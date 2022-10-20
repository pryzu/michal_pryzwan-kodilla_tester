public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public double average(){
        double average = 0;
        for (int i = 0; i < this.size; i++){
            average = average + this.grades[i];}
        average = average / this.size;
        return average;
    }

    public int lastGrade(){
        int lastGrade = this.grades[size-1];
            return lastGrade;

    }
    public static void main(String[] args) {
        Grades down = new Grades();
        down.add(27);
        down.add (1);
        down.add(64);
        down.add(98);

        System.out.println("Średnia 4 liczb"+ down.average());

        System.out.println("Ostatnia liczba:" + down.lastGrade());
    }

}


