public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        String x = "hello" +5 ;
        // String y = 5;
        System.out.println(x);     
        System.out.println(3+5);     
    }
}

// public class HelloWorld {
//    public static void DrawTriangle(int N){
//         // int i = 1;
//         // int m =1,n =20;
//         // while ( i <= N){
//         //     int j = 1;
//         //     while (j <= i){
//         //         System.out.print("*");
//         //         j = j + 1;
//         //     }
//         //     i+=1;
//         //     System.out.println();            
//         // }
//         // System.out.print(m+""+n);

//         int[] numbers = new int[3];
//         numbers[0] = 1;
//         numbers[1] = 2;
//         numbers[2] = 3;
//         int[] numbers2 = new int[]{4,7,10};
//         System.out.println(numbers[0]);
//         System.out.println(numbers2[0]);
//         System.out.println(numbers.length);
//    }
//     /** Returns the maximum value from m. */
//     public static int max(int[] m) {
//         int maxindex = 0;
//         for(int i =1 ;i < m.length; i++){
//             if (m[i] > m[maxindex]){
//                 maxindex = i;
//             }
//         }
//         return m[maxindex];
//     }
//     public static void main(String[] args) {
//         int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
//         System.out.println(max(numbers));
//     }
// //    public static void main(String[] args) {
// //       DrawTriangle(10);
// //    }
// }