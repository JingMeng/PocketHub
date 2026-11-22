package com.github.pockethub.android.ui.item;

import androidx.annotation.NonNull;
import android.view.View;

import com.xwray.groupie.ViewHolder;

import butterknife.ButterKnife;

public class BaseViewHolder extends ViewHolder {

    public BaseViewHolder(@NonNull View rootView) {
        super(rootView);
        ButterKnife.bind(this, rootView);
    }
}

