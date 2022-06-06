class MovingAverage {
     int k,sum;
    Deque q = new ArrayDeque<Integer>();

    public MovingAverage(int size) {
        this.k = size;
        this.sum = 0;
    }
    
    public double next(int val) {
        q.add(val);
        sum += val;
        int curr_size = q.size();
        if(curr_size>k){
            curr_size = curr_size - 1;
            sum = sum - (int)q.poll();
        }
        return (sum*1.0)/curr_size;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */