public class Dynamic {
    int n;
    public void fib(int n){
        int[] table = new int[n+1];
        table[0]=0;
        table[1]=1;
        for(int i=2;i<=n;i++){
            table[i] = table[i-1]+table[i-2];
        }
        for(int num:table){
            System.out.println(num);
        }


    }
    public static void main(String[] args) {
        Dynamic d = new Dynamic();
        d.fib(5);
    }
    
}
