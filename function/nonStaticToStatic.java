package function;

 class nonStaticTostatic {
    void sum(int b,int c){
        int sum=b+c;
      System.out.println(sum);

    }
    public static void main(String [] args)
    {
        nonStaticTostatic ns= new nonStaticTostatic();
        ns.sum(4,5);
    }
}
