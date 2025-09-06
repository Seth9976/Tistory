package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;

public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public boolean a;
    public int indeterminateAnimationType;
    public int indicatorDirection;

    public LinearProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        this(context0, attributeSet0, v, LinearProgressIndicator.DEF_STYLE_RES);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(context0, attributeSet0, v, v1);
        boolean z = false;
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context0, attributeSet0, styleable.LinearProgressIndicator, attr.linearProgressIndicatorStyle, LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = typedArray0.getInt(styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.indicatorDirection = typedArray0.getInt(styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        typedArray0.recycle();
        this.a();
        if(this.indicatorDirection == 1) {
            z = true;
        }
        this.a = z;
    }

    @Override  // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public final void a() {
        if(this.indeterminateAnimationType == 0) {
            if(this.trackCornerRadius > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if(this.indicatorColors.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}

