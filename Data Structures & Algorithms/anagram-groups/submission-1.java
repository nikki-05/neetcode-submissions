class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map <String, List<String>> mpp= new HashMap<>();
       for(String s: strs){
        char[] c= s.toCharArray();
        Arrays.sort(c);

        String key= new String(c);
        if(!mpp.containsKey(key)){
            //if already exisit , create new list and add string
            mpp.put(key, new ArrayList<>());
        }
        mpp.get(key).add(s);

       } 
       return new ArrayList<>(mpp.values());
    }
}
