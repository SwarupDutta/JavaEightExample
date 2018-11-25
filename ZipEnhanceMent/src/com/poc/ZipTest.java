package com.poc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ZipFile zipFile=new ZipFile("MyFolder1.zip"))
		{
			Stream<? extends ZipEntry> stream=zipFile.stream();
			stream.forEach(System.out::println);
			
			Enumeration<? extends ZipEntry> entries=zipFile.entries();
			while(entries.hasMoreElements())
			{
				ZipEntry zipEntry=entries.nextElement();
				System.out.println("Directory & File name"+zipEntry.getName());
				InputStream inputStream=zipFile.getInputStream(zipEntry);
				BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
				Stream<String> lines=br.lines();
				lines.forEach(System.out::println);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
