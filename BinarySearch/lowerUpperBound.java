import java.util.ArrayList;

public class lowerUpperBound {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int n=a.length;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(lower_bound(a, n, 30));
        ans.add(upper_bound(a, n, 30));
        System.out.println(ans);
    }
    public static int lower_bound(int a[],int n,int x){
        int lo=0,hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]>=x){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;//no lower 
    }
    public static int upper_bound(int a[],int n,int x){
        int lo=0,hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]>x){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;//no upper(hypothetical guessing)  
    }
}
