package lotto.model;

import java.util.List;
import lotto.validator.Validator;

public class Lotto {    // 인스턴스 변수 추가 ㄴㄴ, 패키지 변경은 가능
    private final List<Integer> numbers;    // 접근 제어자 변경 ㄴㄴ

    public Lotto(List<Integer> numbers) {
        Validator.validateNumbers(numbers);
        this.numbers = numbers;
    }

    // TODO: 추가 기능 구현
    public Integer get(int index) {
        return numbers.get(index);
    }

    public boolean contains(int number) {
        return numbers.contains(number);
    }

    public int getMatchedCount(Lotto lotto) {
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.contains(lotto.get(i))) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
