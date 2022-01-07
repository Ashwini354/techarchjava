package com.techarch.hackerrank;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/ashwiniramamurthy/eclipse-workspace/Hack/src/resource/Q31Reader.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		List<Object> fileReverse = new ArrayList<Object>();

		System.out.println("read from file");
		String str = null;
		while (true) {
			str = br.readLine();
			if (str != null)
				fileReverse.add(str);
			else
				break;
		}
		FileWriter f = new FileWriter("/Users/ashwiniramamurthy/eclipse-workspace/Hack/src/resource/Q31Writer.txt");
		BufferedWriter fo = new BufferedWriter(f);
		for (int i = fileReverse.size()-1; i >= 0; i--) {
			String data = (String) fileReverse.get(i);
			fo.write(data);
			fo.write("\n");
		}
		fo.flush();
		fo.close();
	}

}
