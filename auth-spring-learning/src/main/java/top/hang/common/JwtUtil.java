package top.hang.common;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/28 12:50
 */
public class JwtUtil {

    public static final String SECRET = "jwt_test";
    public static final Algorithm algorithm = Algorithm.HMAC256(SECRET);

    public static String create(Integer id,String username) {
        Map<String, Object> headers = new HashMap<>();
        Calendar expires = Calendar.getInstance();
        expires.add(Calendar.DAY_OF_MONTH, 1);// 一天
        return JWT.create()
                .withHeader(headers) // 第一部分Header
                .withClaim("userId", id)// 第二部分Payload
                .withClaim("username", username)
                .withExpiresAt(expires.getTime()) // 第三部分Signature
                .sign(algorithm);
    }

    public static Integer prase(String token) {
        JWTVerifier jwtVerifier = JWT.require(algorithm).build();
        DecodedJWT verify = jwtVerifier.verify(token);
        Integer userId = verify.getClaim("userId").asInt();
        return userId;
    }
}
