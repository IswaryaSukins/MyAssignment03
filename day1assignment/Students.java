package week3.day1assignment;

public class Students {

	
		// TODO Auto-generated method stub
		public void  getStudentInfo(int id) {
			System.out.println("Student id is: "+id);
		}
		public void  getStudentInfo(int id, String name) {
			System.out.println("Student id is: "+ id +"\n"+"Student name is: "+name);
		}
			public void  getStudentInfo(String email, String phoneNumber) {
				System.out.println("Student Email is: " + email +"\n"+ "Student Phone Number: " + phoneNumber);
			}
			 public static void main(String[] args) {
			        Students st = new Students();
			        st.getStudentInfo(25);
			        st.getStudentInfo(25, "Iswarya");
			        st.getStudentInfo("iswarya9884@gmail.com", "8989898989");
	}

}
