package pl.blogprogramisty.musicapp.searchalbum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import pl.blogprogramisty.musicapp.R;

public class SearchAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_album);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();

        return true;
    }
}
