package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nom = new int[3];
        nom [0] = 1;
        nom [1] = 2;
        nom [2] = 3;
        System.out.print(nom [0] + "," + nom [1] + "," + nom [2]);
        System.out.println();

        double [] newNom = {1.57, 7.654, 9.986};
        newNom [0] = 1.57;
        double newNom1 = newNom [0];
        System.out.print(newNom1 + ", ");
        newNom [1] = 7.654;
        double newNom2 = newNom [1];
        System.out.print(newNom2 + ", ");
        newNom [2] = 9.986;
        double newNom3 = newNom [2];
        System.out.print(newNom3);

        System.out.println();

        int [] newNomQ = {1, 2, 3};
        newNomQ [0] = 1;
        int newNomQ1 = newNomQ [0];
        System.out.print(newNomQ1 + ",");
        newNomQ [1] = 2;
        int newNomQ2 = newNomQ [1];
        System.out.print(newNomQ2 + ",");
        newNomQ [2] = 3;
        int newNowQ3 = newNomQ [2];
        System.out.print(newNowQ3);

        System.out.println();

        for ( int i = nom.length - 1; i >=0; i--) {
            System.out.print(nom[i]);
            if ( i > 0) {
                System.out.print(", ");
            }
        }System.out.println();

        for ( int q = newNom.length - 1; q >= 0; q--) {
            System.out.print(newNom[q]);
            if (q > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for ( int w = newNomQ.length -1; w >= 0; w--) {
            System.out.print(newNomQ[w]);
            if( w >0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for ( int z = 0; z < nom.length; z++) {
            if (nom[z] % 2 != 0) {
                nom[z]++;
            }
            if ( z > 0) {
                System.out.print(", ");
            }
            System.out.print(nom[z]);
        }
    }
}
