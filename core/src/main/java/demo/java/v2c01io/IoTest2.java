package demo.java.v2c01io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class IoTest2 {

	public IoTest2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<String, Charset> charsets = Charset.availableCharsets();
		for(String name: charsets.keySet()){
			System.out.println(name);
		}
		System.out.println("---------------------------------Available charsets end------------------");
		Charset cset = Charset.forName("utf8");
		Set<String> aliases = cset.aliases();
		for(String alias: aliases){
			System.out.println(alias);
		}
		System.out.println("---------------------------------UTF8 end------------------");
		
		IoTest2.encoding();
	}
	
	
	public static void encoding() {
		String a = "中文";
		Charset cset = Charset.forName("utf8");
		ByteBuffer buffer = cset.encode(a);
		byte[] bytes = buffer.array();
		
		ByteBuffer bufferB = ByteBuffer.wrap(bytes);
		CharBuffer cbuf = cset.decode(bufferB);
		String result = cbuf.toString();
		System.out.println(result);
		
		
	}

}
