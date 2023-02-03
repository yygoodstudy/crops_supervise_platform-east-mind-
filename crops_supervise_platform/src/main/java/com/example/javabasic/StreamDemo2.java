package com.example.javabasic;

import com.vdurmont.emoji.EmojiParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author yuanyao
 * @Date 2022/12/27
 */
public class StreamDemo2 {
    public static void main(String[] args) {
//        String s = filterEmoji(":dragon_face: 观山河想:saxophone:");
//        System.out.println(s);
        fileMoji();
        String s = EmojiParser.parseToUnicode(fileMoji());
        System.out.println("s = " + s);
    }

    public static String filterEmoji(String source) {
        if(source != null){
            Pattern emoji = Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]",Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
            Matcher emojiMatcher = emoji.matcher(source);
            if (emojiMatcher.find()){
                source = emojiMatcher.replaceAll("");
                return source;
            }
            return source;
        }
        return source;
    }

    public static String fileMoji(){
        String s = EmojiParser.parseToAliases("\uD83D\uDC32 观山河想\uD83C\uDFB7");
        return s;
    }

}
