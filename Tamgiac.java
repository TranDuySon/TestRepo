package tamgiac;
import java.util.Scanner;
public class Tamgiac
{
public int a;
public int b;
public int c;

public int tinhChuvi(){
	int chuvi = a + b + c;
			return chuvi;
	
}

public float tinhDienTich(){
	float p = (float) ( a+b+c)/2;
	float dientich = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
	return dientich;
}

public static void main(String[] args) {
	Tamgiac tg = new Tamgiac();
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhập cạnh a: ");
	int canh_a = scanner.nextInt(); // lấy cạnh a
	tg.a = canh_a;
	System.out.print("Nhập cạnh b: ");
	int canh_b = scanner.nextInt(); // lấy cạnh b
	tg.b = canh_b;
	System.out.print("Nhập cạnh c: ");
	int canh_c = scanner.nextInt(); // lấy cạnh c
	tg.c = canh_c;
	
	int chuvi = tg.tinhChuvi();
	float dientich = tg.tinhDienTich();
	System.out.println("Chu vi hình tam giác là: " + chuvi);
	System.out.println("Diện tích hình tam giác là: " + dientich);
	
} 


}