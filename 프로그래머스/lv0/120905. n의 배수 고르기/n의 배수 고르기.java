import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        // int cnt = 0;
        // for(int i=0; i<numlist.length; i++){
        //     if(numlist[i]%n==0){
        //         cnt++;
        //     }
        // }
        // answer = new int[cnt];
        // cnt = 0;
        // for(int i=0; i<numlist.length; i++){
        //     if(numlist[i]%n==0){
        //         answer[cnt++] = numlist[i];
        //     }
        // }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                arr.add(numlist[i]);
            }
        }
        int cnt = 0;
        answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}