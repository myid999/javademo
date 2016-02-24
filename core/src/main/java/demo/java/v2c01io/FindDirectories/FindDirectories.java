package demo.java.v2c01io.FindDirectories;

import java.io.*;

public class FindDirectories {
	public static void main(String[] args) {
		// if no arguments provided, start at the parent directory
		if (args.length == 0)
			args = new String[] { "." };

		try {
			File pathName = new File(args[0]);
			String[] fileNames = pathName.list(new ExtensionFilter("txt"));
//			String[] fileNames = pathName.list();
			// enumerate all files in the directory
			for (int i = 0; i < fileNames.length; i++) {
				File f = new File(pathName.getPath(), fileNames[i]);

				// if the file is again a directory, call the main method
				// recursively
				System.out.println(f.getCanonicalPath());
				if (f.isDirectory()) {
					main(new String[] { f.getPath() });
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static class ExtensionFilter implements FilenameFilter{

		private String ext;
		
		public ExtensionFilter(String ext){
			this.ext=ext;
		}
		
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(this.ext);
		}
		
	}
	
	
	
}
