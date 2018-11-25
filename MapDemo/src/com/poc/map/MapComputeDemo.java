//https://www.javabrahman.com/java-8/java-8-maps-computeifabsent-computeifpresent-getordefault-methods-tutorial-with-examples/
package com.poc.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.poc.map.dto.Employee;

public class MapComputeDemo {

	private Map<String,List<Employee>>  employeeDOJMap;

	public static void main(String[] args) {
		Map<Integer,List<Employee>>  employeeDOJMap=new HashMap<Integer, List<Employee>>();

		List<Employee> list2014 = Arrays.asList(new Employee("Deborah Sprightly", 29, 9000.00));
		employeeDOJMap.put(2014, list2014);
		List<Employee> list2015 = Arrays.asList(
				new Employee("Tom Jones", 45, 7000.00),
				new Employee("Harry Major", 25, 10000.00));
		employeeDOJMap.put(2015, list2015);

		List<Employee> list2016 = Arrays.asList(
				new Employee("Ethan Hardy", 65, 8000.00),
				new Employee("Nancy Smith", 22, 12000.00));

		employeeDOJMap.put(2016, list2016);

		System.out.println("Before replacing ...");
		employeeDOJMap.forEach((year,employeeList)->System.out.println("Year"+year+" =>"+employeeList));

		
		
		/*
		 * Replaces each entry's value with the result of invoking the givenfunction on that entry until all entries have been processed or thefunction throws an exception. Exceptions thrown by the function arerelayed to the caller.
Parameters:function the function to apply to each entryThrows:UnsupportedOperationException - if the set operationis not supported by this map's entry set iterator.ClassCastException - if the class of a replacement valueprevents it from being stored in this mapNullPointerException - if the specified function is null, or thespecified replacement value is null, and this map does not permit nullvaluesClassCastException - if a replacement value is of an inappropriatetype for this map(optional)NullPointerException - if function or a replacement value is null,and this map does not permit null keys or values(optional)IllegalArgumentException - if some property of a replacement valueprevents it from being stored in this map(optional)ConcurrentModificationException - if an entry is found to beremoved during iteration
		 * 
		 */
		employeeDOJMap.replaceAll((year,employeeList)->{//replaceAll is BinaryOperator

			
			
			/*
			 * Replaces each element of this list with the result of applying theoperator to that element. Errors or runtime exceptions thrown bythe operator are relayed to the caller.
Parameters:operator the operator to apply to each elementThrows:UnsupportedOperationException - if this list is unmodifiable.Implementations may throw this exception if an elementcannot be replaced or if, in general, modification is notsupportedNullPointerException - if the specified operator is null orif the operator result is a null value and this list doesnot permit null elements(optional)
			 */
			employeeList.replaceAll(emp->{emp.setName(emp.getName().toUpperCase());return emp;});// Uniary operator
			return employeeList;

		});

		System.out.println("Before replacing ...");
		employeeDOJMap.forEach((year,employeeList)->System.out.println("Year"+year+" =>"+employeeList));


		/*
		 * If the specified key is not already associated with a value (or is mappedto null), attempts to compute its value using the given mappingfunction and enters it into this map unless null. 

If the function returns null no mapping is recorded. Ifthe function itself throws an (unchecked) exception, theexception is rethrown, and no mapping is recorded. The mostcommon usage is to construct a new object serving as an initialmapped value or memoized result, as in: 
 map.computeIfAbsent(key, k -> new Value(f(k)));

		 * 
		 * 
		 */
		employeeDOJMap.computeIfAbsent(2018,empList -> new ArrayList<Employee>())
		.add(new Employee("Dick Newman", 35, 10000.00));
		employeeDOJMap.forEach((year,empList)-> System.out.println(year+"-->"+empList));
		
		/*If the value for the specified key is present and non-null, attempts tocompute a new mapping given the key and its current mapped value. 

			If the function returns null, the mapping is removed. If thefunction itself throws an (unchecked) exception, the exception isrethrown, and the current mapping is left unchanged.
			Parameters:key key with which the specified value is to be associated
		 * 
		 * remappingFunction the function to compute a valueReturns:the new value associated with the specified key, or null if noneThrows:NullPointerException - if the specified key is null andthis map does not support null keys, or theremappingFunction is nullUnsupportedOperationException - if the put operationis not supported by this map(optional)ClassCastException - if the class of the specified key or valueprevents it from being stored in this map(optional)
		 */
		System.out.println("computeIfPresent");
		employeeDOJMap.computeIfPresent(2018, (year,employeeList)->employeeList.removeIf(emp->emp.getName().equalsIgnoreCase("Dick Newman")) && employeeList.size() == 0 ?null:employeeList);
		employeeDOJMap.forEach((year,empList)-> System.out.println(year+"-->"+empList));

	}

}