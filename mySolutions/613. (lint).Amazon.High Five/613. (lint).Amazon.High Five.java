/**
 * Definition for a Record
 * class Record {
 *     public int id, score;
 *     public Record(int id, int score){
 *         this.id = id;
 *         this.score = score;
 *     }
 * }
 */
public class Solution {
    /**
     * @param results a list of <student_id, score>
     * @return find the average of 5 highest scores for each person
     * Map<Integer, Double> (student_id, average_score)
     */
    public Map<Integer, Double> highFive(Record[] results) {
        // Write your code here

        Map<Integer, Double> resultMap = new HashMap<>();
        Map<Integer, PriorityQueue<Integer>> scoreMap = new HashMap<Integer, PriorityQueue<Integer>>();

        for (int i = 0; i < results.length; i++) {
            scoreMap.putIfAbsent(results[i].id, new PriorityQueue<Integer>(5));
            PriorityQueue<Integer> pq = scoreMap.get(results[i].id);
            pq.offer(results[i].score);
            if(pq.size() > 5) {
                pq.poll();
            }
        }
        Set<Integer> keySet = scoreMap.keySet();
        for (int studentId : keySet) {
            
            PriorityQueue<Integer> scores = scoreMap.get(studentId);
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum = sum + scores.poll();
            }
            resultMap.put(studentId, sum / 5.0);
        }
        
        return resultMap;
    }
}