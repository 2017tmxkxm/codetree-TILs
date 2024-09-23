import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] symptoms = new char[3];
        int[] temperature = new int[3];
        int[] clinic = new int[4];

        for(int i=0; i<3; i++) {
            symptoms[i] = sc.next().charAt(0);
            temperature[i] = sc.nextInt();

            if(symptoms[i] == 'Y' && temperature[i]>=37) {
                clinic[0]++;
            }else if (symptoms[i] == 'N' && temperature[i]>=37){
                clinic[1]++;
            } else if (symptoms[i] == 'Y') {
                clinic[2]++;
            } else {
                clinic[3]++;
            }
        }

        for(int i=0; i<clinic.length; i++) {
            System.out.print(clinic[i] + " ");
        }

        if(clinic[0]>1) {
            System.out.print('E');
        }

    }
}