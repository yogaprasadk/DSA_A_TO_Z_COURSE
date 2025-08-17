/*
 * | Phrase in Problem Description | 💡 Pattern Likely |
 * | --------------------------------- | ------------------ |
 * | "Merge overlapping intervals" | Merge Intervals |
 * | "Minimum number of meeting rooms" | Merge Intervals |
 * | "Can attend all meetings" | Merge Intervals |
 * | "Insert and merge intervals" | Merge Intervals |
 * | "Remove covered intervals" | Merge Intervals |
 * | "Merge intervals and count" | Merge Intervals |
 * | "Find free time / gaps" | Merge Intervals |
 * | "Intervals covering a point" | Merge Intervals |
 * | "Interval scheduling" | Greedy + Intervals |
 * | "Timeline / schedule overlapping" | Merge Intervals |
 * | "Overlapping ranges / bookings" | Merge Intervals |
 * 
 * 
 * 📌 LeetCode Problem Titles That Suggest Merge Intervals
 * 
 * Merge Intervals
 * 
 * Insert Interval
 * 
 * Meeting Rooms / Meeting Rooms II
 * 
 * Employee Free Time
 * 
 * Interval List Intersections
 * 
 * Remove Covered Intervals
 * 
 * Non-overlapping Intervals
 * 
 * Maximum Number of Events That Can Be Attended
 * 
 * 
 * 🛠 How to Use This
 * 
 * If you're given a list of intervals and asked to combine, remove or process
 * overlaps → Merge Intervals.
 * import java.util.Scanner;
 * 
 * public class MergeOverlappingIntervals {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * // Step 1: Read number of intervals
 * System.out.print("Enter number of intervals: ");
 * int n = sc.nextInt();
 * 
 * if (n <= 0) {
 * System.out.println("Number of intervals must be > 0.");
 * return;
 * }
 * 
 * // Step 2: Read intervals
 * int[][] intervals = new int[n][2];
 * System.out.println("Enter intervals (start end):");
 * for (int i = 0; i < n; i++) {
 * intervals[i][0] = sc.nextInt();
 * intervals[i][1] = sc.nextInt();
 * }
 * 
 * // Step 3: Sort intervals manually by start time
 * sortIntervalsByStart(intervals);
 * 
 * // Step 4: Merge overlapping intervals
 * int[][] merged = new int[n][2];
 * int idx = 0;
 * 
 * merged[0][0] = intervals[0][0];
 * merged[0][1] = intervals[0][1];
 * 
 * for (int i = 1; i < n; i++) {
 * int lastEnd = merged[idx][1];
 * int currentStart = intervals[i][0];
 * int currentEnd = intervals[i][1];
 * 
 * if (currentStart <= lastEnd) {
 * // Overlap detected → merge
 * merged[idx][1] = Math.max(lastEnd, currentEnd);
 * } else {
 * // No overlap → move to next slot
 * idx++;
 * merged[idx][0] = currentStart;
 * merged[idx][1] = currentEnd;
 * }
 * }
 * 
 * // Step 5: Output merged intervals
 * System.out.println("Merged Intervals:");
 * for (int i = 0; i <= idx; i++) {
 * System.out.println(merged[i][0] + " " + merged[i][1]);
 * }
 * 
 * sc.close();
 * }
 * 
 * // Helper method: Selection sort based on interval start time
 * public static void sortIntervalsByStart(int[][] arr) {
 * int n = arr.length;
 * 
 * for (int i = 0; i < n - 1; i++) {
 * int minIdx = i;
 * for (int j = i + 1; j < n; j++) {
 * if (arr[j][0] < arr[minIdx][0]) {
 * minIdx = j;
 * }
 * }
 * 
 * // Swap arr[i] with arr[minIdx]
 * int tempStart = arr[i][0];
 * int tempEnd = arr[i][1];
 * 
 * arr[i][0] = arr[minIdx][0];
 * arr[i][1] = arr[minIdx][1];
 * 
 * arr[minIdx][0] = tempStart;
 * arr[minIdx][1] = tempEnd;
 * }
 * }
 * }
 * 
 * If you’re asked about scheduling/meeting times, overlapping times, or
 * required rooms → likely this pattern.
 * 
 * import java.util.Scanner;
 * 
 * public class MeetingRoomsRequired {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter number of meetings: ");
 * int n = sc.nextInt();
 * 
 * if (n <= 0) {
 * System.out.println("Number of meetings must be > 0.");
 * return;
 * }
 * 
 * int[][] meetings = new int[n][2];
 * System.out.println("Enter meeting intervals (start end):");
 * for (int i = 0; i < n; i++) {
 * meetings[i][0] = sc.nextInt();
 * meetings[i][1] = sc.nextInt();
 * }
 * 
 * // Step 1: Sort meetings by start time
 * sortByStart(meetings);
 * 
 * // Step 2: Track meeting room end times manually
 * int[] endTimes = new int[n]; // max n rooms
 * int rooms = 0;
 * 
 * for (int i = 0; i < n; i++) {
 * int start = meetings[i][0];
 * int end = meetings[i][1];
 * 
 * boolean roomFound = false;
 * 
 * // Try to reuse a room
 * for (int j = 0; j < rooms; j++) {
 * if (endTimes[j] <= start) {
 * endTimes[j] = end; // Update room end time
 * roomFound = true;
 * break;
 * }
 * }
 * 
 * if (!roomFound) {
 * // No free room, assign new
 * endTimes[rooms] = end;
 * rooms++;
 * }
 * }
 * 
 * System.out.println("Minimum meeting rooms required: " + rooms);
 * sc.close();
 * }
 * 
 * // Manual selection sort by start time
 * public static void sortByStart(int[][] arr) {
 * int n = arr.length;
 * for (int i = 0; i < n - 1; i++) {
 * int minIdx = i;
 * for (int j = i + 1; j < n; j++) {
 * if (arr[j][0] < arr[minIdx][0]) {
 * minIdx = j;
 * }
 * }
 * // Swap
 * int tempStart = arr[i][0], tempEnd = arr[i][1];
 * arr[i][0] = arr[minIdx][0];
 * arr[i][1] = arr[minIdx][1];
 * arr[minIdx][0] = tempStart;
 * arr[minIdx][1] = tempEnd;
 * }
 * }
 * }
 * other DS and ALgo used for second scenario
 * Great follow-up! You're asking:
 * 
 * 💡 What other data structures or algorithms can be used to solve scheduling /
 * overlapping intervals / meeting room problems — besides Merge Intervals and
 * manual array logic?
 * 
 * 🔍 Problem Context:
 * 
 * "Given meeting times, find minimum rooms required."
 * 
 * This falls under the broader category of Interval Scheduling — and can be
 * approached using several data structures and algorithms, depending on
 * constraints and required performance.
 * 
 * ✅ 1. Min-Heap (Priority Queue) → Most Efficient & Popular
 * 
 * Why: Tracks the earliest ending meeting efficiently.
 * 
 * How:
 * 
 * Sort by start time.
 * 
 * Use a min-heap to store end times.
 * 
 * Pop from heap when room becomes free.
 * 
 * Data Structure: PriorityQueue in Java (min-heap).
 * 
 * 🔁 Time Complexity:
 * 
 * Sorting: O(n log n)
 * 
 * Heap operations: O(log n) per meeting → total: O(n log n)
 * 
 * ✅ Recommended for interviews & large input
 * 
 * ✅ 2. Two Pointers / Sweep Line Algorithm
 * 
 * Why: Elegant and fast way to process events (starts and ends) as a timeline.
 * 
 * How:
 * 
 * Separate all start and end times into two arrays.
 * 
 * Sort both arrays.
 * 
 * Use two pointers to walk through starts and ends:
 * 
 * If a meeting starts before the previous ends → need a room.
 * 
 * If end ≤ start → reuse room.
 * 
 * Space: O(n)
 * 
 * Time: O(n log n) (due to sorting)
 * 
 * int minMeetingRooms(int[][] intervals) {
 * int n = intervals.length;
 * int[] starts = new int[n];
 * int[] ends = new int[n];
 * 
 * for (int i = 0; i < n; i++) {
 * starts[i] = intervals[i][0];
 * ends[i] = intervals[i][1];
 * }
 * 
 * Arrays.sort(starts);
 * Arrays.sort(ends);
 * 
 * int rooms = 0, endPtr = 0;
 * for (int i = 0; i < n; i++) {
 * if (starts[i] < ends[endPtr]) {
 * rooms++;
 * } else {
 * endPtr++;
 * }
 * }
 * return rooms;
 * }
 * 
 * 
 * ✅ Most optimal and clean for interview use.
 * 
 * ✅ 3. Segment Tree / Binary Indexed Tree (BIT)
 * 
 * Why: If you're doing many dynamic interval queries (e.g., add, remove, count
 * overlaps), trees are better.
 * 
 * How: Represent timeline (e.g., 0 to 10⁵) and mark interval start/end using
 * lazy propagation or frequency counts.
 * 
 * Used in: High-performance or online scheduling systems.
 * 
 * Time Complexity: O(log n) per update/query
 * 
 * 🚫 Not practical for basic problems — overkill unless required.
 * 
 * ✅ 4. Difference Array (for fixed timeline)
 * 
 * Why: Efficient for range-based updates (e.g., bookings, availability).
 * 
 * How:
 * 
 * Use an array where you do:
 * timeline[start] += 1;
 * timeline[end] -= 1;
 * 
 * Then take prefix sum to get concurrent meetings at each time.
 * 
 * 🛠 Great when the timeline is discrete and bounded (e.g., 0 to 1000 minutes).
 * 
 * ✅ 5. Interval Trees (Advanced)
 * 
 * Special trees to manage intervals, e.g., to find all intervals overlapping a
 * given one.
 * 
 * More common in computational geometry, compilers, etc.
 * 
 * Not often used in basic scheduling problems — but powerful.
 * 
 * ✅ Summary Table
 * Approach Data Structure Time Complexity Use When...
 * Merge + Array Arrays O(n²) (manual sort) Small inputs or constraints prevent
 * built-ins
 * Min-Heap PriorityQueue O(n log n) Fast, clean, and scalable
 * Sweep Line (2 ptrs) Two arrays + pointers O(n log n) Best mix of performance
 * and simplicity
 * Segment Tree / BIT Tree structures O(log n) / op Dynamic or repeated queries
 * over time range
 * Difference Array Fixed timeline array O(n + T) Time is discrete and bounded
 * (e.g., calendar)
 * Interval Tree Tree for ranges O(log n + k) Need fast lookup of overlapping
 * intervals
 * 🔚 Conclusion
 * 
 * For scheduling / meeting room problems:
 * 
 * ✅ Use Sweep Line or Min-Heap for most interview-friendly solutions.
 * 
 * ⚙ Use Difference Array or Segment Tree for calendar-style or dynamic systems.
 * 
 * 📚 Use Interval Trees in advanced or geometric interval queries.
 * 
 * 
 3. Always sort by start time before merging.
 ✅ "Always sort by start time before merging intervals."

This is the core principle of the Merge Intervals pattern — sorting ensures we can compare intervals linearly and merge overlapping ones efficiently.

✅ Java Code — Sort by Start Time Before Merging (Simple Example)

We'll:

Input a list of intervals

Sort them by start time

Merge any overlapping intervals

📌 No built-in libraries like ArrayList, PriorityQueue, or Arrays.sort() — all manual!

🔧 Full Code (With Manual Sorting + Merging)
import java.util.Scanner;

public class MergeSortedIntervals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input intervals
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of intervals must be greater than 0.");
            return;
        }

        int[][] intervals = new int[n][2];
        System.out.println("Enter intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        // Step 2: Sort intervals by start time
        sortByStart(intervals);

        // Step 3: Merge intervals
        int[][] merged = new int[n][2];
        int idx = 0;

        merged[0][0] = intervals[0][0];
        merged[0][1] = intervals[0][1];

        for (int i = 1; i < n; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if (currentStart <= merged[idx][1]) {
                // Overlapping → merge
                if (currentEnd > merged[idx][1]) {
                    merged[idx][1] = currentEnd;
                }
            } else {
                // No overlap → move to next
                idx++;
                merged[idx][0] = currentStart;
                merged[idx][1] = currentEnd;
            }
        }

        // Step 4: Print merged intervals
        System.out.println("Merged Intervals:");
        for (int i = 0; i <= idx; i++) {
            System.out.println(merged[i][0] + " " + merged[i][1]);
        }

        sc.close();
    }

    // Manual selection sort by start time
    public static void sortByStart(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] < arr[minIdx][0]) {
                    minIdx = j;
                }
            }
            // Swap intervals
            int tempStart = arr[i][0], tempEnd = arr[i][1];
            arr[i][0] = arr[minIdx][0];
            arr[i][1] = arr[minIdx][1];
            arr[minIdx][0] = tempStart;
            arr[minIdx][1] = tempEnd;
        }
    }
}

🧪 Sample Input
Enter number of intervals: 4
Enter intervals (start end):
5 10
1 3
2 6
15 18

✅ Output
Merged Intervals:
1 10
15 18

🔍 Why Sort by Start Time?

Sorting ensures that:

Overlapping intervals are adjacent.

You only need to check the last merged interval to decide if you should merge or add a new one.

Time complexity improves (O(n log n) with built-in sort)./
 */

