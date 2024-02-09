package strings;

public class CompareVersions {
    static int compareVersions(final String v1, final String v2){
        String[] version1 = v1.split("\\.");
        String[] version2 = v2.split("\\.");
        int pos = 0;
        int compareResult = 0;
        while(pos < version1.length && pos < version2.length && compareResult == 0){
            int ver1 = Integer.valueOf(version1[pos]);
            int ver2 = Integer.valueOf(version2[pos]);
            compareResult = Integer.compare(ver1, ver2);
            pos++;
        }
        if(compareResult == 0){
            return Integer.compare(version1.length, version2.length);
        }
        return compareResult;
    }
}
