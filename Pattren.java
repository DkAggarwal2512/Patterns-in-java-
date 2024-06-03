
// 1.Rectangle Pattren
// public class Pattren{
//     public static void main(String args[]) {
//         // Nested Loops
//         int n= 4;
//         int m=5;
//         // outer loop
//         for(int i=1; i<=n; i++){
//             // inner loop
//             for(int j=1; j<=m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }






// 2.Hollow Rectangle
// public class Pattren{
//     public static void main(String args[] ){
//         int n = 4;
//         int m =5;
//         // outer loop
//         for(int i=1; i<=n; i++){
//             // inner loop
//             for(int j=1; j<=m; j++){
//                 // cell ->(i,j)
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print("#");
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//             }
//             System.out.println(); 

//             }
//     }
// }





// 3.Half Pyramid
// public class Pattren{
//     public static void main(String args[] ){
//         int n = 4;
//         // outer loop
//         for(int i=1; i<=n; i++){
//             // inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print("@");
//             }

//             System.out.println();
//         }

//     }

// }



// 4. INVERTED Half Pyramid

// public class Pattren{
//         public static void main(String args[] ){
//             int n = 4;
//             // outer loop
//             for(int i=n; i>=1; i--){
//                 // inner loop
//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
    
//                 System.out.println();
//             }
    
//         }
    
//     }
    

// 5.INVERTED Half Pyramid

// public class Pattren{
//             public static void main(String args[] ){
//                 int n = 4;
//                 // outer loop
//                 for(int i=1; i<=n; i++){
//                     // inner loop print Space 
//                     for(int j=1; j<=n-i; j++){
//                         System.out.print(" ");
//                     }

//                     // inner Loop Print Star
//                     for(int j=1; j<=i; j++){
//                         System.out.print("*");
//                     }        
//                     System.out.println();
//                 }        
//             }        
//         }


        // 6.Half Pyramid with numbers














        // public class Pattren{
        //     public static void main(String args[] ){
        //         int n = 5;
        //         // outer loop
        //         for(int i=1; i<=n; i++){
        //             // inner loop print Space 
        //             for(int j=1; j<=i; j++){
        //                 System.out.print(j+" ");
        //             }

                      
        //             System.out.println();
        //         }        
        //     }        
        // }


// 7. INVERTED WITH HALF PYRAMID WITH NUMBERS

// public class Pattren{
//         public static void main(String args[] ){
//             int n = 5;
//             // outer loop
//             for(int i=1; i<=n; i++){
//                 // inner loop print Space 
//                 for(int j=1; j<=n-i+1; j++){
//                     System.out.print(j);
//                 }

                  
//                 System.out.println();
//             }        
//         }        
//     }


    // 8. Floyd's Triangle

    
    // public class Pattren{
    //             public static void main(String args[] ){
    //                 int n = 5;
    //                 int num = 1;
    //                 // outer loop
    //                 for(int i=1; i<=n; i++){
    //                     // inner loop print Space 
    //                     for(int j=1; j<=i; j++){
    //                         System.out.print(num+" ");
    //                         num++;
    //                     }
        
                          
    //                     System.out.println();
    //                 }        
    //             }        
    //         }


// 9. 0-1 Triangle
    public class Pattren{    
    public static void main(String args[] ){
        int n = 5;

        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop print Space 
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }        
    }        
}


        



















