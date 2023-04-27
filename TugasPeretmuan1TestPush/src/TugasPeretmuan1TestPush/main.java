package TugasPeretmuan1TestPush;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Jawaban No 1
		for(int a=0;a<10;a++) {
			for(int b=0;b<10;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Jawaban No 2
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Input Jarak");
	    int jarak = myObj.nextInt(); 
	    System.out.println("Input Kecepatan");
	    int kecepatan = myObj.nextInt(); 
	    int waktu = 0;
	    waktu = jarak * kecepatan;
	    System.out.println("waktu yang ditempuh : "+waktu);
	}
}