package Pattern.MergeIntervals;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MergeIntervals {
    private static final Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Input: number of intervals
            System.out.print("Enter number of intervals: ");
            int intervalCount = S.nextInt();

            if (intervalCount <= 0) {
                System.out.println("Number of intervals must be greater than 0.");
                return;
            }

            int[][] intervals = new int[intervalCount][2];

            // Input intervals
            System.out.println("Enter intervals (start end):");
            for (int i = 0; i < intervalCount; i++) {
                intervals[i][0] = S.nextInt(); // start
                intervals[i][1] = S.nextInt(); // end
            }

            // Merge and get result
            int[][] merged = merge(intervals);

            // Output result
            System.out.println("Merged Intervals:");
            for (int i = 0; i < merged.length; i++) {
                if (merged[i][0] == -1 && merged[i][1] == -1)
                    break; // sentinel end
                System.out.println(merged[i][0] + " " + merged[i][1]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            S.close();
        }
    }

    // Manual selection sort based on start times
    private static void sortByStart(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] < arr[minIdx][0]) {
                    minIdx = j;
                }
            }

            // Swap intervals
            int tempStart = arr[i][0], tempEnd = arr[i][1];
            arr[i][0] = arr[minIdx][0];
            arr[i][1] = arr[minIdx][1];
            arr[minIdx][0] = tempStart;
            arr[minIdx][1] = tempEnd;
        }
    }

    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;

        // Step 1: Sort intervals by start time
        sortByStart(intervals);

        // Step 2: Merge intervals
        int[][] merged = new int[n][2];
        int idx = 0;

        merged[0][0] = intervals[0][0];
        merged[0][1] = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= merged[idx][1]) {
                // Overlap → merge
                merged[idx][1] = Math.max(merged[idx][1], intervals[i][1]);
            } else {
                // No overlap → next slot
                idx++;
                merged[idx][0] = intervals[i][0];
                merged[idx][1] = intervals[i][1];
            }
        }

        // Sentinel marking unused rows
        for (int i = idx + 1; i < n; i++) {
            merged[i][0] = -1;
            merged[i][1] = -1;
        }

        return merged;
    }
}
