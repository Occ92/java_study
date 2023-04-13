package services;

import java.util.List;

public class CalculateService {

	public static <T extends Comparable<T>> T max(List<T> maxList) {
		if (maxList.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}

		T max = maxList.get(0);
		for (T item : maxList) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
