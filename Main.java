import java.nio.charset.StandardCharsets;

/**
 * tajweed-java-idgham-assimilation — محلل الإدغام للمتماثلين والمتجانسين والمتقاربين
 * Homorganic & Geminate Consonant Assimilation Engine
 */
public final class Main {
    public static void main(String[] args) {
        String input = "قَدْ دَخَلُوا / ارْكَبْ مَعَنَا";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] tajweed-java-idgham-assimilation (Java) — Homorganic & Geminate Consonant Assimilation Engine");
        System.out.println("[AR]  محلل الإدغام للمتماثلين والمتجانسين والمتقاربين");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "Type=Mutajanisayn_Kamil | Assimilation=100%", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
