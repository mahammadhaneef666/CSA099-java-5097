public class terniaryopeartor {
    public static void main(String[] ar)
    {
        int n1=10;
        int n2=15;
        int n3=25;
        int largest=(n1>n2)?((n1>n3?n1:n3)):((n2>n3?n2:n3));
        System.out.println("largest:"+largest);
    }
}
