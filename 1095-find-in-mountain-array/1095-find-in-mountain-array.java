/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    // To find the peak
    public int findpeak(MountainArray m,int s,int e){
        while(s<=e){
            int i=(s+e)/2;
            if(i==0)s=i+1;
            else if(i==m.length()-1)e=i-1;
            else{
            int l=m.get(i-1);
            int r=m.get(i+1);
            int mi=m.get(i);
            if(l<mi&&mi>r){
                return i;
            }
            else if(l<mi&&mi<r)s=i+1;
            else e=i-1;}
        }
        return -1;
    }
    // Search to left of peak
    public int findmountainleft(MountainArray m,int s,int e,int target){
        while(s<=e){
            int mid=(s+e)/2;
            int p=m.get(mid);
            if(p==target)return mid;
            if(p<target)s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
    // Search to right of peak
    public int findmountainright(MountainArray m,int s,int e,int target){
        while(s<=e){
            int mid=(s+e)/2;
            int p=m.get(mid);
            if(p==target)return mid;
            if(p>target)s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakind=findpeak(mountainArr,0,mountainArr.length()-1);
        if(peakind==-1)return -1;
        int chk1=findmountainleft(mountainArr,0,peakind,target);
        int chk2=findmountainright(mountainArr,peakind,mountainArr.length()-1,target);
        if(chk1==-1&&chk2==-1)return -1;
        if(chk1!=-1)return chk1;
        return chk2;
    }
}