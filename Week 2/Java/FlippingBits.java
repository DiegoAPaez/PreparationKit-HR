package org.week2;

public class FlippingBits {

    public static void main(String[] args) {
        System.out.println(flippingBits(2147483647)); // 2147483648
        System.out.println(flippingBits(1)); // 4294967294
        System.out.println(flippingBits(0)); // 4294967295
    }

    public static long flippingBits(long n) {
        long flipped = 0;
        String bits = Long.toBinaryString(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 32 - bits.length(); i++) {
            sb.append("1");
        }
        for (int i = 0; i < bits.length(); i++) {
            sb.append(bits.charAt(i) == '1' ? "0" : "1");
        }

        flipped = Long.parseLong(sb.toString(), 2);

        return flipped;
    }
}
