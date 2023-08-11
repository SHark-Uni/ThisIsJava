package chap_01;

public class _07_1_CustomReplace {
    static String customReplace(String s, String target, String replacement) {
        StringBuilder sb = null;
        int start = 0;
        //Find SubString

        for(int idx;(idx=s.indexOf(target,start)) != -1;){
            if(sb==null) sb = new StringBuilder();
            sb.append(s,start,idx);
            sb.append(replacement);
            start = idx + target.length();
        }
        //만약 위를 바로 통과해서 null인 경우, 찾는 값이 없다는 뜻.
        if(sb==null) return s;
        sb.append(s,start,s.length());
        return sb.toString();
    }

    public static void main(String... ignored) {
        String s1 = "JS는 좋아요";
        String newStr=customReplace(s1,"JS","Java");
        System.out.println("newStr "+newStr);
    }

}
