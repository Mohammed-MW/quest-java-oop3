package org.example.interfaceexo;

public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();
        System.out.println("");
        System.out.println("");

        Eagle hawkeye = new Eagle("Hawkeye");
        // TODO : uncomment the following code in order to test it
        hawkeye.takeoff();
        hawkeye.flieup(120);
        hawkeye.flieup(30);
        hawkeye.glide();
        hawkeye.fliedown(140);
        hawkeye.land();
        hawkeye.fliedown(9);
        hawkeye.land();

    }
}
