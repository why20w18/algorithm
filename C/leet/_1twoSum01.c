#include <stdio.h>
#include <stdlib.h>

int *twoSum(int *nums, int numsSize, int target, int *returnSize) {
  int *result = (int *)malloc(sizeof(int) * 2);
  for (short i = 0; i < numsSize; i++) {
    for (short j = i + 1; j < numsSize; j++) {
      if (nums[i] + nums[j] == target) {
        int *result = (int *)malloc(sizeof(int) * 2);
        result[0] = i;
        result[1] = j;
        *returnSize = 2;
        return result;
      }
    }
  }
  free(result);
  *returnSize = 0;
  return NULL;
}

int main() {
  int nums1[] = {2, 7, 11, 15};
  int n1 = sizeof(nums1) / sizeof(int);

  int nums2[] = {3, 2, 4};
  int n2 = sizeof(nums2) / sizeof(int);

  int nums3[] = {3, 3};
  int n3 = sizeof(nums3) / sizeof(int);

  int returnSize = 0;
  int target = 6;
  int *result = twoSum(nums3, n3, target, &returnSize);

  printf("%d ve %d\n", result[0], result[1]);

  free(result);
  return 0x0;
}
