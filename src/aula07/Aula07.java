import aula07.LinkedList;
import aula07.Student;

void main() {
    LinkedList<Student> list = new LinkedList<>();
    list.insertFirst(
            new Student(
                    1L,
                    "Thiago",
                    10.0
            )
    );

    list.insertFirst(
            new Student(
                    2L,
                    "Marliane",
                    9.9
            )
    );
}