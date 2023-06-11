package week01;

public class Reverseforloop {

    public String reverse(String s){
        String ret = "";
        for(int k=0; k < s.length(); k +=1){
            ret = s.charAt(k) + ret;
        }
        return ret;
    }
    public static void main(String[] args) {
        Reverseforloop rs = new Reverseforloop();
        System.out.println(rs.reverse("pit"));

    }

}
