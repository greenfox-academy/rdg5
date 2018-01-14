import java.util.stream.IntStream;

public class Gnirts implements CharSequence {

  String forTehWinz;

  public Gnirts(String fTW) {
    this.forTehWinz = fTW;
  }

//  public  String reverse(){
//    this.forTehWinz = forTehWinz;
//    char ch[]=forTehWinz.toCharArray();
//    String reversed="";
//    for(int i=ch.length-1;i>=0;i--){
//      reversed+=ch[i];
//    }
//    return reversed;
//  }

  @Override
  public int length() {
    return forTehWinz.length();
  }

  @Override
  public char charAt(int index) {
    char ch[] = forTehWinz.toCharArray();
    String reversed = "";
    for (int i = ch.length - 1; i >= 0; i--) {
      reversed += ch[i];
    }
    return reversed.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    char sChar[] = forTehWinz.toCharArray();
    String reversed = "";
    for (int i = sChar.length - 1; i >= 0; i--) {
      reversed += sChar[i];
    }
    return reversed.subSequence(start, end);
  }


}
