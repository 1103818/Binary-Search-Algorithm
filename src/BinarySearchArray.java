public class BinarySearchArray {
    int[] numbersArray = new int[10];
    int nextIndex;

    boolean insert(int num){
        boolean result = false;
        if (nextIndex < numbersArray.length){
            numbersArray[nextIndex] = num;
            nextIndex++;
            result = true;
        }
        
        return result;
    }

    // initailizing binary seach algorithm function
    int binarySearch(int searchItem){
        int index = -1;
        int mid;
        int minIndex = 0;
        int maxIndex = numbersArray.length - 1;
        boolean notFound = true;

        while (notFound){
            if (maxIndex < minIndex){
                notFound = !notFound;
                break;
            }
            mid = minIndex + (maxIndex - minIndex) / 2;
            if (numbersArray[mid] == searchItem){
                index = mid;
                break;
            }
            else{
                if (numbersArray[mid] < searchItem) {
                    minIndex = mid + 1;
                }
                else {
                    maxIndex = mid - 1;            
                } 
            }
        }
        return index;
    }
}
