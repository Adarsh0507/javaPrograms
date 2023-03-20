class Adarsh extends Exception{
    Adarsh(String s){
        super(s);
    }
}

class CustomExceptions{
    public static void main(String args[]){
        try{
            throw new Adarsh("User defined Exception");
        }
        catch(Adarsh a){
            System.out.println("Custom exception created");
            System.out.println(a.getMessage());
        }
    }
}