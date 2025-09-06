package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class b1 {
    public final TextView a;
    public TintInfo b;
    public TintInfo c;
    public TintInfo d;
    public TintInfo e;
    public TintInfo f;
    public TintInfo g;
    public TintInfo h;
    public final k1 i;
    public int j;
    public int k;
    public Typeface l;
    public boolean m;

    public b1(TextView textView0) {
        this.j = 0;
        this.k = -1;
        this.a = textView0;
        this.i = new k1(textView0);
    }

    public final void a(Drawable drawable0, TintInfo tintInfo0) {
        if(drawable0 != null && tintInfo0 != null) {
            AppCompatDrawableManager.a(drawable0, tintInfo0, this.a.getDrawableState());
        }
    }

    public final void b() {
        TextView textView0 = this.a;
        if(this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] arr_drawable = textView0.getCompoundDrawables();
            this.a(arr_drawable[0], this.b);
            this.a(arr_drawable[1], this.c);
            this.a(arr_drawable[2], this.d);
            this.a(arr_drawable[3], this.e);
        }
        if(this.f != null || this.g != null) {
            Drawable[] arr_drawable1 = x0.a(textView0);
            this.a(arr_drawable1[0], this.f);
            this.a(arr_drawable1[2], this.g);
        }
    }

    public static TintInfo c(Context context0, AppCompatDrawableManager appCompatDrawableManager0, int v) {
        ColorStateList colorStateList0;
        synchronized(appCompatDrawableManager0) {
            colorStateList0 = appCompatDrawableManager0.a.d(context0, v);
        }
        if(colorStateList0 != null) {
            TintInfo tintInfo0 = new TintInfo();
            tintInfo0.mHasTintList = true;
            tintInfo0.mTintList = colorStateList0;
            return tintInfo0;
        }
        return null;
    }

    public final ColorStateList d() {
        return this.h == null ? null : this.h.mTintList;
    }

    public final PorterDuff.Mode e() {
        return this.h == null ? null : this.h.mTintMode;
    }

    public final void f(AttributeSet attributeSet0, int v) {
        String s1;
        String s;
        boolean z1;
        boolean z;
        TextView textView0 = this.a;
        Context context0 = textView0.getContext();
        AppCompatDrawableManager appCompatDrawableManager0 = AppCompatDrawableManager.get();
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.AppCompatTextHelper, v, 0);
        ViewCompat.saveAttributeDataForStyleable(textView0, textView0.getContext(), styleable.AppCompatTextHelper, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        int v1 = tintTypedArray0.getResourceId(styleable.AppCompatTextHelper_android_textAppearance, -1);
        if(tintTypedArray0.hasValue(styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.b = b1.c(context0, appCompatDrawableManager0, tintTypedArray0.getResourceId(styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if(tintTypedArray0.hasValue(styleable.AppCompatTextHelper_android_drawableTop)) {
            this.c = b1.c(context0, appCompatDrawableManager0, tintTypedArray0.getResourceId(styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if(tintTypedArray0.hasValue(styleable.AppCompatTextHelper_android_drawableRight)) {
            this.d = b1.c(context0, appCompatDrawableManager0, tintTypedArray0.getResourceId(styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if(tintTypedArray0.hasValue(styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.e = b1.c(context0, appCompatDrawableManager0, tintTypedArray0.getResourceId(styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        int v2 = Build.VERSION.SDK_INT;
        if(tintTypedArray0.hasValue(styleable.AppCompatTextHelper_android_drawableStart)) {
            this.f = b1.c(context0, appCompatDrawableManager0, tintTypedArray0.getResourceId(styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if(tintTypedArray0.hasValue(styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.g = b1.c(context0, appCompatDrawableManager0, tintTypedArray0.getResourceId(styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        tintTypedArray0.recycle();
        TransformationMethod transformationMethod0 = textView0.getTransformationMethod();
        if(v1 == -1) {
            z = false;
            z1 = false;
            s = null;
            s1 = null;
        }
        else {
            TintTypedArray tintTypedArray1 = TintTypedArray.obtainStyledAttributes(context0, v1, styleable.TextAppearance);
            if(transformationMethod0 instanceof PasswordTransformationMethod || !tintTypedArray1.hasValue(styleable.TextAppearance_textAllCaps)) {
                z = false;
                z1 = false;
            }
            else {
                z = tintTypedArray1.getBoolean(styleable.TextAppearance_textAllCaps, false);
                z1 = true;
            }
            this.m(context0, tintTypedArray1);
            s = tintTypedArray1.hasValue(styleable.TextAppearance_textLocale) ? tintTypedArray1.getString(styleable.TextAppearance_textLocale) : null;
            s1 = tintTypedArray1.hasValue(styleable.TextAppearance_fontVariationSettings) ? tintTypedArray1.getString(styleable.TextAppearance_fontVariationSettings) : null;
            tintTypedArray1.recycle();
        }
        TintTypedArray tintTypedArray2 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.TextAppearance, v, 0);
        if(!(transformationMethod0 instanceof PasswordTransformationMethod) && tintTypedArray2.hasValue(styleable.TextAppearance_textAllCaps)) {
            z = tintTypedArray2.getBoolean(styleable.TextAppearance_textAllCaps, false);
            z1 = true;
        }
        if(tintTypedArray2.hasValue(styleable.TextAppearance_textLocale)) {
            s = tintTypedArray2.getString(styleable.TextAppearance_textLocale);
        }
        if(tintTypedArray2.hasValue(styleable.TextAppearance_fontVariationSettings)) {
            s1 = tintTypedArray2.getString(styleable.TextAppearance_fontVariationSettings);
        }
        if(v2 >= 28 && tintTypedArray2.hasValue(styleable.TextAppearance_android_textSize) && tintTypedArray2.getDimensionPixelSize(styleable.TextAppearance_android_textSize, -1) == 0) {
            textView0.setTextSize(0, 0.0f);
        }
        this.m(context0, tintTypedArray2);
        tintTypedArray2.recycle();
        if(!(transformationMethod0 instanceof PasswordTransformationMethod) && z1) {
            textView0.setAllCaps(z);
        }
        Typeface typeface0 = this.l;
        if(typeface0 != null) {
            if(this.k == -1) {
                textView0.setTypeface(typeface0, this.j);
            }
            else {
                textView0.setTypeface(typeface0);
            }
        }
        if(s1 != null) {
            z0.d(textView0, s1);
        }
        if(s != null) {
            y0.b(textView0, y0.a(s));
        }
        k1 k10 = this.i;
        TypedArray typedArray0 = k10.j.obtainStyledAttributes(attributeSet0, styleable.AppCompatTextView, v, 0);
        Context context1 = k10.i.getContext();
        Context context2 = k10.j;
        ViewCompat.saveAttributeDataForStyleable(k10.i, context1, styleable.AppCompatTextView, attributeSet0, typedArray0, v, 0);
        if(typedArray0.hasValue(styleable.AppCompatTextView_autoSizeTextType)) {
            k10.a = typedArray0.getInt(styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float f = typedArray0.hasValue(styleable.AppCompatTextView_autoSizeStepGranularity) ? typedArray0.getDimension(styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float f1 = typedArray0.hasValue(styleable.AppCompatTextView_autoSizeMinTextSize) ? typedArray0.getDimension(styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float f2 = typedArray0.hasValue(styleable.AppCompatTextView_autoSizeMaxTextSize) ? typedArray0.getDimension(styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if(typedArray0.hasValue(styleable.AppCompatTextView_autoSizePresetSizes)) {
            int v3 = typedArray0.getResourceId(styleable.AppCompatTextView_autoSizePresetSizes, 0);
            if(v3 > 0) {
                TypedArray typedArray1 = typedArray0.getResources().obtainTypedArray(v3);
                int v4 = typedArray1.length();
                int[] arr_v = new int[v4];
                if(v4 > 0) {
                    for(int v5 = 0; v5 < v4; ++v5) {
                        arr_v[v5] = typedArray1.getDimensionPixelSize(v5, -1);
                    }
                    k10.f = k1.b(arr_v);
                    k10.i();
                }
                typedArray1.recycle();
            }
        }
        typedArray0.recycle();
        if(!k10.j()) {
            k10.a = 0;
        }
        else if(k10.a == 1) {
            if(!k10.g) {
                DisplayMetrics displayMetrics0 = context2.getResources().getDisplayMetrics();
                if(f1 == -1.0f) {
                    f1 = TypedValue.applyDimension(2, 12.0f, displayMetrics0);
                }
                if(f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 112.0f, displayMetrics0);
                }
                if(f == -1.0f) {
                    f = 1.0f;
                }
                k10.k(f1, f2, f);
            }
            k10.h();
        }
        if(ViewUtils.b && k10.a != 0) {
            int[] arr_v1 = k10.f;
            if(arr_v1.length > 0) {
                if(((float)z0.a(textView0)) == -1.0f) {
                    z0.c(textView0, arr_v1, 0);
                }
                else {
                    z0.b(textView0, Math.round(k10.d), Math.round(k10.e), Math.round(k10.c), 0);
                }
            }
        }
        TintTypedArray tintTypedArray3 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.AppCompatTextView);
        int v6 = tintTypedArray3.getResourceId(styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawable0 = v6 == -1 ? null : appCompatDrawableManager0.getDrawable(context0, v6);
        int v7 = tintTypedArray3.getResourceId(styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawable1 = v7 == -1 ? null : appCompatDrawableManager0.getDrawable(context0, v7);
        int v8 = tintTypedArray3.getResourceId(styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawable2 = v8 == -1 ? null : appCompatDrawableManager0.getDrawable(context0, v8);
        int v9 = tintTypedArray3.getResourceId(styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawable3 = v9 == -1 ? null : appCompatDrawableManager0.getDrawable(context0, v9);
        int v10 = tintTypedArray3.getResourceId(styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawable4 = v10 == -1 ? null : appCompatDrawableManager0.getDrawable(context0, v10);
        int v11 = tintTypedArray3.getResourceId(styleable.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawable5 = v11 == -1 ? null : appCompatDrawableManager0.getDrawable(context0, v11);
        if(drawable4 != null || drawable5 != null) {
            Drawable[] arr_drawable2 = x0.a(textView0);
            if(drawable4 == null) {
                drawable4 = arr_drawable2[0];
            }
            if(drawable1 == null) {
                drawable1 = arr_drawable2[1];
            }
            if(drawable5 == null) {
                drawable5 = arr_drawable2[2];
            }
            if(drawable3 == null) {
                drawable3 = arr_drawable2[3];
            }
            x0.b(textView0, drawable4, drawable1, drawable5, drawable3);
        }
        else if(drawable0 != null || drawable1 != null || drawable2 != null || drawable3 != null) {
            Drawable[] arr_drawable = x0.a(textView0);
            Drawable drawable6 = arr_drawable[0];
            if(drawable6 != null || arr_drawable[2] != null) {
                if(drawable1 == null) {
                    drawable1 = arr_drawable[1];
                }
                Drawable drawable7 = arr_drawable[2];
                if(drawable3 == null) {
                    drawable3 = arr_drawable[3];
                }
                x0.b(textView0, drawable6, drawable1, drawable7, drawable3);
            }
            else {
                Drawable[] arr_drawable1 = textView0.getCompoundDrawables();
                if(drawable0 == null) {
                    drawable0 = arr_drawable1[0];
                }
                if(drawable1 == null) {
                    drawable1 = arr_drawable1[1];
                }
                if(drawable2 == null) {
                    drawable2 = arr_drawable1[2];
                }
                if(drawable3 == null) {
                    drawable3 = arr_drawable1[3];
                }
                textView0.setCompoundDrawablesWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
            }
        }
        if(tintTypedArray3.hasValue(styleable.AppCompatTextView_drawableTint)) {
            TextViewCompat.setCompoundDrawableTintList(textView0, tintTypedArray3.getColorStateList(styleable.AppCompatTextView_drawableTint));
        }
        if(tintTypedArray3.hasValue(styleable.AppCompatTextView_drawableTintMode)) {
            TextViewCompat.setCompoundDrawableTintMode(textView0, DrawableUtils.parseTintMode(tintTypedArray3.getInt(styleable.AppCompatTextView_drawableTintMode, -1), null));
        }
        int v12 = tintTypedArray3.getDimensionPixelSize(styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int v13 = tintTypedArray3.getDimensionPixelSize(styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int v14 = tintTypedArray3.getDimensionPixelSize(styleable.AppCompatTextView_lineHeight, -1);
        tintTypedArray3.recycle();
        if(v12 != -1) {
            TextViewCompat.setFirstBaselineToTopHeight(textView0, v12);
        }
        if(v13 != -1) {
            TextViewCompat.setLastBaselineToBottomHeight(textView0, v13);
        }
        if(v14 != -1) {
            TextViewCompat.setLineHeight(textView0, v14);
        }
    }

    public final void g(Context context0, int v) {
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, v, styleable.TextAppearance);
        boolean z = tintTypedArray0.hasValue(styleable.TextAppearance_textAllCaps);
        TextView textView0 = this.a;
        if(z) {
            textView0.setAllCaps(tintTypedArray0.getBoolean(styleable.TextAppearance_textAllCaps, false));
        }
        if(tintTypedArray0.hasValue(styleable.TextAppearance_android_textSize) && tintTypedArray0.getDimensionPixelSize(styleable.TextAppearance_android_textSize, -1) == 0) {
            textView0.setTextSize(0, 0.0f);
        }
        this.m(context0, tintTypedArray0);
        if(tintTypedArray0.hasValue(styleable.TextAppearance_fontVariationSettings)) {
            String s = tintTypedArray0.getString(styleable.TextAppearance_fontVariationSettings);
            if(s != null) {
                z0.d(textView0, s);
            }
        }
        tintTypedArray0.recycle();
        Typeface typeface0 = this.l;
        if(typeface0 != null) {
            textView0.setTypeface(typeface0, this.j);
        }
    }

    public final void h(int v, int v1, int v2, int v3) {
        k1 k10 = this.i;
        if(k10.j()) {
            DisplayMetrics displayMetrics0 = k10.j.getResources().getDisplayMetrics();
            k10.k(TypedValue.applyDimension(v3, ((float)v), displayMetrics0), TypedValue.applyDimension(v3, ((float)v1), displayMetrics0), TypedValue.applyDimension(v3, ((float)v2), displayMetrics0));
            if(k10.h()) {
                k10.a();
            }
        }
    }

    public final void i(int[] arr_v, int v) {
        k1 k10 = this.i;
        if(k10.j()) {
            if(arr_v.length > 0) {
                int[] arr_v1 = new int[arr_v.length];
                if(v == 0) {
                    arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
                }
                else {
                    DisplayMetrics displayMetrics0 = k10.j.getResources().getDisplayMetrics();
                    for(int v1 = 0; v1 < arr_v.length; ++v1) {
                        arr_v1[v1] = Math.round(TypedValue.applyDimension(v, ((float)arr_v[v1]), displayMetrics0));
                    }
                }
                k10.f = k1.b(arr_v1);
                if(!k10.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(arr_v));
                }
            }
            else {
                k10.g = false;
            }
            if(k10.h()) {
                k10.a();
            }
        }
    }

    public final void j(int v) {
        k1 k10 = this.i;
        if(k10.j()) {
            switch(v) {
                case 0: {
                    k10.a = 0;
                    k10.d = -1.0f;
                    k10.e = -1.0f;
                    k10.c = -1.0f;
                    k10.f = new int[0];
                    k10.b = false;
                    return;
                }
                case 1: {
                    DisplayMetrics displayMetrics0 = k10.j.getResources().getDisplayMetrics();
                    k10.k(TypedValue.applyDimension(2, 12.0f, displayMetrics0), TypedValue.applyDimension(2, 112.0f, displayMetrics0), 1.0f);
                    if(k10.h()) {
                        k10.a();
                        return;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown auto-size text type: " + v);
                }
            }
        }
    }

    public final void k(ColorStateList colorStateList0) {
        if(this.h == null) {
            this.h = new TintInfo();
        }
        this.h.mTintList = colorStateList0;
        this.h.mHasTintList = colorStateList0 != null;
        this.b = this.h;
        this.c = this.h;
        this.d = this.h;
        this.e = this.h;
        this.f = this.h;
        this.g = this.h;
    }

    public final void l(PorterDuff.Mode porterDuff$Mode0) {
        if(this.h == null) {
            this.h = new TintInfo();
        }
        this.h.mTintMode = porterDuff$Mode0;
        this.h.mHasTintMode = porterDuff$Mode0 != null;
        this.b = this.h;
        this.c = this.h;
        this.d = this.h;
        this.e = this.h;
        this.f = this.h;
        this.g = this.h;
    }

    public final void m(Context context0, TintTypedArray tintTypedArray0) {
        this.j = tintTypedArray0.getInt(styleable.TextAppearance_android_textStyle, this.j);
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            int v1 = tintTypedArray0.getInt(styleable.TextAppearance_android_textFontWeight, -1);
            this.k = v1;
            if(v1 != -1) {
                this.j &= 2;
            }
        }
        boolean z = true;
        if(!tintTypedArray0.hasValue(styleable.TextAppearance_android_fontFamily) && !tintTypedArray0.hasValue(styleable.TextAppearance_fontFamily)) {
            if(tintTypedArray0.hasValue(styleable.TextAppearance_android_typeface)) {
                this.m = false;
                int v2 = tintTypedArray0.getInt(styleable.TextAppearance_android_typeface, 1);
                switch(v2) {
                    case 1: {
                        this.l = Typeface.SANS_SERIF;
                        break;
                    }
                    case 2: {
                        this.l = Typeface.SERIF;
                        return;
                    label_16:
                        if(v2 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        break;
                    }
                    default: {
                        goto label_16;
                    }
                }
            }
            return;
        }
        this.l = null;
        int v3 = tintTypedArray0.hasValue(styleable.TextAppearance_fontFamily) ? styleable.TextAppearance_fontFamily : styleable.TextAppearance_android_fontFamily;
        int v4 = this.k;
        int v5 = this.j;
        if(!context0.isRestricted()) {
            v0 v00 = new v0(this, v4, v5, new WeakReference(this.a));
            try {
                Typeface typeface0 = tintTypedArray0.getFont(v3, this.j, v00);
                if(typeface0 != null) {
                    this.l = v < 28 || this.k == -1 ? typeface0 : a1.a(Typeface.create(typeface0, 0), this.k, (this.j & 2) != 0);
                }
                this.m = this.l == null;
            }
            catch(UnsupportedOperationException | Resources.NotFoundException unused_ex) {
            }
        }
        if(this.l == null) {
            String s = tintTypedArray0.getString(v3);
            if(s != null) {
                if(Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                    Typeface typeface1 = Typeface.create(s, 0);
                    int v6 = this.k;
                    if((this.j & 2) == 0) {
                        z = false;
                    }
                    this.l = a1.a(typeface1, v6, z);
                    return;
                }
                this.l = Typeface.create(s, this.j);
            }
        }
    }
}

