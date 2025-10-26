import java.util.ArrayList;

public class firstLastOccurence {
    public static void main(String[] args) {
        int a[]={2,4,6,8,8,8,11,13};
        int n=a.length;
        int x=8;
        //by using previous stuff which is lower and upper bound
        lowerUpperBound lub=new lowerUpperBound();
        int first=lub.lower_bound(a, n, x);
        int last=lub.upper_bound(a, n, x)-1;
        System.out.println(first+","+last);
        //by using proper bs only, calculating based on mid value only
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(firstOccurence(a, n, x));
        ans.add(lastOccurence(a, n, x));
        System.out.println(ans);
    }
    public static int firstOccurence(int a[],int n,int x){
        int lo=0,hi=n-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==x){
                ans=mid;
                hi=mid-1;
            }
            else if(a[mid]>x){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static int lastOccurence(int a[],int n,int x){
        int lo=0,hi=n-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==x){
                ans=mid;
                lo=mid+1;
            }
            else if(a[mid]>x){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}
