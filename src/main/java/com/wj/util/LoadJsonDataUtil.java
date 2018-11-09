package com.wj.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author wangJun
 * @Description //TODO $end$
 * @Date $time$ $date$
 **/
public class LoadJsonDataUtil {

    public static String loadJson(String path) {
        InputStream in = LoadJsonDataUtil.class.getClassLoader().getResourceAsStream(path);
        try {
            InputStreamReader reader = new InputStreamReader(in, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            StringBuffer sb = new StringBuffer();
            while (line != null) {
                sb.append(line);
                line = bufferedReader.readLine();
            }
            return sb.toString();
        }
        catch (Exception e) {
            throw new RuntimeException("加载文件失败");
        }
    }

    public static void main(String args[]) {
        String path = "medadata/xsy_100-bigdata_membership.json";
        String str = loadJson(path);
        System.out.println(str);
    }
}
