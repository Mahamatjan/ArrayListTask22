import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            arrayList1.add(i,rd.nextInt(1, 100) );
            if (arrayList1.get(i) % 2 == 0){
                arrayList2.add(arrayList1.get(i) );
            } else {
                arrayList3.add(arrayList1.get(i) );
            }
        }
        System.out.println("All number: "+arrayList1+"\n"+"Жуп сандар: "+arrayList2+"\n"+"Так сандар: "+arrayList3);

    }
}