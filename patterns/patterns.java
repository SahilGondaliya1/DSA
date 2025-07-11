public class patterns{

    public void pattern1(int n){
        /*
         *       *****
         *       ****
         *       ***
         *       **
         *       *
         */
        //no. of lines
        for(int i = 0 ; i <= n ; i++ ){
            int stars = n-i;
            int spaces = 0;
            starsAndSpaces(spaces, stars);
        }
    }
    public void pattern2(int n){
            /*
             *         *    
                      * *   
                     * * *  
                    * * * * 
                   * * * * *
                    * * * * 
                     * * *  
                      * *   
                       *    
                            */
        //upper triangle
        for(int i = 0; i <= n ; i++){
            int spaces = n-i;
            int stars = i;
            starsAndSpaces(spaces, stars);

        }

        //lower triangle
        for(int j = 1 ; j <= n ; j++){
            int spaces = j;
            int stars = n-j;
            starsAndSpaces(spaces, stars);
        }
    }

    public void pattern3(int n){
        /**
         *  ************
            *****  *****
            ****    ****
            ***      ***
            **        **
            *          *
            *          *
            **        **
            ***      ***
            ****    ****
            *****  *****
            ************
         */

         //there are two parts in the pattern 1) upper part and 2) lower part
         //each of them has two segments left and right
         //so total for segments 
         
         //lower part
         for(int i = 1 ; i <= n ; i++){
            //EACH SEGMENT HAS TTHE SPACES AND STARS 
            //WE WILL GO LINE BY LINE
            int Space =n-i;
            int Stars = i;
            spaceAfterStars(Space, Stars);
            spaceBeforeStars(Space, Stars);  
            System.out.println(".");                        
         }
         //upper part
         for(int i = 1 ; i < n ; i++){
            //EACH SEGMENT HAS TTHE SPACES AND STARS 
            //WE WILL GO LINE BY LINE
            int Space = i;
            int Stars = n-i;
            spaceAfterStars(Space, Stars);
            spaceBeforeStars(Space, Stars);
            System.out.println();                   
         }
          
         
         

    }
    public static void starsAndSpaces(int spaces , int stars){
        for(int i = 1 ; i <= spaces ; i++){ System.out.print(" ");}
        for(int j = 1 ; j <= stars ; j++){ System.out.print("* ");}
        System.out.println();
    }
   
    public static void spaceAfterStars(int spaces, int stars){
        for(int star = 1 ; star <= stars ; star++){System.out.print("*");}
        for(int space = 1 ; space <= spaces ; space++){System.out.print(" ");}
    }
     public static void spaceBeforeStars(int spaces, int stars){
        for(int space = 1 ; space <= spaces ; space++){System.out.print(" ");}
        for(int star = 1 ; star <= stars ; star++){System.out.print("*");}
    }
    public static void main(String[] args){
        int number = 5;
        patterns p = new patterns();
       // p.pattern1(number);
       // p.pattern2(number);
       p.pattern3(number);
    }
}