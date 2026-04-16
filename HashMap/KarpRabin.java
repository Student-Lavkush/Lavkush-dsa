package HashMap;

public class KarpRabin {
    private final int PRIME = 101;

    private double findHash(String str) {
        double hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = hash + str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;

    }

    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
        double newHash = (prevHash - oldChar) / PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    public void search(String text, String pattern) {
        int patternLength = pattern.length();
        double patternHash = findHash(pattern);
        boolean found = false;
        double textHash = findHash(text.substring(0, patternLength));
        for (int i = 0; i <= text.length() - patternLength; i++) {
            if (textHash == patternHash) {
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern has found" + i);
                    found=true;
                }

            }
            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }

        }
        if(!found){
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        KarpRabin obj = new KarpRabin();
        obj.search("lavkus", "abc");

    }
}
