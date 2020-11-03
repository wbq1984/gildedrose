package com.gildedrose.util;

import java.io.*;

public class ReadFile {
    public static String getFile(String path) throws Exception {
        StringBuffer buffer = new StringBuffer();
        String encoding = "GBK";
        File file = new File(path);
        if (file.isFile() && file.exists()) { //判断文件是否存在
            InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file), encoding);//考虑到编码格式
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                buffer.append(lineTxt);
            }
            read.close();
        }
        return buffer.toString();
    }
}
