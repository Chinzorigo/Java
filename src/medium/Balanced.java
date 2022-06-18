package medium;

public class Balanced {
    public static void main(String[] args) {
        int[] a = {-2, 2, 2, 2};
        System.out.println(isBalanced(a));
    }

    static int isBalanced(int[] a) {
        int isBalanced = 1;
        for(int i=0;i<a.length;i++)
        {
            int isValid = 0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==-a[j])
                {
                    isValid = 1;
                    break;
                }
            }
            if (isValid==0)
                isBalanced = 0;
        }
        return isBalanced;
    }
}
