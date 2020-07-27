package com.awslab.bookuitemplate.recyclerview;

import android.view.animation.AnimationUtils;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;

import com.awslab.bookuitemplate.R;

public class CustomItemAnimator extends DefaultItemAnimator {

    @Override
    public boolean animateRemove(RecyclerView.ViewHolder holder) {

        // now let's customize the remove item animation
        // it's the same operation that we did before
        // but we need another custom animation. let's create it ..

        holder.itemView.setAnimation(AnimationUtils.loadAnimation(
                holder.itemView.getContext(),
                R.anim.viewholder_remove_animation
        ));

        return super.animateRemove(holder);
    }

    @Override
    public boolean animateAdd(RecyclerView.ViewHolder holder) {

        // this method will be called when an new item will be added to the list
        // we will handle the add animation to the item here
        // first let's create a custom animation ...
        // now let's apply the animation to the viewholder
        holder.itemView.setAnimation(AnimationUtils.loadAnimation(
                holder.itemView.getContext(),
                R.anim.viewholder_add_anim
        ));
        return super.animateAdd(holder);
    }

    // we can also customize the duration of the add animation


    @Override
    public long getAddDuration() {

        // as you have seen the default duration is 120 ms
        // i change it to 500
        return 500;
    }


    @Override
    public long getRemoveDuration() {
        return 500;
    }
}
