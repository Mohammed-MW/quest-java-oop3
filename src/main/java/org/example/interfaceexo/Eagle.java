package org.example.interfaceexo;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeoff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s Hawkeye takes off in the sky. %n", this.getName());
        }
    }

    @Override
    public int flieup(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    @Override
    public int fliedown(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 325);
            System.out.printf("%s flies downward, altitude: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }


    @Override
    public void land() {
        if (this.flying && this.altitude <= 1) {
            System.out.printf("%s lands on the ground. %n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land. %n", this.getName());
        }
    }
    @Override
    public void glide() {
        System.out.printf("glides into the air. %n");
    }
}
