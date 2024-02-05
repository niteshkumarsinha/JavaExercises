package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTennisScore {
    @ParameterizedTest(name = "''{0}'' => ''{1}''")
    @CsvSource({ "1:0, Fifteen Love", "2:2, Thirty Thirty", "2:3, Thirty Forty",
            "3:3, Deuce", "4:3, Advantage Micha", "4:4, Deuce",
            "5:4, Advantage Micha", "6:4, Game Micha" })
    void calculateScore(String score, String expected)
    {
        String result = TennisScore.tennisScore(score, "Micha", "Tim");
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "''{0}'' => ''{1}''")
    @CsvSource({ "1:0, Fifteen Love", "2:2, Thirty Thirty",
            "3:2, Forty Thirty", "4:2, Game Micha" })
    void calculateScoreWin(String score, String expected)
    {
        String result = TennisScore.tennisScore(score, "Micha", "Tim");
        assertEquals(expected, result);
    }
    @ParameterizedTest(name = "''{0}'' => ''{1}''")
    @CsvSource({ "1:0, Fifteen Love", "2:0, Thirty Love",
            "3:0, Forty Love", "4:0, Game Micha"} )
    void calculateScoreStraightWin(String score, String expected)
    {
        String result = TennisScore.tennisScore(score, "Micha", "Tim");
        assertEquals(expected, result);
    }
}
