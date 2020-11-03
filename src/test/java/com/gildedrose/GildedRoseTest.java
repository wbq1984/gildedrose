package com.gildedrose;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.gildedrose.util.ReadFile;
import org.assertj.core.api.Assert;
import org.junit.Test;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
public class GildedRoseTest {

    @Test
    public void should_always_align_wiht_baseline() throws Exception {
        String output = TextTestFixture.getBaseline().replaceAll("\r\n","");
//        String baseline = ReadFile.getFile("src/test/baseline.txt");
        File file = new File("src/test/baseline.txt");
//        List<String> lines = Files.readLines(file, Charsets.UTF_8);
        String baseline = Files.asCharSource(file, Charsets.UTF_8).read();
        assertThat(output).isEqualTo(baseline);


    }


}
