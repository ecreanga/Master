public class Certificare {
    public static void main(String[] args) {
        int i =1; int j = 0;
        switch (i){
            case 2: j +=6;
            case 4: j +=1;
            default: j +=2;
            case 0: j +=4;

        }
        System.out.println("j = " + j);


        i = 1; j= 10;
        do {
            if (i > j){
                break;
            }
            j--;
        }while(++i < 5);
        System.out.println("i = " + i  + " and j =" + j);
    }
}
