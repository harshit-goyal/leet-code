class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        if(s==null || s.isEmpty()){
            result.add("");
            return result;
        }
        generate(result,0,s.toCharArray(),new StringBuilder());
        return result;
        
    }
    public void generate(List<String> result,int index, char[] array, StringBuilder sb){
        if(index==array.length){
            result.add(sb.toString());
            
        }else if(index<array.length){
            if(array[index]>='0' && array[index]<='9'){
                sb.append(array[index]);
                generate(result,index+1,array,sb);
                sb.deleteCharAt(index);
            }else{
                sb.append(Character.toUpperCase(array[index]));
               generate(result,index+1,array,sb);
                sb.deleteCharAt(index);
                sb.append(Character.toLowerCase(array[index]));
                generate(result,index+1,array,sb);
                sb.deleteCharAt(index);
            }
        }
    }
}