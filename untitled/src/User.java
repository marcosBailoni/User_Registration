public class User {

    private int id;
    private String name;
    private String email;
    private int age;
    private Double height;

    public User(){}


    public User(String name, String email, int age, Double height) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return name + "\n" + email + "\n" + age  + "\n" +height;

    }
}
