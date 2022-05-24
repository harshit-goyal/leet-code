class Solution {
    public int reverse(int x) {
         boolean isNegative=false;
        if(x<0){
            isNegative = true;
            x=x*(-1);
        }
        String value = String.valueOf(x);
        StringBuilder s = new StringBuilder();
        s.append(value);
        s = s.reverse();
        int r;
        try{
        r = Integer.parseInt(s.toString());
        }catch(Exception e){
            return 0;
        }
        if(isNegative){
            return r*(-1);
        }
        return r;
    }
}