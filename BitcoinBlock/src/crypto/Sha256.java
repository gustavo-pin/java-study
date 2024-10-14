package crypto;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Sha256 {
    public static byte[] digest(final String base) {
        try{
            final MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(base.getBytes(StandardCharsets.UTF_8));
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
