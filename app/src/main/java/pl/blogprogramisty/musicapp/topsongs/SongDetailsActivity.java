package pl.blogprogramisty.musicapp.topsongs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import pl.blogprogramisty.musicapp.R;

public class SongDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();

        return true;
    }
}
