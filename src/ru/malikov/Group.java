package ru.malikov;

/**
 * @author Malikov Alexandr
 */

public class Group {
    
    // поле ИД ГРУППЫ
    private int groupId;
    // поле ИМЯ ГРУППЫ
    private String nameGroup;
    // поле КУРАТОР
    private String curator;
    // поле СПЕЦИАЛЬНОСТЬ
    private String speciality;

    
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
     * @return возвращает nameGroup
     */
    public String getNameGroup() {
        return nameGroup;
    }

    /**
     * @param nameGroup принимает nameGroup в качестве аргумента
     */
    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    /**
     * @return возвращает curator
     */
    public String getCurator() {
        return curator;
    }

    /**
     * @param curator принимает curator в качестве аргумента
     */
    public void setCurator(String curator) {
        this.curator = curator;
    }

    /**
     * @return возвращает speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality принимает speciality в качестве аргумента
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    @Override
    public String toString(){
        return nameGroup;
    }
}
