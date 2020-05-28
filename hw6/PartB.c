void E(){
    int Ls;
    float Rs;
    switch(token){
        case '0' : 

        case '1' : Ls = L();    //  回傳小數點前面的全部值。
                   match('.');  //  抓下一個token
                   Rs = R();    //  回傳小數點後面的全部值，因為一定小於一所以要用浮點數去接。
                   break;

        default : error();
    }
    printf("%f\n", Ls+Rs);      //  印出來。
}

int L(){
    int Lsi, Ls, Lss;   //  Ls.i    L.s     Ls.s
    int Bval[2];        //  Bval[0] = B.val     Bval[1] = B.c   -> 總共的bit數，小數點前用不到，但小數點後會用到。
    switch(token){
        case '0' :
        case '1' : B(Bval);         //  我的B()會幫我把Bval這個整數陣列放值，所以他不回傳值，只幫我放東西進去，至於放什麼要拉下去看B的定義。
                   Lsi = Bval[0];   //  Bval[0] = B.val，因為Bval[1]不會用到，所以就不拿出來了。
                   Lss = Ls(Lsi);   //  Lsi當作參數呼叫Ls，他會回傳下面算完的全部值（十進制）
                   Ls = Lss;        //  交給Ls回傳。
                   break;
        default : error();
    }
    return Ls;
}

int Ls(int Lsi){
    int Ls1i, Ls1s, Lss;
    int Bval[2];
    switch(token){
        case '0' :
        case '1' : B(Bval);
                   Ls1i = Bval[0];  //  B.val (十進制的值）
                   Ls1s = Ls(Ls1i); //  當作參數再呼叫Ls
                   Lss = Ls1s;      //  交給Lss回傳
                   break;
        case EOF : Lss = Lsi;       //  如果遇到空字串的話，就直接回傳Lsi就好，交給Lss回傳
                   break;
        default : error();
    }
    return Lss;
}

float R(){
    float Rsi, Rs, Rss;
    int Bval[2];
    switch(token){
        case '0' :
        case '1' : B(Bval);
                   Rss = Rs(Bval);  //  小數點的話，因為我要計算有幾個bit，所以要傳入Bval，把所有資訊丟給Rs，他會回傳小數點後的值。
                   Rs = Rss;        //  交給Rs去回傳。
                   break;
        default : error();
    }
    return Rs;
}

float Rs(int Rsi[2]){
    float Rs1i, Rs1c, Rs1s, Rss;
    int Bval[2];
    switch(token){
        case '0' :
        case '1' : B(Bval);
                   //   Rsi[0]是要把剛剛input吃進來的Rsi[0]給乘以二，然後加上現在的Bval[0]，一直這樣做的話，就可以做到計算小數點前面的所有值的效果了。
                   //   這邊想了好久才想出來，因為是top down approach，所以要記錄每一個狀態，有一點點類似Dinamic programming。
                   Rsi[0] = Rsi[0] * 2 + Bval[0];
                   //   會Rsi[1] * Bval[1]是因為，我要算出bit數的值，如果小數點後有三個bit，那我必須要拿到2^3=8，因為小數點後面的值可以用
                   //   二進制的值除上bit數的值來求得，下面舉個例子。
                   //   .011 = 0.375
                   //   小數點後的二進制值是011 = 3
                   //   總共有三個bit 2^3 = 8
                   //   所以 3 / 8 = 0.375
                   //   這就是我這邊要用乘的原因，因為我Bval[1]都會回傳2，所以會一直2*2*2...一直下去，有幾個bit就乘以幾次。
                   Rsi[1] = Rsi[1] * Bval[1];
                   Rs1s = Rs(Rsi);
                   Rss = Rs1s;
                   break;
        case EOF : Rss = Rs1[0] / Rs1[1];   //  把小數點後的二進制值除以bit數的二進制值。
                   break;
        default : error();
    }
    return Rss;
}

void B(int Bval[2]){
    switch(token){
        case '0' : match('0');  //  讀下一個token近來
                   Bval[0] = 0; //  B.val = 0 -> 十進制的值
                   Bval[1] = 2; //  B.c = 2 -> bit數的值，如果小數點以下有三個數，那就會是2^3 = 8
                   break;
        case '1' : match('1');  //  讀下一個token近來
                   Bval[0] = 1; //  B.val = 1 -> 十進制的值
                   Bval[1] = 2; //  B.c = 2 -> bit數的值，如果小數點以下有三個數，那就會是2^3 = 8
                   break;
        default : error();
    }
}
