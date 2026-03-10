
DATE : 25-JAN-2026
LEVEL : Easy
TOPIC : Array

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // if mappings don't match, not isomorphic
            if (map1[c1] != map2[c2]) {
                return false;
            }

           // store position + 1 to avoid default 0 clash
            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }
        return true;
    }
}


DATE : 10-March-2026
LEVEL : Easy
TOPIC : HashMap

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // check s -> t mapping
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) return false;
            } else {
                mapST.put(c1, c2);
            }

            // check t -> s mapping
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) return false;
            } else {
                mapTS.put(c2, c1);
            }
        }
        return true;
    }
}