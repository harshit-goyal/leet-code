class RandomizedSet {
 HashMap<Integer,Integer> hmap;
    ArrayList<Integer> arr;
    public RandomizedSet() {
         hmap=new HashMap<Integer,Integer>();
        arr=new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(hmap.get(val)!=null)
            return false;
         
         int s=arr.size();
         arr.add(val);
         hmap.put(val,s);
         return true;
    }
    
    public boolean remove(int val) {
         Integer idx=hmap.get(val);

        if(idx==null)
            return false;
        
        
        int size=arr.size();
        Integer last = arr.get(size-1);
        Collections.swap(arr,idx,size-1);
        
        hmap.put(last,idx);
        
        hmap.remove(val);
        arr.remove(size-1);


        return true;
    }
    
    public int getRandom() {
        if(arr.size()>0){
        Random rnd=new Random();
        int rnd_idx=rnd.nextInt(arr.size());
        return arr.get(rnd_idx);
        }
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */