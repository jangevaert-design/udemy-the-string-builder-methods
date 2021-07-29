package edu.cnm.deepdive;

public class TheStringBuilderMethods {

  public static void main(String[] args) {
    //charAt(), indexOf(), length(), substring()
    StringBuilder sb = new StringBuilder("programming");
    String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));// last part "mi" is not included so gram
    int len = sb.length();//11
    char ch = sb.charAt(5);//5
    System.out.println("sub = " + sub + ", len = " + len + " and ch = " + ch + ".");

    //append()
    StringBuilder b = new StringBuilder().append(1).append("L");
    System.out.println();
    System.out.println(b);//prints 1L
    b.append("-").append(true);//prints 1L-true
    System.out.println(b);

    //insert()
    StringBuilder builder = new StringBuilder("Programming");
    builder.insert(7, "-");
    builder.insert(2, 2);
    System.out.println();
    System.out.println(builder);//prints Pr2ogram-ming

    //delete() and deleteCharAt()
    builder.delete(4, 9);
    System.out.println();
    System.out.println(builder);//prints Pr2oming
    builder.deleteCharAt(2);
    System.out.println(builder);//prints Proming

    //builder.delete(2, 1) will not compile. StringIndexOutOfBoundException
    //builder.delete(1, 1) will not change anything

    //reverse()
    StringBuilder sb1 = new StringBuilder("ABC123");
    sb1.reverse();
    System.out.println();
    System.out.println(sb1);

    String myString = sb1.toString();
    myString = myString.toLowerCase();
    System.out.println(myString);
  }

}
