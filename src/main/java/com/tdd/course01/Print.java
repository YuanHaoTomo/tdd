package com.tdd.course01;

public class Print {
	
	public String print(int i){
		if(fizz(i) && buzz(i)){
			return "FizzBuzz";
		}
		if(fizz(i)){
			return "Fizz";
		}
		if(buzz(i)){
			return "Buzz";
		}
		return String.valueOf(i);
	}

	private boolean buzz(int i) {
		return i%5==0 || String.valueOf(i).contains("5");
	}

	private boolean fizz(int i) {
		return i%3==0 || String.valueOf(i).contains("3");
	}

}
