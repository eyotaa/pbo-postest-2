# postest 2
<h1>DOKUMENTASI PROJECT POSTTEST 2 PBO</h1>

<P>Nama : Rikad anggoro putra <br>NIM : 2209116044 <br>Kelas : Sistem Informasi A 2022</P>
<h2>A. Screenshot Source Code</h2>

<ol>
  <li>Class Main</li>
  
  ![image](https://github.com/eyotaa/pbo-postest-2/assets/95154198/4f19f75a-a3fb-4129-bed9-e6cbed1cc4db)
  
  ![image](https://github.com/eyotaa/pbo-postest-2/assets/95154198/88c6d426-06c8-45ae-94b5-3193d63dca16)

  <li>Class BilliardItem</li>
  
  ![Billiarditem](https://github.com/eyotaa/pbo-postest-2/assets/95154198/653109e2-27e6-4f42-921a-0a730bd30295)
  
  <li>Class BilliardStore</li>
  
  ![image](https://github.com/eyotaa/pbo-postest-2/assets/95154198/eef83dd7-b387-46ff-8bef-175e558bc3f7)
  
  ![image](https://github.com/eyotaa/pbo-postest-2/assets/95154198/3e145356-d563-4548-8e9c-2e4d9d5f777e)

  <li>Class Cue</li>
  
  ![image](https://github.com/eyotaa/pbo-postest-2/assets/95154198/d57940ee-8693-4f6b-bf18-027be9f103c9)
  
  <li>Class Glove</li>
  
  ![image](https://github.com/eyotaa/pbo-postest-2/assets/95154198/c521c111-708e-4bfb-a6e4-b5e1cf290ef9)

<h2>B. Penjelasan Source Code</h2>

<ol>
  <li>Class Main</li>
  <ul>

  Program Java di atas adalah program yang mengimplementasikan sebuah sederhana antarmuka teks untuk mengelola toko biliar. Program ini memungkinkan pengguna untuk melakukan beberapa operasi yang melibatkan barang-barang biliar seperti Cue (tongkat) dan Glove (sarung tangan) seperti menampilkan barang, menambahkan barang, menghapus barang, mengupdate barang, dan keluar dari program. Berikut adalah penjelasan mengenai fungsi dari program ini:

1. Program dimulai dengan mengimpor paket-paket yang diperlukan dari `java.util` dan paket `billiardstore`. Ini termasuk kelas `Scanner` untuk masukan pengguna dan kelas-kelas yang berkaitan dengan barang-barang biliar seperti `Cue` dan `Glove`.

2. Program berjalan dalam loop `while (true)` yang berarti akan berjalan terus menerus sampai pengguna memilih opsi keluar.

3. Program menampilkan menu pilihan ke layar dengan menggunakan `System.out.println()`. Menu tersebut termasuk opsi untuk menampilkan barang, menambahkan barang, menghapus barang, mengupdate barang, dan keluar dari program.

4. Program meminta pengguna untuk memilih opsi dengan menggunakan `Scanner` dan menyimpan pilihan dalam variabel `menu`.

5. Program kemudian menggunakan pernyataan `switch` untuk menentukan tindakan yang akan diambil berdasarkan pilihan pengguna. Beberapa tindakan yang mungkin diambil termasuk:
   - Menampilkan barang dengan memanggil `BilliardStore.displayItems()`.
   - Menambahkan barang baru dengan mengambil masukan pengguna terkait dengan jenis barang (Cue atau Glove), dan kemudian membuat objek yang sesuai dan menambahkannya ke daftar barang biliar di toko.
   - Menghapus barang dengan meminta masukan pengguna terkait dengan jenis barang dan ID barang yang akan dihapus, lalu menghapus barang tersebut dari daftar.
   - Mengupdate barang dengan mengambil masukan pengguna terkait dengan jenis barang, ID barang yang akan diupdate, dan informasi baru yang akan diperbarui, lalu mengupdate barang tersebut di daftar.
   - Keluar dari program dengan menghentikan eksekusi program dengan `System.exit(0)`.

6. Jika pengguna memasukkan pilihan yang tidak valid, program akan memberikan pesan kesalahan dan meminta pengguna untuk memilih opsi yang valid.

7. Program berjalan dalam loop hingga pengguna memilih untuk keluar (menu 5).

  <li>Class BilliardItem</li>
  <ul>
  Program di atas mendefinisikan kelas `BilliardItem`, yang merupakan kelas abstrak (dinyatakan dengan kata kunci `abstract`). 
  Ini adalah kelas dasar untuk barang-barang yang dapat dijual di toko biliar. Berikut adalah penjelasan mengenai program tersebut:

1. Kelas `BilliardItem` memiliki tiga variabel anggota pribadi:
   - `idItem` (tipe data `String`): Digunakan untuk menyimpan ID unik item.
   - `name` (tipe data `String`): Digunakan untuk menyimpan nama item.
   - `price` (tipe data `int`): Digunakan untuk menyimpan harga item.

2. Terdapat sebuah konstruktor `BilliardItem` yang menerima tiga parameter:
   - `idItem` (tipe data `String`): Digunakan untuk menginisialisasi `idItem`.
   - `name` (tipe data `String`): Digunakan untuk menginisialisasi `name`.
   - `price` (tipe data `int`): Digunakan untuk menginisialisasi `price`.

3. Terdapat tiga metode getter:
   - `getIdItem()`: Mengembalikan ID item.
   - `getName()`: Mengembalikan nama item.
   - `getPrice()`: Mengembalikan harga item.

4. Terdapat metode abstrak `displayItem()`. Ini adalah metode yang perlu diimplementasikan oleh kelas yang meng-extend `BilliardItem`.
   Metode ini bertujuan untuk menampilkan informasi tentang item ke konsol.

6. Terdapat dua metode setter:
   - `setName(String name)`: Digunakan untuk mengatur nama item.
   - `setPrice(int price)`: Digunakan untuk mengatur harga item.

  <li>Class BilliardStore</li>
  <ul>
