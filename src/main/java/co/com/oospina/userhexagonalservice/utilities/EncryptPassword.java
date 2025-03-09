package co.com.oospina.userhexagonalservice.utilities;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class EncryptPassword {

  private static String ALGORITHM = "AES";

  public static String encryptPassword(String password) throws Exception {
    SecretKey secretKey = generarClave();
    return encriptar(password, secretKey);
  }

  public static SecretKey generarClave() throws Exception {
    KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
    keyGenerator.init(256); // Tamaño de clave AES (128, 192 o 256 bits)
    return keyGenerator.generateKey();
  }

  public static String desencriptar(String textoCifrado, SecretKey clave) throws Exception {
    Cipher cipher = Cipher.getInstance(ALGORITHM);
    cipher.init(Cipher.DECRYPT_MODE, clave);
    byte[] textoDescifrado = cipher.doFinal(Base64.getDecoder().decode(textoCifrado));
    return new String(textoDescifrado);
  }

  public static String encriptar(String texto, SecretKey clave) throws Exception {
    Cipher cipher = Cipher.getInstance(ALGORITHM);
    cipher.init(Cipher.ENCRYPT_MODE, clave);
    byte[] textoCifrado = cipher.doFinal(texto.getBytes());
    return Base64.getEncoder().encodeToString(textoCifrado);
  }
}
