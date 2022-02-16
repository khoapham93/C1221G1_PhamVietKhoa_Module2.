package ss1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rate = 23000;

        System.out.print("Enter USD: ");
        float usd = scanner.nextFloat();
        float vnd = usd * rate;

        System.out.printf("%1.2f USD Exchange to VND is %1.2f", usd, vnd);
    }
}
