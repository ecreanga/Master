import java.util.Scanner;

public class Generatii {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti varsta");

        int age = in.nextInt();
        String generatia;
        if(age < 0){
//            generatia = "Valoare incorecta";
            System.out.println("Varsta incorecta");
            return;
        }
         else if (age < 6){
            generatia = "alfa";
        } else if (age <= 20 ){
            generatia="z";
        }else{
            generatia = "builders";
        }

        System.out.println("Generstis este: "+ generatia);
    }
}
