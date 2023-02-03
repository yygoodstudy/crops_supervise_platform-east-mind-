package com.example.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author yuanyao
 * @Date 2022/9/16
 */
public class FileWriterReaderTest {

    public static void main(String[] args) throws IOException {
        fileWrite("love 张洁");
    }

    public static void fileWrite(String writeStr) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter("write.txt", true);
            writer.write(writeStr);
            System.out.println("向文件中写入字符串成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert writer != null;
            writer.close();
        }
    }
}
