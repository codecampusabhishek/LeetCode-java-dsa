class ValidParanthesis{
    public boolean isValid(String str){
        char[] stack = new char[str.length()];
        int top = -1;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' ||ch == '['){
                top++;
                stack[top] = ch;
            } else {
                if(top == -1){
                    return false;
                }
            if((stack[top] == '(' && ch == ')') ||
                 (stack[top] == '{' && ch == '}') ||
                    (stack[top] == '[' && ch == ']')){
                        top--;
                    } else {
                        return false;
                    }
            }
        }
        return top == -1;
    }
}