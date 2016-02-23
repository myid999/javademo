package demo.java.v2c01io;

import java.io.*;
import java.util.zip.ZipInputStream;

public class IoTest {

	public IoTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		
		//		IoTest.FileInputStreamTest();
		
//		IoTest.FileOutputStreamTest();

//		IoTest.FileCopyTest();
		
//		IoTest.FileCopyBufferedTest();
		
//		IoTest.encoderTest();
		
//		IoTest.PrintWriterTest();
		
		IoTest.BufferedReaderTest();
		
		FileDescriptor fd=new FileDescriptor();
		
	}

	public static void FileInputStreamTest() {
		try {
			FileInputStream rf = new FileInputStream("test1.txt");
			int n = 512;
			byte buffer[] = new byte[n];
			while ((rf.read(buffer, 0, n) != -1) && (n > 0)) {
				System.out.println(new String(buffer));
			}
			rf.close();
		} catch (IOException IOe) {
			System.out.println(IOe.toString());
		}

	}
	
	public static void FileOutputStreamTest() {
		try {
			System.out.println("please Input from Keyboard");
			int count, n = 512;
			byte buffer[] = new byte[n];
			count = System.in.read(buffer);
			FileOutputStream wf = new FileOutputStream("test2.txt");
			wf.write(buffer, 0, count);
			wf.close(); // 当流写操作结束时，调用close方法关闭流。
			System.out.println("Save to the write.txt");
		} catch (IOException IOe) {
			System.out.println("File Write Error!");
		}
	}
	
	
	public static void FileCopyTest() {
		try {
			File inFile = new File("test1.txt");
			File outFile = new File("test1copy.txt");
			FileInputStream finS = new FileInputStream(inFile);
			FileOutputStream foutS = new FileOutputStream(outFile);
			int c;
			while ((c = finS.read()) != -1) {
				foutS.write(c);
			}
			finS.close();
			foutS.close();
		} catch (IOException e) {
			System.err.println("FileStreamsTest: " + e);
		}
	}
	
	
	public static void FileCopyBufferedTest() {
		try {
			File inFile = new File("test1.txt");
			File outFile = new File("test1copy.txt");
			FileInputStream finS = new FileInputStream(inFile);
			BufferedInputStream bin=new  BufferedInputStream( finS);
			FileOutputStream foutS = new FileOutputStream(outFile);
			BufferedOutputStream  bout=new BufferedOutputStream(foutS);
			int c;
			while ((c = bin.read()) != -1) {
				bout.write(c);
			}
			finS.close();
			foutS.close();
		} catch (IOException e) {
			System.err.println("FileStreamsTest: " + e);
		}
	}	
	
	private static void readBuff(byte[] buff) throws IOException {
		ByteArrayInputStream in = new ByteArrayInputStream(buff);
		int data;
		while ((data = in.read()) != -1)
			System.out.print(data + "  ");
		System.out.println();
		in.close();
	}

	public static void encoderTest() throws IOException {
		System.out.println("内存中采用unicode字符编码：");
		char c = '好';
		int lowBit = c & 0xFF;
		int highBit = (c & 0xFF00) >> 8;
		System.out.println("" + lowBit + "   " + highBit);
		String s = "好";
		System.out.println("本地操作系统默认字符编码：");
		readBuff(s.getBytes());
		System.out.println("采用GBK字符编码：");
		readBuff(s.getBytes("GBK"));
		System.out.println("采用UTF-8字符编码：");
		readBuff(s.getBytes("UTF-8"));
	}
	
	public static void DataInputStreamTest() throws IOException {
		FileInputStream fin = new FileInputStream("test4.dat");
		DataInputStream din = new DataInputStream(fin);
		
		DataInputStream dinBuffered = new DataInputStream(new BufferedInputStream(fin));
	}
	
	public static void PushbackInputStreamTest() throws IOException {
		FileInputStream fin = new FileInputStream("test4.dat");
		PushbackInputStream pinBuffered = new PushbackInputStream(new BufferedInputStream(fin));
		int b = pinBuffered.read();
		if(b!='<'){
			pinBuffered.unread(b);
		}
		
		DataInputStream dpinBuffered = new DataInputStream(new PushbackInputStream(new BufferedInputStream(fin)));
		
	}
	
	public static void ZipInputStreamTest() throws IOException {
		FileInputStream fin = new FileInputStream("test4.dat");
		ZipInputStream zin = new ZipInputStream(new BufferedInputStream(fin));
		DataInputStream dzin = new DataInputStream(zin);
		
		
	}	

	
	
	public static void PrintWriterTest() throws IOException {
		PrintWriter pw = new PrintWriter("test5.txt"); // same with -  PrintWriter pw = new PrintWriter(new FileWriter("test5.txt"));
		String name = "Hurry Hacker";
		double salary = 75000;
		pw.print(name);
		pw.print(" ");
		pw.println(salary);
		pw.flush();
		pw.close();
		
	}	
	
	public static void BufferedReaderTest() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("test1.txt")); 
		String line;
		while((line=br.readLine()) != null){
			System.out.println(line);
		}
		
	}		
}
