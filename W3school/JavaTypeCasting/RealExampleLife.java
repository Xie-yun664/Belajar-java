class RealExampleLife {
  public static void main(String[] args) {
    int maxScore = 600;
    int userScore = 376;
    
    float percentage = (float) userScore / maxScore * 100.0f;
    
    System.out.println("User percentage is: " + percentage);
  }
}