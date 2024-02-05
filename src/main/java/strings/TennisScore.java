package strings;

public class TennisScore {
    static String tennisScore(String score, String player1, String player2){
        String[] scores = score.split(":");
        int player1Score = Integer.parseInt(scores[0]);
        int player2Score = Integer.parseInt((scores[1]));

        String scoreString = "";

        String pointPlayer1 = getPoint(player1Score);
        String pointPlayer2 = getPoint(player2Score);


        if(player1Score == player2Score && player1Score >= 3){
            scoreString = "Deuce";
        }
        if(player1Score >= 4 && Math.abs(player1Score - player2Score) >= 2){
            scoreString = "Game " + player1;
        }else if(player2Score >= 4 && Math.abs(player2Score - player1Score) >= 2){
            scoreString = "Game " + player2;
        }else if(Math.abs(player1Score - player2Score) == 1 && player1Score >= 3 && player2Score >= 3){
            if(player1Score > player2Score){
                scoreString = "Advantage " + player1;
            }else {
                scoreString = "Advantage " + player2;
            }
        }else if(player1Score < 3 || player2Score < 3){
            scoreString = String.format("%s %s", pointPlayer1, pointPlayer2);
        }

        return scoreString;
    }

    static private String getPoint(int point) {
        String score = "";
        switch (point){
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
            default:
                break;
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(tennisScore("1:0", "Micha", "Tim"));
        System.out.println(tennisScore("5:4", "Micha", "Tim"));
    }
}
