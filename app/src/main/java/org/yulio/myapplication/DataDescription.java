package org.yulio.myapplication;

import java.util.ArrayList;

public class DataDescription {
    private static String[] title ={
        "Taman Alun - Alun",
            "Taman Film",
            "Taman Kiara Artha",
            "Taman Lansia",
            "Taman Sejarah",
            "Taman Tegalega",
            "Taman Musik",
            "Taman Maluku",
            "Taman Lalu Lintas",
            "Taman Teras Cikapundung"
    };
    private static String[] description = {
            "Alun-alun Bandung adalah pusat kota Bandung yang dicirikan oleh sebidang tanah yang luas. Di sekelilingnya ada bangunan-bangunan fungsional. Tempatnya ada di dekat Grote Postweg",
            "Taman Film adalah salah satu taman tematik dan ruang terbuka publik di Kota Bandung yang terletak di bawah Jembatan Pasupati, Bandung, Jawa Barat. Taman ini diresmikan oleh Wali kota Bandung, Ridwan Kamil, pada tanggal 14 September 2014.",
            "Kiara Artha Park terletak di Jl. Jakarta, Bandung. Di taman seluas 2,6 hektare ini, terdapat area yang dibangun untuk memperingati Konferensi Asia Afrika yang dilaksanakan di Bandung pada 1955. Kawasan tersebut dinamakan Taman Asia Afrika. Di taman itu berdiri patung setengah badan para inisiator KAA dan semua bendera dari negara peserta yang hadir",
            "Taman Lansia adalah salah satu taman kota yang berada di Citarum, Kota Bandung, Jawa Barat. Taman yang terletak di sebelah kanan Gedung Sate ini diresmikan pada tanggal 31 Desember 2014 oleh Wali kota Bandung, Ridwan Kamil.",
            "Taman Sejarah Bandung adalah taman yang terletak di belakang Balai Kota Bandung, kompleks Pemerintahan Kota Bandung. Taman ini berfungsi untuk mengenalkan sejarah di Kota Bandung. Taman ini dilengkapi informasi mengenai pemimpin kota Bandung dari masa ke masa.",
            "Tegalega berarti lapangan yang luas. Lapangan dengan luas sekitar 17 hektare ini memang memiliki daya tarik tersendiri. Selain terdapat monumen Bandung Lautan Api, tahun ini juga terdapat Lampion Park yang berada persis di depannya. Setelah dibuka sejak dua minggu sebelum lebaran 2019 lalu, Lampion Park mulai dikenal oleh masyarakat luas, tak terkecuali pendatang dari luar kota.",
            "Taman Musik Centrum yang sebelumnya dikenal dengan nama Taman Centrum atau Taman Pengki adalah taman tematik di Jalan Belitung, Sumurbandung, Bandung. taman ini diresmikan pada 1 Maret 2014 oleh Kepala Dinas Pemakaman dan Pertamanan Kota Bandung Arief Prasteya.",
            "Taman Maluku Bandung dikenal dengan keberadaan patung pastor. Banyak informasi mengenai patung pastor tersebut. Mulai dari informasi patung bisa bergerak sendiri pada malam hari atau patung tersebut dibuat untuk mengenang pastor yang tewas karena kecelakaan pesawat di Taman Maluku.",
            "Taman Lalu-lintas Ade Irma Suryani adalah sebuah taman rekreasi yang ada di jantung kota Bandung, Jawa Barat, Indonesia. Selain sebagai taman dan tempat bermain, di sini juga dijadikan pusat latihan membaca rambu-rambu lalu lintas.",
            "Ruang Publik ini dibangun oleh pemerintah kota bandung di bawah sang pengagas walikota Ridwan Kamil dengan mengambil konsep Urban dan juga Ekologi tepat di sekitar aliran sungai Cikapundung Tujuan dibangunnya adalah menyediakan ruang umum terbuka untuk warga kota bandung dan sekitarnya, sebagat tempat bersosialisasi, berkumpul di kawasan hijau kota yang nyaman untuk ditinggali."
    };
    private static int[] photo ={
    R.drawable.alunalun,
            R.drawable.film,
            R.drawable.kiaraartha,
            R.drawable.lansia,
            R.drawable.sejarah,
            R.drawable.tegalega,
            R.drawable.musik,
            R.drawable.maluku,
            R.drawable.lalulintas,
            R.drawable.cikapundung,


    };
    static ArrayList<DataClass> getListData(){
        ArrayList<DataClass> list = new ArrayList<>();
        for (int position = 0; position < title.length; position++) {
            DataClass dataClass = new DataClass();
            dataClass.setTitle(title[position]);
            dataClass.setDescription(description[position]);
            dataClass.setPhoto(photo[position]);
            list.add(dataClass);
        }
        return list;
    }
}

