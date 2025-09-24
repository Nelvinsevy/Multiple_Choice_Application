package Application;

import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
        String []q= {"Capital of India ?","2+2=?"};
        String[][]opt= {{"1)Delhi","2)Mumbai","3)Chennai"},
        		           {"1)3","2)4","3)5"}};
        int []ans= {1,2};
        int score =0;
        Scanner sc= new Scanner(System.in);
        
        for(int i=0;i<q.length;i++) {
        	System.out.println(q[i]);
        	for(String o:opt[i])System.out.println(o);
        	System.out.print("Enter your choice :");
        	if(sc.nextInt()==ans[i]) {
        		score++;
        	}
        	System.out.println("You scored :"+score+"/"+opt.length);
        }
    	sc.close();

	}

}
