import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    int num;
    char ch;
    Node[] chldrn = new Node[26];
    
    public Node(char ch){
        this.num=0;
        this.ch=ch;
    }
    public Node(int n,char ch){
        this.num=n;
        this.ch=ch;
    }
    
    static void addStr(Node r, String s){
        //r.num++;
        int ind = (int) s.charAt(0);
        ind -= 97;
        if( r.chldrn[ind] == null ){
            r.chldrn[ind] = new Node(1,s.charAt(0));
            if( ! s.substring(1).equals("") )
                Node.addStr(r.chldrn[ind],s.substring(1));
        }else{
            r.chldrn[ind].num++;
            if(! s.substring(1).equals("") )
                Node.addStr(r.chldrn[ind],s.substring(1));
        }
    }
    
    static int trav(Node r,String s){
        
        if(s.equals(""))
            return 0;
        int ind=(int) s.charAt(0);
        ind -= 97;
        if(s.length()!=1){
            if( r.chldrn[ind] != null ){
                return Node.trav(r.chldrn[ind],s.substring(1));
            }
            else{
                return 0;
            }
        }else{
            if(r.chldrn[ind] == null)
                return 0;
            return r.chldrn[ind].num;
        }
    }
    
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Node root = new Node('*');
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            if(op.equals(new String("add"))){
                
                Node.addStr(root,contact);
                
                
            }else{
                
                System.out.println(Node.trav(root,contact) + "");
            }
        }
        
        
    }
}
