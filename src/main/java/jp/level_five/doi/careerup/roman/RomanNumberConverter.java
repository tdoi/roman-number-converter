package jp.level_five.doi.careerup.roman;

import java.util.Map;
import java.util.HashMap;

public class RomanNumberConverter {

	public int convert(String value) {
		Map<String, Integer> stringValueMap = new HashMap<String, Integer>();
		stringValueMap.put("I", 1);
		stringValueMap.put("V", 5);
		stringValueMap.put("X", 10);
		stringValueMap.put("L", 50);
		stringValueMap.put("C", 100);
		stringValueMap.put("D", 500);
		stringValueMap.put("M", 1000);

		value = value.toUpperCase();
		if (!stringValueMap.containsKey(value)) {
			throw new RuntimeException("Invalid Roman Number : " + value);
		}
		
		Integer integer = stringValueMap.get(value);
		return integer.intValue();
	}
	
}
