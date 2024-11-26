public class Student{
      private String name;
      private int age;
      private String studentId;

      public Student(String name, int age, String studentId){
      this.name = name;
      this.age = age;
      this.studentId = studentId;
      }

      public String GetName(){
            return name;
      }

      public int GetAge(){
            return age;
      }

      public void setAge(int age){
            this.age = age;
      }

      public String getStudentId(){
            return studentId;
      }

      public void setStudentId(String studentIt){
            this.studentId = studentId;
      }
}

      public class GraduateStudent extent Student{
            private String DiplomTopic;

            public GraduateStudent(String name, int age, String studentId, String DiplomTopic){
                  
            }
      }