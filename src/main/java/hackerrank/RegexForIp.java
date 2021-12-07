package main.java.hackerrank;

public class RegexForIp {
    public static void main(String[] args) {
        final String IP_MASK = "([0-55]{1,4}.){3}[0-255]{1,4}";
        String ip = "192.168.0.1";

        System.out.println(ip.matches(IP_MASK));
    }
}
