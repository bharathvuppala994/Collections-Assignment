package com.siri.facebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	public List<String> readTheFile(String path, String filename) throws Exception {
		BufferedReader bufreader = null;
		try {
			FileReader filereader = new FileReader(path + "\\" + filename);
			bufreader = new BufferedReader(filereader);
			List<String> content = new ArrayList<String>();
			String line = null;
			StringBuilder builder = new StringBuilder();
			while ((line = bufreader.readLine()) != null) {
				builder.append(line + "\n");
				content.add(line);
			}
			return content;
		} catch (Exception e) {
			System.out.println("READ: Invalid data type");
			throw new IOException(e.getMessage());
		} finally {
			if(bufreader != null) {
				bufreader.close();
			}
		}

	}

}
