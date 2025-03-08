class JavaBoolean {
  public static void main(String[] args) {
      boolean isJavaFun = true;
      boolean isFishTasty = false;
      
      System.out.println(isJavaFun);
      System.out.println(isFishTasty);
      
      int x = 10;
      int y = 9;
      System.out.println(x > y);
      System.out.println(10 < 9);
      System.out.println(x == 10);
      
      int myAge = 26;
      int votingAge = 19;
      
      System.out.println(myAge >= votingAge);
      
      if (myAge >= votingAge) {
        System.out.println("old enough to vote");
      } else {
        System.out.println("old not enaugh to vote");
      }
  }
}