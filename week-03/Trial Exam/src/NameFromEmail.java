/*
  public class NameFromEmail{

  public static void main(string[] args){
    // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
    //and returns a string that represents the user name in the following format: lastName firstName
    //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
    //accents does not matter
    System.out.println(nameFromEmail("elek.viz@exam.com"));
  }
  static String nameFromEmail(String email){
    int dotIndex = email.indexOf(".");
    int atIndex = email.indexOf("@");
    return upperCaseFirstCharacter(email.substring(dotIndex+1, atIndex) + " " + upperCaseFirstCharacter(email.substring(0,dotIndex));

  }
  static String upperCaseFirstCharacter(String s){
    return s.substring(0,1).toUpperCase() + s.substring()
  }
}
*/