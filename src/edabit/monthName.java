package edabit;

public class monthName {
    public static void main(String[] args) {
        //int months[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int month = 5;
        System.out.println(monthByName(month));

    }

    static String monthByName(int num) {


        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",} ;
        return months[num-1];
    }


    }
/*        String[] months = {"January","February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        switch (returnMonthName) {
            case 1:
                return  months[0];
            case 2:
                return  months[1];
            case 3:
                return  months[2];
            case 4:
                return  months[3];
            case 5:
                return  months[4];
            case 6:
                return  months[5];
            case 7:
                return  months[6];
            case 8:
                return  months[7];
            case 9:
                return  months[8];
            case 10:
                return  months[9];
            case 11:
                return  months[10];
            case 12:
                return  months[11];
        }
        return null;
    }

 */

