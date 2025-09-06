package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.MaterialResources;
import java.util.Arrays;

class ClockFaceView extends RadialViewGroup implements OnRotateListener {
    public final ClockHandView d;
    public final Rect e;
    public final RectF f;
    public final Rect g;
    public final SparseArray h;
    public final c i;
    public final int[] j;
    public final float[] k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public String[] p;
    public float q;
    public final ColorStateList r;

    public ClockFaceView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.e = new Rect();
        this.f = new RectF();
        this.g = new Rect();
        this.h = new SparseArray();
        this.k = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ClockFaceView, v, style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources0 = this.getResources();
        ColorStateList colorStateList0 = MaterialResources.getColorStateList(context0, typedArray0, styleable.ClockFaceView_clockNumberTextColor);
        this.r = colorStateList0;
        LayoutInflater.from(context0).inflate(layout.material_clockface_view, this, true);
        ClockHandView clockHandView0 = (ClockHandView)this.findViewById(id.material_clock_hand);
        this.d = clockHandView0;
        this.l = resources0.getDimensionPixelSize(dimen.material_clock_hand_padding);
        int v1 = colorStateList0.getDefaultColor();
        int v2 = colorStateList0.getColorForState(new int[]{0x10100A1}, v1);
        this.j = new int[]{v2, v2, colorStateList0.getDefaultColor()};
        clockHandView0.j.add(this);
        int v3 = AppCompatResources.getColorStateList(context0, color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList1 = MaterialResources.getColorStateList(context0, typedArray0, styleable.ClockFaceView_clockFaceBackgroundColor);
        if(colorStateList1 != null) {
            v3 = colorStateList1.getDefaultColor();
        }
        this.setBackgroundColor(v3);
        this.getViewTreeObserver().addOnPreDrawListener(new b(this));
        this.setFocusable(true);
        typedArray0.recycle();
        this.i = new c(this);
        String[] arr_s = new String[12];
        Arrays.fill(arr_s, "");
        this.setValues(arr_s, 0);
        this.m = resources0.getDimensionPixelSize(dimen.material_time_picker_minimum_screen_height);
        this.n = resources0.getDimensionPixelSize(dimen.material_time_picker_minimum_screen_width);
        this.o = resources0.getDimensionPixelSize(dimen.material_clock_size);
    }

    @Override  // com.google.android.material.timepicker.RadialViewGroup
    public final void c() {
        super.c();
        for(int v = 0; true; ++v) {
            SparseArray sparseArray0 = this.h;
            if(v >= sparseArray0.size()) {
                break;
            }
            ((TextView)sparseArray0.get(v)).setVisibility(0);
        }
    }

    public final void d() {
        Rect rect0;
        RectF rectF1;
        SparseArray sparseArray0;
        RectF rectF0 = this.d.n;
        float f = 3.402823E+38f;
        TextView textView0 = null;
        for(int v = 0; true; ++v) {
            sparseArray0 = this.h;
            rectF1 = this.f;
            rect0 = this.e;
            if(v >= sparseArray0.size()) {
                break;
            }
            TextView textView1 = (TextView)sparseArray0.get(v);
            if(textView1 != null) {
                textView1.getHitRect(rect0);
                rectF1.set(rect0);
                rectF1.union(rectF0);
                float f1 = rectF1.width();
                float f2 = rectF1.height() * f1;
                if(f2 < f) {
                    textView0 = textView1;
                    f = f2;
                }
            }
        }
        for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
            TextView textView2 = (TextView)sparseArray0.get(v1);
            if(textView2 != null) {
                textView2.setSelected(textView2 == textView0);
                textView2.getHitRect(rect0);
                rectF1.set(rect0);
                textView2.getLineBounds(0, this.g);
                rectF1.inset(((float)this.g.left), ((float)this.g.top));
                RadialGradient radialGradient0 = RectF.intersects(rectF0, rectF1) ? new RadialGradient(rectF0.centerX() - rectF1.left, rectF0.centerY() - rectF1.top, 0.5f * rectF0.width(), this.j, this.k, Shader.TileMode.CLAMP) : null;
                textView2.getPaint().setShader(radialGradient0);
                textView2.invalidate();
            }
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0).setCollectionInfo(CollectionInfoCompat.obtain(1, this.p.length, false, 1));
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.d();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public final void onMeasure(int v, int v1) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        int v2 = (int)(((float)this.o) / Math.max(Math.max(((float)this.m) / ((float)displayMetrics0.heightPixels), ((float)this.n) / ((float)displayMetrics0.widthPixels)), 1.0f));
        int v3 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
        this.setMeasuredDimension(v2, v2);
        super.onMeasure(v3, v3);
    }

    @Override  // com.google.android.material.timepicker.ClockHandView$OnRotateListener
    public final void onRotate(float f, boolean z) {
        if(Math.abs(this.q - f) > 0.001f) {
            this.q = f;
            this.d();
        }
    }

    public final void setValues(String[] arr_s, int v) {
        this.p = arr_s;
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        SparseArray sparseArray0 = this.h;
        int v1 = sparseArray0.size();
        boolean z = false;
        for(int v2 = 0; v2 < Math.max(this.p.length, v1); ++v2) {
            TextView textView0 = (TextView)sparseArray0.get(v2);
            if(v2 >= this.p.length) {
                this.removeView(textView0);
                sparseArray0.remove(v2);
            }
            else {
                if(textView0 == null) {
                    textView0 = (TextView)layoutInflater0.inflate(layout.material_clockface_textview, this, false);
                    sparseArray0.put(v2, textView0);
                    this.addView(textView0);
                }
                textView0.setText(this.p[v2]);
                textView0.setTag(id.material_value_index, v2);
                int v3 = v2 / 12 + 1;
                textView0.setTag(id.material_clock_level, v3);
                if(v3 > 1) {
                    z = true;
                }
                ViewCompat.setAccessibilityDelegate(textView0, this.i);
                textView0.setTextColor(this.r);
                if(v != 0) {
                    textView0.setContentDescription(this.getResources().getString(v, new Object[]{this.p[v2]}));
                }
            }
        }
        ClockHandView clockHandView0 = this.d;
        if(clockHandView0.i && !z) {
            clockHandView0.u = 1;
        }
        clockHandView0.i = z;
        clockHandView0.invalidate();
    }
}

