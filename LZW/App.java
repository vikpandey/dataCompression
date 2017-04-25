package dataCompression.LZW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
        LZW lzw = new LZW();
        File file = new File("/home/vikas/Client.java");
        FileReader fileReader = null;
        try {
		     fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        BufferedReader br = new BufferedReader(fileReader);
        String s = null;
        List<Integer> compressedString;
        
        try {
        	while((s = br.readLine()) != null) {
        		compressedString = lzw.compress(s);
        	}
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
        
		
		//List<Integer> compressedString = lzw.compress(s);
		//List<Integer> compressedString = lzw.compress("CARRARCARCAR");
		System.out.println(compressedString);
		String decompressedString = lzw.decompress(compressedString);
		System.out.println(decompressedString);
		
	}

}
