class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        // 방법 1
        // for(int i=0, j=num_list.length-1; j>=0; i++, j--){
        //    answer[i] = num_list[j]; 
        // }
        
        // 방법 2
        int idx = 0;
        for(int i=num_list.length-1; i>=0; i--){
           answer[idx++] = num_list[i];
        }
        return answer;
    }
}