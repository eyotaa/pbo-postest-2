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
Program di atas merupakan bagian dari aplikasi toko biliar yang mengelola barang-barang biliar, seperti Cue (tongkat) dan Glove (sarung tangan). Program ini menyediakan operasi untuk menambahkan, menghapus, mengupdate, dan menampilkan barang-barang biliar dalam toko.
    
1. **Deklarasi ArrayList**: Program ini mendeklarasikan dua ArrayList statis yang digunakan untuk menyimpan daftar barang-barang biliar:
   - `itemsCue`: ArrayList untuk menyimpan barang-barang jenis Cue.
   - `itemsGlove`: ArrayList untuk menyimpan barang-barang jenis Glove.

2. **Method `addItemCue` dan `addItemGlove`**: Dua method ini digunakan untuk menambahkan barang baru ke dalam ArrayList yang sesuai (Cue atau Glove).

3. **Method `displayItemsCue` dan `displayItemsGlove`**: Method ini digunakan untuk menampilkan daftar barang-barang biliar jenis Cue dan Glove.

4. **Method `displayItems`**: Method ini menggabungkan dua metode sebelumnya untuk menampilkan semua barang biliar dalam toko.

5. **Method `removeItemByIdCue`** dan `removeItemByIdGlove`: Dua method ini digunakan untuk menghapus barang berdasarkan ID dari ArrayList yang sesuai (Cue atau Glove).

6. **Method `updateItemByIdCue`** dan `updateItemByIdGlove`: Dua method ini digunakan untuk mengupdate informasi barang berdasarkan ID dari ArrayList yang sesuai (Cue atau Glove).

  <li>Class Cue</li>
  <ul>
  Program di atas adalah implementasi kelas `Cue`, yang merupakan subkelas dari `BilliardItem`. Kelas ini mewakili barang-barang biliar jenis Cue (tongkat).
1. **Kelas `Cue` extends `BilliardItem`:** Ini berarti `Cue` adalah subkelas dari kelas `BilliardItem`. Dengan demikian, `Cue` akan mewarisi semua atribut dan metode yang ada dalam `BilliardItem`.

2. **Variabel anggota pribadi:**
   - `length` (tipe data `int`): Digunakan untuk menyimpan panjang Cue dalam sentimeter.
   - `weight` (tipe data `int`): Digunakan untuk menyimpan berat Cue dalam gram.

3. **Konstruktor `Cue`**: Konstruktor ini digunakan untuk membuat objek `Cue`. Ia menerima beberapa argumen sebagai berikut:
   - `idItem` (tipe data `String`): ID item Cue.
   - `name` (tipe data `String`): Nama item Cue.
   - `price` (tipe data `int`): Harga item Cue.
   - `length` (tipe data `int`): Panjang Cue dalam sentimeter.
   - `weight` (tipe data `int`): Berat Cue dalam gram.

   Konstruktor ini menginisialisasi atribut `idItem`, `name`, dan `price` dari kelas `BilliardItem` menggunakan kata kunci `super`, dan menginisialisasi atribut `length` dan `weight` kelas `Cue`.

4. **Metode getter:**
   - `getLength()`: Mengembalikan panjang Cue.
   - `getWeight()`: Mengembalikan berat Cue.

5. **Metode setter:**
   - `setLength(int length)`: Digunakan untuk mengatur panjang Cue.
   - `setWeight(int weight)`: Digunakan untuk mengatur berat Cue.

6. **Metode `displayItem()`:** Ini adalah metode yang di-override dari kelas `BilliardItem`. Metode ini digunakan untuk menampilkan informasi tentang barang biliar jenis Cue ke konsol. Ia mencetak ID item, nama, harga, panjang, dan berat Cue.

  <li>Class Cue</li>
  <ul>
Program di atas adalah implementasi kelas `Glove`, yang juga merupakan subkelas dari `BilliardItem`. Kelas ini mewakili barang-barang biliar jenis sarung tangan (Glove). Berikut adalah penjelasan mengenai program tersebut:

1. **Kelas `Glove` extends `BilliardItem`:** Ini berarti `Glove` adalah subkelas dari kelas `BilliardItem`. Sebagai subkelas, `Glove` mewarisi semua atribut dan metode yang ada dalam `BilliardItem`.

2. **Variabel anggota pribadi:**
   - `size` (tipe data `String`): Digunakan untuk menyimpan ukuran sarung tangan.
   - `color` (tipe data `String`): Digunakan untuk menyimpan warna sarung tangan.

3. **Konstruktor `Glove`:** Konstruktor ini digunakan untuk membuat objek `Glove`. Ia menerima beberapa argumen sebagai berikut:
   - `idItem` (tipe data `String`): ID item sarung tangan.
   - `name` (tipe data `String`): Nama item sarung tangan.
   - `price` (tipe data `int`): Harga item sarung tangan.
   - `size` (tipe data `String`): Ukuran sarung tangan.
   - `color` (tipe data `String`): Warna sarung tangan.

   Konstruktor ini menginisialisasi atribut `idItem`, `name`, dan `price` dari kelas `BilliardItem` menggunakan kata kunci `super`, dan menginisialisasi atribut `size` dan `color` dari kelas `Glove`.

4. **Metode getter:**
   - `getSize()`: Mengembalikan ukuran sarung tangan.
   - `getColor()`: Mengembalikan warna sarung tangan.

5. **Metode setter:**
   - `setSize(String size)`: Digunakan untuk mengatur ukuran sarung tangan.
   - `setColor(String color)`: Digunakan untuk mengatur warna sarung tangan.

6. **Metode `displayItem()`:** Ini adalah metode yang di-override dari kelas `BilliardItem`. Metode ini digunakan untuk menampilkan informasi tentang barang biliar jenis sarung tangan ke konsol. Ia mencetak ID item, nama, harga, ukuran, dan warna sarung tangan.

<h2>A. Screenshot Output</h2>
