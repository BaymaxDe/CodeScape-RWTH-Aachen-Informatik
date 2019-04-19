# CodeScape-RWTH-Aachen-Informatik
# CodeScape- #Informatik für Maschinenbauer# Eine Lösung für das Spiel CodeScape.
*Ich hab darüm gekümmert, dass ich nur ein einziges Programm(Code) verwende, um alle Aufgaben zu lösen.
*Bei allen Aufgaben habe ich die geringste Menge an Befehle verwendet. Ich bin offen für Kritik und Verbesserung der Lösung.  *Bedeutungen der Variablen:
1) String M: ist der Move-String, darin wird die Route und die Bewegungen vom Roboter geschrieben.
a) u=up,d=down,l=left,r=right,R=Read,w=write,c=check,t=turn,p=pick,b=warte bis der Weg frei ist, o= dies ist überflüssig(den Befehl brauchen wir nie).

*die Derehung funktioniert so, t1: Roboter ist nach oben gerichtet, t0= nach rechts,t3=nach unten,t2= nach links.

*bei u,d,r,l braucht man die Drehung nicht einzugeben. Der Roboter kennt seine eigene Richtung und weißt, wir er sich drehen soll,    um diese Bewegung in der entsprechenden Richtung auszuführen.

*u1: bewegung nach Oben um eine Stelle, r9: Bewegung nach rechts um 9 Stellen.(egal wie der Roboter gerichtet ist) 

**Nach jeder Buchstabe soll eine Nummer bzw.ein Zeichen stehen, damit der Roboter den Code überhaupt versteht. ZB. u1r3p0R0, obwohl die Zahl 0 nach dem p und R nichts macht aber, um die Verständlichkeit des Move-Strings für den Roboter zu sichern brauchen wir diese Zahl oder irgendein anderes Zeichen. 

2)int BruchB: Bruchbedingung= dies is gleich der Länge des Move-Strings, d.h wenn der Roboter über die ganze Route gefahren ist, dann endet hier seine Bewegung. 

**Beachte mal, dass im Laufe des Programms, diese Bruchbedingung geändert werden kann, weil der Roboter manchmal wärend des Ausfürens vom Programm neue Route fahren soll, die nicht vorhersehbar waren.

3)int richtung: die Richtung vom Roboter, 1 ist Norden,2 ist Westen, 3 ist Süden, 0 ist Osten. 

4) int Bewegung= wie viele Stellen muss er fahren.  Ich würde gerne weitere Erklärungen schreiben, aber ich weiß es nicht, was unklar sein könnte. 
