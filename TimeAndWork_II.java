public class TimeAndWork_II {
        long ans = Long.MAX_VALUE;
        public int earliestFinishTime(int[] landStartTime,int[] landDuration,int[] waterStartTime,int[] waterDuration) {
        long minLandEnd = Long.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minLandEnd = Math.min(minLandEnd,(long) landStartTime[i] + landDuration[i]);
        }
        for (int j = 0; j < waterStartTime.length; j++) {
            ans = Math.min(ans,Math.max(minLandEnd, (long) waterStartTime[j])+ waterDuration[j]);
        }
        long minWaterEnd = Long.MAX_VALUE;
        for (int j = 0; j < waterStartTime.length; j++) {
            minWaterEnd = Math.min( minWaterEnd,(long) waterStartTime[j] + waterDuration[j]);
        }
        for (int i = 0; i < landStartTime.length; i++) {
            ans = Math.min(ans,Math.max(minWaterEnd, (long) landStartTime[i])+ landDuration[i]);
        }
        return (int) ans;
    }
public static void main(String[] args) {
        int[] landStartTime = {2, 8};
        int[] landDuration = {4, 1};
        int[] waterStartTime = {6};
        int[] waterDuration = {3};
        TimeAndWork_II obj = new TimeAndWork_II();
        int result = obj.earliestFinishTime(landStartTime,landDuration,waterStartTime,waterDuration);
        System.out.println("Answer = " + result);
    }    
}    

