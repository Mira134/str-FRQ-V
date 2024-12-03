public boolean isValidIdentifier(String str){
    if(!Character.isLetter(str.charAt(0))&& str.charAt(0) !='_'){
        return false;
    }
    for(int i = 1;i < str.length();i++){
        if(!Character.isLetter(str.charAt(i)&& !Character.isDigit(str.charAt(i))&& str.charAt(i) != '_'){
            return false;
        }
    }
    return true;
}