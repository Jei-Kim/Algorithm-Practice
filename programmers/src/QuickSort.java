public class Test {

    private static void quickSort(int [] arr) {
        //시작위치와 끝나는 지점을 정해 재귀함수 호출
        quickSort(arr, 0, arr.length -1); 
    }

    private static void quickSort(intp[] arr, int start, int end) {
        //시작과 끝 영역 안에서 파티션을 나누고,
        //나눈 파티션의 오른쪽 파트 첫 번째 값을 받아 옴
        int part2 = partition(arr, start, end);
    
//오른쪽 파트가 시작점 바로 다음에서 시작한다면, 왼쪽 파트의 데이터가 하나임을 의미
// -> 더이상 정렬할 필요가 없음
// => 오른쪽 파트가 시작점에서 한 개 이상 차이가 날 경우에만 정렬하도록 조건문 설정
        if (start < part2 - 1) {

            //왼쪽: start에서 오른쪽 시작 바로 전까지
            quickSort(arr, start, part2 -1);
        }
    
        //오른쪽의 시작값이 마지막 방보다 작을 경우에만 정렬 진행
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

        //배열방의 파티션을 나누는 함수 ~
        private static int partition(int[] arr, int start, int end) {

            //중간지점으로 피봇 설정
            int pivot = arr[(start + end) / 2]; 

            //시작값이 끝값보다 같거나 작은 동안만 양쪽 끝에서 포인트를 한칸씩 옮김
            while (start <= end) {
                //배열방의 값이 피벗과 같거나 크면 멈추고 end포인트로 넘어감
                while (arr[start] < pivot) start++; { 
                //넘어와서, 크면 계속 무시하고 다음 방으로 건너뛰고
                // 피벗값보다 작거나 같으면 -> 38
                while (arr[end] > pivot) end--; {
                //만났다가 지나치지 않았는지 확인?
                if (start <= end) {
                    //두 값을 스왑
                    swap (arr, start, end);
                    start++;
                    end--;
                }
              }
           }
        }
         return start;
     }

        private static void swap(int[] arr, int start, int end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }

        private static void printArray(int[] arr) {
            for (int dara : arr) {
                System.out.print(data + ", ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int[] arr = {3,9,4,7,5,0,1,6,8,2};
        printArray(arr);
        quickSort(arr);
        printArray(arr);
    }
}