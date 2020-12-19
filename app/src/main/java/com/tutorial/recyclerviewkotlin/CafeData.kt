package com.tutorial.recyclerviewkotlin

object CafeData {

    private val name = arrayOf("Beranda Depok",
        "Cammo Milk Bar",
        "Coger Coffee",
        "Delish Coffee Shop",
        "Fullcafe Coffee",
        "Ghawil & Coffee",
        "Green T",
        "Juliet Coffee",
        "Kedai Coffee Kimung",
        "Koma Coffee",
        "Kopi Bar",
        "Kopium Depok",
        "Meet up Cafe",
        "Milan Pizzeria Cafe",
        "MUG Authentic Coffe Atjeh",
        "Rustic Kitchen & Coffee",
        "Skala Coffee",
        "What's Up Cafe",
        "Yellow Truck Cafe",
        "Zoe Reborn Library Cafe")

    private val image = arrayOf(R.drawable.ic_beranda_depok,
        R.drawable.ic_cammo_milk_bar,
        R.drawable.ic_coger_caffe,
        R.drawable.ic_delish_coffe_shop,
        R.drawable.ic_fullcaff_coffee,
        R.drawable.ic_ghawil_dan_coffe,
        R.drawable.ic_green_t,
        R.drawable.ic_juliet_coffe,
        R.drawable.ic_kedai_coffe_kimung,
        R.drawable.ic_koma_cafe,
        R.drawable.ic_kopi_bar,
        R.drawable.ic_kopium_depok,
        R.drawable.ic_meet_up_cafe,
        R.drawable.ic_milan_pizzeria_caffe,
        R.drawable.ic_mug_authentic_coffe_atjeh,
        R.drawable.ic_rustic_kitchen_dan_coffee,
        R.drawable.ic_skala_coffe,
        R.drawable.ic_what_up_cafe,
        R.drawable.ic_yellow_truck_coffe,
        R.drawable.ic_zoe_reborn_library)

    private val description = arrayOf("Buka : Senin - Minggu 10.00 - 00.00 \n\nAlamat: Jalan Kartini 11K-L, Depok, Kec. Pancoran Mas, Kota Depok, Jawa Barat 16431",
        "Buka : Senin - Minggu 11.00 - 23.00 \n\nAlamat: Jl. H. Asmawi No.105, Beji, Kecamatan Beji, Kota Depok, Jawa Barat 16425",
        "Buka : Selasa - Minggu 15.00 - 23.00 \n\nAlamat: Jl. Raya Cipayung Jaya No.16, Cipayung Jaya, Kec. Cipayung, Kota Depok, Jawa Barat 16437",
        "Buka : Senin - Minggu 08.00 - 00.00 \n\nAlamat: Ruko Depok Mall, Jalan Margonda Raya No.88, Kemirimuka, Beji, Kemiri Muka, Kecamatan Beji, Kota Depok, Jawa Barat 16411",
        "Buka : Senin - Minggu 10.00 - 23.00 \n\nAlamat: Ruko Arcade, Jl. Boulevard Grand Depok City No.5, Tirtajaya, Kec. Sukmajaya, Jawa Barat 16412",
        "Buka : Senin - Minggu 10.00 - 23.00 \n\nAlamat: Jl. Boulevard Grand Depok City,Depok, Jawa Barat 16412 ",
        "Buka : Senin - Minggu 10.00 - 00.00 \n\nAlamat: Main Library, Universitas Indonesia, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
        "Buka : Senin - Minggu 09.00 - 00.00 \n\nAlamat: Jl. Margonda Raya, Kemiri Muka, Kecamatan Beji, Kota Depok, Jawa Barat 16423",
        "Buka : Senin - Minggu 10.00 - 22.00 \n\nAlamat: Perumahan Grand Depok City, Ruko Anggrek 1 Blok C No. 53, Jalan Boulevard Raya, Tirtajaya, Kec. Sukmajaya, Kota Depok, Jawa Barat 16413",
        "Buka : Senin - Minggu 09.00 - 23.00 \n\nAlamat: Jl. K.H.M. Yusuf Raya, Mekar Jaya, Kec. Sukmajaya, Kota Depok, Jawa Barat 16411",
        "Buka : Senin - Minggu 11.00 - 00.00 \n\nAlamat: Jl. Margonda Raya No.417 E, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
        "Buka : Senin - Minggu 11.00 - 23.00 \n\nAlamat: Jalan Margonda, 2 No.498 D, RW.004, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
        "Buka : Senin - Minggu 08.00 - 22.00 \n\nAlamat: Jl. Raya Sawangan No.19, Pancoran MAS, Kec. Pancoran Mas, Kota Depok, Jawa Barat 16436",
        "Buka : Senin - Minggu 10.00 - 23.00 \n\nAlamat: Jl. Margonda Raya No.514, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
        "Buka : Senin - Minggu 10.00 - 21.00 \n\nAlamat: Jl. Margonda Raya No.488, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
        "Buka : Senin - Minggu 09.00 - 21.00 \n\nAlamat: Jl. Raya Sawangan No.98-99, Rangkapan Jaya, Kec. Pancoran Mas, Kota Depok, Jawa Barat 16435",
        "Buka : Senin - Minggu 11.00 - 00.00 \n\nAlamat: Jl. Raya Sawangan No.98-99, Rangkapan Jaya, Kec. Pancoran Mas, Kota Depok, Jawa Barat 16435",
        "Buka : Senin - Minggu 10.00 - 22.00 \n\nAlamat: Jl. Margonda Raya No.463, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
        "Buka : Senin - Minggu 11.00 - 00.00 \n\nAlamat: Jl. Margonda Raya No.505C, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
        "Buka : Senin - Minggu 10.00 - 22.00 \n\nAlamat: Jl. Margonda Raya No.27, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424"

    )

    val listData : ArrayList<Cafe>
    get() {
        val list = arrayListOf<Cafe>()
        for (position in name.indices){
            val cafe = Cafe ()
            cafe.name = name[position]
            cafe.desc = description[position]
            cafe.image = image[position]
            list.add(cafe)
        }

        return list
    }
}