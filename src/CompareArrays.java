public class CompareArrays {
    public static <T> boolean compareArrays(T[] arrays1, T[]arrays2){
        if (arrays1.length != arrays2.length){
            return false;
        }
        for (int i = 0; i < arrays1.length; i++) {
            if(!arrays1[i].equals(arrays2[i])){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Integer[]intArray1 = {1,2,3,4};
        Integer[]intArray2 = {1,2,3,4};
        Integer[]intArray3 = {1,2,5,4};

        String[]strArray1 = {"dd","www","rr"};
        String[]strArray2 = {"dd","www","rr"};
        String[]strArray3 = {"dd","www","lf"};

        boolean intArrayEqual = compareArrays(intArray1,intArray2);
        boolean strArrayEqual = compareArrays(strArray1,strArray2);
        boolean intArrayNotEquals = compareArrays(intArray1,intArray3);
        boolean strArrayNotEquals  = compareArrays(strArray2,strArray3);

        System.out.println("Массивы из целочисленных  чисел равны :" + intArrayEqual);
        System.out.println("Массивы из строк равны :" + strArrayEqual);
        System.out.println("Массивы из целочисленных чисел не равны :"+ intArrayNotEquals);
        System.out.println("Массивы из строк не равны :"+ strArrayNotEquals);
    }
}
