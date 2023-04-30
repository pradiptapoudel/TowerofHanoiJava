class tower{
    public static void TOH(int n,String start,String help,String end){
        if(n==1){
            System.out.println(start+" to "+ end);
        }
        else{
            TOH(n-1,start,end,help);
            System.out.println(start+" to "+ end);
            TOH(n-1,help,start,end);
        }

    }
    public static void main(String[] args){
        TOH(3,"A","B","C");
    }
}