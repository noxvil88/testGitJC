
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Андрей", Arrays.asList(new Course("Математика"), new Course("Химия"),
                new Course("Информатика"))));
        students.add(new Student("Анна", Arrays.asList(new Course("Математика"), new Course("Физика"),
                new Course("Информатика3"), new Course("Информатика2"))));
        students.add(new Student("Алена", Arrays.asList(new Course("Биология"), new Course("Химия"),
                new Course("Информатика"), new Course("Информатика1"))));


        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));


        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));


        Course course = new Course("Testing");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }


}
