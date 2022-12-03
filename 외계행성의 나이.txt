class Solution {
    public String solution(int age) {
        String answer = "";
        String str = "abcdefghij";
        String[] arr1 = str.split("");
        String[] arr2 = (age+"").split("");
        for(int i=0; i<arr2.length; i++){
            answer += arr1[Integer.parseInt(arr2[i])];
        }
        return answer;
    }
}