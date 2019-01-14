class MyCalendarThree {
    List<ArrayList<Integer>> intervals;
    int max;
    public MyCalendarThree() {
        intervals = new ArrayList<ArrayList<Integer>>();
        max = 0;
    }
    
    public int book(int start, int end) {
        int count = 0;

        if(intervals.size() == 0){
            ArrayList newInterval = new ArrayList<>();
            newInterval.add(start);
            newInterval.add(end);
            
            intervals.add(newInterval);
            System.out.println("List empty, adding new interval start: "+start+" end: "+end);
            max = ++max;
            System.out.println("Max is "+max);
            return max;
        }
        
        for(List<Integer> interval: intervals){
            int intStart = interval.get(0);
            int intEnd = interval.get(1);
            System.out.println("IntStart: "+intStart+"IntEnd: "+intEnd);
            
            if( intEnd >= start || intStart < end){
                ++count;
                System.out.println("Now count is "+count);
                
            }
            
            else {
                
                ArrayList newInterval = new ArrayList<>();
                newInterval.add(start);
                newInterval.add(end);
                intervals.add(newInterval);
                
            }
        
        }  
        
        System.out.println("Intervals is now: ");
        for(List<Integer> i: intervals){
            System.out.print(i.get(0) + "\t" + i.get(1));
            System.out.println();
                
        }
            System.out.println();
        
        if(count > max){
            System.out.println("Count is "+count);
            max = count;
        }
        
        return max;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */