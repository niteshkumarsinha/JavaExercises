package strings;

import java.util.List;
import java.util.stream.Collectors;

public class Joiner {

    static String joinIter(List<String> strings, String separator){
        StringBuilder sb = new StringBuilder();
        for(String str: strings){
            sb.append(str);
            if(strings.indexOf(str) != strings.size() - 1)
                sb.append(separator);
        }
        return sb.toString();
    }

    static String join(List<String> strings, String separator){
        if(strings.size() == 1) return strings.get(0);
        return strings.get(0) + separator + join(strings.subList(1, strings.size()), separator);
    }

    static String joinStrings(List<String> strings, String delimeter){
        return strings.stream().collect(Collectors.joining(delimeter));
    }

    public static void main(String[] args) {
        System.out.println(join(List.of("hello", "world", "message"), "+++"));
        System.out.println(join(List.of("Micha", "Zurich"), " likes "));
        System.out.println(joinStrings(List.of("hello", "world", "message"), "+++"));
        System.out.println(joinStrings(List.of("Micha", "Zurich"), " likes "));
        System.out.println(joinIter(List.of("hello", "world", "message"), "+++"));
        System.out.println(joinIter(List.of("Micha", "Zurich"), " likes "));

    }
}
