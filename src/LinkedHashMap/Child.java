package LinkedHashMap;

public class Child {

    private String name;
    private int age;
    private char gender;
    private String city;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Child(String name, int age, char gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public boolean canGoSchool(){
        if(age>6){
            System.out.println("Child can go to school.");
            return true;
        }
        System.out.println("Child can not go to school.");
        return false;
    }

    public boolean nameIsPalindrome(String name) {
//        String result="";
//        int length = name.length();
//        for(int i = length - 1; i >= 0; i--) {
//            result = result + name.charAt(i);
//        }
//        if(name.equalsIgnoreCase(result)) {
//            return true;
//        }

        int k = name.length() / 2;
        for (int i = 0; i < k; i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1))
                System.out.println("The name is not palindrome");
                return false;
            }
            System.out.println("The name is palindrome");
            return true;

        }
    }
