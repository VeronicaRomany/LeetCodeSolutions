class Solution {
    class Item {
    int memberOfArray;
    int oneBitsCount;

    public Item(int memberOfArray, int oneBitsCount) {
        this.memberOfArray = memberOfArray;
        this.oneBitsCount = oneBitsCount;
    }
}
    public  int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1); 
            count++;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
          Comparator<Item> comparator = new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                if (item1.oneBitsCount < item2.oneBitsCount) {
                    return -1;
                } else if (item1.oneBitsCount > item2.oneBitsCount) {
                    return 1;
                } else {
                    // If they are equal
                    return Integer.compare(item1.memberOfArray, item2.memberOfArray);
                }
            }
        };
        
        int i;
         PriorityQueue<Item> priorityQueue = new PriorityQueue<>(comparator);
            
        for(i=0 ; i<arr.length ; i++){
            
//             int a =   arr[i] & (arr[i]-1); 
//             System.out.println(arr[i]+ " "+a);
//             System.out.println(arr[i]+ " "+(1 + (arr[i]&(arr[i]-1))));
            priorityQueue.add(new Item(arr[i] ,countSetBits(arr[i])));
        }
        
        i=0;
        while(!priorityQueue.isEmpty()) arr[i++] = priorityQueue.poll().memberOfArray;
        
        return arr;
        
    }
}