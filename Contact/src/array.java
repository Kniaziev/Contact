/**
 * Created by admin on 3/3/2016.
 */
public class array {
    public static void main (String [] args) {
        int arr1[] = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 100);


        }
        for(int i = arr1.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr1[j] > arr1[j + 1]) {
                    int tmp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = tmp;
                }
            }
            System.out.print(arr1[i] + "  ");
        }
    }
}