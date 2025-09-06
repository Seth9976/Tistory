package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressIndicator extends BaseProgressIndicator {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public static final int DEF_STYLE_RES = 0;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    static {
        CircularProgressIndicator.DEF_STYLE_RES = style.Widget_MaterialComponents_CircularProgressIndicator;
    }

    public CircularProgressIndicator(@NonNull Context context0) {
        this(context0, null);
    }

    public CircularProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v, CircularProgressIndicator.DEF_STYLE_RES);
        this.setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(this.getContext(), ((CircularProgressIndicatorSpec)this.a)));
        this.setProgressDrawable(DeterminateDrawable.createCircularDrawable(this.getContext(), ((CircularProgressIndicatorSpec)this.a)));
    }

    @Override  // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec a(Context context0, AttributeSet attributeSet0) {
        return new CircularProgressIndicatorSpec(context0, attributeSet0);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec)this.a).indicatorDirection;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec)this.a).indicatorInset;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec)this.a).indicatorSize;
    }

    public void setIndicatorDirection(int v) {
        ((CircularProgressIndicatorSpec)this.a).indicatorDirection = v;
        this.invalidate();
    }

    public void setIndicatorInset(@Px int v) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec0 = this.a;
        if(((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).indicatorInset != v) {
            ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).indicatorInset = v;
            this.invalidate();
        }
    }

    public void setIndicatorSize(@Px int v) {
        int v1 = Math.max(v, this.getTrackThickness() * 2);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec0 = this.a;
        if(((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).indicatorSize != v1) {
            ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).indicatorSize = v1;
            ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).getClass();
            this.invalidate();
        }
    }

    @Override  // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int v) {
        super.setTrackThickness(v);
        ((CircularProgressIndicatorSpec)this.a).getClass();
    }
}

