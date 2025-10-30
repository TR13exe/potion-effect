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
        /*
        System.out.println("输入条件");
        Scanner in = new Scanner(System.in);
        int foot = (int) (32/3.0);    //括号里的int或double可以强制转换右面公式的结果为整数或者非整数。
        System.out.println("输入英尺：");
//        int foot = in.nextInt();
        System.out.println("输入英寸：");
        double inch = in.nextDouble();    //*** double,双精度浮点数的类型名，可以加给inch或者foot。用nextDouble，就可以输入浮点数了。
        System.out.println("foot=" + foot + ",inch=" + inch);
        System.out.println((int) ((foot+inch/12.0)*0.3048*100) + "cm");    //*** 小数点10.0和10是不一样的数字，一个是非整数（浮点数）一个是整数,不加小数点，计算后小数点后面的所有值都是零，只检测前面整数。
        */

            Scanner in = new Scanner(System.in);
    //        System.out.println("是否相同：" + (5==5.0));    //非整数5.0和整数5是相等的。
            int shengyujine = 0;
        while (true)    //*** while，java关键词中循环的意思，true让这个while大括号里的代码一直运行下去。
        {
            System.out.println("请投入金币：");
            int tourujine = in.nextInt();
            System.out.println("是否大于10：" + (tourujine >= 10));    //小判断。是就是T，不是就是F。
            shengyujine = shengyujine+tourujine;
            if (shengyujine >= 10)
            {
                System.out.println("投入金额：" + tourujine);
                System.out.println("**************************");
                System.out.println("JAVA城车票");
                System.out.println("**************************");
                System.out.println("找零：" + (shengyujine-10));
                shengyujine = shengyujine-10;
            }
            System.out.println("剩余金额：" + shengyujine);
        }

        /*
        Scanner in = new Scanner(System.in);
        System.out.println("输入三个数");
        System.out.println("输入x的值：");
        double x = in.nextDouble();
        System.out.println("输入y的值：");
        double y = in.nextDouble();
        System.out.println("输入z的值：");
        double z = in.nextDouble();
        double max = 0.0;
        if (x > y)    //if的嵌套式，这种做法还不是最好的。。。
        {
            if (x > z)
            {
                max = x;
                System.out.println("max=" + max);
            }
            else
            {
                max = z;
                System.out.println("max=" + max);
            }
        }
        else
        {
            if (y > z)
            {
                max =y;
                System.out.println("max=" + max);
            }
            else
            {
                max = z;
                System.out.println("max=" + max);

            }
        }
        */
        /*
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        switch (type)    //*** switch是用来简化级联判断的多路分支行判断，而且其括号里的参数只能是整数，浮点数不行。
        {
            case 1:    //*** case后面的可以是常量，也可以是一个计算公式。
                System.out.println("你好");
                break;
            case 2:
                System.out.println("早上好");
            case 3:
                System.out.println("中午好");
                break;    //*** break是用来让选择并从上到下执行完指令后跳出这个大括号的，没有的话就会让执行执行下面别的选项。
            case 4:
                System.out.println("晚上好");
                break;
            default:    //*** default是当所有输入的条件都不符合时会执行的指令。
                System.out.println("你这家伙，在说什么呐！！！");
                break;
        }
        */
    }
}