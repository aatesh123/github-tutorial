class Juice1{
    enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}
public class Juice{

    public static void main(String args[])
    {
        Juice1 juice=new Juice1();
        juice.size=Juice1.FreshJuiceSize.SMALL;
        System.out.println("Size: "+ juice.size);
    }
}