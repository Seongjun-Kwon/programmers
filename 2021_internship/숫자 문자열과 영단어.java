class Solution {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int answer = 0;

        for (int i = 0; i < numbers.length; i++)
            s = s.replaceAll(numbers[i], Integer.toString(i));

        answer = Integer.parseInt(s);
        return answer;
    }
}
