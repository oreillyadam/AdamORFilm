package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Validator {

	// allowed rating values:
	public static final Integer[] SET_VALUES = new Integer[] { -5, -3, -1, 1,
			3, 5 };
	public static final Set<Integer> validRatings = new HashSet<Integer>(
			Arrays.asList(SET_VALUES));

	public static boolean isValidRating(int rating) {
		return (validRatings.contains(rating));
	}

	public static boolean isValidEmailAddress(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(email);
		return m.matches();
	}

	public static double toTwoDecimalPlaces(double num) {
		return (int) (num * 100) / 100.0;
	}

	@SuppressWarnings("unused")
	public static boolean isValidDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Date test = sdf.parse(date);
			return true;
		} catch (ParseException pe) {
			return false;
		}

	}
}
