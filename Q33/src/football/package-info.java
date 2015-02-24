package football;
import java.util.Scanner;

class QBrating{
	public static void main(String[] args){
		double userin1;
		double userin2;
		double userin3;
		double userin4;
		double userin5;
		double Prating;
		double a;
		double b;
		double c;
		double d;
		Scanner in = new Scanner(System.in);
		
		System.out.println("number of touchdowns");
		userin1 = in.nextInt();
		System.out.println("total yards");
		userin2= in.nextInt();
		System.out.println("interceptions");
		userin3= in.nextInt();
		System.out.println("attempted passes");
		userin4= in.nextInt();
		System.out.println("Completions");
		userin5= in.nextInt();
		c=(userin1/userin4)*20;
		a=((userin5/userin4)-.3)*5;
		b=((userin2/userin4)-3)*0.25;
		d=2.375-((userin3/userin4)*25);
		if(a<0){
			a=0;
			}
		if(b<0){
			b=0;
			}
		if(c<0){
			c=0;
			}
		if(d<0){
			d=0;
			}
		if(a>2.375){
			a=2.375;
			}
		if(b>2.375){
			b=2.375;
			}
		if(c>2.375){
			c=2.375;
			}
		if(d>2.375){
			d=2.375;
			}
		Prating=((a+b+c+d)/6)*100;
		System.out.println("their rating is:"+Prating);
		in.close();
	}
}