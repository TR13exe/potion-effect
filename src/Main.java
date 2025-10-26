import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main
{
    public static void main(String[] args)
    {
        /*
        System.out.println("有什么事吗");    //输出
        Scanner in = new Scanner(System.in);    //*** 读取输入的信息
//        System.out.println("程序：" + in.nextLine());
        System.out.println("请输入减数：");
        int bianliang2 = in.nextInt();    //int，java关键词里整数的类型名称，用等号赋值输入的整数给bianliang这个变量名（定义）。这是一个变量的创建
//        final int bianliang3 = 50;    //*** final，很熟悉吧？这是用来固定的，这里固定了这个值，所以这个变量变成了常量。
        System.out.println("请输入被减数：");
        int bianliang = in.nextInt();
        System.out.println(bianliang2 + "-" + bianliang + "=" + (bianliang2-bianliang));    //输出公式
         */
        System.out.println("输入条件");
        Scanner in = new Scanner(System.in);
        System.out.println("输入英尺：");
        int foot = in.nextInt();
        System.out.println("输入英寸：");
        double inch = in.nextDouble();    //*** double,双精度浮点数的类型名，可以加给inch或者foot。用nextDouble，就可以输入浮点数了。
        System.out.println("foot=" + foot + ",inch=" + inch);
        System.out.println((foot+inch/12.0)*0.3048);    //*** 小数点10.0和10是不一样的数字，一个是非整数（浮点数）一个是整数,不加小数点，计算后小数点后面的所有值都是零，只检测前面整数。
    }
}