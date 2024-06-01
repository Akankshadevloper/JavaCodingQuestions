public class LPS {

        public int findLPSLength(String st) {
            return findLPSLengthRecursive(st, 0, st.length()-1);
        }

        private int findLPSLengthRecursive(String st, int startIndex, int endIndex) {
            if(startIndex > endIndex)
                return 0;

            // every sequence with one element is a palindrome of length 1
            if(startIndex == endIndex)
                return 1;

            // case 1: elements at the beginning and the end are the same
            if(st.charAt(startIndex) == st.charAt(endIndex))
                return 2 + findLPSLengthRecursive(st, startIndex+1, endIndex-1);

            // case 2: skip one element either from the beginning or the end
            int c1 =  findLPSLengthRecursive(st, startIndex+1, endIndex);
            int c2 =  findLPSLengthRecursive(st, startIndex, endIndex-1);
            return Math.max(c1, c2);
        }

        public static void main(String[] args) {
            LPS lps = new LPS();
            System.out.println(lps.findLPSLength("abdbca"));
            System.out.println(lps.findLPSLength("cddpd"));
            System.out.println(lps.findLPSLength("pqr"));
        }
    }

