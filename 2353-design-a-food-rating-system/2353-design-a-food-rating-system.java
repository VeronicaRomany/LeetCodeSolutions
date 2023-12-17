class FoodRatings {
    
     HashMap<String, Pair<String, Integer>> foods;
    HashMap<String, TreeSet<Pair<String, Integer>>> highestRate;
   
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.foods = new HashMap<>();
        this.highestRate = new HashMap<>();
        
        for (int i = 0; i < foods.length; i++) {
            this.foods.put(foods[i], new Pair<>(cuisines[i], ratings[i]));
            
            if (highestRate.containsKey(cuisines[i])) {
                highestRate.get(cuisines[i]).add(new Pair<>(foods[i], ratings[i]));
            } else {
                TreeSet<Pair<String, Integer>> s = new TreeSet<>(new VarvouraComparator());
                s.add(new Pair<>(foods[i], ratings[i]));
                highestRate.put(cuisines[i], s);
            }
        }
    }
    
    static class VarvouraComparator implements Comparator<Pair<String, Integer>> {
        @Override
        public int compare(Pair<String, Integer> p1, Pair<String, Integer> p2) {
            // Compare based on string length
            // System.out.println(p2.getKey());
            if (p1.getValue().equals( p2.getValue())) {
                
                return p1.getKey().compareTo(p2.getKey());
            }
            return p2.getValue().compareTo(p1.getValue());
        }
    }
    
    public void changeRating(String food, int newRating) {
        Pair<String, Integer> p = this.foods.get(food); // cuisine , rate
        
        TreeSet<Pair<String, Integer>> t = this.highestRate.get(p.getKey()); 
        Pair<String, Integer> copy = new Pair<>(food, p.getValue()); // food , rate
        t.remove(copy);
        Pair<String, Integer> newCopy = new Pair<>(food, newRating);
        t.add(newCopy);
        this.highestRate.put(p.getKey(),t);
        
        Pair<String, Integer> Pcopy = new Pair<>(p.getKey(), newRating);// cuisine ,rate
        this.foods.put(food , Pcopy);
    }
    
    public String highestRated(String cuisine) {
        return this.highestRate.get(cuisine).first().getKey();
    }
  
}
