/**
 * @input A : Integer array
 * @input n1 : Integer array's ( A ) length
 * N light bulbs are connected by a wire. Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb. Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs. You can press the same switch multiple times.
 * @Output Integer
 */
int bulbs(int* A, int n1) {
    int count = 0;
    int i = 0;
    int j = 0;
    for(i = 0; i < n1; i++){
        if(A[i] == 0){      //If you find OFF switch0
            count ++;       //update count
            A[i] == 1;      //turn it ON
            for (j = i+1; j<n1; j++) {      //Look for switches to the right of current switch
            if (A[j] == 0)  //if its OFF
                A[j] = 1;   //Turn it ON
            else if (A[j] == 1) //if its ON
                A[j] = 0;   //turn it OFF
            }
        }
    }
    return count;
}

