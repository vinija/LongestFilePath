/**
 * Created by vinija on 11/16/16.
 */
public class LongestFilePath {

    public int lengthLongestPath(String input){

        String[] iArr = input.split("\n");
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(","+iArr[i]);

        }
        int len = iArr.length;
        int[] level = new int[len];

        int max = 0;

        for(int i = 0; i<len; i++){
            char[] tmp = iArr[i].toCharArray();
            int levelt = 0;

            while(levelt < tmp.length && tmp[levelt] =='\t') levelt++;
            level[levelt] = levelt>0 ? (level[levelt-1] +1):0;
            level[levelt] += tmp.length - levelt;

            if(iArr[i].contains(".")){
                max = Math.max(max, level[levelt]);
            }

        }
System.out.println(max);
        return max;

    }
}
