import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (!queue.isEmpty() && t - 3000 > queue.peek()) {
            queue.poll();
        }
        return queue.size();
    }
}