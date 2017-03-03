package com.part01;

/**
 * 将一个字符串中的空格替换成"%20"
 * Created by Dong on 2017/3/2.
 */
public class ReplaceSpace {
    public StringBuffer replaceSpace(StringBuffer stb){
        String str = stb.toString();
        char[] strChar = str.toCharArray();
        StringBuffer stbResult = new StringBuffer();

        for (int i=0; i <= strChar.length-1; i++){
            if (strChar[i] == ' '){
                stbResult.append("%20");
            }else {
                stbResult.append(strChar[i]);
            }
        }

        return stbResult;
    }
}
