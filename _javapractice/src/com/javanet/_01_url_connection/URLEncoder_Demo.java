package com.javanet._01_url_connection;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
/*
    HTML 格式编码的实用工具类。
    URLEncoder和URLDecoder用于完成普通字符串和application/x-www-form-urlencoded MIME字符串之间的相互转换
    该类包含了将String转换为application/x-www-form-urlencoded MIME格式的静态方法。
*/
public class URLEncoder_Demo {
    public static void main(String[] args) throws Exception {
//        获取平台的默认字符集
//        System.out.println(System.getProperty("file.encoding"));//UTF-8
        String str = "无关风月 iNsomnia 18";
//        使用UTF-8编码
        String encode = URLEncoder.encode(str,"UTF-8");
        System.out.println(encode);//%E9%8F%83%E7%8A%B2%E5%8F%A7%E6%A4%8B%E5%BA%A2%E6%B9%80+iNsomnia+18
//        使用UTF-8解码
        String decoder = URLDecoder.decode(encode,"UTF-8");
        System.out.println(decoder);
    }
}
/*编码和解码
    在web浏览器中，不同的浏览器的编码和解码规则是不一样的
    对于W3C浏览器：遵循W3C组织规范的浏览器(非IE)；
        编码:byte[] data = "无关风月".getByte(String charsetName);
        解码:String str = new String(data,String charsetName);

    对于IE浏览器：
        编码使用的application/x-www-form-urlencoded MIME 机制

*/