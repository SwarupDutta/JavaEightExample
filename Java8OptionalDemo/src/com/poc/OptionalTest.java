package com.poc;

import java.util.Optional;

public class OptionalTest {

	private static void checkFilter(User user)
	{
		Optional<User> userOptional = Optional.of(user);
		Optional<User> filteredUserOptional=userOptional.filter(usr->usr.getId().equalsIgnoreCase("667290"));
		filteredUserOptional.ifPresent(usr->System.out.println(usr.getName()));
	}
	private static void checkOptional(Optional<User> userOptional)
	{


		//Optional<User> userOptional1 = Optional.ofNullable(null);
		System.out.println("UNDERSTANDING ISPRESENT");
		if(userOptional.isPresent()) {
			// value is present inside Optional
			System.out.println("Value found - " + userOptional.get().getId());
		} else {
			// value is absent
			System.out.println("Optional is empty");
		}
		
		System.out.println("UNDERSTANDING IFPRESENT");


		userOptional.ifPresent(value -> {
			System.out.println("Value found - " + value.getId());
		});

		System.out.println("UNDERSTANDING ORELSE");

		User finalUser = userOptional.orElse(new User("0", "Unknown User"));
		System.out.println("Final user"+finalUser.getId());
		finalUser=null;
		
		System.out.println("UNDERSTANDING ORELSEGET");


		finalUser = userOptional.orElseGet(() -> {
			return new User("0", "Unknown User");
		});

		System.out.println("Final user......"+finalUser.getId());
		finalUser=null;
	}

	public static void main(String[] args) {

		User user = new User("667290", "Rajeev Kumar Singh");
		Optional<User> userOptional = Optional.of(user);
		System.out.println("USING METHOD OF");
		checkOptional(userOptional);


		Optional<User> userOptional1 = Optional.ofNullable(null);
		System.out.println("USING METHOD OFNULLABLE AND SENDING NULL AS AN ARGUMENT");

		checkOptional(userOptional1);


		Optional<User> userOptional2 = Optional.ofNullable(user);
		System.out.println("USING METHOD OFNULLABLE AND SENDING USER AS AN ARGUMENT");

		checkOptional(userOptional2);
		
		System.out.println("Check Filter");
		checkFilter(new User("667290", "Rajeev Kumar Singh"));
		checkFilter( new User("667291", "Sadab Kumar Singh"));




		/*
		 * @GetMapping("/users/{userId}")
public User getUser(@PathVariable("userId") String userId) {
    return userRepository.findByUserId(userId).orElseThrow(
	    () -> new ResourceNotFoundException("User not found with userId " + userId);
    );
}
		 */



		// TODO Auto-generated method stub
		/*Optional<String> optional=Optional.empty();
		//System.out.println(optional.get()); //will cause NoSuchElementException

		//System.out.println(optional.isPresent()); //will return false
		String str="value";
		Optional<String> ofOptional=Optional.of(str);//Will cause NullPointerException

		//Optional<String> ofOptional=Optional.of(null);//Will cause NullPointerException
		Optional<String> ofNullableOptional=Optional.ofNullable(null);//Will not  cause NullPointerException and create empty string

		//System.out.println(ofOptional.get()); //will cause NoSuchElementException
		 */

	}

}
//https://www.callicoder.com/java-8-optional-tutorial/
