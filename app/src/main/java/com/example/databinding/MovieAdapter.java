package com.example.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.databinding.databinding.MovieItemBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieItemViewHolder> {

    private MovieClickHandler movieClickHandler;
    private List<Movie> movies;

    public MovieAdapter(MovieClickHandler movieClickHandler, List<Movie> movies) {
        this.movieClickHandler = movieClickHandler;
        this.movies = movies;
    }
    @Override
    public MovieItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        MovieItemBinding binding = MovieItemBinding.inflate(inflater, parent, false);
        return new MovieItemViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(MovieItemViewHolder holder, int position) {
        holder.binding.setMovie(movies.get(position));
        holder.binding.setClick(movieClickHandler);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieItemViewHolder extends RecyclerView.ViewHolder {

        MovieItemBinding binding;

        public MovieItemViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView imageView, String v) {
        Picasso.with(imageView.getContext()).load(v).into(imageView);
    }
}

