package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import b8.a;
import b8.b;
import com.google.android.material.R.styleable;

@RestrictTo({Scope.LIBRARY_GROUP})
public class TextAppearance {
    public ColorStateList a;
    public float b;
    public final int c;
    public boolean d;
    public Typeface e;
    @Nullable
    public final String fontFamily;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    @Nullable
    public final ColorStateList textColorHint;
    @Nullable
    public final ColorStateList textColorLink;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(@NonNull Context context0, @StyleRes int v) {
        this.d = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, styleable.TextAppearance);
        this.setTextSize(typedArray0.getDimension(styleable.TextAppearance_android_textSize, 0.0f));
        this.setTextColor(MaterialResources.getColorStateList(context0, typedArray0, styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context0, typedArray0, styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context0, typedArray0, styleable.TextAppearance_android_textColorLink);
        this.textStyle = typedArray0.getInt(styleable.TextAppearance_android_textStyle, 0);
        this.typeface = typedArray0.getInt(styleable.TextAppearance_android_typeface, 1);
        int v1 = styleable.TextAppearance_fontFamily;
        int v2 = styleable.TextAppearance_android_fontFamily;
        if(!typedArray0.hasValue(v1)) {
            v1 = v2;
        }
        this.c = typedArray0.getResourceId(v1, 0);
        this.fontFamily = typedArray0.getString(v1);
        this.textAllCaps = typedArray0.getBoolean(styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context0, typedArray0, styleable.TextAppearance_android_shadowColor);
        this.shadowDx = typedArray0.getFloat(styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = typedArray0.getFloat(styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = typedArray0.getFloat(styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(v, styleable.MaterialTextAppearance);
        this.hasLetterSpacing = typedArray1.hasValue(styleable.MaterialTextAppearance_android_letterSpacing);
        this.letterSpacing = typedArray1.getFloat(styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArray1.recycle();
    }

    public final void a() {
        if(this.e == null) {
            String s = this.fontFamily;
            if(s != null) {
                this.e = Typeface.create(s, this.textStyle);
            }
        }
        if(this.e == null) {
            switch(this.typeface) {
                case 1: {
                    this.e = Typeface.SANS_SERIF;
                    break;
                }
                case 2: {
                    this.e = Typeface.SERIF;
                    break;
                }
                case 3: {
                    this.e = Typeface.MONOSPACE;
                    break;
                }
                default: {
                    this.e = Typeface.DEFAULT;
                }
            }
            this.e = Typeface.create(this.e, this.textStyle);
        }
    }

    public Typeface getFallbackFont() {
        this.a();
        return this.e;
    }

    @NonNull
    @VisibleForTesting
    public Typeface getFont(@NonNull Context context0) {
        if(this.d) {
            return this.e;
        }
        if(!context0.isRestricted()) {
            try {
                Typeface typeface0 = ResourcesCompat.getFont(context0, this.c);
                this.e = typeface0;
                if(typeface0 != null) {
                    this.e = Typeface.create(typeface0, this.textStyle);
                }
                goto label_10;
            }
            catch(UnsupportedOperationException exception0) {
            }
            catch(Resources.NotFoundException | Exception unused_ex) {
                goto label_10;
            }
            Log.d("TextAppearance", "Error loading font " + this.fontFamily, exception0);
        }
    label_10:
        this.a();
        this.d = true;
        return this.e;
    }

    public void getFontAsync(@NonNull Context context0, @NonNull TextPaint textPaint0, @NonNull TextAppearanceFontCallback textAppearanceFontCallback0) {
        this.updateTextPaintMeasureState(context0, textPaint0, this.getFallbackFont());
        this.getFontAsync(context0, new b(this, context0, textPaint0, textAppearanceFontCallback0));
    }

    public void getFontAsync(@NonNull Context context0, @NonNull TextAppearanceFontCallback textAppearanceFontCallback0) {
        int v = this.c;
        if((v == 0 ? null : ResourcesCompat.getCachedFont(context0, v)) == null) {
            this.a();
        }
        else {
            this.getFont(context0);
        }
        if(v == 0) {
            this.d = true;
        }
        if(this.d) {
            textAppearanceFontCallback0.onFontRetrieved(this.e, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context0, v, new a(this, textAppearanceFontCallback0), null);
        }
        catch(Resources.NotFoundException unused_ex) {
            this.d = true;
            textAppearanceFontCallback0.onFontRetrievalFailed(1);
        }
        catch(Exception exception0) {
            Log.d("TextAppearance", "Error loading font " + this.fontFamily, exception0);
            this.d = true;
            textAppearanceFontCallback0.onFontRetrievalFailed(-3);
        }
    }

    @Nullable
    public ColorStateList getTextColor() {
        return this.a;
    }

    public float getTextSize() {
        return this.b;
    }

    public void setTextColor(@Nullable ColorStateList colorStateList0) {
        this.a = colorStateList0;
    }

    public void setTextSize(float f) {
        this.b = f;
    }

    public void updateDrawState(@NonNull Context context0, @NonNull TextPaint textPaint0, @NonNull TextAppearanceFontCallback textAppearanceFontCallback0) {
        this.updateMeasureState(context0, textPaint0, textAppearanceFontCallback0);
        textPaint0.setColor((this.a == null ? 0xFF000000 : this.a.getColorForState(textPaint0.drawableState, this.a.getDefaultColor())));
        int v = this.shadowColor == null ? 0 : this.shadowColor.getColorForState(textPaint0.drawableState, this.shadowColor.getDefaultColor());
        textPaint0.setShadowLayer(this.shadowRadius, this.shadowDx, this.shadowDy, v);
    }

    public void updateMeasureState(@NonNull Context context0, @NonNull TextPaint textPaint0, @NonNull TextAppearanceFontCallback textAppearanceFontCallback0) {
        if((this.c == 0 ? null : ResourcesCompat.getCachedFont(context0, this.c)) != null) {
            this.updateTextPaintMeasureState(context0, textPaint0, this.getFont(context0));
            return;
        }
        this.getFontAsync(context0, textPaint0, textAppearanceFontCallback0);
    }

    public void updateTextPaintMeasureState(@NonNull Context context0, @NonNull TextPaint textPaint0, @NonNull Typeface typeface0) {
        Typeface typeface1 = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context0, typeface0);
        if(typeface1 != null) {
            typeface0 = typeface1;
        }
        textPaint0.setTypeface(typeface0);
        int v = typeface0.getStyle();
        int v1 = this.textStyle & ~v;
        textPaint0.setFakeBoldText((v1 & 1) != 0);
        textPaint0.setTextSkewX(((v1 & 2) == 0 ? 0.0f : -0.25f));
        textPaint0.setTextSize(this.b);
        if(this.hasLetterSpacing) {
            textPaint0.setLetterSpacing(this.letterSpacing);
        }
    }
}

