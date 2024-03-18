package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.tensorflow.lite.examples.detection.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class ListDaun extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.list_lengkuas,
                R.drawable.list_bayam,
                R.drawable.list_nangka,
                R.drawable.list_mimba,
                R.drawable.list_lembayung,
                R.drawable.list_sesawi,
                R.drawable.list_karendang,
                R.drawable.list_lemon,
                R.drawable.list_ficus,
                R.drawable.list_bodhi,
                R.drawable.list_kembangsepatu,
                R.drawable.list_melati,
                R.drawable.list_mint,
                R.drawable.list_kersen,
                R.drawable.list_mangga,
                R.drawable.list_salamkoja,
                R.drawable.list_kelor,
                R.drawable.list_srigading,
                R.drawable.list_mentega,
                R.drawable.list_ruku,
                R.drawable.list_jintan,
                R.drawable.list_sirih,
                R.drawable.list_jambubiji,
                R.drawable.list_malapari,
                R.drawable.list_delima,
                R.drawable.list_cendana,
                R.drawable.list_jamblang,
                R.drawable.list_jambumawar,
                R.drawable.list_mondokaki,
                R.drawable.list_klabet};
        String[] name = {"Daun Lengkuas",
                "Daun Bayam Hijau",
                "Daun Nangka",
                "Daun Mimba",
                "Daun Lembayung Malabar",
                "Daun Sesawi India",
                "Daun Karendang",
                "Daun Lemon",
                "Daun Ficus Auriculata",
                "Daun Bodhi",
                "Daun Kembang Sepatu",
                "Daun Melati",
                "Daun Mint",
                "Daun Kersen",
                "Daun Mangga",
                "Daun Salam Koja",
                "Daun Kelor",
                "Daun Srigading",
                "Daun Bunga Mentega",
                "Daun Ruku-Ruku",
                "Daun Jintan",
                "Daun Sirih",
                "Daun Jambu Biji",
                "Daun Malapar",
                "Daun Delima",
                "Daun Cendana",
                "Daun Jamblang",
                "Daun Jambu Mawar",
                "Daun Mondokaki",
                "Daun Klabet"};
        String[] lastMessage = {"(Alpinia Galanga)",
                "(Amaranthus Viridis)",
                "(Artocarpus Heterophyllus)",
                "(Azadirachta Indica)",
                "(Basella Alba)",
                "(Brassica Juncea)",
                "(Carissa Carandas)",
                "(Citrus Limon)",
                "(Ficus Auriculata)",
                "(Ficus Religiosa)",
                "(Hibiscus Rosa)",
                "(Jasminum)",
                "(Mentha)",
                "(Muntingia Calabura)",
                "(Mangifera Indica)",
                "(Murraya Koenigii)",
                "(Moringa Oleifera)",
                "(Nyctanthes Arbor Tristis)",
                "(Nerium Oleander)",
                "(Ocimum Tenuiflorum)",
                "(Plectranthus Amboinicus)",
                "(Piper Betle)",
                "(Psidium Guajava)",
                "(Pongamia Pinnata)",
                "(Punica Granatum)",
                "(Pantalum Album)",
                "(Syzygium Cumini)",
                "(Syzygium Jambos)",
                "(Tabernaemontana Divaricata)",
                "(Trigonella Poenum-graecum)"};
        String[] lastmsgTime = {"1","2","3","4","5","6","7","8","9","10",
                "11","12","13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30"};
        String[] phoneNo = {
                "Minyak atsiri, Flavonoid, Fenolik, Saponin, Kardenolin, Polifenol.",
                "Serat, Antioksidan, Fitonutrien, Asam lemak omega-3.",
                "Flavonoid, Fenol, Tanin, Fitokimia, Serat, Protein, Asam lemak.",
                "Hyperoside, Nimbolide, Quercetin, Quercitrin, Rutin, Azadirachtin, Nimbine.",
                "Serat, Antioksidan, Fitonutrien.",
                "Fitokimia, Asam lemak, Protein.",
                "Antioksidan, Serat, Asam lemak.",
                "Fitokimia, Alkaloid, Flavonoid, Fenol, Tanin",
                "Enzim, Fenolik, Serat, Asam lemak.",
                "Fitosterol, Flavonoid, Tanin, Turunan furanoucumarin.",
                "Flavonoida, Saponin, Polifenol, Asam organik, Serat.",
                "Alkaloid, Flavonoid, Saponin, Tanin, Asam Fenolat, Polifenol, Minyak esensial.",
                "Menthone, Menthol, Metil asetat, Flavonoid, Asam fenolat, Minyak esensial.",
                "Asam Amino, Asam fenolat, saponin, Flavonoid, Tanin.",
                "Glikosid, Steroid, Fitokimia, Alkaloid, Enzim,triterpenoid, Asam fenolat, Tanin, Flavonoid.",
                "Alkaloid, Glikosida, Fenolik, Magnesium.",
                "Antioksidan, Serat, Protein, Mineral, Fitokimia.",
                "Antipiretik, Saponin, terpenoid, Flavonoid, Alkaloid.",
                "Glikosida, Flavonoid, Alkaloid, Asam tanin, Saponin, Steroid, Tripenoid.",
                "Alkaloid, Flavonoid, Asam fenolat, Saponin, Steroid.",
                "Protein, Serat, Karbohidrat, Minyak astiri, Senyawa felonik, Flavonoid.",
                "Senyawa fenol, Tanin, Flavonoid, Alkaloid, Minyak atsiri, Senyawa felonik.",
                "Senyawa polifenol, Karoten, Flavonoid, Tanin, Asam folat, Asam kafeat.",
                "Flavonoid, alkaloid, Polifenol, Protein, Asam amino.",
                "Alkoloid, Tanin, Kalsium oksalat, Sulfur peroksidase, Asam ellagik, Flavonoid.",
                "Minyak esensial, Santalin, Flavonoid, Asam galat, Polifenol, Alkaloid, Terpenoid.",
                "Triterpenoid, Monoterpen, Minyak atsiri, Alkaloid, Tanin, Flavonoid.",
                "Minyak atsiri, Asam fenolat, Polifenol, Tanin, Flavonoid.",
                "Asam fenolat, Alkaloid, Flavonoid, Saponin, Glikosida, Fitosterol, Terpenoid.",
                "Protein, Asam lemak, karbohidrat, Minyak atsiri, Flavonoid, Fenolik, Polifenol."};
        String[] country = {
                "Membantu mengurangi peradangan dalam tubuh.\n\nMeningkatkan fungsi saluran pencernaan dan meredakan masalah pencernaan.\n\nMembersihkan kulit, mengurangi jerawat, dan meningkatkan tekstur kulit.\n\nMeredakan batuk dan gejala pernapasan seperti pilek dan flu.\n\nMembantu meredakan stres, kelelahan, dan ketegangan.",
                "Meningkatkan sistem kekebalan tubuh, melawan infeksi, dan mempercepat penyembuhan luka.\n\nMenjaga kesehatan mata dan mencegah masalah penglihatan.\n\nMenjaga kepadatan tulang dan mengurangi risiko osteoporosis.\n\nMemperlancar pencernaan, mencegah sembelit, dan menjaga kesehatan saluran pencernaan.\n\nMenjaga kesehatan jantung, mengurangi risiko penyakit kardiovaskular, dan menurunkan tekanan darah.",
                "Menurunkan tekanan darah.\n\nMeningkatkan sensitivitas insulin dan mengatur metabolisme glukosa.\n\nMemperlancar pencernaan, mencegah sembelit, dan menjaga kesehatan saluran pencernaan secara keseluruhan.\n\nMelawan infeksi kulit, mencegah jerawat, dan memperbaiki kondisi kulit.\n\nMeredakan peradangan dalam tubuh sehingga dapat bermanfaat bagi penderita arthritis atau kondisi inflamasi lainnya.",
                "Menjaga kesehatan gigi dan gusi.\n\nMengurangi perut kembung, dan meredakan gangguan pencernaan seperti diare.\n\nMeredakan peradangan dalam tubuh. Ini dapat bermanfaat bagi penderita kondisi inflamasi seperti arthritis atau gangguan kulit inflamasi.\n\nMengurangi masalah kulit seperti jerawat, noda hitam, dan peradangan kulit. Serta memperbaiki tekstur kulit dan memberikan efek anti-penuaan.\n\nMengatasi masalah seperti ketombe, rambut rontok, dan menjaga kulit kepala yang sehat.",
                "Melindungi sel-sel dari kerusakan oksidatif dan dapat berperan dalam pencegahan penyakit degeneratif.\n\nMelawan tanda-tanda penuaan seperti keriput, garis halus, dan bintik-bintik gelap pada kulit.\n\nMemperkuat akar rambut, mencegah kerontokan rambut, dan memberikan kilau alami pada rambut.\n\nMenjaga kesehatan kardiovaskular dan mengurangi risiko penyakit jantung.\n\nMemperlancar pencernaan, mencegah sembelit, dan menjaga keseimbangan mikroflora usus.",
                "Melindungi sel-sel tubuh dari kerusakan akibat radikal bebas.\n\nMencegah sembelit, dan menjaga kesehatan saluran pencernaan secara keseluruhan.\n\nMeredakan peradangan dalam tubuh. Ini dapat bermanfaat bagi penderita arthritis atau kondisi inflamasi lainnya.\n\nMenurunkan kadar kolesterol jahat (LDL) dalam darah dan meningkatkan kadar kolesterol baik (HDL).\n\nMenjaga kepadatan tulang dan mengurangi risiko osteoporosis.",
                "Mengatasi infeksi saluran kemih.\n\nMenjaga kesehatan gigi dan mulut.\n\nDapat digunakan sebagai obat alami untuk mengatasi batuk dan flu.\n\nMenjaga kesehatan rambut dan mencegah kerontokan rambut.\n\nMengatasi masalah kulit seperti jerawat, kusam, dan noda bekas jerawat.\n\nMemperbaiki fungsi pencernaan dan mengatasi masalah pencernaan seperti sembelit.",
                "Meningkatkan sistem kekebalan tubuh, menjaga kesehatan umum, dan melawan infeksi.\n\nMengatasi masalah pencernaan seperti kembung, mual, dan gangguan pencernaan lainnya.\n\nMelawan radikal bebas dalam tubuh dan melindungi sel-sel dari kerusakan oksidatif.\n\nMenjaga kesehatan jantung dengan mengurangi peradangan, meningkatkan sirkulasi darah, dan mengendalikan tekanan darah.\n\nmeredakan peradangan dalam tubuh, termasuk pada kondisi seperti arthritis dan radang sendi.",
                "Mengurangi tanda-tanda penuaan seperti keriput, garis halus, dan noda pada kulit.\n\nmemperbaiki fungsi pencernaan, mencegah sembelit, dan menjaga kesehatan saluran pencernaan.\n\nmenjaga kepadatan tulang dan mendukung kesehatan tulang yang baik.\n\nMenurunkan kadar gula darah, sehingga bermanfaat dalam pengelolaan diabetes.\n\nmenurunkan tekanan darah dan mengendalikan kadar kolesterol dalam darah, yang dapat mendukung kesehatan jantung.",
                "Mengurangi stres, kegelisahan, dan ketegangan. Daun ini sering digunakan dalam praktik meditasi dan terapi relaksasi.\n\nMeningkatkan fokus dan konsentrasi mental. Oleh karena itu, daun ini dapat digunakan untuk mendukung kegiatan belajar, pekerjaan, dan aktivitas kognitif lainnya.\n\nMeredakan gangguan pencernaan seperti diare, kram perut, dan gangguan lainnya.\n\nMengurangi tanda-tanda penuaan kulit, memperbaiki tekstur kulit, dan memberikan perlindungan terhadap radikal bebas.",
                "Manfaat11",
                "Manfaat12",
                "Manfaat13",
                "Manfaat14",
                "Manfaat15",
                "Manfaat16",
                "Manfaat17",
                "Manfaat18",
                "Manfaat19",
                "Manfaat20",
                "Manfaat21",
                "Manfaat22",
                "Manfaat23",
                "Manfaat24",
                "Manfaat25",
                "Manfaat26",
                "Manfaat27",
                "Manfaat28",
                "Manfaat29",
                "Manfaat30"};

        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            User user = new User(name[i],lastMessage[i],lastmsgTime[i],phoneNo[i],country[i],imageId[i]);
            userArrayList.add(user);

        }

        ListAdapter listAdapter = new ListAdapter(ListDaun.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent intent = new Intent(view.getContext(), Desc_Lengkuas.class);
                    startActivity(intent);
                }
                if (position==1) {
                    Intent intent = new Intent(view.getContext(), Desc_Bayam.class);
                    startActivity(intent);
                }
                if (position==2) {
                    Intent intent = new Intent(view.getContext(), Desc_Nangka.class);
                    startActivity(intent);
                }
                if (position==3) {
                    Intent intent = new Intent(view.getContext(), Desc_Mimba.class);
                    startActivity(intent);
                }
                if (position==4) {
                    Intent intent = new Intent(view.getContext(), Desc_Lembayung.class);
                    startActivity(intent);
                }
                if (position==5) {
                    Intent intent = new Intent(view.getContext(), Desc_Sesawi.class);
                    startActivity(intent);
                }
                if (position==6) {
                    Intent intent = new Intent(view.getContext(), Desc_Karendang.class);
                    startActivity(intent);
                }
                if (position==7) {
                    Intent intent = new Intent(view.getContext(), Desc_Lemon.class);
                    startActivity(intent);
                }
                if (position==8) {
                    Intent intent = new Intent(view.getContext(), Desc_Ficus.class);
                    startActivity(intent);
                }
                if (position==9) {
                    Intent intent = new Intent(view.getContext(), Desc_Bodhi.class);
                    startActivity(intent);
                }
                if (position==10) {
                    Intent intent = new Intent(view.getContext(), Desc_Sepatu.class);
                    startActivity(intent);
                }
                if (position==11) {
                    Intent intent = new Intent(view.getContext(), Desc_Melati.class);
                    startActivity(intent);
                }
                if (position==12) {
                    Intent intent = new Intent(view.getContext(), Desc_Mint.class);
                    startActivity(intent);
                }
                if (position==13) {
                    Intent intent = new Intent(view.getContext(), Desc_Kersen.class);
                    startActivity(intent);
                }
                if (position==14) {
                    Intent intent = new Intent(view.getContext(), Desc_Mangga.class);
                    startActivity(intent);
                }
                if (position==15) {
                    Intent intent = new Intent(view.getContext(), Desc_Salam.class);
                    startActivity(intent);
                }
                if (position==16) {
                    Intent intent = new Intent(view.getContext(), Desc_Kelor.class);
                    startActivity(intent);
                }
                if (position==17) {
                    Intent intent = new Intent(view.getContext(), Desc_Srigading.class);
                    startActivity(intent);
                }
                if (position==18) {
                    Intent intent = new Intent(view.getContext(), Desc_Mentega.class);
                    startActivity(intent);
                }
                if (position==19) {
                    Intent intent = new Intent(view.getContext(), Desc_Ruku.class);
                    startActivity(intent);
                }
                if (position==20) {
                    Intent intent = new Intent(view.getContext(), Desc_Jintan.class);
                    startActivity(intent);
                }
                if (position==21) {
                    Intent intent = new Intent(view.getContext(), Desc_Sirih.class);
                    startActivity(intent);
                }
                if (position==22) {
                    Intent intent = new Intent(view.getContext(), Desc_Jambubiji.class);
                    startActivity(intent);
                }
                if (position==23) {
                    Intent intent = new Intent(view.getContext(), Desc_Malapari.class);
                    startActivity(intent);
                }
                if (position==24) {
                    Intent intent = new Intent(view.getContext(), Desc_Delima.class);
                    startActivity(intent);
                }
                if (position==25) {
                    Intent intent = new Intent(view.getContext(), Desc_Cendana.class);
                    startActivity(intent);
                }
                if (position==26) {
                    Intent intent = new Intent(view.getContext(), Desc_Jamblang.class);
                    startActivity(intent);
                }
                if (position==27) {
                    Intent intent = new Intent(view.getContext(), Desc_Jambumawar.class);
                    startActivity(intent);
                }
                if (position==28) {
                    Intent intent = new Intent(view.getContext(), Desc_Mondokaki.class);
                    startActivity(intent);
                }
                if (position==29) {
                    Intent intent = new Intent(view.getContext(), Desc_Klabet.class);
                    startActivity(intent);
                }

            }
        });

        Toolbar toolbar = findViewById(R.id.back_list);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }

        });

    }
}
