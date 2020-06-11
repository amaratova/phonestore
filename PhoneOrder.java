package com.phonestore;

public class PhoneOrder implements ICheck{
    private  String clientName;
    private String telNo;
    private boolean orderID;
    private String companyname;
    private String model;
    private String color;
    private int capacity;

    public PhoneOrder(PhoneBuilder builder) {

        this.clientName = builder.clientName;
        this.telNo = builder.telNo;
        this.orderID = builder.orderID;
        this.companyname = builder.companyname;
        this.model = builder.model;
        this.color = builder.color;
        this.capacity = builder.capacity;
    }
    public boolean orderID(){return this.orderID;}

    public boolean isOrderID(){return this.orderID;}

    public String getCompanyName() {
        return this.companyname;
    }


    public String getModel() {
        return this.model;
    }


    public String getColor() {
        return this.color;
    }


    public int getCapacity() {
        return this.capacity;
    }


    @Override
    public String check() {
        return "You ordered " + this.companyname + " " + this.model + " with " + this.color + " color and " + this.capacity +
                "GB capacity. Your order is successfully saved";
    }


    public String toString() {
        return this.clientName + " " + this.telNo + " " + this.companyname + " " + this.model + " " + this.color + " " + this.capacity;
    }


    public static class PhoneBuilder {
        private  String clientName;
        private String telNo;
        private boolean orderID;
        private String companyname;
        private String model;
        private String color;
        private int capacity;

        public PhoneBuilder(String clientName, String telNo) {
            this.clientName = clientName;
            this.telNo = telNo;
        }

        public PhoneBuilder setOrderID(boolean orderID){
            this.orderID = orderID;
            return this;
        }
        public PhoneOrder.PhoneBuilder setCompanyname(String companyname) {
            this.companyname = companyname;
            return this;
        }

        public PhoneOrder.PhoneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PhoneOrder.PhoneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PhoneOrder.PhoneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PhoneOrder build() {
          return new PhoneOrder(this);

        }
    }
}
