    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        //Not enough words in the magazine to creat ransom note
        if(magazine.length < note.length) {
            System.out.println("No");
            return;
        }

        //stores words and number of times they occure
        HashMap<String, Integer> set = new HashMap<String, Integer>();
        for(String s: magazine) {
            //if word already seen, add to number of occurences
            if(set.containsKey(s)) {
                set.put(s, set.get(s) + 1);
            } else {
                set.put(s, 1);
            }
        }

        for(String s: note) {
            if(set.containsKey(s)) {
                //if there's one more word left, remove from set
                if(set.get(s) == 1) {
                    set.remove(s);
                } else {
                    set.put(s, set.get(s) - 1);
                }
                //magazine does not contain the word
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }