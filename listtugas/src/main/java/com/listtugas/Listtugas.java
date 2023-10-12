package com.listtugas;

import controller.TaskController;
import view.TaskView;

import java.util.Scanner;

public final class Listtugas {
    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskController taskController = new TaskController();
        TaskView taskView = new TaskView();

        while (true) {
            taskView.displayMessage("\nMenu:");
            taskView.displayMessage("1. Tambah Tugas");
            taskView.displayMessage("2. Lihat Tugas");
            taskView.displayMessage("3. Ubah Tugas");
            taskView.displayMessage("4. Hapus Tugas");
            taskView.displayMessage("5. Keluar");
            taskView.displayMessage("Pilih operasi (1/2/3/4/5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    taskView.displayMessage("Masukkan Nama Tugas: ");
                    String name = scanner.nextLine();
                    taskView.displayMessage("Masukkan Deskripsi Tugas: ");
                    String description = scanner.nextLine();
                    taskController.createTask(name, description);
                    taskView.displayMessage("Tugas berhasil ditambahkan.");
                    break;
                case 2:
                    taskController.readTasks();
                    break;
                case 3:
                    taskView.displayMessage("Masukkan ID Tugas yang akan diubah: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    taskView.displayMessage("Masukkan Nama Tugas Baru: ");
                    name = scanner.nextLine();
                    taskView.displayMessage("Masukkan Deskripsi Tugas Baru: ");
                    description = scanner.nextLine();
                    taskController.updateTask(idToUpdate, name, description);
                    break;
                case 4:
                    taskView.displayMessage("Masukkan ID Tugas yang akan dihapus: ");
                    int idToDelete = scanner.nextInt();
                    taskController.deleteTask(idToDelete);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    taskView.displayMessage("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}
