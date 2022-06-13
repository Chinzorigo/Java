package medium;

public class OddValentV2 {
    public static void main(String[] args) {
        int[] a =  {2, 4, 8, 6,11,11};
        System.out.println(f(a));
    }

    static int f(int[] a) {
        int rtnVal = 0;
        boolean isFirst = false,isSecond=false;
        for(int i=0;i<a.length;i++)
        {
            int count = 1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    if(count>1)
                    {
                        isFirst = true;
                    }
                }
            }
            if(a[i]%2!=0)
            {
                isSecond = true;
            }

        }
        if(isFirst && isSecond)
        {
            rtnVal = 1;
        }
        else
        {
            rtnVal = 0;
        }
        return rtnVal;
    }
}
