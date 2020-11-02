package com.gildedrose;

import com.gildedrose.util.ReadFile;
import org.assertj.core.api.Assert;
import org.junit.Test;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
class GildedRoseTest {
    @Test
    public void should_always_align_wiht_baseline() throws Exception {
        String output = TextTestFixture.getBaseline();
        String fileTest = ReadFile.getFile("src/test/baseline.txt");
        System.out.println("_-----"+fileTest);
        assertThat(output).isEqualTo(fileTest);


    }


}
