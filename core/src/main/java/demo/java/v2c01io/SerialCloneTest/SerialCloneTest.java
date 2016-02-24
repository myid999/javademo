package demo.java.v2c01io.SerialCloneTest;

import java.io.*;
import java.util.*;

public class SerialCloneTest {
	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 1);
		// clone harry
		Employee harry2 = (Employee) harry.clone();

		// mutate harry
		harry.raiseSalary(10);

		// now harry and the clone are different
		System.out.println(harry);
		System.out.println(harry2);
	}
}

/**
 * A class whose clone method uses serialization.
 */
class SerialCloneable implements Cloneable, Serializable {
	public Object clone() {
		try {
			// save the object to a byte array
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject(this);
			out.close();

			// read a clone of the object from the byte array
			ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
			ObjectInputStream in = new ObjectInputStream(bin);
			Object ret = in.readObject();
			in.close();

			return ret;
		} catch (Exception e) {
			return null;
		}
	}
}

/**
 * The familiar Employee class, redefined to extend the SerialCloneable class.
 */
class Employee extends SerialCloneable {
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}

/*	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		System.out.println(" readObject(ObjectInputStream in )");
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println(" writeObject(ObjectOutputStream out )");
	}*/

	private String name;
	private double salary;
	private Date hireDay;
	private transient Date birthday;
}
