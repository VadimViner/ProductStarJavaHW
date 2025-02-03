public class HW_For {
        public static void main(String[] args) {
         int n = 15;
            for (int i = 0; i <= n; i++){
                if (i == 0){
                    System.out.print(i + " ");
                } else if(i % 3 == 0 && i % 5 == 0) {
                    System.out.print("fizzbuzz ");
                } else if (i % 3 == 0){
                    System.out.print("fizz ");
                } else if (i % 5 == 0) {
                    System.out.print("buzz ");
                } else {
                    System.out.print(i + " ");
                }

            }}}
