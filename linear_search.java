public class linear_search {
    public static void main(String[] args) {
        int a[]={23,1,16,19,22};
        int n=a.length,ele=1;
        linear(a,n,ele);
    }    
    private static void linear(int[] a, int n, int ele) {
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                System.out.println("element found at position "+i);
                break;
            }
        }
    }        
        
}
