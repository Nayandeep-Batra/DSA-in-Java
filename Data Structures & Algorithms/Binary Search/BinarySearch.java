public class BinarySearch {

        public static int BinSearch(int num[], int key) { // TC = O(log n)
            int st = 0, end = num.length-1;
            while (st <= end) {
                int mid = st+(end-st)/2;
                if(num[mid] == key)
                    return mid;
                else if(num[mid] >= key) {
                    end = mid-1;
                }
                else
                    st = mid+1;
            }
            return -1;
        }
        public static void main(String[] args) {
        int num[] = {-1,0,3,5,9,12};
        int key = 9;
        System.out.println(BinSearch(num, key));
    }
}

// Classic binary Search in a sorted array.

// mid = answer?

// Found?
//     Yes → Return.
    // No  → Decide Left or Right.



// Boundary Binary Search    
// Answer lies on a boundary.
// Find:
// - First occurrence
// OR
// - Last occurrence
// Ask these questions to yourself
// Did I find a valid answer?

// Yes
// ↓
// Save it
// ↓
// Keep searching towards the boundary.

// No
// ↓
// Search opposite side.


// Binary Search where Mid Can Be the Answer
// blueprint :
// mid itself may be the answer.
// Never discard it unless you're sure.
// Typical Update style :
// right = mid; instead of right = mid-1;




/*
Binary Search on Answer

Guess a day.
↓
Simulate blooming till that day.
↓
Count bouquets that can be formed.
↓
If bouquets >= m:
    Answer may be smaller.
Else:
    Need more days.
*/