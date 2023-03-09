package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	
	int i = 10;
    

	//	Note: We are using java.util.Base64 class to perform Encoding and Decoding
	//String encode (String txt) => Takes plain text as input and returns encoded text 
	public static String encode(String txt) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}
	
	// String decode (String encodeTxt) => Takes encoded txt as input and returns decoded text
	public static String decode(String encodeTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String(decode);
	}
	
	public static void main(String[] args) {
		String encode = PasswordService.encode("ashokit");
		System.out.println(encode);
		String decode = PasswordService.decode(encode);
		System.out.println(decode);
	}
	
	//changes for BUG-121
	String name ="raju";
	
}
