class distributionFair {
    private int res=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
       backtracking(cookies,0,k,new int[k]);
       return res;
    }
    void backtracking(int[] cookies,int index,int k,int[] cookiesdistribution){
        if(index==cookies.length)  {
            int max=0;
            for(int cook: cookiesdistribution)  max=Math.max(max,cook);
                System.out.println("Max: "+max);
                res=Math.min(res,max);
                System.out.println("Res: "+res);
                return;
        }
        for(int i=0;i<k;i++){
            cookiesdistribution[i]+=cookies[index];
            System.out.println("cookdis: "+cookiesdistribution[i]);
            backtracking(cookies,index+1,k,cookiesdistribution);
            cookiesdistribution[i]-=cookies[index];
        }
    }
    public static void main(String[] args){
        int [] cookies = {8,15,10,20,8};
        int k =2;
        distributionFair df = new distributionFair();
        int a =df.distributeCookies(cookies, k);
        System.out.println(a);
    }
}