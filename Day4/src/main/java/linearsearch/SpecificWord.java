package main.java.linearsearch;
//Linear Search Problem 2: Search for a Specific Word in a List of Sentences
//Problem:
//You are given an array of sentences (strings). Write a program that performs Linear Search to find the first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains the word, return "Not Found".
//Approach:
//Iterate through the list of sentences.
//For each sentence, check if it contains the specific word.
//If the word is found, return the current sentence.
//If no sentence contains the word, return "Not Found".

public class SpecificWord {
    public String [] strs = {
            "I am a sentence of a longer sentence array",
            "Ok this a longer sentence that is more longer ofcourse"
    };
    public String specific= new String("more");
    public String searchWord(){
        for(String itr : this.strs){
            if(itr.contains(this.specific)){
                return itr;
            }
        }
        return "NOt found";
    }
    public static void main(String[] args) {
        SpecificWord sp = new SpecificWord();
        System.out.println(sp.searchWord());
    }
}
