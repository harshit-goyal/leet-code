class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> count=new HashMap<>();
        int i=0;
        while(i<s.length()){
            Character temp = s.charAt(i);
            if(count.containsKey(temp))
            {
                Integer counter = count.get(temp)+1;
                count.put(temp,counter);
            }
            else
            {
                count.put(temp,1);
            }
            i++;
        }
        i=0;
        while(i<s.length()){
            if(count.get(s.charAt(i))==1) return i;
            i++;
        }
        return -1;
    }
}