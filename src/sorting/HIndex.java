package sorting;
/*
Given an integer array citations[], where citations[i] represents the number of citations for the ith paper, you have to compute the H-index of the researcher.
The H-index is defined as the maximum value H such that the researcher has at least H papers with at least H citations each.

Examples:

Input: citations[] = [3, 0, 5, 3, 0]
Output: 3
Explanation: There are at least 3 papers (3, 5, 3) with at least 3 citations.
Input: citations[] = [5, 1, 2, 4, 1]
Output: 2
Explanation: There are 3 papers (with citation counts of 5, 2, and 4) that have 2 or more citations. However, the H-Index cannot be 3 because there aren't 3 papers with 3 or more citations.
Input: citations[] = [0, 0]
Output: 0
Explanation: The H-index is 0 because there are no papers with at least 1 citation.
Constraints:
1 ≤ citations.size() ≤ 106
0 ≤ citations[i] ≤ 106
 */
public class HIndex {
    public static int computeHIndex(int[] citations){
        int n= citations.length;
        int[] count = new int[n+1];

        for (int c:citations){
            if (c>=n){
                count[n]++;
            }
            else {
                count[c]++;
            }
        }

        int total = 0;
        for (int i = n; i>=0; i--) {
            total = total+count[i];
            if (total>=i){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] citation = {1,3,0,3,5};
        System.out.println(computeHIndex(citation   ));
    }
}
