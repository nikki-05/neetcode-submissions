class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n= strs.length;
        List<List<String>> result=new ArrayList<>();
        boolean[] visited= new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]) continue;// skip if already  in the group

            List<String> current= new ArrayList<>();
            current.add(strs[i]);
            visited[i]= true;
            for(int j=i+1;j<n;j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    current.add(strs[j]);
                    visited[j]= true;
                }
            }
            result.add(current);
        }
        return result;
        
    }
    public boolean isAnagram(String s, String t) {
        char[] arr1= s.toCharArray();
        char[] arr2= t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result= Arrays.equals(arr1, arr2);
        return result;
    }
}
