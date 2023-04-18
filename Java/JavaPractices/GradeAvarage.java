package Java.JavaPractices;

import java.util.Scanner;

public class GradeAvarage {
  public static void main(String[] args) {
      //declaring variables
      int mathematich, physic, chem, turkish, history, music;

      //scanner object 
      Scanner sc = new Scanner(System.in);
  
      //getting grades
      System.out.print("Mathematic grade: ");
      mathematich = sc.nextInt();
      
      System.out.print("Physic grade: ");
      physic = sc.nextInt();
      
      System.out.print("Chemistry grade: ");
      chem = sc.nextInt();
      
      System.out.print("Turkish grade: ");
      turkish = sc.nextInt();
      
      System.out.print("History grade: ");
      history = sc.nextInt();
      
      System.out.print("Music grade: ");
      music = sc.nextInt();

      //calculating avarage grade
      int avarageGrade = (mathematich + physic + chem + turkish + history + music) / 6;

      //printing Avarage Grade
      System.out.println("Avarage: " + avarageGrade);

      //condition cheks the avarage and turns into string to print
      String response = (avarageGrade > 60) ? "Sinifi Gecti" : "Sinifta Kaldi";

      //printing response
      System.out.println(response);
      
  }
}
