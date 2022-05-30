package MIU;



public class Question17isInertial {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(isInertial(new int[] {-2,-4,-6,-8,-11} )));
        int[] a =  {2,4,6,8,10};
        System.out.println(isInertial(a));
    }

    static int isInertial(int[] a) {
        //int isItInertial = 1;
        boolean hasAtLeastOneOdd = false;
        boolean maxValueIsEven = false;
        int oddSize = 0;
        int evenSize = 0;
        int maxValue = a[0];


        for(int idx: a) {
            if (maxValue < idx) {
                maxValue = idx;
            }
            if(idx % 2 == 1 || idx % 2 == -1) {
                hasAtLeastOneOdd = true;
                oddSize += 1;
            }
            else {
                evenSize += 1;
            }
        }



        if(maxValue % 2 == 0 ) {
            maxValueIsEven = true;
        }

        if(!maxValueIsEven) return 0;

        if(!hasAtLeastOneOdd) {
            return 0;
        }



        int oddidx = 0, evenidx = 0;
        int[] evenArray = new int[evenSize];
        int[] oddArray = new int[oddSize];



        for(int i: a) {
            if (i % 2 == 1 || i % 2 == -1) {
                oddArray[oddidx] = i;
                oddidx++;
            }
            else  {
                evenArray[evenidx] = i;
                evenidx++;
            }

        }

        if(oddArray.length == 0) {
            return 0;
        }

        for(int idx: oddArray) {
            for(int jdx: evenArray) {
                if(jdx != maxValue){
                    if(idx < jdx)  {
                         return 0;
                    }
                }
            }
        }

        return 1;

    }
}
