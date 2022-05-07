package Constructor.com;

public class Market {

    public String address;
    public int capacity;
    public boolean isOpen;
    public char sideOfTown;

    public Market(){

    }

    public Market (String address){
        this.address = address;
    }
    public Market (String address, char sideOfTown){

    }
    public Market (String address, int capacity, boolean isOpen, char sideOfTown){

    }

    public static void main(String[] args) {
        Market market1 = new Market("Some Street");
        System.out.println(market1.address);

    }
}
