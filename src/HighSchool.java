public class HighSchool {

    public static void main(String[] args) {

        Student student1 = new Student("Roee");
        student1.setListener((grade) -> {
            if (grade < 60)
                System.out.println("oh, s%#t!");
            else if (grade < 70)
                System.out.println("I'm so sad...");
            else if (grade < 80)
                System.out.println("sad but nahhh...");
            else if (grade < 90)
                System.out.println("not bad at all");
            else if (grade < 100)
                System.out.println("nailed it!");
        });

        Student student2 = new Student("Eti");
        student2.setListener((grade) -> reactToGrade(grade));

        System.out.print(student1.getName()+"'s reaction: ");
        student1.graded(76);

        System.out.print(student2.getName()+"'s reaction: ");
        student2.graded(91);
    }

    public static void reactToGrade(int grade) {
        if (grade < 60)
            System.out.println("oh, s%#t!");
        else if (grade < 70)
            System.out.println("I'll appeal!");
        else if (grade < 80)
            System.out.println("is there Moed B?");
        else if (grade < 90)
            System.out.println("I wanted more...");
        else if (grade < 100)
            System.out.println("but why not 100?");
    }

}