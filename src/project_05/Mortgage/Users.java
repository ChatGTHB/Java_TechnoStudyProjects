package project_05.Mortgage;

public class Users {
    /*
        User Class, HousePrices Class ının ebeveyn classidir.
        her bir User in almasi gereken attribute lar private olmalıdır ve su sekildedir:
        String olanlar -> username, whichCondtiton, houseType
        int olanlar -> roomCount, downPayment, longTerm
        ve son olarakta StatesTax cinsinden bir StatesTax olmalıdır:
        "private StatesTax statesTax;"
     */
    //--------------------------------------------------------------
    // -> Attributes
    private String username;
    private String whichCondition;
    private String houseType;
    private int roomCount;
    private int downPayment;
    private int longTerm;
    private StatesTax statesTax;
    //--------------------------------------------------------------

    /*
        Bir constructor methodu oluşturup, tüm attribute lar constructorda gelmeli ve daha sonra sınıfın kendi attributelarına
    eşitlenmelidir.
     */

    //--------------------------------------------------------------
    // -> Constructor

    public Users(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        this.username = username;
        this.whichCondition = whichCondition;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.longTerm = longTerm;
        this.statesTax = statesTax;
    }

    //--------------------------------------------------------------

    // Son olarak ise tüm attributelar icin sadece getter methodlar oluşmalıdır.

    //--------------------------------------------------------------
    // -> Methods

    public String getUsername() {
        return username;
    }

    public String getWhichCondition() {
        return whichCondition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public StatesTax getStatesTax() {
        return statesTax;
    }

    //--------------------------------------------------------------
}

