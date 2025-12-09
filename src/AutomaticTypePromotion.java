public class AutomaticTypePromotion {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        float d = a*b/c;
        System.out.println(d);
    }
}
