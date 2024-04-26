package NumberAndStrings.strings;

public class RegionMatchesDemo {
    public static void main(String[] args) {
        String searchMe = "GreenEggsEggsEggsEggs Ham";
        String findMe = "Eggs";
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;

        for (int i = 0; i <= (searchMeLength - findMeLength); i++) {
            System.out.printf("loop: %d\n", i);
            if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {// i: vị trí chỉ mục của searchMe, findMe: chuỗi muốn so sánh với searchMe, 0: vị trí bắt đầu trong findMe, findMeLength: kích thước của các khu vực cần so sánh
                foundIt = true;
                System.out.println(searchMe.substring(i, i + findMeLength));
                break;
            }
        }
        if (!foundIt) {
            System.out.println("No match found.");
        }

        //Giải thích:
        /*
         * i = 0: so sánh 'G' với 'E' --> fail
         * i = 1: so sánh 'r' với 'E' --> fail
         * i = 2: so sánh 'e' với 'E' --> fail
         * i = 3: so sánh 'e' với 'E' --> fail
         * i = 4: so sánh 'n' với 'E' --> fail
         * i = 5: so sánh ' ' với 'E' --> fail
         * i = 6: so sánh 'E' với 'E' --> true => vào if {
         *      
         * }
        */
        
    }
}
