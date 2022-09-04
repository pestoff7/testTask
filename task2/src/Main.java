public class Main {

    public static void main(String[] args){
        int[] nums = new int[args.length];
        int steps = 0;
        int median;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        if (nums.length % 2 == 0){
            median = ((nums[nums.length / 2] + nums[nums.length / 2 + 1]) / 2) + 1;
        }
        else median = nums[nums.length / 2 + 1];
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] < median) {
                nums[i]++;
                steps++;
                if (nums[i] == median) {
                    break;
                }
            }
            while (nums[i] > median) {
                nums[i]--;
                steps++;
                if (nums[i] == median) {
                    break;
                }
            }
        }
        System.out.println(steps);
    }
}