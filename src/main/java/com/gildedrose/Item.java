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

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected boolean isBackstagePass() {
        /*
            https://blog.csdn.net/qq_42499188/article/details/85193886 迪米特法则
            return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
            item.name 违反了迪米特法则
         */
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    protected boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    protected boolean isAgedbrie() {
        return name.equals("Aged Brie");
    }
}
