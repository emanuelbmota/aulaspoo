
public class TesteSeries{

    public static void main(String[] args){

        Series s1 = new Series();
        s1.setI1(1);
        s1.setI2(10);
        s1.setPasso(1);
        System.out.println(s1.mostraSerie());

        Series s2 = new Series();
        s1.setI1(10);
        s1.setI2(0);
        s1.setPasso(2);
        System.out.println(s1.mostraSerie());

        Series s3 = new Series();
        s1.setI1(-5);
        s1.setI2(5);
        s1.setPasso(1);
        System.out.println(s1.mostraSerie());
    }
}