package com.ouyang;

/**
 * @author oy
 * @description
 * @date 2019/5/29
 */
public class DownLoadTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String filepath = "http://127.0.0.1:8080/file/loadfile.mkv";
        MultiTheradDownLoad load = new MultiTheradDownLoad(filepath ,4);
        load.downloadPart();
    }

}
