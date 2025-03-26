/*
Crie uma função recursiva que calcule a soma dos elementos de um array
de inteiros.
* */
public class SomaArray {
    public static int Soma(int[] nums, int in) {
        if (in >= nums.length) return 0;
        return nums[in] + Soma(nums, in + 1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(Soma(nums, 0));
    }
}
