class PlusOne{
    public int[] plusOne(int[] digits) {
        
        int len= digits.length; 
        ArrayList<Integer> plus= new ArrayList<Integer>();
        int c=1;
        for(int i=len-1;i>=0;i--){
              
            if(c==1){
                if(digits[i]==9){
                    plus.add(0); 
                    c=1;
                }
                else {
                    plus.add(digits[i]+1); c=0; 
                }
            }
              
            else{
                plus.add(digits[i]);
            }
        }
        if(c==1) {
            plus.add(1);
        }
        
        int ans[]=new int[plus.size()];
        int j=0;
        for(int i=plus.size()-1;i>=0;i--){
            ans[j]=plus.get(i);
            j++;
        }
        return ans;
    }
}
