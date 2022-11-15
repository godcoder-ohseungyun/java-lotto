package lotto.domain.messages;

public class ErrorMessages {
    public static final String SIZE_ERROR_MESSAGE = "로또 번호는 6개 입니다 , 를 구분자로 입력해 주십시오";
    public static final String DUPLICATE_ERROR_MESSAGE = "로또 번호는 서로 중복될 수 없습니다";
    public static final String RANGE_ERROR_MESSAGE = "로또 번호는 1~45사이의 수로 구성되어야 합니다";
    public static final String DUPLICATE_BONUS_ERROR_MESSAGE = "보너스 번호는 당첨 번호와 중복될 수 없습니다";
    public static final String EXPENSES_RANGE_ERROR_MESSAGE = "금액은 1000이상 INTEGER_MAX_VALUE 이하의 1000의 배수여야 합니다";

}
