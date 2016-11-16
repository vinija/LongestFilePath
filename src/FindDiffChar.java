/**
 * Created by vinija on 11/16/16.
 */
public class FindDiffChar {
        public char findTheDifference(String s, String t) {
            char s_sum ='a';
            char t_sum = 'a';
            for(int i = 0; i<s.length(); i++){
                s = s.toLowerCase();
                s_sum +=s.charAt(i);
            }
            for(int j = 0; j<t.length(); j++){
                t_sum += t.charAt(j);
            }
            System.out.println((char)(s_sum-t_sum));
            return (char) (s_sum-t_sum);
        }

        public void findBiggerDiffChar(String s, String t){
            if(s.length()>t.length()){
               char []sArray= s.toCharArray();
                for(int i =0;i< sArray.length;i++){
                    for(int j = 0; j<t.length(); j++){
                        if(sArray[i]== t.charAt(j)){
                            sArray[i]= '8';
                        }
                    }
                }

                for(int k = 0; k< sArray.length; k++){
                    if(sArray[k]!='8'){
                        System.out.println(sArray[k]);
                    }
                }
            }
        }
}
