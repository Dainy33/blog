package blog.utils;

import sun.misc.BASE64Encoder;

import java.io.IOException;

public class Hex {
    private static String hexString2binaryString(String hexString) {
        if (hexString == null || hexString.length() % 2 != 0)
            return null;
        String bString = "", tmp;
        for (int i = 0; i < hexString.length(); i++) {
            tmp = "0000" + Integer.toBinaryString(Integer.parseInt(hexString.substring(i, i + 1), 16));
            bString += tmp.substring(tmp.length() - 4);
        }
        return bString;
    }

    private static byte[] binStrToByteArr(String binStr) {
        char[] ch = binStr.toCharArray();
        byte[] b = new byte[ch.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) ch[i];
        }
        return b;
    }

    private static String getImageString(byte[] data) throws IOException {
        BASE64Encoder encoder = new BASE64Encoder();
        return data != null ? encoder.encode(data) : "";
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2019-01-04 19:07
 **/
