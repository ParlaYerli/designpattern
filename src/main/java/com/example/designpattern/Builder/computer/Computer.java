package com.example.designpattern.Builder.computer;

public class Computer {
    private String marka;
    private String fiyat;
    private String ram;

    private Computer(ComputerBuilder builder){
        this.marka= builder.marka;
        this.fiyat=builder.fiyat;
        this.ram= builder.ram;
    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public static class ComputerBuilder {
        private String marka;
        private String fiyat;
        private String ram;

        public ComputerBuilder marka(String marka) {
            this.marka = marka;
            return this;
        }

        public ComputerBuilder fiyat(String fiyat) {
            this.fiyat = fiyat;
            return this;
        }

        public ComputerBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}
