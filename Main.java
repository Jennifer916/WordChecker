import java.util.ArrayList;
public class Main
{

public static void main(String[] args)
    {
        WordChecker w = new WordChecker();
       System.out.println(w.isWordChain());

        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon"); 
       WordChecker x = new WordChecker(words);
       System.out.println(x.isWordChain());

       ArrayList<String> alist = new ArrayList<String>();
       alist.add("to");
       alist.add("too");
       alist.add("stool");
       alist.add("tools");
        WordChecker h = new WordChecker(alist);
        System.out.println(h.isWordChain());

    }
}

