public class MetodusokDolgozat2 {
    public static double masodfokuMegoldasSzam (double a, double b, double c) {
        if((b * b - 4 * a * c) > 0) {
            return 2;
        }
        else if ((b * b - 4 * a * c) == 0) {
            return 1;
        }
        else if ((b * b - 4 * a * c) < 0) {
            return 0;
        }
        else {
            return -1;
        }
    }

    public static boolean vanKisbetu (String sz) {
        for(int i = 0; i < sz.length(); i++) {
            if(Character.isLowerCase(sz.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static String getMeret(double meret) {
        if (meret < 150) {
            return "XS";
        }
        else if (meret >= 150 && meret < 160) {
            return "S";
        }
        else if (meret >= 160 && meret < 170) {
            return "M";
        }
        else if (meret >= 170 && meret < 180) {
            return "L";
        }
        else if (meret >= 180 && meret < 190) {
            return "XL";
        }
        else {
            return "XXL";
        }
    }

    public static String rubikKockaSzin(int dobas) {
        if(dobas == 1) {
            return "yellow";
        }
        else if(dobas == 2) {
            return "red";
        }
        else if(dobas == 3) {
            return "orange";
        }
        else if(dobas == 4) {
            return "white";
        }
        else if(dobas == 5) {
            return "blue";
        }
        else if(dobas == 6) {
            return "green";
        }
        else {
            return "invalid parameter";
        }
    }
    public static void main(String[] args) {
        System.out.println(masodfokuMegoldasSzam(0, 6, 5) == -1);
        System.out.println(masodfokuMegoldasSzam(0, 1, 1) == -1);
        System.out.println(masodfokuMegoldasSzam(1, 3, 4) == 0);
        System.out.println(masodfokuMegoldasSzam(2, 4, 3) == 0);
        System.out.println(masodfokuMegoldasSzam(2, -4, 2) == 1);
        System.out.println(masodfokuMegoldasSzam(1, -2, 1) == 1);
        System.out.println(masodfokuMegoldasSzam(1, 0, -4) == 2);
        System.out.println(masodfokuMegoldasSzam(2, 2, -2) == 2);
        System.out.println(vanKisbetu("alma") == true);
        System.out.println(vanKisbetu("ALmA") == true);
        System.out.println(vanKisbetu("ALMA") == false);
        System.out.println(vanKisbetu("") == false);
        System.out.println(vanKisbetu("123456") == false);
        System.out.println(getMeret(100).equals("XS"));
        System.out.println(getMeret(150).equals("S"));
        System.out.println(getMeret(156).equals("S"));
        System.out.println(getMeret(160).equals("M"));
        System.out.println(getMeret(166).equals("M"));
        System.out.println(getMeret(170).equals("L"));
        System.out.println(getMeret(176).equals("L"));
        System.out.println(getMeret(180).equals("XL"));
        System.out.println(getMeret(186).equals("XL"));
        System.out.println(getMeret(190).equals("XXL"));
        System.out.println(getMeret(200).equals("XXL"));
        System.out.println(rubikKockaSzin(1).equals("yellow"));
        System.out.println(rubikKockaSzin(2).equals("red"));
        System.out.println(rubikKockaSzin(3).equals("orange"));
        System.out.println(rubikKockaSzin(4).equals("white"));
        System.out.println(rubikKockaSzin(5).equals("blue"));
        System.out.println(rubikKockaSzin(6).equals("green"));
        System.out.println(rubikKockaSzin(7).equals("invalid parameter"));
        System.out.println(rubikKockaSzin(-1).equals("invalid parameter"));
    }
}
