package edabit.very_easy;

public class VolumeOfABox {
    public static void main(String[] args) {
        System.out.println(volumeOfBox(new int[] {1,2,3}));
    }
    public static int volumeOfBox(int[] sizes) {
        int volume = 1;
        for(int i = 0; i < sizes.length; i++) {
            volume *= sizes[i];
        }
        return volume;
    }
}
