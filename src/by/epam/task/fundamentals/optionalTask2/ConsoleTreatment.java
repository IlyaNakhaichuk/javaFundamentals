package by.epam.task.fundamentals.optionalTask2;

public class ConsoleTreatment {
    public static void searchMinAndMaxNumber(String[] args) {
        String[] argsSort = args;
        for (int i = argsSort.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (Integer.parseInt( argsSort[j] ) > Integer.parseInt( argsSort[j + 1] )) {
                    String tmp = argsSort[j];
                    argsSort[j] = argsSort[j + 1];
                    argsSort[j + 1] = tmp;
                }
            }
        }
        System.out.println("Min:  " + argsSort[0] + " Max: " + argsSort[argsSort.length-1]);
    }
}
