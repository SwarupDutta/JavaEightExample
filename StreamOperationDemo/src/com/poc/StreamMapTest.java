package com.poc;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.poc.model.Detail;
import com.poc.model.Employee;
import com.poc.model.Product;

public class StreamMapTest {

	public static void main(String[] args) {
		
		List<Product> productList=Arrays.asList(new Product(23,"potatoes"),new Product(14,"orange"),new Product(13,"lemon"),new Product(23,"bread"),new Product(13,"sugar"));
		List<String> listOfProducrNames=productList.stream().map(Product::getName).collect(Collectors.toList());
		listOfProducrNames.forEach(s->System.out.println(s.toUpperCase()));
		
		String joinedlistOfProductNames=productList.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]")); 
		System.out.println(joinedlistOfProductNames);
		
		//Double avaragingids=productList.stream().collect(Collectors.averagingInt(p->p.getId()));
		Double avaragingids=productList.stream().collect(Collectors.averagingInt(Product::getId));

		System.out.println(avaragingids);
		
		IntSummaryStatistics  collect=productList.stream().collect(Collectors.summarizingInt(Product::getId));
		System.out.println(collect);
		
		Map<Integer, List<Product>> grpMap=productList.stream().collect(Collectors.groupingBy(Product::getId));
		grpMap.forEach((k,prodtList)->{
			System.out.println(k);
			prodtList.forEach(System.out::println);

			
		});
		
		Map<Boolean, List<Product>> prtMap=productList.stream().collect(Collectors.partitioningBy(p->p.getId()>15));
		prtMap.forEach((b,listOfProd)->{
			
			System.out.println(b);
			listOfProd.forEach((p)->System.out.println(p));
			
			
		});




		
		

		// TODO Auto-generated method stu1
		List<String> uris=new ArrayList<String>();
		uris.add("c:\\test1.txt");
		uris.add("c:\\test2.txt");
		uris.add("D:\\test1.txt");
		uris.add("D:\\test2.txt");
	
		
		Stream<Path> map=uris.stream().map(uri->Paths.get(uri));
		map.forEach(System.out::println);	
		
		List<Detail> details=new ArrayList<Detail>();
		
		List<String> parts1=new ArrayList<String>();
		parts1.add("part_1");
		parts1.add("part_2");
		parts1.add("part_3");
		Detail detailc=new Detail(1001,parts1);
		details.add(detailc);
		
		List<String> parts2=new ArrayList<String>();
		parts2.add("part_4");
		parts2.add("part_5");
		parts2.add("part_6");
		Detail detaild=new Detail(1001,parts2); 
		details.add(detaild);
		
		Stream<String> s=details.stream().flatMap(d->d.getParts().stream()); 
		s.forEach(System.out::println);


		



		

	
	}

}
