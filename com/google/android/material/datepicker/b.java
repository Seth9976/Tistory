package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

public final class b {
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final ShapeAppearanceModel f;

    public b(ColorStateList colorStateList0, ColorStateList colorStateList1, ColorStateList colorStateList2, int v, ShapeAppearanceModel shapeAppearanceModel0, Rect rect0) {
        Preconditions.checkArgumentNonnegative(rect0.left);
        Preconditions.checkArgumentNonnegative(rect0.top);
        Preconditions.checkArgumentNonnegative(rect0.right);
        Preconditions.checkArgumentNonnegative(rect0.bottom);
        this.a = rect0;
        this.b = colorStateList1;
        this.c = colorStateList0;
        this.d = colorStateList2;
        this.e = v;
        this.f = shapeAppearanceModel0;
    }

    public static b a(Context context0, int v) {
        Preconditions.checkArgument(v != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, styleable.MaterialCalendarItem);
        Rect rect0 = new Rect(typedArray0.getDimensionPixelOffset(styleable.MaterialCalendarItem_android_insetLeft, 0), typedArray0.getDimensionPixelOffset(styleable.MaterialCalendarItem_android_insetTop, 0), typedArray0.getDimensionPixelOffset(styleable.MaterialCalendarItem_android_insetRight, 0), typedArray0.getDimensionPixelOffset(styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList0 = MaterialResources.getColorStateList(context0, typedArray0, styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList1 = MaterialResources.getColorStateList(context0, typedArray0, styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context0, typedArray0, styleable.MaterialCalendarItem_itemStrokeColor);
        int v1 = typedArray0.getDimensionPixelSize(styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.builder(context0, typedArray0.getResourceId(styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArray0.getResourceId(styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
        typedArray0.recycle();
        return new b(colorStateList0, colorStateList1, colorStateList2, v1, shapeAppearanceModel0, rect0);
    }

    public final void b(TextView textView0, ColorStateList colorStateList0, ColorStateList colorStateList1) {
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable1 = new MaterialShapeDrawable();
        materialShapeDrawable0.setShapeAppearanceModel(this.f);
        materialShapeDrawable1.setShapeAppearanceModel(this.f);
        if(colorStateList0 == null) {
            colorStateList0 = this.c;
        }
        materialShapeDrawable0.setFillColor(colorStateList0);
        materialShapeDrawable0.setStroke(((float)this.e), this.d);
        ColorStateList colorStateList2 = this.b;
        if(colorStateList1 == null) {
            colorStateList1 = colorStateList2;
        }
        textView0.setTextColor(colorStateList1);
        ViewCompat.setBackground(textView0, new InsetDrawable(new RippleDrawable(colorStateList2.withAlpha(30), materialShapeDrawable0, materialShapeDrawable1), this.a.left, this.a.top, this.a.right, this.a.bottom));
    }
}

