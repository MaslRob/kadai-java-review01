
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int tax = tax(price);
        int total = price + tax;
        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + tax + "円）です。");

    }

    public static int tax(int price) {
        // Calcuration of tax
        int rate = 10;
        int tax = (int) (price * (rate * 0.01)) ;
        return tax;

    }

}
