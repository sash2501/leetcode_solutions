class Solution {
    public boolean isValid(String s) {
        Stack stack=new Stack();
    
        char[] charArr=s.toCharArray();

       if(charArr.length%2!=0){
            return false;  //odd means no matching pair
        }

        for(int i=0;i<charArr.length;i++){
            if(charArr[i]=='('||charArr[i]=='['||charArr[i]=='{'){
                stack.push(charArr[i]);
            }else{
               
                if(!stack.empty()){
                    char temp=(char)stack.pop();
                    if(charArr[i]==')' && temp!='('){
                        return false;
                    }
                    else if(charArr[i]==']' && temp!='['){
                        return false;
                    }
                    else if(charArr[i]=='}' && temp!='{'){
                        return false;
                    }
                    
                }
            }
        }

        if(!stack.empty()){
            return false;
        }

        return true;
        
    }
}
