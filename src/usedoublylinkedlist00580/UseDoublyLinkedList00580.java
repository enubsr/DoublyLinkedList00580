/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usedoublylinkedlist00580;

/**
 *
 * @author Enubs
 */
public class UseDoublyLinkedList00580 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        DList<String> stringsList = new DList<>();
//        stringsList.addFirst("[middle]");//[middle]
//        stringsList.addFirst("[first]");//[first][middle]
//        stringsList.addLast("[last]");//[first][middle][last]
//        System.out.println(stringsList.last());
//        stringsList.removeFirst();//[middle][last]
//        //System.out.println(stringsList.first());
//        stringsList.removeFirst();//[middle][last]
//        System.out.println(stringsList.first());

        Subject cc104 = new Subject(580, "Data Structures and Algorithms");
        Subject ipt101 = new Subject(556, "Integrative Programming and Tehnologies");
        Subject adv101 = new Subject(747, "Elective 1");
        
        DList<Subject> subjectsList = new DList<>();
        subjectsList.addFirst(cc104);//580
        subjectsList.addFirst(ipt101);//556 580
        subjectsList.addLast(adv101);//556 580 747
        subjectsList.removeFirst();//580 747
        subjectsList.removeLast();//580
        System.out.print(subjectsList.last().getSubjectCode());
        
    }
    
}
