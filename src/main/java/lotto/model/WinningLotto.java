package lotto.model;

import lotto.constant.ErrorMessage;
import lotto.constant.LottoPrize;

public class WinningLotto {
    private final Lotto lotto;
    private final int bonusNumber;

    public WinningLotto(Lotto lotto, int bonusNumber) {
        validateDuplication(lotto, bonusNumber);
        this.lotto = lotto;
        this.bonusNumber = bonusNumber;
    }

    public void validateDuplication(Lotto winningLottoTicket, int bonusNumber) {
        if (winningLottoTicket.contains(bonusNumber)) {
            throw new IllegalArgumentException(ErrorMessage.HAS_DUPLICATED_NUMBER.getMessage());
        }
    }

    public LottoPrize compare(Lotto lotto) {
        return LottoPrize.valueOf(
                this.lotto.getMatchedCount(lotto),
                lotto.contains(bonusNumber)
        );
    }
}
