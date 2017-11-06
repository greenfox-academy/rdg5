public class Player {

  String name;
  int score;
  String scoreAsText;

  public String getScoreAsText() {
    return scoreAsText;
  }

  public void setScoreAsText(String scoreAsText) {
    this.scoreAsText = scoreAsText;
  }

  public Player(String name) {
    this.name = name;
    this.scoreAsText="";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
