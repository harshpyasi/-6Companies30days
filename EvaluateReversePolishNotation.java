class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;

        for (int i = 0; i < n; i++) {
            int a = tokens[i].charAt(0)-'*';
            if(tokens[i].length()>1 || a>5){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else {
                int l = stack.pop();
                int k = stack.pop();
                switch (a) {
                    case 0 -> stack.push(k * l);
                    case 1 -> stack.push(k + l);
                    case 3 -> stack.push(k - l);
                    case 5 -> stack.push(k / l);
                }
            }
        }
        return stack.pop();
    }
}
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/harshpyasi/-6Companies30days.git
git push -u origin main