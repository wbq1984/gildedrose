package com.gildedrose;

import org.assertj.core.api.IntegerAssert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {
    @Test
    public void should_double_increas_backstage_pass_value_when_getting_close_to_expiration(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        item.passOneDay();
        assertThat(item.quality).isEqualTo(21);
        item.passOneDay();
        assertThat(item.quality).isEqualTo(23);


    }

}