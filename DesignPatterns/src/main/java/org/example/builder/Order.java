package org.example.builder;

public final class Order  {
    private  int deadline;
    private int packageNumber;
    private  String topic;
    private String address;

    public Order(Builder builder) {
        this.address=builder.address;
        this.topic=builder.topic;
        this.packageNumber=builder.packageNumber;
        this.deadline=builder.deadline;
    }


    public String getAddress() {
        return address;
    }

    public String getTopic() {
        return topic;
    }

    public int getEndTime() {
        return deadline;
    }

    public int getNumberOfPackages() {
        return packageNumber;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("this is a order with topic :").append(topic);
        sb.append(" to address : ").append(address);
        sb.append(" with time limit of :").append(deadline);
        sb.append(" no of package :").append(packageNumber);
        return sb.toString();
    }

    public static class Builder {

        public final int deadline;
        public int packageNumber=0;
        public final String topic;
        public String address="";


        public Builder(String topic, int deadline) {
            if (topic == null || deadline == 0) {
                throw new IllegalArgumentException("topic and deadline can not be null");
            }
            this.topic = topic;
            this.deadline = deadline;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPackageNumber(int packageNumber) {
            this.packageNumber = packageNumber;
            return this;
        }


        public Order build() {
            return new Order(this);
        }
    }

}

