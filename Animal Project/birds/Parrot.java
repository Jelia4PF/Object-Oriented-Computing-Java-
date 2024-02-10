package birds;

public class Parrot extends Bird {
    private boolean canTalk; // private member
    protected String favoriteWord; // protected member

    // Two constructors
    public Parrot(String name, int age, boolean canTalk) {
        super(name, age);
        this.canTalk = canTalk;
    }

    public Parrot(String name, int age) {
        super(name, age);
        this.canTalk = false;
    }

    // Overridden method from superclass
    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
    public void talk(int words) {
        System.out.println(name + " can talk " + words + " words");
    }

    public void talk(boolean canTalk) {
        System.out.println(name + (canTalk ? " can" : " cannot") + " talk");
    }

    // Getters and Setters
    public boolean canTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }

    public String getFavoriteWord() {
        return favoriteWord;
    }

    public void setFavoriteWord(String favoriteWord) {
        this.favoriteWord = favoriteWord;
    }
}
