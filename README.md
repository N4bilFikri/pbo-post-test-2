# pbo-post-test-2


Program yang telah diberikan adalah program Java sederhana yang mengimplementasikan sistem CRUD (Create, Read, Update, Delete) untuk mengelola daftar tugas kuliah. Program ini dibagi menjadi tiga package: `model`, `view`, dan `controller`, untuk memisahkan komponen-komponen program. Berikut adalah penjelasan mengenai program tersebut:


1. **Package `model`**:
   - `Task` adalah kelas yang digunakan untuk merepresentasikan tugas kuliah. Setiap tugas memiliki atribut seperti ID, nama, dan deskripsi. Karena atributnya bersifat privat dan tidak ada metode setter, Anda perlu menggunakan konstruktor untuk menginisialisasi objek tugas. Kelas ini telah dimodifikasi menjadi `final` sehingga tidak dapat diwariskan atau diubah oleh kelas lain.


2. **Package `view`**:
   - `TaskView` adalah kelas yang digunakan untuk menampilkan informasi ke layar. Kelas ini memiliki tiga metode:
     - `displayTasks`: Menampilkan daftar tugas kuliah ke layar.
     - `displayTask`: Menampilkan satu tugas kuliah ke layar.
     - `displayMessage`: Menampilkan pesan teks ke layar. Kelas ini telah dimodifikasi menjadi `final` sehingga metodenya tidak dapat diubah atau dioverride oleh kelas lain.


3. **Package `controller`**:
   - `TaskController` adalah kelas yang mengendalikan logika bisnis dalam program. Kelas ini memiliki metode-metode berikut:
     - `createTask`: Membuat tugas baru dan menambahkannya ke daftar tugas.
     - `readTasks`: Menampilkan daftar tugas kuliah.
     - `findTaskById`: Mencari tugas berdasarkan ID.
     - `updateTask`: Mengubah tugas berdasarkan ID, menampilkan data tugas sebelumnya dan setelah diubah.
     - `deleteTask`: Menghapus tugas berdasarkan ID.
   - Kelas `TaskController` juga menggunakan ArrayList untuk menyimpan daftar tugas dan memiliki atribut `nextId` untuk menghasilkan ID unik untuk setiap tugas yang dibuat. Kelas ini juga telah dimodifikasi menjadi `final` sehingga tidak dapat diwariskan atau diubah oleh kelas lain.


4. **Kelas `Listtugas`**:
   - Kelas ini adalah kelas utama yang berisi metode `main` dan digunakan untuk menjalankan program. Di dalam metode `main`, program menampilkan menu yang memungkinkan pengguna untuk menambahkan tugas, melihat daftar tugas, mengubah tugas, menghapus tugas, atau keluar dari program. Input dari pengguna diterima menggunakan objek `Scanner`.


Secara keseluruhan, program ini adalah contoh sederhana penggunaan sistem CRUD untuk mengelola daftar tugas kuliah. Program ini memisahkan logika bisnis, tampilan, dan model ke dalam tiga package yang berbeda untuk mengikuti prinsip-prinsip desain yang baik. Selain itu, penggunaan kata kunci `final` di beberapa kelas dan metode mencegah pengubahan atau perubahan perilaku yang tidak diinginkan oleh kelas lain.
