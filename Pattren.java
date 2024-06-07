
// 1.Rectangle Pattren
public class Pattren{
    public static void main(String args[]) {
        // Nested Loops
        int a= 4;
        int b=5;
        // outer loop
        for(int i=1; i<=a; i++){
            // inner loop
            for(int j=1; j<=b; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    
    // }}






// 2.Hollow Rectangle
// public class Pattren{
//     public static void main(String args[] ){
        int c = 4;
        int d =5;
        // outer loop
        for(int i=1; i<=c; i++){
            // inner loop
            for(int j=1; j<=d; j++){
                // cell ->(i,j)
                if(i==1 || j==1 || i==c || j==d){
                    System.out.print("#");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
            System.out.println(); 

            }
//     }
// }





// 3.Half Pyramid
// public class Pattren{
//     public static void main(String args[] ){
        int e = 4;
        // outer loop
        for(int i=1; i<=e; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                System.out.print("@");
            }

            System.out.println();
        }

//     }

// }





// 4. INVERTED Half Pyramid

// public class Pattren{
//         public static void main(String args[] ){
            int f = 4;
            // outer loop
            for(int i=f; i>=1; i--){
                // inner loop
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
    
                System.out.println();
            }
    
//         }
    
//     }


    

// 5.INVERTED Half Pyramid

// public class Pattren{
//             public static void main(String args[] ){
                int g = 4;
                // outer loop
                for(int i=1; i<=g; i++){
                    // inner loop print Space 
                    for(int j=1; j<=g-i; j++){
                        System.out.print(" ");
                    }

                    // inner Loop Print Star
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }        
                    System.out.println();
                }        
//             }        
//         }


        // 6.Half Pyramid with numbers



        // public class Pattren{
        //     public static void main(String args[] ){
                int h = 5;
                // outer loop
                for(int i=1; i<=h; i++){
                    // inner loop print Space 
                    for(int j=1; j<=i; j++){
                        System.out.print(j+" ");
                    }

                      
                    System.out.println();
                }        
        //     }        
        // }


// 7. INVERTED WITH HALF PYRAMID WITH NUMBERS

// public class Pattren{
//         public static void main(String args[] ){
            int k = 5;
            // outer loop
            for(int i=1; i<=k; i++){
                // inner loop print Space 
                for(int j=1; j<=k-i+1; j++){
                    System.out.print(j);
                }

                  
                System.out.println();
            }        
//         }        
//     }


    // 8. Floyd's Triangle

    
    // public class Pattren{
    //             public static void main(String args[] ){
                    int l = 5;
                    int lnum = 1;
                    // outer loop
                    for(int i=1; i<=l; i++){
                        // inner loop print Space 
                        for(int j=1; j<=i; j++){
                            System.out.print(lnum+" ");
                            lnum++;
                        }
        
                          
                        System.out.println();
                    }        
    //             }        
    //         }


// 9. 0-1 Triangle
    // public class Pattren{    
    // public static void main(String args[] ){
        int m = 5;

        // outer loop
        for(int i=1; i<=m; i++){
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
          



        








        // ButterFly


        // public class Pattren {
        //     public static void main(String[] args) {
        
        int o = 5;


        // Upper Part
        for(int i=1; i<=o; i++){
            // 1st
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Space
            int spaces = 2 * (o-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
        }

        // 2nd
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();

    }
    // lower

for(int i=o; i>=1; i--){

        // 1st
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        // Space
        int spaces = 2 * (o-i);
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");
    }

    // 2nd
    for(int j=1; j<=i; j++){
        System.out.print("*");
    }
    System.out.println();

}
            // }}
 









// Rhombus
// public class Pattren {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {

int p = 5;





for(int i=1; i<=p;i++){
    // spaces
    for(int j=1; j<=p-i; j++){
        System.out.print(" ");
    }
// stars
for(int j=1; j<=5; j++){
    System.out.print("*");
}
System.out.println();

}
// }}








//  Number Pyramid

// public class Pattren {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {

int q = 5;




for(int i=1; i<=q; i++){
    // spaces
    for(int j=1; j<=q-i; j++){
        System.out.print(" ");
    }

    // numbers -> print row no , row no times
    for(int j=1; j<=i; j++){
        System.out.print(i + " ");
    }

    System.out.println();
}

//     }}

// Palindromic 


// public class Pattren {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {

int s = 5;


for(int i=1; i<=s; i++){
    // spaces
    for(int j=1; j<=s-i; j++){
        System.out.print(" ");
    }

    // numbers of 1st part
    for(int j=i;  j>=1; j--){
        System.out.print(j);
    }

    // 2nd Part
    for(int j=2; j<=i; j++){
        System.out.print(j);
    }


    System.out.println();
}
//     }}



// Diamond       


// public class Pattren {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {

int t = 4;


// Upper Part
for(int i=1; i<=t; i++){    
    // spaces
    for(int j=1; j<=t-i; j++){
        System.out.print(" ");
    }
    // stars
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }    
    System.out.println();
}
//  Lower Part
for(int i=t; i>=1; i--){    
    // spaces
    for(int j=1; j<=t-i; j++){
        System.out.print(" ");
    }
    // stars
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }    
    System.out.println();
}



// }}




 


    }}















