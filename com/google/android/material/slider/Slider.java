package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import com.google.android.material.R.attr;
import com.google.android.material.shape.MaterialShapeDrawable;

public class Slider extends BaseSlider {
    public interface OnChangeListener extends BaseOnChangeListener {
        void onValueChange(@NonNull Slider arg1, float arg2, boolean arg3);

        @Override  // com.google.android.material.slider.BaseOnChangeListener
        default void onValueChange(@NonNull Object object0, float f, boolean z) {
            this.onValueChange(((Slider)object0), f, z);
        }
    }

    public interface OnSliderTouchListener extends BaseOnSliderTouchListener {
        void onStartTrackingTouch(@NonNull Slider arg1);

        @Override  // com.google.android.material.slider.BaseOnSliderTouchListener
        default void onStartTrackingTouch(@NonNull Object object0) {
            this.onStartTrackingTouch(((Slider)object0));
        }

        void onStopTrackingTouch(@NonNull Slider arg1);

        @Override  // com.google.android.material.slider.BaseOnSliderTouchListener
        default void onStopTrackingTouch(@NonNull Object object0) {
            this.onStopTrackingTouch(((Slider)object0));
        }
    }

    public Slider(@NonNull Context context0) {
        this(context0, null);
    }

    public Slider(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.sliderStyle);
    }

    public Slider(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x1010024});
        if(typedArray0.hasValue(0)) {
            this.setValue(typedArray0.getFloat(0, 0.0f));
        }
        typedArray0.recycle();
    }

    public void addOnChangeListener(@NonNull BaseOnChangeListener baseOnChangeListener0) {
        this.l.add(baseOnChangeListener0);
    }

    public void addOnSliderTouchListener(@NonNull BaseOnSliderTouchListener baseOnSliderTouchListener0) {
        this.m.add(baseOnSliderTouchListener0);
    }

    public void clearOnChangeListeners() {
        this.l.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.m.clear();
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent0) {
        return super.dispatchHoverEvent(motionEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.slider.BaseSlider
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return "android.widget.SeekBar";
    }

    public int getActiveThumbIndex() {
        return this.M;
    }

    public int getFocusedThumbIndex() {
        return this.N;
    }

    @Dimension
    public int getHaloRadius() {
        return this.D;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.W;
    }

    public int getLabelBehavior() {
        return this.z;
    }

    public float getStepSize() {
        return this.O;
    }

    public float getThumbElevation() {
        return this.e0.getElevation();
    }

    @Dimension
    public int getThumbRadius() {
        return this.C;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.e0.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.e0.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.e0.getFillColor();
    }

    @Dimension
    public int getTickActiveRadius() {
        return this.R;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.a0;
    }

    @Dimension
    public int getTickInactiveRadius() {
        return this.S;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.b0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if(!this.b0.equals(this.a0)) {
            throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        }
        return this.a0;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.c0;
    }

    @Dimension
    public int getTrackHeight() {
        return this.A;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.d0;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.B;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if(!this.d0.equals(this.c0)) {
            throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        }
        return this.c0;
    }

    @Dimension
    public int getTrackWidth() {
        return this.T;
    }

    public float getValue() {
        return (float)(((Float)this.getValues().get(0)));
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public float getValueFrom() {
        return this.J;
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public float getValueTo() {
        return this.K;
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean hasLabelFormatter() {
        return super.hasLabelFormatter();
    }

    public boolean isTickVisible() {
        return this.Q;
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean onKeyDown(int v, @NonNull KeyEvent keyEvent0) {
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean onKeyUp(int v, @NonNull KeyEvent keyEvent0) {
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public boolean pickActiveThumb() {
        if(this.getActiveThumbIndex() != -1) {
            return true;
        }
        this.setActiveThumbIndex(0);
        return true;
    }

    public void removeOnChangeListener(@NonNull BaseOnChangeListener baseOnChangeListener0) {
        this.l.remove(baseOnChangeListener0);
    }

    public void removeOnSliderTouchListener(@NonNull BaseOnSliderTouchListener baseOnSliderTouchListener0) {
        this.m.remove(baseOnSliderTouchListener0);
    }

    public void setCustomThumbDrawable(@DrawableRes int v) {
        this.setCustomThumbDrawable(this.getResources().getDrawable(v));
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(@NonNull Drawable drawable0) {
        super.setCustomThumbDrawable(drawable0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setFocusedThumbIndex(int v) {
        super.setFocusedThumbIndex(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setHaloRadius(@Dimension @IntRange(from = 0L) int v) {
        super.setHaloRadius(v);
    }

    public void setHaloRadiusResource(@DimenRes int v) {
        this.setHaloRadius(this.getResources().getDimensionPixelSize(v));
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setHaloTintList(@NonNull ColorStateList colorStateList0) {
        super.setHaloTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setLabelBehavior(int v) {
        super.setLabelBehavior(v);
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter0) {
        this.H = labelFormatter0;
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    public void setThumbElevationResource(@DimenRes int v) {
        this.setThumbElevation(this.getResources().getDimension(v));
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbRadius(@Dimension @IntRange(from = 0L) int v) {
        super.setThumbRadius(v);
    }

    public void setThumbRadiusResource(@DimenRes int v) {
        this.setThumbRadius(this.getResources().getDimensionPixelSize(v));
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList0) {
        super.setThumbStrokeColor(colorStateList0);
    }

    public void setThumbStrokeColorResource(@ColorRes int v) {
        if(v != 0) {
            this.setThumbStrokeColor(AppCompatResources.getColorStateList(this.getContext(), v));
        }
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    public void setThumbStrokeWidthResource(@DimenRes int v) {
        if(v != 0) {
            this.setThumbStrokeWidth(this.getResources().getDimension(v));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList0) {
        MaterialShapeDrawable materialShapeDrawable0 = this.e0;
        if(!colorStateList0.equals(materialShapeDrawable0.getFillColor())) {
            materialShapeDrawable0.setFillColor(colorStateList0);
            this.invalidate();
        }
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickActiveRadius(@Dimension @IntRange(from = 0L) int v) {
        super.setTickActiveRadius(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickActiveTintList(@NonNull ColorStateList colorStateList0) {
        super.setTickActiveTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickInactiveRadius(@Dimension @IntRange(from = 0L) int v) {
        super.setTickInactiveRadius(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList0) {
        super.setTickInactiveTintList(colorStateList0);
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList0) {
        this.setTickInactiveTintList(colorStateList0);
        this.setTickActiveTintList(colorStateList0);
    }

    public void setTickVisible(boolean z) {
        if(this.Q != z) {
            this.Q = z;
            this.postInvalidate();
        }
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList0) {
        super.setTrackActiveTintList(colorStateList0);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackHeight(@Dimension @IntRange(from = 0L) int v) {
        super.setTrackHeight(v);
    }

    @Override  // com.google.android.material.slider.BaseSlider
    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList0) {
        super.setTrackInactiveTintList(colorStateList0);
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList0) {
        this.setTrackInactiveTintList(colorStateList0);
        this.setTrackActiveTintList(colorStateList0);
    }

    public void setValue(float f) {
        this.setValues(new Float[]{f});
    }

    public void setValueFrom(float f) {
        this.J = f;
        this.V = true;
        this.postInvalidate();
    }

    public void setValueTo(float f) {
        this.K = f;
        this.V = true;
        this.postInvalidate();
    }
}

