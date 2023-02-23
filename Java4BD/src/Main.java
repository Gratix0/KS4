public class Main {
    public static void main(String[] args) {
        // Это для файла PostOffice.java
        PostOffice One = new PostOffice();
        One.setAdress("Alibaba");
        System.out.println(One.getAdress());

        One.setStaff(5);
        System.out.println(One.getStaff());

        One.setStorage("Alida?");
        System.out.println(One.getStorage());

        One.Stat();
        One.RandNamePostOffice();
        One.StuffOfTheGym();
        System.out.println("-------------------------------------------------");

        //А это для Staff.Java
        Staff OneStaff = new Staff();
        OneStaff.setFullName("Beer");
        OneStaff.getFullName();

        OneStaff.setPost("Aga");
        OneStaff.getPost();

        OneStaff.setSalary(500);
        OneStaff.getSalary();

        OneStaff.RandNameStaff();
        OneStaff.Stat();
        OneStaff.Anekdot();





    }
}