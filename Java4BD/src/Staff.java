import java.util.Random;

public class Staff {
    private String FullName;
    public void setFullName(String InpFullName){
        if (InpFullName.length() > 1){
            System.out.println("Теперь ты " + InpFullName);
            this.FullName = InpFullName;
        }
        else{
            System.out.println("Ошибка! Слишком короткое имя");
        }
    }
    public String getFullName(){
        return this.FullName;
    }
    private String Post;
    private int salary;

    public void RandNamePostOffice(){
        String [] arr = {"Billy Herrington", "Van Darkholme", "Mark Wolff", "Danny Lee"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
        FullName = arr[select];
        System.out.println("Теперь одного из ваших подчинённых зовут: " + FullName);

    }
}
