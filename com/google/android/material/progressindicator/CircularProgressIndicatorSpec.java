package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indicatorDirection;
    @Px
    public int indicatorInset;
    @Px
    public int indicatorSize;

    public CircularProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        this(context0, attributeSet0, v, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(context0, attributeSet0, v, v1);
        int v2 = context0.getResources().getDimensionPixelSize(dimen.mtrl_progress_circular_size_medium);
        int v3 = context0.getResources().getDimensionPixelSize(dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context0, attributeSet0, styleable.CircularProgressIndicator, v, v1, new int[0]);
        this.indicatorSize = Math.max(MaterialResources.getDimensionPixelSize(context0, typedArray0, styleable.CircularProgressIndicator_indicatorSize, v2), this.trackThickness * 2);
        this.indicatorInset = MaterialResources.getDimensionPixelSize(context0, typedArray0, styleable.CircularProgressIndicator_indicatorInset, v3);
        this.indicatorDirection = typedArray0.getInt(styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArray0.recycle();
    }

    @Override  // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public final void a() {
    }
}

