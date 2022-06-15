package chapter9;

public class TasteTester {

    public static void main(String[] args) {

       Cake cake = new Cake("chocolate");
       cake.setPrice(9.99);
       System.out.println("The cake flavor: " + cake.getFlavor());
       System.out.println("The cake price: " + cake.getPrice());

       BirthdayCake birthdayCake = new BirthdayCake();
       birthdayCake.setPrice(99.99);
       System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
       System.out.println("Birthday cake price: " + birthdayCake.getPrice());

       WeddingCake weddingCake = new WeddingCake();
       weddingCake.setFlavor("pina colada");
       System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
       System.out.println("Wedding cake price: " + weddingCake.getPrice());

    }
}
