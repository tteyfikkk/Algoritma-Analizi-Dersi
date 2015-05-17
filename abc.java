
public class abc {

	
	public static void main(String[] args) {
		int sayi,a,b,c,i;
		
		for(i=100;i<1000;i++){
			a=i/100;
			b=(i-(a*100))/10;
			c=(i-(a*100)-(b*10));
			sayi=a*a*a+b*b*b+c*c*c;
			if (i==sayi)
			{
				System.out.println(" " + i + " ");
			}
		}
}
}
