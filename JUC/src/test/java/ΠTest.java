import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @ClassName: ΠTest.java
 * @Description: TODO
 * @Author: LQH
 * @Data: 2020年06月15日 17:55:00
 * @Version: 1.0
 **/

public class ΠTest {
	public static void main(String[] args) {
		System.out.print("请输入循环次数(10次可精确到小数点后30位，循环次数越多精确度越高)：");
		Scanner reader = new Scanner(System.in);
		int theNumberOfCircles = reader.nextInt();
		System.out.print("请输入要输出的小数点后的位数：");
		int preciseFigures = reader.nextInt();
		reader.close();//关闭扫描器
		
		//定义各个引用变量
		BigDecimal PI = null;//PI
		BigDecimal a = null;//公式的第一项
		BigDecimal b = null;//公式的第二项
		BigDecimal c = null;//公式的第三项
		BigDecimal d = null;//公式的第四项
		BigDecimal e = null;//公式的第五项
		BigDecimal f = null;//公式的第六项
		BigDecimal g = null;//公式的第七项
		BigDecimal h = null;//公式的第八项
		
		BigDecimal tempt = new BigDecimal(0);
		System.out.println("计算机正在全力计算中...请稍后...");
		
		long startTime = System.nanoTime();//开始时间
		
		for (int i = 0; i < theNumberOfCircles; i++) {
			
			//a=(-1/1024)^i
			a = BigDecimal.valueOf(-1).divide(BigDecimal.valueOf(1024)).pow(i);//valueOf()方法，BigDecimal的静态方法，将 double 转换为 BigDecimal
			//pow()方法，BigDecimal类中的方法,原型BigDecimal pow(int n, MathContext mc);
			//返回其值为 (this^n) 的 BigDecimal
			
			//b=32/(4i+1)
			b = BigDecimal.valueOf(32).divide(BigDecimal.valueOf(4).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(1)), preciseFigures + 3, BigDecimal.ROUND_DOWN);
			//为求精确,计算精度比输出值多三位
			//ROUND_DOWN接近零的舍入模式（截取）
			
			//c=1/(4n+3)
			c = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(4).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(3)), preciseFigures + 3, BigDecimal.ROUND_DOWN);
			
			//d=256/(10n+1)
			d = BigDecimal.valueOf(256).divide(BigDecimal.valueOf(10).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(1)), preciseFigures + 3, BigDecimal.ROUND_DOWN);
			
			//e=64/(10n+3)
			e = BigDecimal.valueOf(64).divide(BigDecimal.valueOf(10).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(3)), preciseFigures + 3, BigDecimal.ROUND_DOWN);
			
			//f=4/(10n+5)
			f = BigDecimal.valueOf(4).divide(BigDecimal.valueOf(10).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(5)), preciseFigures + 3, BigDecimal.ROUND_DOWN);
			
			//g=4/(10n+7)
			g = BigDecimal.valueOf(4).divide(BigDecimal.valueOf(10).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(7)), preciseFigures + 3, BigDecimal.ROUND_DOWN);
			
			//h=1/(10n+9)
			h = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(10).multiply(BigDecimal.valueOf(i)).add(BigDecimal.valueOf(9)), preciseFigures + 3, BigDecimal.ROUND_DOWN);
			
			//tempt=tempt+a(d+h-b-c-e-f-g)  循环累加
			tempt = tempt.add(a.multiply(d.add(h).subtract(b).subtract(c).subtract(e).subtract(f).subtract(g)));
			
		}
		PI = tempt.divide(BigDecimal.valueOf(64));//PI=tempt/64
		long endTime = System.nanoTime();//结束时间
		System.out.println("PI=" + PI.setScale(preciseFigures, BigDecimal.ROUND_DOWN) + "\n共用时："
				+ (endTime - startTime) / 1000000000.0 + "秒");
	}
}