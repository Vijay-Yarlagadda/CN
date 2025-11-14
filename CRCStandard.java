//Aim: CRC
public class CRCStandard {
    // Generic CRC function
    static String computeCRC(String data, String poly) {
        int m = poly.length();
        String dividend = data + "0".repeat(m - 1); // append zeros
        char[] rem = dividend.toCharArray();
        char[] div = poly.toCharArray();

        for (int i = 0; i <= rem.length - m; i++) {
            if (rem[i] == '1') {
                for (int j = 0; j < m; j++) {
                    rem[i + j] = (rem[i + j] == div[j]) ? '0' : '1';
                }
            }
        }
        return new String(rem).substring(rem.length - (m - 1));
    }

    public static void main(String[] args) {
        String data = "1011001"; // example data

        // Standard polynomials
        String crc12 = "1100000001111";
        String crc16 = "11000000000000101";
        String crcCCITT = "10001000000100001";

        System.out.println("Data: " + data);
        System.out.println("CRC-12: " + computeCRC(data, crc12));
        System.out.println("CRC-16: " + computeCRC(data, crc16));
        System.out.println("CRC-CCITT: " + computeCRC(data, crcCCITT));
    }
}