public class Choco {
    public static void main(String[] args) {
        int money = 0;
        int chocolates = 0;
        int price = 1;
        /*while (money > price){
            chocolates++;
            money -= price;
        }
        System.out.println(chocolates);*/

        do {
            chocolates++;
            money -=price;
        } while (money > price);
        System.out.println(chocolates);
    }
}
