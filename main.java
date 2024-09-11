package Урок_6;

import java.util.ArrayList;
import java.util.List;
// import java.util.concurrent.Flow;
// import Урок_6.flowservice;

public class main {
    
    public static void main(String[] args) {

        // Объекты УчебнаяГруппа
        StudentGroup group1 = new StudentGroup("Группа 1");
        StudentGroup group2 = new StudentGroup("Группа 2");
        StudentGroup group3 = new StudentGroup("Группа 3");

        // Объекты Потока
        Flow flow1 = new Flow();
        flow1.addGroup(group1);
        flow1.addGroup(group2);

        Flow flow2 = new Flow();
        flow2.addGroup(group3);

        // Объект ПотокСервис и Контроллер
        FlowService flowservice =  new FlowService();
        Controller controller = new Controller(flowservice);

        // Сортировка списка потоков
        List<Flow> flows = new ArrayList<>();
        flows.add(flow1);
        flows.add(flow2);
        controller.sortingFlows(flows);

        // Вывод отсортированного списка потоков
        for (Flow flow : flows) {
            System.out.println("Поток: ");

            for (StudentGroup group : flow) {
                System.out.println("- " + group.getName());
            }
        }
    }
}
