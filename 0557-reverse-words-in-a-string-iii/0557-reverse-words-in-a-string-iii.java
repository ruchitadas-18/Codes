class Solution {
    public String reverseWords(String s) {
      String[] arr=s.split("\\s");
      String reverse="";
      for(int i=0;i<arr.length;i++){
           reverse+=(new StringBuffer(arr[i])).reverse().toString()+" ";
      }
      return reverse.trim();
    }
}