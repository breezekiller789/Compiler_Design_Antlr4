/* A program to sum 1 to n */
main(){
    int n;
    int s;
    int i;
    read n;
    if ( n < 1 ){
        if(n==0){
            read s;
        }
        else{
            return;
        }fi
        write -1;
        return;
    }
    else {
        s = 0;
    }fi
    i = 1;
    while ( i <= n) {
        s = s + i;
        i = i + 1;
    }
    write s;
    return;
}
