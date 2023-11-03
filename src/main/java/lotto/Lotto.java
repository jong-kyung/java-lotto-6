package lotto;

import java.util.HashSet;
import java.util.List;

public class Lotto {
	private final List<Integer> numbers;

	public Lotto(List<Integer> numbers) { // 사용자가 입력한 값을 넣을때 사용해야함
		validate(numbers);
		this.numbers = numbers;
	}
	
	private void validate(List<Integer> numbers) {
		if (numbers.size() != 6) {
			throw new IllegalArgumentException();
		}
		this.isDuplicateNumber(numbers);
	}

	private void isDuplicateNumber(List<Integer> numbers) {
		HashSet<Integer> removeDuplicateNumber = new HashSet<>();
		removeDuplicateNumber.addAll(numbers);
		if (numbers.size() != removeDuplicateNumber.size()) {
			throw new IllegalArgumentException();
		}
	}

	public List<Integer> getNumbers() {
		return numbers;
	}
	
}