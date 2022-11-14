package lotto.domain;


public class LottoNumber {

    private static final String RANGE_ERROR_MESSAGE = "로또 번호는 1~45사이의 수로 구성되어야 합니다";
    private Integer number;

    private LottoNumber(int number) {
        validate(number);
        this.number = number;
    }

    public static LottoNumber generateFromRawValue(int inputNumber) {
        return new LottoNumber(inputNumber);
    }

    private void validate(int number) {
        validateTo45From1(number);
    }

    private void validateTo45From1(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException(RANGE_ERROR_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        LottoNumber that = (LottoNumber) o;

        return that.isSameNumber(this.number);
    }

    private boolean isSameNumber(int number) {
        return this.number == number;
    }
}



