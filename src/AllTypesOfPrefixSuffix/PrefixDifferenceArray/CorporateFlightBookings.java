package AllTypesOfPrefixSuffix.PrefixDifferenceArray;

/*
LeetCode: 1109. Corporate Flight Bookings

Time Complexity: O(n + m)
Space Complexity: O(n)

Repository: Difference Array → Range Update Pattern. This is the most famous application of the Difference Array template.
 */
public class CorporateFlightBookings {

    public static int[] calcCorporateFlightBookings(int[][] bookings, int n) {

        // Time Complexity : O(n + m)
        // Space Complexity: O(n)
        // m = Number of Bookings

        // Difference Array
        int[] diff = new int[n];

        // Har Booking Process Karo
        // Booking Format : {firstFlight, lastFlight, seats}
        for (int[] booking : bookings) {

            int first = booking[0] - 1; // 0-based indexing
            int last = booking[1] - 1;
            int seats = booking[2];

            // Range Start par seats add karo
            diff[first] += seats;

            // Range End ke baad seats subtract karo
            if (last + 1 < n) {
                diff[last + 1] -= seats;
            }
        }

        // Difference Array se Final Answer Build
        int[] answer = new int[n];

        answer[0] = diff[0];

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + diff[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] bookings = {
                {1, 2, 10},
                {2, 3, 20},
                {2, 5, 25}
        };

        int n = 5;

        int[] answer = calcCorporateFlightBookings(bookings, n);

        System.out.print("Seats Booked = ");

        for (int seat : answer) {
            System.out.print(seat + " ");
        }
    }
}
