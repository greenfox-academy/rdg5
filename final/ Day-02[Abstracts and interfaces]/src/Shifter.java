public class Shifter implements CharSequence {

  String makeJavaGreatAgain;
  int charShifting;

  public Shifter(String makeJavaGreatAgain, int shiftingNr) {
    this.makeJavaGreatAgain = makeJavaGreatAgain;
    this.charShifting = shiftingNr;
  }

  @Override
  public int length() {
    return makeJavaGreatAgain.length();
  }

  @Override
  public char charAt(int index) {
    String shiftedString;
    for (int i = 0; i < charShifting; i++) {
      shiftedString =
          makeJavaGreatAgain.substring(1, makeJavaGreatAgain.length() - 1) + makeJavaGreatAgain
              .charAt(0);
      makeJavaGreatAgain = shiftedString;
    }
    return makeJavaGreatAgain.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String shiftedString;
    for (int i = 0; i < charShifting; i++) {
      shiftedString =
          makeJavaGreatAgain.substring(1, makeJavaGreatAgain.length() - 1) + makeJavaGreatAgain
              .charAt(0);
      makeJavaGreatAgain = shiftedString;
    }
    return makeJavaGreatAgain.subSequence(start, end);

  }

}
