public void run() {
        String word = "";
        //{u,d,l,r,t,c,re,w,b,p,o}
        String M = "r3u1l3u1l1r6u1l7u1r7u1l6u1r4l1u1l2";
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
              /*case 'p':
                  pickUp();
                    break;*/
             /*case 't':
                 int t=M.charAt(i+1)-'0';
                 turn=richtung-(t);
                 richtung=t;
                 break;
             case 'R':
                 word=read();
                 break;
             case 'w':
                 write(word);
                 k++;
                 break;*/
            /* case 'c':
                 if(word.equals("R"))
                    M+="y2";
                 else 
                    M+="y0";
                 break;*/
            /*   case 'b':
                 while(!isMovePossible())
                 rest();
                 break;*/
              /* case 'o':
                 if(!isMovePossible())
                 M+="x2x3o0";
                 else
                 M+="x6p0y0p0y1x7";
                 break; */

            }
            if (job == 'r' || job == 'l' || job == 'd' || job == 'u')
                bewegung = M.charAt(i + 1) - '0';
            turn = (turn + 4) % 4;
            for (int j = 0; j < turn; j++)
                turnRight();
            for (int j = 0; j < bewegung; j++) {
                move();
                pickUp();
            }
            i += 2;
            BruchB = M.length();


        }


    }
