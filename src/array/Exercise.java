package array;

/**
 * @ClassName Exercise
 * @Description
 * @Author changxuan
 * @Date 2020-03-11 21:44
 **/
public class Exercise {
    public static void main(String[] args){
        int[][] number = new int[][]{};
//        System.out.println(number.length);
//        int n = 0;
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 4; j++){
//                number[i][j] = (n++);
//            }
//        }
        System.out.println(number.length-1);
        //System.out.println(number[0].length);
        System.out.println(Find(7,number));

    }

    public static boolean Find(int target, int [][] array) {
        int r_length = array.length-1;
        if (r_length < 0){
            return false;
        }
        int c_length = array[0].length-1;
        if (target<array[0][0] || target>array[r_length][c_length]){
            return false;
        }

        for(int r = 0; r <= r_length; r++){
            for(int c = c_length; c >= 0; c--){
                if(target < array[r][c]){
                    continue;
                }else if(target > array[r][c]){
                    break;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
