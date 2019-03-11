package com.assignment.assignmentnew;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	
	
	// create an array of strings
		private List<String> data = new ArrayList<>() ;
		private int ind =0;
		
		
		
		public RandomFortuneService() {
			super();
			
			try {
				BufferedReader br = new BufferedReader(new FileReader("input.txt"));
				String line;
				while ((line = br.readLine()) != null) {
					// process the line.
					data.add(line);
				} 
				br.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage().toString());
			}
			
			
		}

	
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.size());
		
		String theFortune = data.get(index);
		
		return theFortune;
	}

}


