package day8;

interface MountainArray {
    int get(int index);
    int length();
}
class MountainArrayImpl implements MountainArray {
    private int[] arr;
    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }
    public int get(int index) {
        return arr[index];
    }
    public int length() {
        return arr.length;
    }
}
public class Main {
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peakIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            int prev = mountainArr.get(i - 1);
            int curr = mountainArr.get(i);
            int next = mountainArr.get(i + 1);
            if (prev < curr && curr > next) {
                peakIndex = i;
                break;
            }
        }
        for (int i = 0; i <= peakIndex; i++) {
            if (mountainArr.get(i) == target) {
                return i;
            }
        }
        for (int i = peakIndex + 1; i < n; i++) {
            if (mountainArr.get(i) == target) {
                return i;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        MountainArray arr = new MountainArrayImpl(mountainArr);
        int result = findInMountainArray(target, arr);
        System.out.println("Target index: " + result);  
        }
}
