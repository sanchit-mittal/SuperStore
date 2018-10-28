/*
 * Name    : - PORVIL
 * Roll No : - 2017304
 */
package superstore.Data;

/**
 *
 * @author PD
 */
public class Item {
    private static int D;
    
    private String path;
    private String name;
    private double price;
    private int quantity;
    private int H;
    private int K;
    private double EOQ;
    private long UID;
    
    
    public static int getD() {
        return D;
    }

    public static void setD(int D) {
        Item.D = D;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

    public int getK() {
        return K;
    }

    public void setK(int K) {
        this.K = K;
    }

    public double getEOQ() {
        return EOQ;
    }

    public void setEOQ(double EOQ) {
        this.EOQ = EOQ;
    }

    public long getUID() {
        return UID;
    }

    public void setUID(long UID) {
        this.UID = UID;
    }   
    
}
