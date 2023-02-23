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
    public void setPost(String InpPost){
        if (InpPost.length() > 1){
            System.out.println("Где ты? В: " + InpPost);
            this.Post = InpPost;
        }
        else{
            System.out.println("Ошибка! Слишком короткое имя");
        }
    }
    public String getPost(){
        return this.Post;
    }

    private int salary;
    public void setSalary(int InpSalary){
        if (InpSalary > 100){
            System.out.println("Установлена ЗП: " + InpSalary);
            this.salary = InpSalary;
        }
        else{
            System.out.println("Ошибка! Слишком маленькая зп");
        }
    }
    public int getSalary(){
        return this.salary;
    }

    public void RandNameStaff(){
        String [] arr = {"Billy Herrington", "Van Darkholme", "Mark Wolff", "Danny Lee"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
        FullName = arr[select];
        System.out.println("Теперь одного из ваших подчинённых зовут: " + FullName);
    }

    public void Stat(){
        System.out.println("Полное имя: " + FullName + "\nДолжность: " + Post + "\nЗарплата: " + salary);
    }

    public void Anekdot(){
        System.out.println("Во время чемпионата по футболу, между сборными Китая и Таджикистана произошёл курьёзнейший случай.\n" +
                "Китайцы во время штрафного выстроились в стенку, а Таджики не растерялись и начали её штукатурить");
    }
}
