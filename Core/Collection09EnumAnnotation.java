package Core;

enum Days {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

enum Result {
    // Integer marks;
    PASS, FAIL;
    int marks;

    Result() {
        System.out.println("Result Constructor:");
    }

    public void setMarks(int m){
        this.marks = m;
    }

    public int getMarks(){
        return this.marks;
    }
}

public class Collection09EnumAnnotation {
    public static void main(String[] args) {
        Days day = Days.MON;
        System.out.println(day);
        System.out.println(day.ordinal()); // it gives the index of enum variable
        // for (Object elem : Days.values()) {
        //     System.out.println(elem);
        // }

        for (Days elem : Days.values()) {
            System.out.println(elem.ordinal() + " --> " + elem);
        }

    }
}
