package view;

import java.util.Date;

public class Test {
			int age;
			
			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public static void main(String[] args) {
				for(int i=0; i<args.length; i++){
			         System.out.println("args[" + i + "]: " +
			                                           args[i]);
			      }
				
				
				Test test=new Test();
				test.setAge(2);
				System.out.println(test.age);
				Integer h=6;
				System.out.println(h.compareTo(6));
				StringBuffer gh=new StringBuffer("a");
				System.out.println(gh);
				gh.append("b");
				System.out.println(gh);
				
				 try {
					long start = System.currentTimeMillis( );
					 System.out.println(new Date( ) + "\n");
					 Thread.sleep(5*60*10);
					 System.out.println(new Date( ) + "\n");
					 long end = System.currentTimeMillis( );
					 long diff = end - start;
					 System.out.println("Difference is : " + diff);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
