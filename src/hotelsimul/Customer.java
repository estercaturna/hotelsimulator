package hotelsimul;

import hotelsimul.Hotel;

public class Customer {
        private String name;
        private int customKey = 0;

    public int getCustomKey() {
        return customKey;
    }

    public void setCustomKey(int customKey) {
        this.customKey = customKey;
    }

    public String getName() {
        return name;
    }
    public Customer(String name, Hotel hotel){
            this.name = name;
        }

        public void checkIn(Hotel hotel){
            hotel.checkIn(this);
        }
        public void checkOut(Hotel hotel){
            hotel.checkOut(this);
        }
}