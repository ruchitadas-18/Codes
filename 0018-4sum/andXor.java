public class andXor {
    public static void main(String[] args){
        String a ="1A0A1A0A1";
        int d=0;
        for(int i=0; i<a.length(); i++){
            char b = a.charAt(i);
            if(b=='C'){
                d = Character.getNumericValue(a.charAt(i-1)) ^ Character.getNumericValue(a.charAt(i+1));
                a = a.replace(a.charAt(i+1),(char)d);
                
            }else if(b=='B'){
                d = Character.getNumericValue(a.charAt(i-1)) | Character.getNumericValue(a.charAt(i+1));
                a = a.replace(a.charAt(i+1),(char)d);
            }else if(b=='A'){
                d = Character.getNumericValue(a.charAt(i-1)) & Character.getNumericValue(a.charAt(i+1));
                a = a.replace(a.charAt(i+1),(char)d);
            }
        }
        System.out.println("d="+Math.abs(d));
    }
}
