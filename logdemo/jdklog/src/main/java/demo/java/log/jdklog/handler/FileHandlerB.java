package demo.java.log.jdklog.handler;

import java.io.IOException;
import java.util.logging.FileHandler;

public class FileHandlerB extends FileHandler {


	public FileHandlerB() throws IOException, SecurityException {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileHandlerB(String pattern) throws IOException, SecurityException {
		super(pattern);
		// TODO Auto-generated constructor stub
	}
	
	public FileHandlerB(String pattern, boolean append) throws IOException,
			SecurityException {
		super(pattern, append);
		// TODO Auto-generated constructor stub
	}
	
	public FileHandlerB(String pattern, int limit, int count)
			throws IOException, SecurityException {
		super(pattern, limit, count);
		// TODO Auto-generated constructor stub
	}	
	
	public FileHandlerB(String pattern, int limit, int count, boolean append)
			throws IOException, SecurityException {
		super(pattern, limit, count, append);
		// TODO Auto-generated constructor stub
	}







}
