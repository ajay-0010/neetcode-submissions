class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int top = score.pop();
                int newtop = top+score.peek();
                score.push(top);
                score.push(newtop);
            }
            else if(op.equals("D")){
                int double1 = score.peek()*2;
                score.push(double1);
            }
            else if(op.equals("C")){
                score.pop();
            }
            else {
                score.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int total : score) {
            sum += total;
        }
        return sum;
    }
}