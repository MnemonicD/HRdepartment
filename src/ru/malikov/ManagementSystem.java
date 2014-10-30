package ru.malikov;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Malikov Alexandr
 */
public class ManagementSystem {

    private List<Group> groups;
    private Collection<Student> students;

    // Для шаблона Singletone статическая переменная
    private static ManagementSystem instance;

    // Закрытый конструктор
    private ManagementSystem() {
        loadGroups();
        loadStudents();
    }

    // Проверка инициализации instance;
    public static synchronized ManagementSystem getInstance() {
        if (instance == null) {
            instance = new ManagementSystem();
        }
        return instance;
    }

    public static void main(String[] args) {
    }

    // Метод создает две группы и помещает их в коллекцию для групп
    private void loadGroups() {
        if (groups == null) {
            groups = new ArrayList<Group>();
        } else {
            groups.clear();
        }
        Group g = null;

        g = new Group();
        g.setGroupId(1);
        g.setNameGroup("Первая группа");
        g.setCurator("Доктор борменталь");
        g.setSpeciality("Создание собачек из человеков");
        groups.add(g);

        g = new Group();
        g.setGroupId(2);
        g.setNameGroup("Вторая группа");
        g.setCurator("Профессор преображенский");
        g.setSpeciality("Создание человеков из собак");
        groups.add(g);
    }

    // Метод создает несколько студентов и помещает их в коллекцию
    private void loadStudents() {
        if (students == null) {
            // Использование коллекции, автоматически сортирующей элементы
            students = new TreeSet<Student>();
        } else {
            students.clear();
        }

        Student s = null;
        Calendar c = Calendar.getInstance();

        // Вторая группа
        s = new Student();
        s.setStudentId(1);
        s.setFirstName("Иван");
        s.setPatronymic("Сергеевич");
        s.setSurName("Степанов");
        s.setSex('М');
        c.set(1990, 3, 20);
        s.setDateOfBirth(c.getTime());
        s.setGroupId(2);
        s.setEducationYear(2006);
        students.add(s);

        s = new Student();
        s.setStudentId(2);
        s.setFirstName("Наталья");
        s.setPatronymic("Андреевна");
        s.setSurName("Чичикова");
        s.setSex('Ж');
        c.set(1990, 6, 10);
        s.setDateOfBirth(c.getTime());
        s.setGroupId(2);
        s.setEducationYear(2006);
        students.add(s);

        // Первая группа
        s = new Student();
        s.setStudentId(3);
        s.setFirstName("Петр");
        s.setPatronymic("Викторович");
        s.setSurName("Сушкин");
        s.setSex('М');
        c.set(1991, 3, 12);
        s.setDateOfBirth(c.getTime());
        s.setEducationYear(2006);
        s.setGroupId(1);
        students.add(s);

        s = new Student();
        s.setStudentId(4);
        s.setFirstName("Вероника");
        s.setPatronymic("Сергеевна");
        s.setSurName("Ковалева");
        s.setSex('Ж');
        c.set(1991, 7, 19);
        s.setDateOfBirth(c.getTime());
        s.setEducationYear(2006);
        s.setGroupId(1);
        students.add(s);
    }
    
    // Получить список групп
    public List<Group> getGroups(){
        return groups;
    }
    
    // Получить список всех студентов
    public Collection<Student> getAllStudents(){
        return students;
    }
    
    // Получить список студентов для определенной группы
    public Collection<Student> getStudentsFromGroup(Group group, int year){
        Collection<Student> l = new TreeSet<Student>();
        for(Student si : students) {
            if (si.getGroupId()==group.getGroupId()&&si.getEducationYear()==year) l.add(si);
        }
        return l;
    }
}
