class grandfather{
    public String name;
    public void setname(String n){
        this.name = n;
    }
    public String getname(){
        return name;
    }
    public grandfather(String n){
        this.name = "kalikaprasad";
    }
}
class father extends grandfather{
    public String name;
    public void setname(String a){
        this.name = a;
    }
    public String getname(){
        return name;
    }
    public father(String n,String a){
        super(n);
        this.name = "AMARNATH KATIYAR";
    }
}
class son extends father{
    public String name;
    public void setname(String m){
        this.name = m;

    }
    public String getname(){
        return name;
    }
    public son(String n,String a, String m){
        super(m,a);
        this.name = "gaurav katiyar";
    }
}
class inheritance2 {
    public static void main(String[] args) {
        grandfather g = new grandfather("Kalikaprasad");
        System.out.println(g.getname());

        father f = new father("AMARNATH KATIYAR" , "Kalikaprasad");
        System.out.println(f.getname());

        son s = new son("gaurav katiyar" , "AMARNATH KATIYAR" , "Kalikaprasad");
        System.out.println(s.getname());
    }

}

    

