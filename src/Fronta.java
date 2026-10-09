import java.util.Scanner;

public class Fronta{
    Scanner sc = new Scanner(System.in);
    private final int kapacita = 20;
    private final Zak[] frontaZaku;
    private int front;
    private int rear;
    private int size;

    public Fronta() {
        this.frontaZaku = new Zak[kapacita];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Test na prázdnou frontu
    public boolean jePrazdna() {
        return size == 0;
    }

    // Test na plnou frontu
    public boolean jePlna(){
        return size == kapacita;
    }

    public void addZak(Zak zak) {
        if (jePlna()) {
            throw new FullFrontaException("Fronta je plna");
        }

        rear = (rear + 1) % kapacita;
        frontaZaku[rear] = zak;
        size++;
    }

    public void obslouzeni(Zak zak) {
        if (jePrazdna()) {
            throw new FullFrontaException("Fronta je prazdna");
        }
        /*Zak current = frontaZaku[front];
        Zak next =  frontaZaku[front+1];*/
        System.out.println("Obsoulzen: "+frontaZaku[front].getJmeno()+", cislo chodu: "+frontaZaku[front].getCisloChodu());
        frontaZaku[front]=null;
        front = (front + 1) % kapacita;
        size--;

    }

    public void prvniChod(){
        if (jePrazdna()) {
            throw new FullFrontaException("Fronta je prazdna");
        }
        System.out.println("Chod prvního: "+frontaZaku[front].getJmeno()+" "+frontaZaku[front].getCisloChodu());

    }

    public void hledaniPrijmeni(){
        if (jePrazdna()) {
            throw new FullFrontaException("Fronta je prazdna");
        }
        System.out.println("Napis prijmeni zaka: ");
        String hledany = sc.nextLine();
        boolean je = false;
        for(int i=0; i<size; i++){
            int index = (front + i) % kapacita;
            if(frontaZaku[index].getJmeno().contains(hledany)){
                System.out.println(frontaZaku[index].getJmeno());
                je = true;
            }
        }
        if(!je){
            System.out.println("Neni tam");
        }

    }






    public void printFrontaZaku() {
        int poradi=1;
        for (int i = 0; i < size; i++) {
            int index = (front + i) % kapacita;
            System.out.print(poradi+") "+frontaZaku[index].getJmeno()+"\n");
            poradi++;

        }
    }

    public int getKapacita() {
        return kapacita;
    }

    public Zak[] getFrontaZaku() {
        return frontaZaku;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
