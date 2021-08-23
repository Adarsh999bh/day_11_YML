

import java.util.Scanner;/**
 * Hello world!
 *
 */
public class linecomp 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to line comp" );
        int l1[]=new int[4];
        int l2[]=new int[4];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the coordinates for line 1");
        System.out.print("X_1=");
        l1[0]=sc.nextInt();
        System.out.print("Y_1=");
        l1[1]=sc.nextInt();
        System.out.print("X_2=");
        l1[2]=sc.nextInt();
        System.out.print("Y_2=");
        l1[3]=sc.nextInt();
        System.out.print("enter the coordinates for line 2\n");
        System.out.print("X_1=");
        l2[0]=sc.nextInt();
        System.out.print("Y_1=");
        l2[1]=sc.nextInt();
        System.out.print("X_2=");
        l2[2]=sc.nextInt();
        System.out.print("Y_2=");
        l2[3]=sc.nextInt();
        sc.close();
        Double dis1=new Double(Math.sqrt(Math.pow(l1[3]-l1[1],2)+Math.pow(l1[2]-l1[0],2)));
        Double dis2=new Double(Math.sqrt(Math.pow(l2[3]-l2[1],2)+Math.pow(l2[2]-l2[0],2)));
        System.out.println("length of line 1 = "+dis1+"\nlength of line 2 = "+dis2);

        //using equals method
        if (dis1.equals(dis2))
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");
        
        //using compareto method
        int com=dis1.compareTo(dis2);
        if(com > 0) {
            System.out.println("line 1 is larger than line 2");
        }
        else if(com < 0) {
            System.out.println("line 1 is smaller than line 2");
        }
        else {
             System.out.println("line 1 is equal to line 2");
        }

}
}
