class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nl[]=new int[n];
        int nr[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nr[i]=n;
            }else{
                nr[i]=s.peek();
            }
            s.push(i);
        }
        System.out.println(Arrays.toString(nr));

        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nl[i]=-1;
            }else{
                nl[i]=s.peek();
            }
            s.push(i);
        }
        System.out.println(Arrays.toString(nl));
        int max=0;
        for(int i=0;i<n;i++){
            int curr=nr[i]-nl[i]-1;
            curr=curr*heights[i];
            max=Math.max(curr,max);
        }
        return max;
    }
}