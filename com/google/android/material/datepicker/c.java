package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

public final class c {
    public final b a;
    public final b b;
    public final b c;
    public final b d;
    public final b e;
    public final b f;
    public final b g;
    public final Paint h;

    public c(Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context0, attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), styleable.MaterialCalendar);
        this.a = b.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_dayStyle, 0));
        this.g = b.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.b = b.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_daySelectedStyle, 0));
        this.c = b.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList0 = MaterialResources.getColorStateList(context0, typedArray0, styleable.MaterialCalendar_rangeFillColor);
        this.d = b.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_yearStyle, 0));
        this.e = b.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f = b.a(context0, typedArray0.getResourceId(styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint0 = new Paint();
        this.h = paint0;
        paint0.setColor(colorStateList0.getDefaultColor());
        typedArray0.recycle();
    }
}

