import java.util.Arrays;

public class StringBox {

    private char[] characters;

    public StringBox(String s) {
        this.characters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            characters[i] = s.charAt(i);
        }
    }

    // @Override
    public String toString() {
        return String.valueOf(characters);
    }

    public void append(String x) {
        String s = String.valueOf(characters).concat(x);
        this.characters = new char[s.length()];

        for (int i = 0; i < this.characters.length; i++) {
            this.characters[i] = s.charAt(i);
        }
    }

    public Boolean isEmpty() {
        return this.characters.length == 0;
    }

    public int length() {
        return this.characters.length;
    }

    public StringBox concat(String x) {  //Pass by value
        char[] newCharacters = new char[this.characters.length + x.length()];
        int idx = 0;
        for (int i = 0; i < this.characters.length; i++) {
            newCharacters[idx++] = this.characters[i];
        }
        for (int i = 0; i < x.length(); i++) {
            newCharacters[idx++] = x.charAt(i);
        }
        return new StringBox (String.valueOf(newCharacters));  //Pass by value, will not affect original StringBox, it return a new StringBox to someone
    }

    public StringBox concat2(String x) { //Pass by refernce
        char[] newCharacters = new char[this.characters.length + x.length()];
        int idx = 0;
        for (int i = 0; i < this.characters.length; i++) {
            newCharacters[idx++] = this.characters[i];
        }
        for (int i = 0; i < x.length(); i++) {
            newCharacters[idx++] = x.charAt(i);
        }
        this.characters = newCharacters;
        return this; //Pass by reference, amend self and return self
        
    }

    public StringBox replace(char from, char to){
        return this;
    }

    public static void main(String[] args) {
        StringBox s = new StringBox("hello");
        System.out.println(s.toString());
        System.out.println(s.concat("world"));
        System.out.println(s.length());

        StringBox s2 = s.concat("world");
        System.out.println(s == s2); //False
        StringBox s3 = s.concat2("world");
        System.out.println(s == s3); //True
    }
}
