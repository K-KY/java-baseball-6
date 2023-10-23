package baseball.domain;

import java.util.HashMap;

public class GameResult {
    private final HashMap<BallScore, Integer> result = new HashMap<>();

    public void saveResult(BallScore score) {
        if (score.isStrike() || score.isBall()) {
            result.put(score, result.getOrDefault(score, 0) + 1);
        }
    }

    public Integer getResult(BallScore ballScore) {
        return result.getOrDefault(ballScore, 0);
    }

    public boolean isNothing() {
        return result.size() == 0;
    }
}
