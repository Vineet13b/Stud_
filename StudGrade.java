public class StudGrade { 
    public static void main(String[] args) { 
        // Marks for three courses 
        int course1Marks = 98; 
        int course2Marks = 50; 
        int course3Marks = 62; 
        int totalMarks = course1Marks + course2Marks + course3Marks; 
        double percentage = (totalMarks / 3.0); 
 // Determine grade     
        char grade; 
        if (percentage >= 90) { 
            grade = 'S';  
        } else if (percentage >= 80 && percentage<=90) { 
            grade = 'A'; 
        } else if (percentage >= 65 && percentage<= 80) { 
            grade = 'B'; 
        } else if (percentage >= 50&& percentage<= 65) { 
            grade = 'C'; 
        } else if (percentage >= 40 && percentage<= 50) { 
            grade = 'D'; 
        } else { 
            grade = 'F'; 
        } 
 
        // Display percentage obtained and grade 
       System.out.println("Result of Student is:"); 
        System.out.println("Percentage Obtained: " + percentage + "%"); 
        System.out.println("Grade: " + grade); 
    } 
} 
 