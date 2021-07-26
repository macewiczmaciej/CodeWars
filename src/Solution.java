import java.util.Locale;

class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase != null && phrase.length()>0){
            String[] words = phrase.split("\\s");
            String result = "";
            for (String word : words) {
                String first = word.substring(0,1);
                String rest = word.substring(1);
                result += first.toUpperCase()+rest+" ";
            }
            return result.trim();
        }else{
            return null;
        }
    }
}