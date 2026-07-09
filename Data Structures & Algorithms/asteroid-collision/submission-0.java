class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() &&
                   stack.peek() > 0 &&
                   asteroid < 0) {

                if (stack.peek() < -asteroid) {
                    stack.pop();          // top explodes
                }
                else if (stack.peek() == -asteroid) {
                    stack.pop();          // both explode
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;     // current explodes
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
        }

        return ans;
    }
}