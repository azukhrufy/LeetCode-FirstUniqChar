/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstuniqchar;

/**
 *
 * @author zukhruf
 */
public class FirstUniqChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
     static int firstUniqChar(String s) {
        int count = -1;
        if(s == null) return count;
        for(char ch:s.toCharArray()){
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                count = s.indexOf(ch);
                break;
            }
        }
        return count;
    }
    
}
