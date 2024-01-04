package practises.practise_03;
public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[]lesson1Grades=new int[10]; // Holds 10 notes
        int[]lesson2Grades=new int[10]; // Holds 10 notes
        int[]lesson3Grades=new int[10]; // Holds 10 notes


        int[][]allLessonsGrades=new int[3][10]; // Holds (3x10) 30 notes

        for (int lesson = 0; lesson < 3; lesson++) {
            for (int grade = 0; grade < 10; grade++) {
                allLessonsGrades[lesson][grade]=(int)(Math.random()*100);
                System.out.println((lesson+1)+". lesson "+(grade+1)+ ". grade = "+allLessonsGrades[lesson][grade]);
            }
        }

    }
}
