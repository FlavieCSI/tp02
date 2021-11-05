

import java.util.Scanner;

public class Form {
    public Form() {
    }

    public static void main(String[] args) {
        System.out.println("Quelle forme voulez vous choisir ?");
        System.out.println("Entrez :\n\t 1 pour un Carré \n\t 2 pour un rectangle \n\t 3 pour un losange");
        Scanner sc = new Scanner(System.in);

        int reponse;
        Scanner scC;
        int reponse2;
        for(reponse = sc.nextInt(); reponse != 1 && reponse != 2 && reponse != 3; reponse = reponse2) {
            System.out.println("Saisie incorrecte");
            System.out.println("Quelle forme voulez vous choisir ?");
            System.out.println("Entrez 1 pour un Carré \n\t 2 pour un rectangle \n\t 3 pour un losange");
            scC = new Scanner(System.in);
            reponse2 = scC.nextInt();
        }

        Scanner scTemp;
        double cTemp;
        Scanner scLonTemp;
        double cRTemp;
        switch(reponse) {
            case 1:
                System.out.println("De quelle taille est votre carré ?");
                scC = new Scanner(System.in);
                double c = scC.nextDouble();
                Square mySquare = new Sqaure(c);

                while(!mySaquare.verif()) {
                    System.out.println("Saisie erronée");
                    System.out.println("De quelle taille est votre carré ?");
                    scTemp = new Scanner(System.in);
                    cTemp = scTemp.nextDouble();
                    Square mySquare1 = new square(cTemp);
                    mySaquare = mySaquare1;
                    mySquare1.verif();
                }

                System.out.println("Le perimetre de votre carré est : " + mySquare.perimetre());
                System.out.println("L'aire de votre carre est de : " + mySqaure.aire());
                break;
            case 2:
                System.out.println("De quelle longueur est votre rectangle ?");
                scTemp = new Scanner(System.in);
                cTemp = scTemp.nextDouble();
                System.out.println("De quelle largueur est votre rectangle ?");
                Scanner scLar = new Scanner(System.in);
                double cR2 = (double)scLar.nextInt();
                Rectangle monRectangle = new Rectangle(cTemp, cR2);

                while(!monRectangle.verif()) {
                    System.out.println("Saisie incorecte");
                    System.out.println("De quelle longueur est votre rectangle ?");
                    scLonTemp = new Scanner(System.in);
                    cRTemp = scLonTemp.nextDouble();
                    System.out.println("De quelle largueur est votre rectangle ?");
                    Scanner scLarTemp = new Scanner(System.in);
                    double cRTemp2 = (double)scLarTemp.nextInt();
                    Rectangle monRectangleTemp = new Rectangle(cRTemp, cRTemp2);
                    monRectangle = monRectangleTemp;
                    monRectangleTemp.verif();
                }

                System.out.println("Le perimetre de votre rectangle est : " + monRectangle.perimetre());
                System.out.println("L'aire de  votre  rectangle  est de  : " + monRectangle.aire());
                break;
            case 3:
                System.out.println("De quelle taille est votre losange ?");
                scLonTemp = new Scanner(System.in);
                cRTemp = scLonTemp.nextDouble();
                Diamond myDiamond = new Diamond(cRTemp);

                Scanner scdiag;
                double diag;
                while(!myDiamond.verif()) {
                    System.out.println("Saisie incorecte");
                    System.out.println("De quelle longueur sont les cotés de votre losange ?");
                    scdiag = new Scanner(System.in);
                    diag = scdiag.nextDouble();
                    Diamond myDiamond1 = new Diamond(diag);
                    myDiamond = myDiamond1;
                    myDiamond1.verif();
                }

                System.out.println("Le perimetre de votre losange est : " + myDiamond.perimetre());
                System.out.println("Entrez la longueur de la diagonale connue :");
                scdiag = new Scanner(System.in);
                diag = scdiag.nextDouble();myDiamond.getCote());
                System.out.println("La diagonale d2 vaut : " + myDiamond.getDiagonal() + "cm");
        }

    }
}