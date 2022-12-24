package org.example;

public class ColaAdvertisingProxy implements Advertising{
    private ColaAdvertising colaAd = new ColaAdvertising();
    private int AdCount = 0;
    public void showAd() {
        colaAd.showAd();
        AdCount += 1;
    }
    public void printAdCount(){
        System.out.println("Количество показанной рекламы: " + AdCount);
    }
    public void clearCount(){
        AdCount = 0;
    }
}
