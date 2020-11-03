package com.gildedrose;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.junit.Test;
import java.io.File;
import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseTest {

    @Test
    public void should_always_align_wiht_baseline() throws Exception {
        String output = TextTestFixture.getBaseline().replaceAll("\r\n", "");
        /*
            生成baseline.txt
            File baselineFile = new File("src/test/baseline.txt");
            String baseline = Files.asCharSource(baselineFile, Charsets.UTF_8).read();
            Files.asCharSink(baselineFile, Charsets.UTF_8).write(output);
         */
        //读取生成baseline.txt 文件内容
        String baseline = Files.asCharSource(new File("src/test/baseline.txt"), Charsets.UTF_8).read();
        assertThat(output).isEqualTo(baseline);
    }


}
