package com.poc.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class FileTest {

	public static void main(String[] args) throws IOException {

		//newBufferedReaderDemo();
		//writeToFileDemo();
		// TODO Auto-generated method stub
		//walkDemo();
		//bufferedReaderDemo();
		listingDir();



	}
	
	private static void listingDir()  
	{
		Stream<Path> list=null;
		Stream<Path> list2=null;
		try
		{
			//list=Files.list(Paths.get("."));
			//list.forEach(System.out::println);
			Files.list(Paths.get(".")).filter(Files::isRegularFile).forEach(System.out::println);;



		}
		catch(IOException e)
		{
		}
		finally
		{
			if(list!=null)
				list.close();
		}

		
	}
	
	private static void walkDemo() throws IOException {
		
		Path start=Paths.get("../StreamOperationDemo");
		try(Stream<Path> walk=Files.walk(start, Integer.MAX_VALUE,FileVisitOption.FOLLOW_LINKS))
		{
			walk.forEach(System.out::println);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void writeToFileDemo() throws IOException {
		Path path=Paths.get("data1.txt");
		String s="India is 2011 Cricket WC champion";
		Path write1=Files.write(path,s.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println(write1.toUri().getPath());
		
		List<String> names=new LinkedList<String>();
		names.add("Yuvendra Chawal ");
		names.add("Kuldeep Yadav");
		names.add("Bhuvaneswar Kumar");
		names.add("Yasaprit Singh Bumrah");
		Path write2=Files.write(path,names,Charset.forName("UTF-8"),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println(write2.toUri().getPath());



		
		
	}

	private static void readAllLines() throws IOException {
		Path path=Paths.get("data.txt");

		List<String> lines=Files.readAllLines(path,Charset.forName("UTF-8"));
		lines.forEach(System.out::println);		
	}
	
	private static void newBufferedReaderDemo() throws IOException {
		Path path=Paths.get("data.txt");

		BufferedReader br=Files.newBufferedReader(path,Charset.forName("UTF-8"));
		Stream<String> lines=br.lines();
		lines.forEach(System.out::println);		

		
	}
	private static void bufferedReaderDemo() throws IOException {
		
		try(BufferedReader br=new BufferedReader(new FileReader("data.txt")))
		{
			Stream<String> lines=br.lines();
			lines.forEach(System.out::println);			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
