public class Dog {
    int size;

    public void bark(){
        if(size > 60){
            System.out.println("Woof woof");
        }else if (size > 14){
            System.out.println("Ruf ruf");
        }else{
            System.out.println("Yip Yip");
        }
    }
}
