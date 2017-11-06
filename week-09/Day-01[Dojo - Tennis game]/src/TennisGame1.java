public class TennisGame1 implements TennisGame {

  Player player1;
  Player player2;
  String[] namesForScores = {"Love", "Fifteen", "Thirty", "Forty"};


  public TennisGame1(String player1Name, String player2Name) {
    player1 = new Player(player1Name);
    player2 = new Player(player2Name);
  }

  public String getScore() {
    if (player1.score == player2.score) {
      return getScoreIfTie();
    } else if (player1.score >= 4 || player2.score >= 4) {
      return getScoreIfAboveForty();
    } else {
      return getScoreIfBelowForty();
    }
  }

  public String getScoreIfTie() {
    String result;
    if (player1.score >= 4) {
      result = "Deuce";
    } else {
      for (int i = 0; i < 4; i++) {
        if (player1.score == i) {
          player1.scoreAsText += namesForScores[i];
        }
      }
      player2.scoreAsText = "All";
      result = player1.scoreAsText + "-" + player2.scoreAsText;
    }
    return result;
  }

  public String getScoreIfAboveForty() {
    String result;
    int minusResult = player1.score - player2.score;
    if (minusResult == 1) {
      result = "Advantage player1";
    } else if (minusResult == -1) {
      result = "Advantage player2";
    } else if (minusResult >= 2) {
      result = "Win for player1";
    } else {
      result = "Win for player2";
    }
    return result;
  }

  public String getScoreIfBelowForty() {
    for (int i = 0; i < 4; i++) {
      if (player1.score == i) {
        player1.scoreAsText += namesForScores[i];
      }
      if (player2.score == i) {
        player2.scoreAsText += namesForScores[i];
      }
    }
    return player1.scoreAsText + "-" + player2.scoreAsText;
  }

  public void wonPoint(String currentPlayerName) {
    if (currentPlayerName == player1.name) {
      player1.score += 1;
    } else {
      player2.score += 1;
    }
  }
}



