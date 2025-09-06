package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;

public final class b extends Drawable.ConstantState {
    public final e a;

    public b(e e0) {
        this.a = e0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        return new GifDrawable(this);
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        return new GifDrawable(this);
    }
}

