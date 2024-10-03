import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            list.add(temp);
        }
        int minVal=1000000;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<n;j++){
                temp+=Math.abs(i-j)*list.get(j);
            }
            minVal=Math.min(minVal, temp);
        }
        System.out.println(minVal);
    }
}