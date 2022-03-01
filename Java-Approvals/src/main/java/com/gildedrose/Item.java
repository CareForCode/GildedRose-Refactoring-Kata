package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    void invalidateQuality() {
        this.quality = 0;
    }

    void decreaseQuality() {
        this.quality = Math.max(0, this.quality - 1);
    }

    void incrementQuality() {
        this.quality = Math.min(50, this.quality + 1);
    }

    void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
