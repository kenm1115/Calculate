
public class ScoreData {

	public static void main(String args[]){


		int max = calculateMax();
		int min = calculateMin();
		int sum = calculateSum();
		int ave = calculateAve(sum);

		System.out.println("最大："+max);
		System.out.println("最小："+min);
		System.out.println("合計："+sum);
		System.out.println("平均："+ave);



	}

	private static int[] scores(){
		  int scores[] = {48,29,28,37,25};
		  return scores;
	}


	public static int calculateMax() {
		int[] scores = scores();
		int max = scores[0];
		for(int i = 0;i < scores.length;i++) {
		if(max < scores[i]) {
			max = scores[i];
		}
	}
		return max;

	}
	public static int calculateMin() {
		int[] scores = scores();
		int min = scores[0];
		for(int i = 0;i < scores.length;i++) {
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		return min;

	}

	public static int calculateSum() {
		int[] scores = scores();
		int sum = 0;
		for(int i = 0;i < scores.length;i++) {
			sum += scores[i];
		}
		return sum;
	}

	public static int calculateAve(int sum) {
		int[] scores = scores();
		return sum / scores.length;
	}


}
