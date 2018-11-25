package com.poc;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InfiniteStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stream<Integer> infiniteStream=Stream.iterate(0, i->i+1);
		List<Integer> listOfIntegers=infiniteStream.limit(10).collect(Collectors.toList());
		listOfIntegers.forEach(System.out::println);
		
		
		
		
		
		Supplier<UUID> randomUUIDs=UUID::randomUUID;
		Stream<UUID> generate=Stream.generate(randomUUIDs);
		
		List<UUID> collect=generate.skip(10).limit(10).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
		
		//Stream<String> empty=Stream.empty();
		
		Collection<String> collection=Arrays.asList("a","b");
		Stream<String> streamOfCollection=collection.stream();
		streamOfCollection.forEach(System.out::println);
		
		//Stream of Array
		String arr[]=new String [] {"Swarup","Dutta"};
		Stream<String>streamOfArrayFull=Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);
		
		//Stream<String>streamOfArrayPart=Arrays.stream(arr,1,2);
		//streamOfArrayPart.forEach(System.out::println);
		
		Stream<String> of=Stream.of("a","b");//=Stream.of(arr);
		of.forEach(System.out::println);
		
		Stream<String>streamBuilder=Stream.<String>builder().add("a").add("b").add("c").build();
		streamBuilder.map(String::toUpperCase).forEach(System.out::println);
		
		Stream<String> streamGenerated=Stream.generate(()->"element").limit(10);
		streamGenerated.forEach(System.out::println);
		
		IntStream intStream=IntStream.range(1,3);
		intStream.forEach(System.out::println);
		
		LongStream longStream=LongStream.rangeClosed(1,3);
		longStream.forEach(System.out::println);
		
		Random rand=new Random();
		DoubleStream doubleStream=rand.doubles(3);
		doubleStream.forEach(System.out::println);

		
		Path path=Paths.get("C:\\NewWorkSpaces\\java8_ws\\StreamOperationDemo\\src\\com\\poc\\BiConsumerTest.java");
	//	Stream<String> lines=Files.lines(path);
		Stream<String> lines=Files.lines(path,Charset.forName("UTF-8"));

		
		lines.forEach(System.out::println);

		
		
		

		
		
		



		


	}

}
