import sorts.ChoiceSort;
import sorts.IGeneralSorts;

public class Main {

    public static void main(String[] args) {
        Integer[] mas = {4,15,1,10,2};
        IGeneralSorts<Integer> sortMas = new ChoiceSort<>();
        mas = sortMas.sort(mas);
        for (Integer mas1:
             mas) {
            System.out.println(mas1);

        }
    }

}
