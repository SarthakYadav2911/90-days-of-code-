import java.util.HashMap;
import java.util.Scanner;
public class leetcode242
{
    public static void  main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();

        HashMap<Character , Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {

            if (!map.containsKey(ch)) {
                System.out.println("not an anagram");
                return;
            }
            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0)
                map.remove(ch);
        }

        if(map.isEmpty()) {
            System.out.println("is anagram;");
        }else{
                System.out.println("is not an anagram ");
            }
        sc.close();
    }

    }
