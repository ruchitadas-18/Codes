class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        Map<Integer, Integer> maps = new HashMap<>();
        for(int m: nums){
            maps.put(m, maps.getOrDefault(m,0)+1);
        }
        maps.forEach((k,v)->{
           if(v>(nums.length/3)) l.add(k); 
        });
        return l;
    }
}

