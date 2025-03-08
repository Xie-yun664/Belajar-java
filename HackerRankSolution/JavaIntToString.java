import java.util.Scanner;
/*
Mulai
   Baca n  // Input bilangan bulat
   Coba
      s = konversi n ke string
      Cetak "Good job"
   Jika Gagal
      Cetak "Wrong answer"
Selesai
*/
class JavaIntToString {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  sc.close();
  String s = Integer.toString(n);

   try {
     System.out.println("Good job");
   } catch (Exception e) {
     System.out.println("Wrong answer");
   }
  }
}