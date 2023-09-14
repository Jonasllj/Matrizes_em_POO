package Programa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal");
		for(int i=0;i<n;i++) {
			System.out.print(mat[i][i] +" ");
		}
		System.out.println();
		
		int contador = 0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j] <0 ) {
					contador = contador +1;		
				}
			}
		}
		System.out.println("Numeros negativos: " + contador);
	}
}
