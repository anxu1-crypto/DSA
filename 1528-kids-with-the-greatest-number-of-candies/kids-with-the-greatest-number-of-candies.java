import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> result = new ArrayList<>();
        int i = 0;
        int max = candies[0];
        for(int j = 1; j<candies.length; j++){
            if (candies[j]>max){
                max = candies[j];
                
            }
        }
        while(i<candies.length){
            if(candies[i] + extraCandies >= max) result.add(true);
            else result.add(false);
            i++;
        }
        return result;
    }
}