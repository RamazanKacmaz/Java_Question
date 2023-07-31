package C76_C90;

public class C86_Do_While_Loop {
    public static void main(String[] args) {
       // Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char ch = 'k';
        System.out.println("k dan t ye kadar olan harfler");

        do {
            System.out.print(ch + " ");
            ch++;
        }while (ch <= 't');
    }
}
