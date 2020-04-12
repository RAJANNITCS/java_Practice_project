public class PrintClass {

    private char ch;
    
    public PrintClass(char ch) {
        this.ch = ch;
    }
    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u') {
            return true;
        }else {
            return false;
        }
    }
    public boolean isNumber(){
        if(ch >= 48 && ch <=57) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isAlphabet() {
        if(ch >=65 && ch <= 90) {
            return true;
        }else if (ch >=97 && ch <= 122) {
            return true;
        } else {
            return false;
        }
    }

    public void printLowerCaseAlphabets() {
        for(int i = 65 ;i<=90;i++) {
            System.out.println((char)i);
        }
    }
    public void printUpperCaseAlphabets() {
        for(int i = 97;i<=122;i++) {
            System.out.println((char)i);
        }
    }

    public static void main(String[] args) { 
        PrintClass mychar = new PrintClass('C');
        System.out.println(mychar.isVowel());
        System.out.println(mychar.isNumber());
        System.out.println(mychar.isAlphabet());
        mychar.printLowerCaseAlphabets();
        mychar.printUpperCaseAlphabets();
    }
}