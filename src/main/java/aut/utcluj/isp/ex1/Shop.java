package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Shop {
    private String name;
    private String city;

    public Shop(String name, String city) {

        this.name=name;
        this.city=city;
    }

    public Shop(String name) {
        this.city ="";
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public boolean equals(Object o){
        if(o==null) return false;
        if(!(o instanceof Shop)) return false;
        Shop other = (Shop) o;
        return this.name.equals(((Shop) o).name) &&
                this.city.equals(((Shop) o).city);
    }

    @Override
    public String toString() {
        return "Shop: " + name +
                " City: " + city ;
    }
}
