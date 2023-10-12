package controller;

import model.Task;
import view.TaskView;

import java.util.ArrayList;
import java.util.List;

public final class TaskController {
    private List<Task> tasks = new ArrayList<>();
    private TaskView taskView = new TaskView();
    private int nextId = 1;

    public final void createTask(String name, String description) {
        Task task = new Task(nextId, name, description);
        tasks.add(task);
        nextId++;
    }

    public final void readTasks() {
        taskView.displayTasks(tasks);
    }

    public final Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public final void updateTask(int id, String name, String description) {
        Task task = findTaskById(id);
        if (task != null) {
            taskView.displayMessage("Update task dengan ID: " + id);
            taskView.displayMessage("Data Sebelumnya:");
            taskView.displayTask(task);
            taskView.displayMessage("Data Baru:");
            taskView.displayTask(new Task(id, name, description));
        } else {
            taskView.displayMessage("Tidak dapat menemukan tugas dengan ID: " + id);
        }
    }

    public final void deleteTask(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            taskView.displayMessage("Tugas dengan ID: " + id + " berhasil dihapus.");
        } else {
            taskView.displayMessage("Tidak dapat menemukan tugas dengan ID: " + id);
        }
    }
}
