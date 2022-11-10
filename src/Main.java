public class Main {
    public static void main(String[] args) {
        String logo = ("Как же не хватает часов в сутках!");

        int number = 3;
        int count = 0;
        int chars = logo.length() / number;
        String[] theSame = new String[number];
        for (int i = 0; i < logo.length(); i = i + chars) {
            String half = logo.substring(i, i + chars);
            theSame[count] = half;
            count++;
        }
        for (int i = 0; i < theSame.length; i++) {
            System.out.println(theSame[i]);
        }


        String string = "Ghbvth cnhjrb sdfsd sadfsd dsafsdf";
        int halfLength = string.length() / 2;
        String first = string.substring(0, halfLength);
        String second = string.substring(halfLength);
        System.out.println(first);
        System.out.println(second);


//        System.out.println(half);
//        System.out.println(logo.length());
//
//        String logo1 = logo.substring(0, 17);
//        String logo2 = logo.substring(18);
//        System.out.println(logo1);
//        System.out.println(logo2);
//

//
//
//        for (char whatArr : logoArr) {
//            System.out.println(logo1);
//
//        }
//        for (int i = 0; i < logoArr.length; i++) {
//            System.out.println(logoArr[i]);
//        }
    }
}