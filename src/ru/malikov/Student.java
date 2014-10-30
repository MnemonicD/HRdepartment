package ru.malikov;

import java.text.Collator;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Malikov Alexandr
 */
public class Student {

    // поле ИД СТУДЕНТА
    private int studentId;
    // поле ИМЯ
    private String firstName;
    // поле ФАМИЛИЯ
    private String surName;
    // поле ФАМИЛИЯ
    private String patronymic;
    // поле ДАТА РОЖДЕНИЯ
    private Date dateOfBirth;
    // поле ПОЛ
    private char sex;
    // поле ИД ГРУППЫ
    private int groupId;
    // поле ГОД ОБУЧЕНИЯ
    private int educationYear;

    /**
     * @return возвращает studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId принимает studentId в качестве аргумента
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return возвращает firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName принимает firstName в качестве аргумента
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return возвращает surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param surName принимает surName в качестве аргумента
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return возвращает patronymic
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * @param patronymic принимает patronymic в качестве аргумента
     */
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    /**
     * @return возвращает dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth принимает dateOfBirth в качестве аргумента
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return возвращает sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex принимает sex в качестве аргумента
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @return возвращает groupId
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * @param groupId принимает groupId в качестве аргумента
     */
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    /**
     * @return возвращает educationYear
     */
    public int getEducationYear() {
        return educationYear;
    }

    /**
     * @param educationYear принимает educationYear в качестве аргумента
     */
    public void setEducationYear(int educationYear) {
        this.educationYear = educationYear;
    }

    @Override
    public String toString() {
        return surName + " " + firstName + " " + patronymic + ", "
                + DateFormat.getDateInstance(DateFormat.SHORT).format(dateOfBirth)
                + ", группа ИД = " + groupId + " Год: " + educationYear;
    }

    /**
     *
     * @param obj - объект для сравнения
     * @return целое число больше 0, если объект obj меньше,
                0 – если они равны, и отрицательное число – если больше
     */
    public int compareTo(Object obj) {
        Collator c = Collator.getInstance(new Locale("ru"));
        c.setStrength(Collator.PRIMARY);
        return c.compare(this.toString(), obj.toString());
    }

}
