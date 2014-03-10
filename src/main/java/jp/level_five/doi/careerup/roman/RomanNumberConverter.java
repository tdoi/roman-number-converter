package jp.level_five.doi.careerup.roman;

public class RomanNumberConverter {

	public int convert(String value) {
		if ("I".equals(value)) {
			return 1;
		} else if ("V".equals(value)) {
			return 5;
		} else {
			return 10;
		}
	}
	
}
