package com.google.android.material.internal;

import android.content.Context;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import java.lang.ref.WeakReference;

@RestrictTo({Scope.LIBRARY_GROUP})
public class TextDrawableHelper {
    public interface TextDrawableDelegate {
        @NonNull
        int[] getState();

        boolean onStateChange(int[] arg1);

        void onTextSizeChange();
    }

    public final TextPaint a;
    public final w b;
    public float c;
    public float d;
    public boolean e;
    public WeakReference f;
    public TextAppearance g;

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableHelper$TextDrawableDelegate0) {
        this.a = new TextPaint(1);
        this.b = new w(this);
        this.e = true;
        this.f = new WeakReference(null);
        this.setDelegate(textDrawableHelper$TextDrawableDelegate0);
    }

    public final void a(String s) {
        TextPaint textPaint0 = this.a;
        float f = 0.0f;
        this.c = s == null ? 0.0f : textPaint0.measureText(s, 0, s.length());
        if(s != null) {
            f = Math.abs(textPaint0.getFontMetrics().ascent);
        }
        this.d = f;
        this.e = false;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.g;
    }

    public float getTextHeight(@Nullable String s) {
        if(!this.e) {
            return this.d;
        }
        this.a(s);
        return this.d;
    }

    @NonNull
    public TextPaint getTextPaint() {
        return this.a;
    }

    public float getTextWidth(String s) {
        if(!this.e) {
            return this.c;
        }
        this.a(s);
        return this.c;
    }

    public boolean isTextWidthDirty() {
        return this.e;
    }

    public void setDelegate(@Nullable TextDrawableDelegate textDrawableHelper$TextDrawableDelegate0) {
        this.f = new WeakReference(textDrawableHelper$TextDrawableDelegate0);
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance0, Context context0) {
        if(this.g != textAppearance0) {
            this.g = textAppearance0;
            if(textAppearance0 != null) {
                TextPaint textPaint0 = this.a;
                w w0 = this.b;
                textAppearance0.updateMeasureState(context0, textPaint0, w0);
                TextDrawableDelegate textDrawableHelper$TextDrawableDelegate0 = (TextDrawableDelegate)this.f.get();
                if(textDrawableHelper$TextDrawableDelegate0 != null) {
                    textPaint0.drawableState = textDrawableHelper$TextDrawableDelegate0.getState();
                }
                textAppearance0.updateDrawState(context0, textPaint0, w0);
                this.e = true;
            }
            TextDrawableDelegate textDrawableHelper$TextDrawableDelegate1 = (TextDrawableDelegate)this.f.get();
            if(textDrawableHelper$TextDrawableDelegate1 != null) {
                textDrawableHelper$TextDrawableDelegate1.onTextSizeChange();
                textDrawableHelper$TextDrawableDelegate1.onStateChange(textDrawableHelper$TextDrawableDelegate1.getState());
            }
        }
    }

    public void setTextSizeDirty(boolean z) {
        this.e = z;
    }

    public void setTextWidthDirty(boolean z) {
        this.e = z;
    }

    public void updateTextPaintDrawState(Context context0) {
        this.g.updateDrawState(context0, this.a, this.b);
    }
}

