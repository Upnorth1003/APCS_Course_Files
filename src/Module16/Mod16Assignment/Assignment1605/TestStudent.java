package Module16.Mod16Assignment.Assignment1605;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tyler
 * @version 3/25/2017
 * @purpose challenge of all I learned in 16
 */
public class TestStudent
    {

        public static void main(String[] args)
            {
                List<Student> myClass = new ArrayList<>();
                myClass.add(new Student("Mark Kennedy", 70,80,90,100,90));
                myClass.add(new Student("Max Gerard", 80,85,90,85,80));
                myClass.add(new Student("Jean Smith", 50,79,89,99,100));
                myClass.add(new Student("Betty Farm",85,80,85,88,89));
                myClass.add(new Student("Dilbert Gamma", 70,70,90,70,80));
                //Original
                System.out.println("Original: ");
                printBook(myClass);

                System.out.println("Changing Batty's name to Batty Boop: ");
                replaceName(myClass, "Betty Farm", "Betty Boop");
                printBook(myClass);

                System.out.println("Changing Jean's quiz 1 score to 80: ");
                replaceQuiz(myClass, "Jean Smith", 1, 80);
                printBook(myClass);

                System.out.println("Replacing Dilbert with Mike Kappa, 80, 80, 80, 90, 90: ");
                replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80,80,80,90,90);
                printBook(myClass);

                System.out.println("Insering Lily Mu: 85, 95, 70, 0, 100 before Betty:  ");
                insertStudent(myClass, "Betty Boop", "Lily Mu", 85,95,70,0,100);
                printBook(myClass);

                System.out.println("Deleting Max Gerard: ");
                deleteStudent(myClass, "Max Gerard");
                printBook(myClass);

            }

        public static void printBook(List<Student> myClass)
            {
                System.out.printf("%9s %6s %s %s %s %s %s %s %s %s %s %s\n", "Name", "|", "Quiz 1", "|", "Quiz 2", "|", "Quiz 3", "|", "Quiz 4", "|", "Quiz 5", "|");
                for (int i = 0; i < myClass.size(); i++)
                    {
                        System.out.printf("%-14s %s %4d %3s %4d %3s %4d %3s %4d %3s %4d %3s\n",
                                myClass.get(i).getName(), "|",
                                myClass.get(i).getQuiz(1), "|",
                                myClass.get(i).getQuiz(2), "|",
                                myClass.get(i).getQuiz(3), "|",
                                myClass.get(i).getQuiz(4), "|",
                                myClass.get(i).getQuiz(5), "|");
                    }
                System.out.println();
            }

        public static void replaceName(List<Student> myClass, String name, String newName)
            {
                for (int i = 0; i < myClass.size(); i++)
                        if (myClass.get(i).getName().equals(name))
                            myClass.get(i).setName(newName);
            }

        public static void replaceQuiz(List<Student> myClass,String student,  int quiz, int newGrade)
            {
                for (int i = 0; i < myClass.size(); i++)
                        if (myClass.get(i).getName().equals(student))
                                myClass.get(i).setQuiz(quiz, newGrade);
            }

        public static void replaceStudent(List<Student> myClass, String student, String newStudent, int q1, int q2, int q3, int q4, int q5)
            {
                for (int i = 0; i < myClass.size(); i++)
                    {
                        if (myClass.get(i).getName().equals(student))
                            {
                                myClass.get(i).setName(newStudent);
                                myClass.get(i).setQuiz(1, q1);
                                myClass.get(i).setQuiz(2, q2);
                                myClass.get(i).setQuiz(3, q3);
                                myClass.get(i).setQuiz(4, q4);
                                myClass.get(i).setQuiz(5, q5);
                            }
                    }
            }

        public static void insertStudent(List<Student> myClass, String student, String newStudent, int q1, int q2, int q3, int q4, int q5)
            {
                int location = 0;

               for (int i = 0; i < myClass.size(); i++)
                       if (myClass.get(i).getName().equals(student))
                           location = i;

                myClass.add(location, new Student(newStudent, q1, q2, q3, q4, q5));
            }

        public static void deleteStudent(List<Student> myClass, String student)
            {
                for (int i = 0; i < myClass.size(); i++)
                    if (myClass.get(i).getName().equals(student))
                        myClass.remove(i);
            }
    }
