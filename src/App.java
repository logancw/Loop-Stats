//                             A24 Loop Stats
//                             Logan Weisgerber
//                               10/17/2023


import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in); // scanner


    System.out.println("Enter your start number: "); // User input
    int a = kb.nextInt();
    System.out.println("Enter your end number: ");
    int b = kb.nextInt();

    LoopStats ls = new LoopStats(); // grab loopstats class

    System.out.println(ls.stat(a,b)); // run the loopstats function
  }
}