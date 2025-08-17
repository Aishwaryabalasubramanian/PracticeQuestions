import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PascalTriangle {
    public static void main(String[] args) {

        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int n) {

        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            List<Integer> in = new ArrayList<>();
            if (i == 0) {
                in.addFirst(1);
            } else {
                in.add(0, 1);
                for (int j = 1; j < i; j++) {
                    in.add(out.get(i - 1).get(j - 1) + out.get(i - 1).get(j));
                }
                in.add(i, 1);
            }

            out.add(in);


        }
        return out;


    }
}