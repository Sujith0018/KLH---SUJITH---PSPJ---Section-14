public class StudentMarks {
public static void main(String[] args) {
    int[] marks = {70,45,80,35,90};
    // 1. Traversal - print all marks
    System.out.println("Student:");
    for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]);
    
    }
    //2.Search - find 80
    int search = 80;
    for (int  i = 0; i<marks.length;i++ ) {
        if (marks[i] == search){
            System.out.println("80 found at index " + i )
        }
    }
// 3. Counting - count students who passed
int count = 0;
for (int i = 0;i )

