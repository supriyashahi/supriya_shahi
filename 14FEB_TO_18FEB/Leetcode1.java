class Leetcode1 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        int i=0,j=0;
        while(i<startTime.length && j<endTime.length){
            if(startTime[i]<=queryTime && endTime[j]>=queryTime)
                count++;
            i++;
            j++;
        }
        return count;
    }
}