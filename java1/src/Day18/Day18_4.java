package Day18;

public class Day18_4 {
	
	public static void main(String[] args) {
		
		Thread 영화실행 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i<5;i++) {
					System.out.println("영화실행중");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread 음악실행 = new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i<5;i++) {
					System.out.println("음악실행중");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		}
		});
		
		Thread 메일실행 = new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i<5;i++) {
					System.out.println("메일실행중");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		}
		});
		메일실행.start();
		음악실행.start();
		메일실행.start();
		
		
		
		
	}
	

}
