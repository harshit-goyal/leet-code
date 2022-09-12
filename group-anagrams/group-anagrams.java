class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<List<String>>();
        Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        for(String str:strs){
            char[] arr = new char[26];
            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)-'a']++;
            }
            String key = new String(arr);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                ArrayList<String> list = new ArrayList();
                list.add(str);
                map.put(key,list);
            }
        }
        result.addAll(map.values());
        return result;
}
}