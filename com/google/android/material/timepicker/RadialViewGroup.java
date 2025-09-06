package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class RadialViewGroup extends ConstraintLayout {
    public final j a;
    public int b;
    public final MaterialShapeDrawable c;

    public RadialViewGroup(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public RadialViewGroup(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        LayoutInflater.from(context0).inflate(layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
        this.c = materialShapeDrawable0;
        materialShapeDrawable0.setCornerSize(new RelativeCornerSize(0.5f));
        ColorStateList colorStateList0 = ColorStateList.valueOf(-1);
        this.c.setFillColor(colorStateList0);
        ViewCompat.setBackground(this, this.c);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RadialViewGroup, v, 0);
        this.b = typedArray0.getDimensionPixelSize(styleable.RadialViewGroup_materialCircleRadius, 0);
        this.a = new j(this, 0);
        typedArray0.recycle();
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(view0.getId() == -1) {
            view0.setId(ViewCompat.generateViewId());
        }
        Handler handler0 = this.getHandler();
        if(handler0 != null) {
            handler0.removeCallbacks(this.a);
            handler0.post(this.a);
        }
    }

    public void c() {
        ConstraintSet constraintSet0 = new ConstraintSet();
        constraintSet0.clone(this);
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(view0.getId() != id.circle_center && !"skip".equals(view0.getTag())) {
                Integer integer0 = (Integer)view0.getTag(id.material_clock_level);
                if(integer0 == null) {
                    integer0 = 1;
                }
                if(!hashMap0.containsKey(integer0)) {
                    hashMap0.put(integer0, new ArrayList());
                }
                ((List)hashMap0.get(integer0)).add(view0);
            }
        }
        for(Object object0: hashMap0.entrySet()) {
            List list0 = (List)((Map.Entry)object0).getValue();
            int v1 = ((int)(((Integer)((Map.Entry)object0).getKey()))) == 2 ? Math.round(((float)this.b) * 0.66f) : this.b;
            float f = 0.0f;
            for(Object object1: list0) {
                constraintSet0.constrainCircle(((View)object1).getId(), id.circle_center, v1, f);
                f += 360.0f / ((float)list0.size());
            }
        }
        constraintSet0.applyTo(this);
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public final void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        Handler handler0 = this.getHandler();
        if(handler0 != null) {
            handler0.removeCallbacks(this.a);
            handler0.post(this.a);
        }
    }

    @Override  // android.view.View
    public final void setBackgroundColor(int v) {
        ColorStateList colorStateList0 = ColorStateList.valueOf(v);
        this.c.setFillColor(colorStateList0);
    }
}

