public class Main {
    public static void main(String[] args) {
        double weight = 2.5, price = 0;

        if(weight <= 2);
        {
            price = 3;
        }
        if(weight > 2)
        {
            if(weight <= 5)
            {
                price = 3 + 2*(weight-2);
            }
            if(weight > 5)
            {
                price = 9 + 3*(weight-2);
            }
        }
        System.out.println(price);
    }
}