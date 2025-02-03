class Data{
    int start;
    int end;
    public Data(int s,int e){
        this.start=s;
        this.end=e;



class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        int n=start.length;
        Data[] data=new Data[n];
        for(int i=0;i<n;i++){
            data[i]=new Data(start[i],end[i]);
        }
        Arrays.sort(data,(a,b)->Integer.compare(a.end,b.end));
        int cnt=1;
        int free=data[0].end;
        for(int i=1;i<n;i++){
            if(free<data[i].start){
                cnt++;
                free=data[i].end;
            }
        }
        return cnt;
    }
}
