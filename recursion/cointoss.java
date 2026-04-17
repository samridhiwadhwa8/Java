    class Main{
        public static void main(String[] args)
        {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           toss(n,"");
        }
        public static void toss(int n,String ans){
            if(n==0){
                System.out.print(ans+" ");
                return ;
            }
            toss(n-1,ans+"H");
            toss(n-1,ans+"T");
        }
    }
