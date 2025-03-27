/*
* Implemente uma função recursiva que encontre o maior elemento dentro
de um array de inteiros.
* */
public class RetornarMaiorNumero {
    public static int VerificarNumeros(int[] nums, int in, int maiorNum) {
        if (in >= nums.length) return maiorNum;
        return VerificarNumeros(nums,  in + 1, nums[in] > maiorNum ? maiorNum = nums[in] : maiorNum);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,43,4,5,30};
        System.out.println(VerificarNumeros(nums, 0,0));
    }
}
