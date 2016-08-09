#include <stdio.h>

int main ()
{
    /* This is a simple implementation of the fizzbuzz coder test
     * I am not a robot
     */

     int x = 0;
     const int LIMIT = 101;
     for (x=1;x<LIMIT;x++)
     {
         if (((x%3) == 0) && ((x%5) == 0))
         {
             printf("FizzBuzz (%i) ", x);
         } else {
             if ((x%3) == 0) 
            {
                printf("Fizz (%i) ", x);
            }
            if ((x%5) == 0)
            {
                printf("Buzz (%i) ", x);
            }
         }
     }
     return 0;
} 