package crypto;

public class Hash256 {

    public static byte[] digest(final String base) {
        byte[] firstHash = Sha256.digest(base);

        return Sha256.digest(Bytes.bytesToHex(firstHash));
    }
}
