import java.util.*; 
public class sorted {     
    public static List< Integer > sortedArray(int []a, int []b) {    
        // Write your code here        
        //store the elements in hashmap         
        LinkedHashMap <Integer,Integer> map=new LinkedHashMap<>();        
        for(int i=0;i<a.length;i++){           
            if(map.containsKey(a[i])){                
                map.put(a[i],map.get(a[i])+1);             
            }
            else {
                map.put(a[i],1);             
            }        
        }//store the elements in hashmap         
        for(int i=0;i<b.length;i++){            
            if(map.containsKey(b[i]))             
            {                 
                map.put(b[i],map.get(b[i])+1);             
            }             
            else             
            {                 
                map.put(b[i],1);             
            }         
            
        }//add the elements of hashmap in list and return         
        List<Integer> list = new ArrayList<>();          
        for (Integer key : map.keySet()){                       
            list.add(key);                     
        }         
        Collections.sort(list);         
        return list;     
    }
    
    public static void main(String[] args){
        int b[] ={2,3,6};
        int a[] = {1,2,4,5,6,7,8,9,10};
        System.out.println(sortedArray(a, b));
    }
}   