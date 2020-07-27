package com.awslab.bookuitemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;

import com.awslab.bookuitemplate.model.Book;
import com.bumptech.glide.Glide;

public class BookDetailsActivity extends AppCompatActivity {

    ImageView imgbook;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        //ini view
        imgbook = findViewById(R.id.item_book_img);
        ratingBar = findViewById(R.id.item_book_ratingbar);

        // we need to get book item object

        Book item = (Book) getIntent().getExtras().getSerializable("bookObject");

        loadBookData(item);


    }

    private void loadBookData(Book item) {

        // bind book data here for now i will only load the book cover image

        Glide.with(this).load(item.getDrawableResource()).into(imgbook);

    }
}