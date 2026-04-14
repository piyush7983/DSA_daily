import java.util.*;

class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        int m=0;
        int[] l=new int[n]; 
        int []r=new int[n];
        Deque<Integer>s=new ArrayDeque<>();

        for(int i=0;i<n;i++) {
            while(!s.isEmpty() && h[s.peek()] >= h[i]) s.pop();
            l[i]=s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        s.clear();

        for(int i=n - 1; i >= 0; i--) {
            while(!s.isEmpty() && h[s.peek()] >= h[i]) s.pop();
            r[i]=s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        for(int i=0; i < n; i++) {
            m=Math.max(m, h[i] * (r[i] - l[i] - 1));
        }

        return m;
    }
}