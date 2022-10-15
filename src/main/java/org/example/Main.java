package org.example;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import java.util.ArrayList;


public class Main {
    static ArrayList<String> courses = new ArrayList<>(){
        {
            add("Computer Science");
        }
    };

    static ArrayList<String> modules = new ArrayList<>(){
        {
            add("Software Engineering");
            add("Professional Skills");
        }
    };

    static ArrayList<String> students = new ArrayList<>() {
        {
            add("Maria Henehan");
            add("Emily Metadjer");
            add("Seamus Dewar");
        }
    };

    static ArrayList<String> students2 = new ArrayList<>() {
        {
            add("Emma Urquhart");
            add("Jade Harnett");
        }
    };

    static studentClass maria = new studentClass("Maria Henehan", 21, DateTime.parse("06/02/2001", DateTimeFormat.forPattern("dd/MM/yyyy")),"19382053", courses, modules);
    static studentClass emily = new studentClass("Emily Metadjer", 25, DateTime.parse("15/10/1997", DateTimeFormat.forPattern("dd/MM/yyyy")),"19563921", courses, modules);

    static lecturerClass christina = new lecturerClass("Christina Heaney", 21, DateTime.parse("15/06/2001", DateTimeFormat.forPattern("dd/MM/yyyy")), "19325634", modules);
    static lecturerClass heather = new lecturerClass("Heather O'Brien", 21, DateTime.parse("07/09/2001", DateTimeFormat.forPattern("dd/MM/yyyy")), "19373027", modules);

    static moduleClass software = new moduleClass("Software Engineering", "Heather O'Brien", "ct417", students, courses);
    static moduleClass profSkills = new moduleClass("Professional Skills", "Christina Heaney", "ct436", students, courses);

    static courseProgrammeClass compSci = new courseProgrammeClass("Computer Science", students, modules, DateTime.parse("01/09/2022", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("05/12/2022", DateTimeFormat.forPattern("dd/MM/yyyy")));
    static courseProgrammeClass bis = new courseProgrammeClass("Business and Information Systems", students2, modules, DateTime.parse("01/09/2022", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("05/12/2022", DateTimeFormat.forPattern("dd/MM/yyyy")));


    public static void main(String[] args){
        System.out.println("Students: ");
        System.out.println(maria);
        System.out.println(emily);

        System.out.println("Lecturers: ");
        System.out.println(christina);
        System.out.println(heather);

        System.out.println("Modules: ");
        System.out.println(software);
        System.out.println(profSkills);

        System.out.println("Courses: ");
        System.out.println(compSci);
        System.out.println(bis);
    }
}