package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class TintTypedArray {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public TintTypedArray(Context context0, TypedArray typedArray0) {
        this.a = context0;
        this.b = typedArray0;
    }

    public boolean getBoolean(int v, boolean z) {
        return this.b.getBoolean(v, z);
    }

    @RequiresApi(21)
    public int getChangingConfigurations() {
        return f3.a(this.b);
    }

    public int getColor(int v, int v1) {
        return this.b.getColor(v, v1);
    }

    public ColorStateList getColorStateList(int v) {
        TypedArray typedArray0 = this.b;
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = AppCompatResources.getColorStateList(this.a, v1);
                return colorStateList0 == null ? typedArray0.getColorStateList(v) : colorStateList0;
            }
        }
        return typedArray0.getColorStateList(v);
    }

    public float getDimension(int v, float f) {
        return this.b.getDimension(v, f);
    }

    public int getDimensionPixelOffset(int v, int v1) {
        return this.b.getDimensionPixelOffset(v, v1);
    }

    public int getDimensionPixelSize(int v, int v1) {
        return this.b.getDimensionPixelSize(v, v1);
    }

    public Drawable getDrawable(int v) {
        TypedArray typedArray0 = this.b;
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? typedArray0.getDrawable(v) : AppCompatResources.getDrawable(this.a, v1);
        }
        return typedArray0.getDrawable(v);
    }

    public Drawable getDrawableIfKnown(int v) {
        if(this.b.hasValue(v)) {
            int v1 = this.b.getResourceId(v, 0);
            if(v1 != 0) {
                AppCompatDrawableManager appCompatDrawableManager0 = AppCompatDrawableManager.get();
                synchronized(appCompatDrawableManager0) {
                    return appCompatDrawableManager0.a.c(this.a, v1, true);
                }
            }
        }
        return null;
    }

    public float getFloat(int v, float f) {
        return this.b.getFloat(v, f);
    }

    @Nullable
    public Typeface getFont(@StyleableRes int v, int v1, @Nullable FontCallback resourcesCompat$FontCallback0) {
        int v2 = this.b.getResourceId(v, 0);
        if(v2 == 0) {
            return null;
        }
        if(this.c == null) {
            this.c = new TypedValue();
        }
        return ResourcesCompat.getFont(this.a, v2, this.c, v1, resourcesCompat$FontCallback0);
    }

    public float getFraction(int v, int v1, int v2, float f) {
        return this.b.getFraction(v, v1, v2, f);
    }

    public int getIndex(int v) {
        return this.b.getIndex(v);
    }

    public int getIndexCount() {
        return this.b.getIndexCount();
    }

    public int getInt(int v, int v1) {
        return this.b.getInt(v, v1);
    }

    public int getInteger(int v, int v1) {
        return this.b.getInteger(v, v1);
    }

    public int getLayoutDimension(int v, int v1) {
        return this.b.getLayoutDimension(v, v1);
    }

    public int getLayoutDimension(int v, String s) {
        return this.b.getLayoutDimension(v, s);
    }

    public String getNonResourceString(int v) {
        return this.b.getNonResourceString(v);
    }

    public String getPositionDescription() {
        return this.b.getPositionDescription();
    }

    public int getResourceId(int v, int v1) {
        return this.b.getResourceId(v, v1);
    }

    public Resources getResources() {
        return this.b.getResources();
    }

    public String getString(int v) {
        return this.b.getString(v);
    }

    public CharSequence getText(int v) {
        return this.b.getText(v);
    }

    public CharSequence[] getTextArray(int v) {
        return this.b.getTextArray(v);
    }

    public int getType(int v) {
        return f3.b(this.b, v);
    }

    public boolean getValue(int v, TypedValue typedValue0) {
        return this.b.getValue(v, typedValue0);
    }

    public TypedArray getWrappedTypeArray() {
        return this.b;
    }

    public boolean hasValue(int v) {
        return this.b.hasValue(v);
    }

    public int length() {
        return this.b.length();
    }

    public static TintTypedArray obtainStyledAttributes(Context context0, int v, int[] arr_v) {
        return new TintTypedArray(context0, context0.obtainStyledAttributes(v, arr_v));
    }

    public static TintTypedArray obtainStyledAttributes(Context context0, AttributeSet attributeSet0, int[] arr_v) {
        return new TintTypedArray(context0, context0.obtainStyledAttributes(attributeSet0, arr_v));
    }

    public static TintTypedArray obtainStyledAttributes(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1) {
        return new TintTypedArray(context0, context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1));
    }

    public TypedValue peekValue(int v) {
        return this.b.peekValue(v);
    }

    public void recycle() {
        this.b.recycle();
    }
}

