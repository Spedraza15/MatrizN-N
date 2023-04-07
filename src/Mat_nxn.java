/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*albeiro.suarezra1998@gmail.com
 */
import java.util.Scanner;

/**
 *
 * @author Dacarth Sarmiento
 */
public class Mat_nxn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m[][]=new int [15][15];
        int f,c,h,p,n;
        Scanner lee=new Scanner(System.in);
        System.out.print("ingrese número impar");
        n=lee.nextInt();

        c=n/2;
        h=1;
        //c=1;
        f=0;
        m[f][c]=1;
        p=1;
        do
        {
            h=h+1;
            p++;
            if(p>n)
            {
                f++;
                p=1;
            }
            else
            {
                f--;
                if(f<0)
                {
                    c++;
                    f=n-1;
                }
                else
                    if(c>=n-1)
                        c=0;
                    else
                        c++;
            }
            m[f][c]=h;
        }

        while(h!=n*n);

        // IMPRESION DEL RESULTADO
        for(f=0;f<=n-1;f++)
        {
            for(c=0;c<=n-1;c++)
            {  System.out.print(m[f][c]+"   ");}
            System.out.println();
        } 
        
    }
    
}
