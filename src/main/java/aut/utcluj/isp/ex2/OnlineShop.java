package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class OnlineShop extends Shop{
    private String webAddress;
    Shop shop;

    public OnlineShop(String name, String city, String webAddress) {
        super(name, city);
        shop = new Shop(name,city);
        this.webAddress=webAddress;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public String toString(){
        return "Shop: "+shop.getName()+" City: "+shop.getCity()+" Web address: "+webAddress+"";
    }
}
