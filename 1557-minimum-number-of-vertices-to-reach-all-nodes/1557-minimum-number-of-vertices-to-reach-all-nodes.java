class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
    //List of nodes incoming
        boolean [] incomingNode = new boolean[n];
        //checking for each node its incoming or not
        for(List<Integer> edge: edges){
            incomingNode[edge.get(1)]= true;
        }
        
        List<Integer> requiredNodes = new ArrayList();
        
        for(int i=0; i<n; i++){
            //Store all the nodes that don't have incoming edge.
            if(!incomingNode[i]){
                requiredNodes.add(i);
            }
        }
        
        return requiredNodes;
    }
}