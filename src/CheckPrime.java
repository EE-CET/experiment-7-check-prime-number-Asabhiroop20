import java.util.Scanner ;
public class CheckPrime {
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                int n= sc.nextInt();
                int temp=0;
                if(n==1){
                        temp=1;
                        }
                for (int i=2;i<n;i++){
                        if(n%i==0){
                               temp=1;
                               break;
                        }
                        else{
                                temp=0;
                             
                        }

                }
                if (temp==1) {
                         System.out.println("Not Prime");
                        
                }
                else{
                         System.out.println("Prime");
                }
                sc.close();
        }
   
}
