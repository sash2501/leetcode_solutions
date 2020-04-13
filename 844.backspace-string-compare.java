class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack stackS= new Stack();
        Stack stackT= new Stack();
        char[] charS=S.toCharArray();
        char[] charT=T.toCharArray();
        
        for(int i=0;i<charS.length;i++){
            if(charS[i] !='#'){
                stackS.push(charS[i]);
            }else{
                if(!stackS.empty()){
                stackS.pop();
                }
            }
        }
        for(int i=0;i<charT.length;i++){
            if(charT[i] !='#'){
                stackT.push(charT[i]);
            }else{
                if(!stackT.empty()){
                stackT.pop();
                }
            }
        }
        int flag= 0;
        while(!stackS.empty() && !stackT.empty()){
            char Spop=(char)stackS.pop();
            char Tpop=(char)stackT.pop();
            if(Spop == Tpop){
                continue;
            }
            else{
                flag =1;
                break;
            }
        }
        
        if(!stackS.empty() || !stackT.empty() || flag ==1)        
        return false;
        else 
        { return true;}
        
    }
}
