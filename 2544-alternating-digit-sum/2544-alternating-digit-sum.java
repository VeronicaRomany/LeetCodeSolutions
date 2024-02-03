class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        ArrayList<Integer> dig = new ArrayList();
        
        while(n != 0){
            dig.add(n%10);
            n= n/10;
        }
        
        Collections.reverse(dig);

        int [] signs = {1,-1};
        int control = 0;
        
        for(int i=0 ; i<dig.size();i++){
            sum += signs[control] * dig.get(i);
            control = (control+1)%2;
        }
        return sum;
    }
}