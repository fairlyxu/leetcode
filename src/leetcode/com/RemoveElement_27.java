package leetcode.com;

//利用兩個指針 進行交換 注意判斷該數組中有無鈣元素的存在
//測試案例 {4,5} 5
// {4} 4
//注意 基本數據類型無法設置爲null，所以 nums[p2]==null 是錯誤的
public class RemoveElement_27 {
	public int removeElement(int[] nums, int val) {

		if (nums == null || nums.length <= 0)
			return 0;

		int p1 = 0;
		int p2 = nums.length - 1;
		int temp = 0;
		boolean flag = false;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] == val) {
				flag = true;
				break;
			}
		}
		if (flag) {
			while (p1 != p2) {
				for (; nums[p1] != val && p1 < p2; ++p1) {
				}

				for (; nums[p2] == val && p2 > p1; --p2) {
				}
				temp = nums[p1];
				nums[p1] = nums[p2];
				nums[p2] = temp;
			}
			return p2;
		} else
			return nums.length;
		// System.out.println(p1+"-     - "+p2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {   };
		RemoveElement_27 t = new RemoveElement_27();
		int left = t.removeElement(null, 4);
		System.out.println(left);
		for (int i = 0; i < left; ++i)
			System.out.println("~~~" + a[i]);
	}

}
