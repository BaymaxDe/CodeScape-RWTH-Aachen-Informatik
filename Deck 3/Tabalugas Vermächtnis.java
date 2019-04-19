 public void run() {
        String word = "";
        String pass = "";
        //{u,d,l,r,t,c,R,w,b,p,o}
        String M = "t1s0t3";
        int turn = 0, bewegung = 0, richtung = 0, BruchB = M.length(), i = 0, k = 0;

        while (i < BruchB) {
            turn = 0;
            bewegung = 0;
            char job = M.charAt(i);
            switch (job) {
                case 'r':
                    turn = richtung - 0;
                    richtung = 0;
                    break;
                case 'l':
                    turn = richtung - 2;
                    richtung = 2;
                    break;
                case 'u':
                    turn = richtung - 1;
                    richtung = 1;
                    break;
                case 'd':
                    turn = richtung - 3;
                    richtung = 3;
                    break;
                case 'L':
                   turn =richtung- (richtung + 1)%4;
                    richtung=(richtung+1)%4;
                    break;
                case 'R':
                    turn = richtung- (richtung +3)%4;
                    richtung=(richtung+3)%4;
                    break;
                case 'M':
                    bewegung=1;
                    break;
            /*  case 'p':
                  pickUp();
                    break;*/
                case 't':
                    int t = M.charAt(i + 1) - '0';
                    turn = richtung - (t);
                    richtung = t;
                    break;
                case 's':
                    word = read();
                    for (int N = word.length() - 1; N >= 0; N--)
                        pass += word.charAt(N);
                    M=M+word+",d1r1"; 
                    break;
            /*  case 'w':
                    write(word);
                    k++;
                    break;*/
            /* case 'c':
                 if(word.equals("R"))
                    M+="y2";
                 else
                    M+="y0";
                 break;*/
            /* case 'b':
                 while(!isMovePossible())
                 rest();
                 break;*/

            }
            if (job == 'r' || job == 'l' || job == 'd' || job == 'u')
                bewegung = M.charAt(i + 1) - '0';
            turn = (turn + 4) % 4;
            for (int j = 0; j < turn; j++)
                turnRight();
            for (int j = 0; j < bewegung; j++)
                move();
            i += 2;
            BruchB = M.length();

        }
    }

