/*
Deklarasikan variabel statis lebar, tinggi sebagai integer  
Deklarasikan variabel statis valid sebagai boolean  

Blok inisialisasi statis:
    Baca lebar dari input  
    Baca tinggi dari input  
    Jika lebar > 0 DAN tinggi > 0:
        valid = true  
    Jika tidak:
        Cetak "java.lang.Exception: Lebar dan tinggi harus positif"  
        valid = false  

Metode main:
    Jika valid = true:
        luas = lebar * tinggi  
        Cetak luas
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {

static int B;
static int H;
static boolean flag;

static {
  Scanner sc = new Scanner(System.in);
  B = sc.nextInt();
  H = sc.nextInt();
  if (B > 0 && H > 0) {
    flag = true;
  } else {
    System.out.println("Breadt and height must be positive");
  }
  sc.close();
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

