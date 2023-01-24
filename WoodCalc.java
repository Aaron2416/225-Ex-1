public class WoodCalc {
    private int price;
    private int orderNumber;
    private String customerName;
    private int lengthOfDesk;
    private int widthOfDesk;
    private String woodType;
    private int numDrawers;

    static final int BASE_PRICE = 200; 
    static final int SURFACE = 50;
    static final int MAHOGANY = 150;
    static final int OAK = 125;
    static final int PINE = 0; 
    static final int DRAWER = 30; 

    public WoodCalc(int orderNumber, String customerName, int lengthOfDesk, int widthOfDesk, String woodType, int numDrawers) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.lengthOfDesk = lengthOfDesk;
        this.widthOfDesk = widthOfDesk;
        this.woodType = woodType;
        this.numDrawers = numDrawers;
        
        int surfaceArea = lengthOfDesk * widthOfDesk;
        int surfaceCharge = (surfaceArea > 750) ? SURFACE : 0;
        int woodCharge = 0;
        if (woodType.equalsIgnoreCase("mahogany")) {
            woodCharge = MAHOGANY;
        } else if (woodType.equalsIgnoreCase("oak")) {
            woodCharge = OAK;
        } else {
            woodCharge = PINE;
        }
        int drawerCharge = numDrawers * DRAWER;
        price = BASE_PRICE + surfaceCharge + woodCharge + drawerCharge;
    }
    
    public int getPrice() {
        return price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getLengthOfDesk() {
        return lengthOfDesk;
    }

    public int getWidthOfDesk() {
        return widthOfDesk;
    }

    public String getWoodType() {
        return woodType;
    }

    public int getNumDrawers() {
        return numDrawers;
    }
}