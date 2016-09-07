package com.myapps.ammu.recyclerview;

import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Ammu on 07-09-2016.
 */
public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>{
    private LinkedList<String> mWordList;
    private LayoutInflater mInfater;

    public WordListAdapter(Context cx, LinkedList<String> w){
        mInfater = LayoutInflater.from(cx);
        this.mWordList=w;
    }
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInfater.inflate(R.layout.wordlist_item,parent,false);
        return new WordViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(WordListAdapter.WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);

    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
    class WordViewHolder extends RecyclerView.ViewHolder{
        public final TextView wordItemView;
        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView,WordListAdapter adapter) {
            super(itemView);
            wordItemView = (TextView) itemView.findViewById(R.id.word);
            this.mAdapter=adapter;
        }
    }
}
