package demo.java.v2c01io.ZipTest;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.zip.*;

import javax.swing.*;

public class MyZipTest {
	public static void main(String[] args) throws IOException {
//		MyZipTest.scanZipFile();
//		MyZipTest.loadZipFile();
		MyZipTest.createZipFile();
	}


	public static void scanZipFile() throws IOException {
		ZipInputStream zin = new ZipInputStream(new FileInputStream("ziptest.zip"));
		ZipEntry entry;
		while ((entry = zin.getNextEntry()) != null) {
			System.out.println(entry.getName()+" - "+entry.getCrc());
			
			zin.closeEntry();
		}
		zin.close();

	}

	public static void loadZipFile() throws IOException {

		ZipInputStream zin = new ZipInputStream(new FileInputStream("ziptest.zip"));
		ZipEntry entry;

		while ((entry = zin.getNextEntry()) != null) {
			System.out.println(entry.getName()+" - "+entry.getCrc()+"--------------------");
			Scanner in = new Scanner(zin);
			while (in.hasNextLine()) {
				System.out.println(in.nextLine());
			}
			zin.closeEntry();
		}
		zin.close();

	}
	
	public static void createZipFile() throws IOException {

		File[] fs = new File[]{
				new File("pom.xml"),
				new File("ziptest.zip"),
				new File("test2.txt")
				
		};
		
		ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("ziptestout.zip"));
		
		for(File f:fs){
			ZipEntry entry = new ZipEntry(f.getName());
			InputStream fis = new BufferedInputStream(new FileInputStream(f));
			zout.putNextEntry(entry);
			for(int i=fis.read();i!=-1;i=fis.read()){
				zout.write(i);
			}
			zout.closeEntry();
			
		}
		zout.close();

	}	


}