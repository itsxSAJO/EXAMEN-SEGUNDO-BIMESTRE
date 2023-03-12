package BusinessLogic;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncrypter {
    public static String encrypt(String slPassword) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] contrasenaBytes = slPassword.getBytes();
            byte[] hash = md.digest(contrasenaBytes);
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
