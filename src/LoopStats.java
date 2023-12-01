class LoopStats{

    int even = 0;
    int odd = 0;
    int total = 0;
    public String stat(int a, int b){ // LOOP BREAKDOWN
      for(int i = a; i <= b; i++){ // int i = to the value of a required to run the function. checks if (i) a is less than OR EQUAL to b which is the stop number the user enters. if so continue the loop if not end the loop.
        total = total + i; // Total = total + i. DO NOT COUNT the numbers total everything.
        if(i % 2 == 0){ // checks if the number is even by if i % of 2 which means is divisble evenly by two == 0 (divisble) add a count to even. 
          even++;
        }else{
          odd++; // else add a count to odd
        }
      }
      return "Total: " + total + " Even: " + even + " Odd: " + odd; // Here we are returning as a string. 
    }
  }