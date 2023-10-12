package view;

import model.Task;

import java.util.List;

public class TaskView {
    public final void displayTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas.");
        } else {
            System.out.println("Daftar Tugas:");
            for (Task task : tasks) {
                System.out.println("ID: " + task.getId());
                System.out.println("Nama: " + task.getName());
                System.out.println("Deskripsi: " + task.getDescription());
                System.out.println("------------------------------");
            }
        }
    }

    public final void displayTask(Task task) {
        System.out.println("ID: " + task.getId());
        System.out.println("Nama: " + task.getName());
        System.out.println("Deskripsi: " + task.getDescription());
    }

    public final void displayMessage(String message) {
        System.out.println(message);
    }
}
