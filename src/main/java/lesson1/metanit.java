package lesson1;//public class lesson1.metanit {
//   public static void main(String[] args) {
//       String text = "Hello \nworld";
//       System.out.println(text);
//         String text = "первая строка,\n"+
//                "second line \n";
//       System.out.println(text);
//       String text = """
//               line 1
//               line 2
//               """;
//       System.out.println(text);
//   }
//       int x=5;
//      int y=6;
//     System.out.println("x="+ x+ ";y="+y);

//}
//  }
//import java.util.Scanner;
//public class lesson1.metanit {
//    public static void main(String[] args) {
//      Scanner in = new Scanner(System.in);
//        System.out.println("Input a line");
//        String one = in.next();*/
//        System.out.println("Your line:"+one);
//        in.close();
//    }
// }

//import java.util.Scanner;
//public class lesson1.metanit {
//    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        System.out.println("Input name");
//        String name = in.nextLine();
//        System.out.println("Input age");
//        int age= in.nextInt();
//        System.out.println("Input height");
//        float height = in.nextFloat();
//        System.out.printf("Name: %s\nAge: %d\nheight: %.2f\n",name, age,height);
//        in.close();
//    }
//}

/** префиксный инкремент сначала увеличивает на 1,
 * потом присваивает
 */
public class metanit {
    public static void main(String[] args) {
        int a = 8;
        int b = a--;
        System.out.printf("a=%d\nb=%d", a, b );
    }
}