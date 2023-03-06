import java.util.Random;

public class random {
    public static void main(String[] args){
        Random r = new Random();
        double d1=r.nextDouble();
        double d2 = r.nextDouble() * 7;
        int i1=r.nextInt(10);
        int i2=r.nextInt(18)-3;
        long l1=r.nextLong();
        boolean b1=r.nextBoolean();
        float f1=r.nextFloat();
        System.out.println("生成的[0,1.0]区间的小数是：" + d1);
        System.out.println("生成的[0,7.0]区间的小数是：" + d2);
        System.out.println("生成的[0,10]区间的整数是：" + i1);
        System.out.println("生成的[-3,15]区间的整数是：" + i2);
        System.out.println("生成一个随机长整型值：" + l1);
        System.out.println("生成一个随机布尔型值：" + b1);
        System.out.println("生成一个随机浮点型值：" + f1);
        System.out.print("下期开奖号码预测：");
        for (int i=1;i<8;i++){
            int num=r.nextInt(9);
            System.out.print(num);
        }
        System.out.println("\n");
    }
}