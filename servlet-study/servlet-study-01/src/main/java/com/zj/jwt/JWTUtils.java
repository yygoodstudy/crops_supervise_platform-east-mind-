package com.zj.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author yuanyao
 * @Date 2022/9/13
 */
public class JWTUtils {
    public static void main(String[] args) {
        Map<String, String> payload = new HashMap<>();
        payload.put("username", "zhangJie");
        payload.put("age", "27");
        payload.put("address", "雁塔区大寨路宏府麒麟山");
        String token = generateToken(payload);
        Map<String, Object> map = getToken(token);
        System.out.println(map);
//        mapTest();
    }


    // 生成JWT的token
    // 注意多次运行方法生成的token字符串内容是不一样的，尽管我们的payload信息没有变动。因为JWT中携带了超时时间，超时时间是不断变化的，
    // 所以每次生成的token会不一样，
    // 我们利用base64解密工具可以发现payload确实携带了超时时间
    public static String generateToken(Map<String, String> payload) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND, 60); // 对当前时间进行+60s的操作
        // 生成token
        JWTCreator.Builder builder = JWT.create();
        payload.forEach((k, v) -> builder.withClaim(k, v)); // 构建payload
        String token = builder.withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256("!34ADAS"));

        System.out.println("token = " + token);
        return token;
    }

    public static Map<String, Object> getToken(String token) {
        // 创建解析对象，使用的算法和secret要与创建的token保持一致
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("!34ADAS")).build();
        // 解析指定的token
        DecodedJWT decodedJWT = jwtVerifier.verify(token);
        // 获取解析后的payload中的信息
        Claim usernameClaim = decodedJWT.getClaim("username");
        String userName = usernameClaim.asString();

        Claim ageClaim = decodedJWT.getClaim("age");
        String age = ageClaim.asString();
        Date expiresAt = decodedJWT.getExpiresAt(); // 获取过期时间

        Map<String, Object> payloadMap = new HashMap<>();
        payloadMap.put("username", userName);
        payloadMap.put("age", age);
        payloadMap.put("expire", expiresAt);
        return payloadMap;
    }


    public static void mapTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zhangJie");
        map.put("age", 27);
        map.put("address", "宏府麒麟山");
        map.put("phone", "13162629214");

        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

    }
}
