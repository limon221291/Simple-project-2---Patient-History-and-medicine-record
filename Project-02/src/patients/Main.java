package patients;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("How many patients?");
        int n=in.nextInt();

        Patient[] p=new Patient[n];

        int[] id=new int[n];
        String[] name=new String[n];
        String[] history=new String[n];
        String[] med=new String[n];


        for(int i=0;i<n;i++){

            System.out.println("Patient id: ");
            id[i]=in.nextInt();
            in.nextLine();

            System.out.println("Patient name :");
            name[i]=in.nextLine();


            System.out.println("History: ");
            history[i]=in.nextLine();


            System.out.println("Medicines: ");
            med[i]=in.nextLine();

        }

        for(int i=0;i<n;i++){
            p[i]=new Patient(id[i],name[i],history[i]);
            p[i].setMedicines(med[i]);
        }

        for(Patient x: p){
            System.out.println(x.getMedicines());
        }
    }
}
