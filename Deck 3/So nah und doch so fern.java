 public void run() {
        String word = "";
        String pass = "";
        //{u,d,l,r,t,c,R,w,b,p,o}
        String M = "u1l1l1t1c0";
        String derWeg[] = new String[7];
        derWeg[2] = "l1";
        String nextMove = "l1";// Die nächste bewegung, die der Roboter ausführen soll,
                                //sollte diese bewegung ihm nicht nach vorne bringen
                                //dann wird die Richtung beim nächsten Schritt gändert (schaue mal unten)
        int thisPos = 2;//die aktuelle Position, diese wird nur dann aktualisiert wenn er sich fortbewegt
                        //wenn er eine stelle rückwerts fährt für dise variable nicht um -1 geändert
                        //sondern er wird noch mal streben zu dieser position zu kommen
        int lastPos = 1;// Die ltzte Position ìst immer gleich thisPos-1
        int turn = 0, bewegung = 0, richtung = 0, BruchB = M.length(), i = 0;

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
                case 'p':
                    pickUp();
                    break;
                case 't':
                    int t = M.charAt(i + 1) - '0';
                    turn = richtung - (t);
                    richtung = t;
                    break;
                case 'R':
                    word = read();
                    for (int N = word.length() - 1; N >= 0; N--)
                        pass += word.charAt(N);
                    break;
                case 'w':
                    write(word);
                    break;
                case 'c'://c steht für check
                    int f = Integer.parseInt(read()); 
                    if (f != 6) { // in dieser Bedingung strebt der Roboter danach, die Stelle 6 zu erreichen
                        if (f == lastPos) {
                            if (nextMove.equals("l1"))
                                nextMove = "r1";
                            else
                                nextMove = "l1";
                            M += derWeg[thisPos] + nextMove + "t1c1";
                        } else {
                            thisPos = f;
                            lastPos = thisPos - 1;
                            derWeg[thisPos] = nextMove;// hier wird den Weg zu der Stelle 6 gespeichert
                            M += nextMove + "t1c1";

                        }

                    } else {// hier hat er 6 erreicht. Ab da wissin wir genau wie er sich Verhalten(sich bewegen) soll
                        derWeg[6] = nextMove;
                        M += "r1p0t1R0l2";
                        for (int k = 6; k >= 3; k--)//hier werden die Werte für die Rückfahrt berechnet
                            if (derWeg[k].equals("r1"))
                                M += "l1";
                            else
                                M += "r1";
                        M += "r1t1w1d1";
                    }
                    break;
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