package prime;

public class check4Prime {
	static final int max = 1000;
	static final int min = 0;
	static int input = 0;
	
	public static void main(String [] args) {
		check4Prime check = new check4Prime();
		try {
			check.checkArgs(args);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Usage: check4Prime x");
			System.out.println("         -- where 0<=x<=1000");
			System.exit(1);
		}
	}
	
	/**
	 * 判断一个数是否为素数
	 * @param num
	 * @return
	 */
	public boolean primeCheck(int num) {
		double sqroot = Math.sqrt(max);
		boolean primeBucket [] = new boolean [max+1];
		for(int i=2;i<=max;i++){
			primeBucket[i]=true;
		}
		int j=2;
		for(int i=j+j;i<=max;i=i+j){
			primeBucket[i]=false;
		}
		for(j=3;j<sqroot;j=j+2){
			if(primeBucket[j]==true){
				for(int i=j+j;i<=max;i=i+j){
					primeBucket[i]=false;
				}
			}
		}
		if(primeBucket[num]==true){
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 判断输入的是否合法
	 * @param args
	 * @throws Exception
	 */
	public void checkArgs(String [] args) throws Exception {
		if(args.length != 1){
			throw new Exception();
		}else {
			Integer num =Integer.valueOf(args[0]);
			input = num.intValue();
			if (input<0) {
				throw new Exception();
			}else if (input>max) {
				throw new Exception();
			}
		}
	}
}
