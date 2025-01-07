class Solution {
    public List<String> stringMatching(String[] words) {

        HashSet<String> answer = new HashSet();

        for(int i=0 ; i<words.length;i++){

            for(int j=i+1 ; j<words.length;j++){
                if(i!=j){
                    int subStringLen = Math.min(words[j].length(), words[i].length());

                    if(subStringLen == words[i].length()){
                        if(words[j].contains(words[i])){
                            answer.add(words[i]);
                        }
                    }else{
                        if(words[i].contains(words[j])){
                            answer.add(words[j]);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(answer); 
    }
}