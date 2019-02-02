package sorts;

public class ChoiceSort<T extends Comparable> implements IGeneralSorts<T> {

    @Override
    public T[] sort(T[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            int index = i;
            for(int j=i+1;j<mas.length;j++){
                if(mas[index].compareTo(mas[j])>0){
                    index = j;
                }
            }
            T smallest = mas[index];
            mas[index] = mas[i];
            mas[i] = smallest;
        }
        return mas;
    }
}
