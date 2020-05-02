package com.dicoding.wisataambon.model;

import com.dicoding.wisataambon.R;

import java.util.ArrayList;

public class ToursData {
    private static String[] tourNames = {
            "Gong Perdamaian",
            "Pantai Pintu Kota",
            "Pantai Liang",
            "Pantai Natsepa",
            "Pantai Lubang Buaya",
            "Rumah Pohon",
            "Kampung Rotan",
            "Pantai Hukurila",
            "Pantai Batu Kapal",
            "Pantai Namalatu",

    };
    private static String[] tourLocation = {
            "Pusat Kota, Desa Uritetu, Sirimau",
            "Negeri (Desa) Air Louw",
            "Jalan Propinsi, Liang, Salahutu",
            "Desa Suli, Kecamatan Salahutu",
            "Morela, Kabupaten Maluku Tengah",
            "Desa Waai, Kecamatan Salahutu, ",
            "Laha, Teluk Ambon, Kota Ambon",
            "Banda Sea, Kecamatan Leitimur",
            "Jln. Propinsi Liliboy",
            "Jln. Karang Panjang, Negeri Latuhalat",

    };

    private static String[] tourDetails = {
            "Gong Perdamaian Dunia ini berada di Taman Pelita, pusat Kota Ambon, taman yang asri dan terbuka untuk umum. Taman ini selalu dikunjungi para pelancong atau masyarakat Ambon pada akhir pekan. Untuk bisa masuk ke wilayah gong ini, Anda cukup merogoh kocek sekitar Rp 5.000. \n\nGong ini diresmikan oleh Presiden Susilo Bambang Yudhoyono pada tanggal 25 November 2009. Tujuan dibangunnya gong yang megah dan besar ini, yaitu agar citra Ambon yang dulu identik dengan kerusuhan dan kekerasan dapat sirna dan hidup dalam damai.\n\nGong ini merupakan Gong Perdamaian ke-35 di dunia. Tidak hanya menjadi kebanggaan masyarakat Ambon, gong ini pun menjadi kebanggaan Indonesia.",
            "Pantai Pintu Kota, pantai ini memiliki objek khas yang tidak dapat anda temukan di pantai lainnya. Sama seperti namanya, pantai ini memiliki objek berbentuk seperti gerbang. Gerbang ini terbentuk di tengah batu karang karena proses penggerusan oleh ombak laut, dengan demikian kita dapat melihat Laut Banda melalui gerbang tersebut. Dari Kota Ambon anda harus menempuh jarak sejauh 45 km dengan menggunakan mobil, motor ataupun angkutan umum ke Desa Airlouw. \n\nPantai Pintu Kota memiliki lokasi yang strategis untuk menikmati view di senja hari. Sunset yang terlihat dari pantai dapat terlihat jelas dari pantai ini. Di sekitar pantai terdapat homestay yang dapat anda sewa untuk beristirahat selagi menikmati senja. ",
            "Karena memiliki panorama alam yang menakjubkan, pantai yang memiliki nama asli lokal “Hanimua” ini bahkan pernah dinobatkan sebagai pantai paling indah di Indonesia pada tahun 1990 oleh UNDP PBB. Pantai Liang terletak di Jl. Provinsi Liang, Kecamatan Salahutu, Maluku Tengah. Atau untuk lebih mudahnya dapat ditemukan pada titik kordinat F8WV+24 menggunakan Gps. Jaraknya kurang lebih 31 km dari Kota Ambon, atau sekitar 30 menit apabila ditempuh dengan kendaraan bermotor. Sedagkan dari Bandara Pattimura, Ambon maka memakan waktu sekitar 40 menit.\n\nharga tiket masuk ke objek wisata Pantai Liang bervariasi, tergantung kapan Anda datang. Pada hari kerja, biaya masuk hanya Rp 10.000 /orang, sedangkan akhir pekan dan liburan sebesar Rp 15.000 /orang. Sedangkan jika datang bersama rombongan, maka akan dikenakan tarif sebesar Rp 200.000 /10 orang (All include). Sebagai tips tambahan untuk wisatawan yang baru pertama kali akan berkunjung, sebaiknya sediakan uang pas untuk membayar tiket. Sebab kalau tidak, mungkin Anda harus merelakan uang lebihan dari yang dibayarkan.",
            "Seiring dengan berjalannya waktu, kepopuleran Pantai Natsepa seperti tidak pernah pudar. Meskipun saat ini sudah banyak dibuka objek wisata pantai yang baru disekitarnya, namun Natsepa tetap menjadi yang paling ramai dikunjungi. Hal tersebut tentu tidak terlepas dari putihnya pasir dan biru lautan dengan pepohonan rindang yang menjadi daya tarik utama dari tempat ini. \n\nTransportasi yang dapat digunakan untuk menuju Pantai Natsepa juga sangat mudah. Anda bisa memilih untuk rental kendaraan, atau naik kendaraan umum (angkot). Kalau naik angkot Berlokasi di Desa Suli, Kecamatan Salahutu, Kota Ambon, Kabupaten Maluku, Provinsi Maluku Tengah. Pantai Natsepa dapat ditemukan dengan mudah pada titik kordinat 97HR+9R di Google \n\nTarif yang harus dibayar untuk masuk Pantai Natsepa terbilang sangat murah, wisatawan hanya ulsepuasnya. Sedangkan tarif untuk parkir juga terjangkau dan tergantung pada jenis kendaraan yang dibawa, untuk sepeda motor mulai Rp 5000, sedangkan mobil sekitar Rp 10.000",
            "Keindahan pantai lubang buaya memang belum terlalu banyak didengar oleh wisatawan. Untuk masyarakat Kota Ambon sendiri pun masih banyak yang belum mengetahui keberadaan pantai ini, namun atas inisiatis masyarakat sekitar, maka ditatalah lokasi ini dengan peralatan seadanya agar layak dikunjungi sebagai salah satu objek wisata unggulan di Provinsi Maluku. \n\nUntuk ke Lubang Buaya Morella kamu tidak perlu melewati lautan dengan kapal penyebrangan. Cukup dengan kendaraan bermotor/mobil dengan Waktu tempuh sekitar 60 hingga 90 menit dari Kota Ambon. Lubang Buaya di Morella wujudnya cantik dan eksotis dan tentu saja tidak ada predator di dalamnya. Yang ada para pengunjung berdatangan setiap hari karena ingin menikmati udara segar dan jernihnya lautan. Asal usul penamaannya tidak jauh-jauh dari mitos yang berkembang di desa setempat. Konon dulunya ada lubang atau gua yang jadi sarang buaya putih.",
            "Rumah Pohon merupakan salah satu spot yang sangat dikenal di salah satu obyek liburan yang terletak di kawasan bukit Desa Waai, Kecamatan Salahutu Kabupaten Maluku Tengah ini adalah pilihan tepat liburan sekaligus hiburan yang memicu adernalin. \n\nSaat mendatangi wilayah dengan berbagai macam spot hiburan yang ditawarkan ini, seperti rumah pohon, rumah terbalik, flying fox, pengunjung pasti terpesona dengan pemandangan hijau pepohonan dan lautan biru dari atas bukit desa Waai ini. Selain itu udara segar juga sudah pasti dinikmati. \n\nHanya merogoh kocek sekitar Rp.15.000,- pengunjung sudah dapat menikmati lebih kurang 10 spot.  Setiap pengunjung dikenakan tiket masuk Rp.10.000.- dan itu sudah dapat menikmati  semua wahana yang ada, dengan hanya menunjukan tiket masuk yang dibeli saat masuk,  selain itu juga untuk parkir kendaraan seperti mobil dikenakan Rp. 5.000.- dan untuk motor Rp. 2.000.-",
            "Kampung Rotan menawarkan pemandangan yang indah dan alami. Para pengunjung juga bisa menikmati air terjun yang jaraknya sekitar 50 meter dari rumah pohon. Uniknya, air terjun itu diberi nama Air Terjun Gergaji. \n\nKampung Rotan ini tidak jauh dari pusat kota, pengunjung bisa menempuh jarak sekitar 1 jam perjalanan dengan menggunakan transportasi darat. Apalagi bagi wisatawan yang baru tiba di Ambon menggunakan pesawat, bisa langsung menuju ke Bandara Pattimura saja, karena waktu tempuh dari bandara menuju Rumah Pohon Kampung Rotan hanya berkisar 20 menit. \n\nLahan seluas 15 hektar dikelilingi berbagai jenis pohon rotan dan kayu, seperti kayu nani, kayu nisa dan pohon samama. Setiap pengunjung yang masuk dikenai tarif Rp 10 ribu per orang. Disana pengunjung bisa menikmati suasana alam yang begitu kental, foto berlatar hutan dan air terjun. Untuk bisa sampai ke spot foto utama dengan latar pepohonan nan hijau, pengunjung harus menaiki 310 anak tangga. Jika ingin leluasa berfoto, ada baiknya berkunjung di hari senin-jumat. Disaat akhir pekan tempat ini dipadati lebih dari 500 orang.",
            "Pantai Hukurila merupakan salah satu pantai yang membatasi Pulau Ambon dengan Laut Banda. Pantai ini membentang menghadap ke arah Timur dengan pasir yang berwarna coklat dengan batu batu yang menghiasi bibir pantai, terdapat endapan pasir hitam yang diduga merupakan hasil dari aktivitas vulkanisme daerah setempat. \n\nPesona alamnya dapat anda nikmati dengan melakukan diving atau snorkeling dengan biaya Rp 15.000 –  Rp 25.000, dengan harga tersebut anda akan mendapatkan pelatihan singkat diving di laut belum termasuk alat alat menyelamnya. Alat penyelam dapat anda dapatkan dengan menyewa pada pengelola pantai. \n\nPantai Hukurila merupakan salah satu destinasi wisata yang harus anda kunjungi ketika berada di Pulau Ambon. Selain pesona pantai berupa goa bawah laut, makanan khasnya juga tidak akan mengecewakan. Saat berkunjung ke pantai, anda harus memperhatikan keselamatan karena batuan di pantai adalah batu gamping maka pada waktu musim hujan akan menjadi sangat licin dan dapat membuat anda tergeincir saat melintas.",
            "Pantai Batu Kapal yang terletak di Negeri Liliboi, Kecamatan Lehitu Barat, Kabupaten Maluku Tengah. Secara administrasi daerah ini masuk dalam Kabupaten Maluku Tengah, namun secara geografis Negeri Liliboi berada pada Pulau Ambon. Letaknya tidak kurang lebih 50 kilometer dari kota Ambon, menariknya lokasi ini dekat dengan Bandara Pattimura, sehingga bagi wisatawan luar yang ingin berlibur hanya butuh waktu 10-15 menit saja untuk sampai ke Pantai Batu Kapal.\n\nPantai Batu Kapal baru dipublikasikan pada tahun 2016, kini menjadi salah satu spot wisata yang banyak dikunjungi oleh para wisatawan lokal atau asing. Untuk biaya masuk ke kawasan tersebut masih terbilang murah, kita hanya membayar Rp 5.000 per orang, dengan biaya parkir untuk motor Rp 3.000 dan mobil sebesar Rp 5.000.\n\nPantai ini memiliki lubang sebesar tiga meter persegi, serta di sepanjang pantai terdapat kerikil-kerikil yang indah. Uniknya, tebing itu berbentuk kapal sehingga masyarakat Liliboi menamakannya sebagai Pantai Batu Kapal. Setelah memasuki pintu gerbang wisata ini, kita akan melewati beberapa anak tangga yang cukup panjang hampir mendekati bibir pantai.",
            "Kota Ambon memang sangat terkenal dengan pesona pantainya yang memesona. Beberapa diantara pantai andalannya, adalah Namalatu. Apabila diterjemahkan ke dalam bahasa Ambon, maka artinya adalah Nama Raja. Pantai yang berada di Desa Batulahat ini memiliki ciri khas berupa jajaran batu karang dengan warna kecoklatan, yang menjadi daya tarik tersendiri. \n\nTempat Wisata Pantai Namalatu berada di Negeri LatuLahat yang berjarak sekitar 15 km dari pusat Kota Ambon, jarak antara Pantai Namalatu dengan pusat Kota Ambon ini menyebabkan anda hanya membutuhkan waktu sekitar 30 menit untuk mencapai lokasi Tempat Wisata Pantai Namalatu. Oleh karena jarak yang tidak terlalu jauh dari pusat Kota membuat anda tidak perlu pusing memikirkan kendaraan apa yang bisa membawa anda ke kawasan Pantai Namalatu. karena banyak terdapat kendaraan umum yang siap sedia mengantarkan anda ke tujuan wisata pilihan tersebut. \n\nPantai Namalatu telah dilengkapi dengan berbagai macam fasilitas yang dapat memudahkan wisatawan selama berada di pantai tersebut, di antara fasilitas itu adalah deretan warung makanan yang menjual berbagai macam makanan serta jajanan khas daerah Ambon, ada penjual kelapa muda, terdapat Saung yang bisa anda manfaatkan untuk beristirahat, serta lahan parkir yang cukup luas untuk menampung kendaraan anda. ",

    };

    private static int[] toursImages = {
            R.drawable.gong_perdamaian,
            R.drawable.pantai_pintu_kota,
            R.drawable.pantai_liang,
            R.drawable.pantai_natsepa,
            R.drawable.lubang_buaya,
            R.drawable.rumah_pohon,
            R.drawable.kampung_rotan,
            R.drawable.pantai_hukurila,
            R.drawable.batu_kapal,
            R.drawable.pantai_namalatu,




    };

    public static ArrayList<Tour> getListData() {
        ArrayList<Tour> list = new ArrayList<>();
        for (int position = 0; position < tourNames.length; position++) {
            Tour tour = new Tour();
            tour.setName(tourNames[position]);
            tour.setLocation(tourLocation[position]);
            tour.setDetail(tourDetails[position]);
            tour.setPhoto(toursImages[position]);

            list.add(tour);
        }


        return list;


    }
}
