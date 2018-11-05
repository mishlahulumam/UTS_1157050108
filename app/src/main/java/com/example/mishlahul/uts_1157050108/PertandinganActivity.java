package com.example.mishlahul.uts_1157050108;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import com.example.mishlahul.uts_1157050108.R;
import com.example.mishlahul.uts_1157050108.PertandinganAdapter;
import com.example.mishlahul.uts_1157050108.PertandinganModel;
import butterknife.BindView;
import butterknife.ButterKnife;

public class PertandinganActivity extends AppCompatActivity {

    @BindView(R.id.rv_pertandingan)
    RecyclerView mRecyclerView;
    PertandinganAdapter mAdapter;
    ArrayList<PertandinganModel> listMatch = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertandingan);
        ButterKnife.bind(this);

        Toolbar toolbar = findViewById(R.id.toolbar); //Inisialisasi dan Implementasi id Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("List Pertandingan");

        listMatch.add(new PertandinganModel("Persib", "Persija", "1", "0", "Pertandingan ini Dilaksanakan di stadion Bandung lautan API", R.drawable.persib, R.drawable.persija, "https://www.liputan6.com/tag/persib-vs-persija"));
        listMatch.add(new PertandinganModel("Arema", "Psms", "4", "3", "Pertandingan ini Dilaksanakan di Stadion Kanjuruhan Arema Malang", R.drawable.arema, R.drawable.psms, "https://bola.kompas.com/read/2018/10/28/17365138/hasil-arema-fc-vs-psms-singo-edan-pesta-gol-mitra-kukar-atasi-psis"));
        listMatch.add(new PertandinganModel("Persib", "Psms", "0", "1", "Pertandingan ini Dilaksanakan di stadion Sijalak Harupat", R.drawable.persib, R.drawable.psms, "http://www.pikiran-rakyat.com/persib/2018/11/02/dijadwal-ulang-persib-bandung-vs-psms-medan-maju-dua-hari-432590"));
        listMatch.add(new PertandinganModel("Persija", "Sriwijaya", "2", "1", "Pertandingan ini Dilaksanakan di stadion Glora Bungkarno", R.drawable.persija, R.drawable.sriwijaya, "https://www.liputan6.com/tag/persija-vs-sriwijaya-fc"));
        listMatch.add(new PertandinganModel("Sriwijaya", "Arema", "3", "3", "Pertandingan ini Dilaksanakan di stadion Glora Sriwijaya", R.drawable.sriwijaya, R.drawable.arema, "https://www.bola.com/indonesia/read/3596062/arema-fc-bantai-sriwijaya-fc/page-1"));

        mRecyclerView = findViewById(R.id.rv_pertandingan);
        mAdapter = new PertandinganAdapter(PertandinganActivity.this, listMatch);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
