package pl.blogprogramisty.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import pl.blogprogramisty.musicapp.favorites.FavoritesActivity;
import pl.blogprogramisty.musicapp.searchalbum.SearchAlbumActivity;
import pl.blogprogramisty.musicapp.topsongs.TopSongsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bTopSongs = findViewById(R.id.bTopSongs);
        Button bFavorites = findViewById(R.id.bFavorites);
        Button bSearchAlbum = findViewById(R.id.bSearchAlbum);

        bTopSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TopSongsActivity.class);
                startActivity(intent);
            }
        });

        bFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(intent);
            }
        });

        bSearchAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchAlbumActivity.class);
                startActivity(intent);
            }
        });
    }
}
