
import java.util.PriorityQueue;

 class StudentPriority {
public static void main(String[] args) {
    PriorityQueue<Student> queue = new PriorityQueue<>(new java.util.Comparator<Student>() {
        @Override
        public int compare(Student student,Student t1){
            return student.getGrade() - t1.getGrade();
                        
                    }
            
                    

    } );
    queue.offer(new Student('B', "Prasant"));
    queue.offer(new Student('D', "Ram"));
    queue.offer(new Student('C', "Prem"));
    queue.offer(new Student('F', "Mohan"));
    queue.offer(new Student('A', "Sanchit"));
    // System.out.printf("Queue is %s",queue);
    // System.out.printf("Got %s",queue.poll());
    while (!queue.isEmpty()) {
        Student student = queue.poll();
        System.out.println(student.getName() +" "+ student.getGrade());
    }
}
    
        private  static class Student{
            private final String name;
            private  final char grade;
    
         
    
            public Student(char grade, String name) {
                this.grade = grade;
                this.name = name;
            }
    
         public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
    
}
