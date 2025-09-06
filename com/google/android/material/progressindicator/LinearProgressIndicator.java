package com.google.android.material.progressindicator;

import a8.n;
import a8.p;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearProgressIndicator extends BaseProgressIndicator {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndeterminateAnimationType {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public static final int DEF_STYLE_RES = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    static {
        LinearProgressIndicator.DEF_STYLE_RES = style.Widget_MaterialComponents_LinearProgressIndicator;
    }

    public LinearProgressIndicator(@NonNull Context context0) {
        this(context0, null);
    }

    public LinearProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v, LinearProgressIndicator.DEF_STYLE_RES);
        this.setIndeterminateDrawable(IndeterminateDrawable.createLinearDrawable(this.getContext(), ((LinearProgressIndicatorSpec)this.a)));
        this.setProgressDrawable(DeterminateDrawable.createLinearDrawable(this.getContext(), ((LinearProgressIndicatorSpec)this.a)));
    }

    @Override  // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec a(Context context0, AttributeSet attributeSet0) {
        return new LinearProgressIndicatorSpec(context0, attributeSet0);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec)this.a).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec)this.a).indicatorDirection;
    }

    @Override  // android.view.View
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        ((LinearProgressIndicatorSpec)this.a).a = ((LinearProgressIndicatorSpec)this.a).indicatorDirection == 1 || ViewCompat.getLayoutDirection(this) == 1 && ((LinearProgressIndicatorSpec)this.a).indicatorDirection == 2 || ViewCompat.getLayoutDirection(this) == 0 && ((LinearProgressIndicatorSpec)this.a).indicatorDirection == 3;
    }

    @Override  // android.widget.ProgressBar
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        int v4 = this.getPaddingLeft();
        int v5 = v - (this.getPaddingRight() + v4);
        int v6 = this.getPaddingTop();
        int v7 = v1 - (this.getPaddingBottom() + v6);
        IndeterminateDrawable indeterminateDrawable0 = this.getIndeterminateDrawable();
        if(indeterminateDrawable0 != null) {
            indeterminateDrawable0.setBounds(0, 0, v5, v7);
        }
        DeterminateDrawable determinateDrawable0 = this.getProgressDrawable();
        if(determinateDrawable0 != null) {
            determinateDrawable0.setBounds(0, 0, v5, v7);
        }
    }

    public void setIndeterminateAnimationType(int v) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec0 = this.a;
        if(((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).indeterminateAnimationType == v) {
            return;
        }
        if(this.b() && this.isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).indeterminateAnimationType = v;
        ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).a();
        if(v == 0) {
            IndeterminateDrawable indeterminateDrawable0 = this.getIndeterminateDrawable();
            n n0 = new n(((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0));
            indeterminateDrawable0.m = n0;
            n0.a = indeterminateDrawable0;
        }
        else {
            IndeterminateDrawable indeterminateDrawable1 = this.getIndeterminateDrawable();
            p p0 = new p(this.getContext(), ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0));
            indeterminateDrawable1.m = p0;
            p0.a = indeterminateDrawable1;
        }
        this.invalidate();
    }

    @Override  // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int[] arr_v) {
        super.setIndicatorColor(arr_v);
        ((LinearProgressIndicatorSpec)this.a).a();
    }

    public void setIndicatorDirection(int v) {
        ((LinearProgressIndicatorSpec)this.a).indicatorDirection = v;
        ((LinearProgressIndicatorSpec)this.a).a = v == 1 || ViewCompat.getLayoutDirection(this) == 1 && ((LinearProgressIndicatorSpec)this.a).indicatorDirection == 2 || ViewCompat.getLayoutDirection(this) == 0 && v == 3;
        this.invalidate();
    }

    @Override  // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int v, boolean z) {
        if(this.a != null && ((LinearProgressIndicatorSpec)this.a).indeterminateAnimationType == 0 && this.isIndeterminate()) {
            return;
        }
        super.setProgressCompat(v, z);
    }

    @Override  // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int v) {
        super.setTrackCornerRadius(v);
        ((LinearProgressIndicatorSpec)this.a).a();
        this.invalidate();
    }
}

