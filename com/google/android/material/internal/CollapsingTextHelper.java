package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public CancelableFontCallback D;
    public CancelableFontCallback E;
    public TextUtils.TruncateAt F;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean J;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;
    public final View a;
    public ColorStateList a0;
    public float b;
    public float b0;
    public boolean c;
    public float c0;
    public float d;
    public float d0;
    public float e;
    public ColorStateList e0;
    public int f;
    public float f0;
    public final Rect g;
    public float g0;
    public final Rect h;
    public float h0;
    public final RectF i;
    public StaticLayout i0;
    public int j;
    public float j0;
    public int k;
    public float k0;
    public float l;
    public float l0;
    public float m;
    public CharSequence m0;
    public ColorStateList n;
    public int n0;
    public ColorStateList o;
    public float o0;
    public int p;
    public float p0;
    public float q;
    public int q0;
    public float r;
    public StaticLayoutBuilderConfigurer r0;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;

    public CollapsingTextHelper(View view0) {
        this.j = 16;
        this.k = 16;
        this.l = 15.0f;
        this.m = 15.0f;
        this.F = TextUtils.TruncateAt.END;
        this.J = true;
        this.n0 = 1;
        this.o0 = 0.0f;
        this.p0 = 1.0f;
        this.q0 = 1;
        this.a = view0;
        TextPaint textPaint0 = new TextPaint(0x81);
        this.T = textPaint0;
        this.U = new TextPaint(textPaint0);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        this.e = (1.0f - this.d) * 0.5f + this.d;
        this.maybeUpdateFontWeightAdjustment(view0.getContext().getResources().getConfiguration());
    }

    public static int a(int v, int v1, float f) {
        float f1 = ((float)Color.alpha(v)) * (1.0f - f);
        float f2 = ((float)Color.alpha(v1)) * f + f1;
        float f3 = ((float)Color.red(v)) * (1.0f - f);
        float f4 = ((float)Color.red(v1)) * f + f3;
        float f5 = ((float)Color.green(v)) * (1.0f - f);
        float f6 = ((float)Color.green(v1)) * f + f5;
        float f7 = ((float)Color.blue(v)) * (1.0f - f);
        return Color.argb(Math.round(f2), Math.round(f4), Math.round(f6), Math.round(((float)Color.blue(v1)) * f + f7));
    }

    public final boolean b(CharSequence charSequence0) {
        boolean z = ViewCompat.getLayoutDirection(this.a) == 1;
        if(this.J) {
            return z ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL.isRtl(charSequence0, 0, charSequence0.length()) : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR.isRtl(charSequence0, 0, charSequence0.length());
        }
        return z;
    }

    public final void c(float f, boolean z) {
        Layout.Alignment layout$Alignment0;
        boolean z2;
        Typeface typeface0;
        float f4;
        float f3;
        if(this.G == null) {
            return;
        }
        float f1 = (float)this.h.width();
        float f2 = (float)this.g.width();
        if(Float.compare(Math.abs(f - 1.0f), 0.00001f) < 0) {
            f3 = this.m;
            f4 = this.f0;
            this.L = 1.0f;
            typeface0 = this.w;
        }
        else {
            float f5 = this.l;
            float f6 = this.g0;
            Typeface typeface1 = this.z;
            this.L = Math.abs(f - 0.0f) < 0.00001f ? 1.0f : CollapsingTextHelper.e(this.l, this.m, f, this.W) / this.l;
            float f7 = this.m / this.l;
            f1 = z || this.c || f2 * f7 <= f1 ? f2 : Math.min(f1 / f7, f2);
            f3 = f5;
            f4 = f6;
            typeface0 = typeface1;
        }
        TextPaint textPaint0 = this.T;
        if(Float.compare(f1, 0.0f) > 0) {
            boolean z1 = this.C != typeface0;
            z2 = this.M != f3 || this.h0 != f4 || this.i0 != null && f1 != ((float)this.i0.getWidth()) || z1 || this.S;
            this.M = f3;
            this.h0 = f4;
            this.C = typeface0;
            this.S = false;
            textPaint0.setLinearText(this.L != 1.0f);
        }
        else {
            z2 = false;
        }
        if(this.H == null || z2) {
            textPaint0.setTextSize(this.M);
            textPaint0.setTypeface(this.C);
            textPaint0.setLetterSpacing(this.h0);
            boolean z3 = this.b(this.G);
            this.I = z3;
            int v = this.n0 > 1 && (!z3 || this.c) ? this.n0 : 1;
            if(v == 1) {
                layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
            }
            else {
                switch(GravityCompat.getAbsoluteGravity(this.j, ((int)z3)) & 7) {
                    case 1: {
                        layout$Alignment0 = Layout.Alignment.ALIGN_CENTER;
                        break;
                    }
                    case 5: {
                        layout$Alignment0 = this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    }
                    default: {
                        layout$Alignment0 = this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    }
                }
            }
            v v1 = new v(this.G, textPaint0, ((int)f1));
            v1.l = this.F;
            v1.k = z3;
            v1.e = layout$Alignment0;
            v1.j = false;
            v1.f = v;
            v1.g = this.o0;
            v1.h = this.p0;
            v1.i = this.q0;
            v1.m = this.r0;
            StaticLayout staticLayout0 = (StaticLayout)Preconditions.checkNotNull(v1.a());
            this.i0 = staticLayout0;
            this.H = staticLayout0.getText();
        }
    }

    public final int d(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            return 0;
        }
        int[] arr_v = this.R;
        return arr_v == null ? colorStateList0.getDefaultColor() : colorStateList0.getColorForState(arr_v, 0);
    }

    public void draw(@NonNull Canvas canvas0) {
        int v = canvas0.save();
        if(this.H != null && (this.i.width() > 0.0f && this.i.height() > 0.0f)) {
            TextPaint textPaint0 = this.T;
            textPaint0.setTextSize(this.M);
            float f = this.u;
            float f1 = this.v;
            float f2 = this.L;
            if(f2 != 1.0f && !this.c) {
                canvas0.scale(f2, f2, f, f1);
            }
            if(this.n0 <= 1 || this.I && !this.c || this.c && this.b <= this.e) {
                canvas0.translate(f, f1);
                this.i0.draw(canvas0);
            }
            else {
                float f3 = this.u - ((float)this.i0.getLineStart(0));
                int v1 = textPaint0.getAlpha();
                canvas0.translate(f3, f1);
                if(!this.c) {
                    textPaint0.setAlpha(((int)(this.l0 * ((float)v1))));
                    if(Build.VERSION.SDK_INT >= 0x1F) {
                        textPaint0.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint0.getAlpha()));
                    }
                    this.i0.draw(canvas0);
                }
                if(!this.c) {
                    textPaint0.setAlpha(((int)(this.k0 * ((float)v1))));
                }
                int v2 = Build.VERSION.SDK_INT;
                if(v2 >= 0x1F) {
                    textPaint0.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint0.getAlpha()));
                }
                int v3 = this.i0.getLineBaseline(0);
                canvas0.drawText(this.m0, 0, this.m0.length(), 0.0f, ((float)v3), textPaint0);
                if(v2 >= 0x1F) {
                    textPaint0.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if(!this.c) {
                    String s = this.m0.toString().trim();
                    if(s.endsWith("…")) {
                        s = s.substring(0, s.length() - 1);
                    }
                    textPaint0.setAlpha(v1);
                    canvas0.drawText(s, 0, Math.min(this.i0.getLineEnd(0), s.length()), 0.0f, ((float)v3), textPaint0);
                }
            }
            canvas0.restoreToCount(v);
        }
    }

    public static float e(float f, float f1, float f2, TimeInterpolator timeInterpolator0) {
        if(timeInterpolator0 != null) {
            f2 = timeInterpolator0.getInterpolation(f2);
        }
        return AnimationUtils.lerp(f, f1, f2);
    }

    public final boolean f(Typeface typeface0) {
        CancelableFontCallback cancelableFontCallback0 = this.E;
        if(cancelableFontCallback0 != null) {
            cancelableFontCallback0.cancel();
        }
        if(this.y != typeface0) {
            this.y = typeface0;
            Typeface typeface1 = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.a.getContext().getResources().getConfiguration(), typeface0);
            this.x = typeface1;
            if(typeface1 == null) {
                typeface1 = this.y;
            }
            this.w = typeface1;
            return true;
        }
        return false;
    }

    public final boolean g(Typeface typeface0) {
        CancelableFontCallback cancelableFontCallback0 = this.D;
        if(cancelableFontCallback0 != null) {
            cancelableFontCallback0.cancel();
        }
        if(this.B != typeface0) {
            this.B = typeface0;
            Typeface typeface1 = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.a.getContext().getResources().getConfiguration(), typeface0);
            this.A = typeface1;
            if(typeface1 == null) {
                typeface1 = this.B;
            }
            this.z = typeface1;
            return true;
        }
        return false;
    }

    public void getCollapsedTextActualBounds(@NonNull RectF rectF0, int v, int v1) {
        float f2;
        float f;
        boolean z = this.b(this.G);
        this.I = z;
        Rect rect0 = this.h;
        if(v1 == 17 || (v1 & 7) == 1) {
            f = ((float)v) / 2.0f - this.j0 / 2.0f;
        }
        else if((v1 & 0x800005) == 0x800005 || (v1 & 5) == 5) {
            f = z ? ((float)rect0.left) : ((float)rect0.right) - this.j0;
        }
        else if(z) {
            f = ((float)rect0.right) - this.j0;
        }
        else {
            f = (float)rect0.left;
        }
        float f1 = Math.max(f, rect0.left);
        rectF0.left = f1;
        rectF0.top = (float)rect0.top;
        if(v1 == 17 || (v1 & 7) == 1) {
            f2 = ((float)v) / 2.0f + this.j0 / 2.0f;
        }
        else if((v1 & 0x800005) == 0x800005 || (v1 & 5) == 5) {
            f2 = this.I ? f1 + this.j0 : ((float)rect0.right);
        }
        else if(this.I) {
            f2 = (float)rect0.right;
        }
        else {
            f2 = this.j0 + f1;
        }
        rectF0.right = Math.min(f2, rect0.right);
        float f3 = (float)rect0.top;
        rectF0.bottom = this.getCollapsedTextHeight() + f3;
    }

    public ColorStateList getCollapsedTextColor() {
        return this.o;
    }

    public int getCollapsedTextGravity() {
        return this.k;
    }

    public float getCollapsedTextHeight() {
        this.U.setTextSize(this.m);
        this.U.setTypeface(this.w);
        this.U.setLetterSpacing(this.f0);
        return -this.U.ascent();
    }

    public float getCollapsedTextSize() {
        return this.m;
    }

    public Typeface getCollapsedTypeface() {
        return this.w == null ? Typeface.DEFAULT : this.w;
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
        return this.d(this.o);
    }

    public int getExpandedLineCount() {
        return this.p;
    }

    public ColorStateList getExpandedTextColor() {
        return this.n;
    }

    public float getExpandedTextFullHeight() {
        this.U.setTextSize(this.l);
        this.U.setTypeface(this.z);
        this.U.setLetterSpacing(this.g0);
        float f = this.U.ascent();
        return this.U.descent() + -f;
    }

    public int getExpandedTextGravity() {
        return this.j;
    }

    public float getExpandedTextHeight() {
        this.U.setTextSize(this.l);
        this.U.setTypeface(this.z);
        this.U.setLetterSpacing(this.g0);
        return -this.U.ascent();
    }

    public float getExpandedTextSize() {
        return this.l;
    }

    public Typeface getExpandedTypeface() {
        return this.z == null ? Typeface.DEFAULT : this.z;
    }

    public float getExpansionFraction() {
        return this.b;
    }

    public float getFadeModeThresholdFraction() {
        return this.e;
    }

    @RequiresApi(23)
    public int getHyphenationFrequency() {
        return this.q0;
    }

    public int getLineCount() {
        return this.i0 == null ? 0 : this.i0.getLineCount();
    }

    @RequiresApi(23)
    public float getLineSpacingAdd() {
        return this.i0.getSpacingAdd();
    }

    @RequiresApi(23)
    public float getLineSpacingMultiplier() {
        return this.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.n0;
    }

    @Nullable
    public TimeInterpolator getPositionInterpolator() {
        return this.V;
    }

    @Nullable
    public CharSequence getText() {
        return this.G;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.F;
    }

    public final void h(float f) {
        this.c(f, false);
        ViewCompat.postInvalidateOnAnimation(this.a);
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.J;
    }

    // 去混淆评级： 低(30)
    public final boolean isStateful() {
        return this.o != null && this.o.isStateful() || this.n != null && this.n.isStateful();
    }

    public void maybeUpdateFontWeightAdjustment(@NonNull Configuration configuration0) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            Typeface typeface0 = this.y;
            if(typeface0 != null) {
                this.x = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration0, typeface0);
            }
            Typeface typeface1 = this.B;
            if(typeface1 != null) {
                this.A = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration0, typeface1);
            }
            this.w = this.x == null ? this.y : this.x;
            this.z = this.A == null ? this.B : this.A;
            this.recalculate(true);
        }
    }

    public void recalculate() {
        this.recalculate(false);
    }

    public void recalculate(boolean z) {
        float f7;
        float f4;
        View view0 = this.a;
        if(view0.getHeight() > 0 && view0.getWidth() > 0 || z) {
            this.c(1.0f, z);
            CharSequence charSequence0 = this.H;
            TextPaint textPaint0 = this.T;
            if(charSequence0 != null) {
                StaticLayout staticLayout0 = this.i0;
                if(staticLayout0 != null) {
                    this.m0 = TextUtils.ellipsize(charSequence0, textPaint0, ((float)staticLayout0.getWidth()), this.F);
                }
            }
            CharSequence charSequence1 = this.m0;
            this.j0 = charSequence1 == null ? 0.0f : textPaint0.measureText(charSequence1, 0, charSequence1.length());
            int v = GravityCompat.getAbsoluteGravity(this.k, ((int)this.I));
            Rect rect0 = this.h;
            switch(v & 0x70) {
                case 0x30: {
                    this.r = (float)rect0.top;
                    break;
                }
                case 80: {
                    float f2 = (float)rect0.bottom;
                    this.r = textPaint0.ascent() + f2;
                    break;
                }
                default: {
                    float f = textPaint0.descent();
                    float f1 = textPaint0.ascent();
                    this.r = ((float)rect0.centerY()) - (f - f1) / 2.0f;
                }
            }
            switch(v & 0x800007) {
                case 1: {
                    this.t = ((float)rect0.centerX()) - this.j0 / 2.0f;
                    break;
                }
                case 5: {
                    this.t = ((float)rect0.right) - this.j0;
                    break;
                }
                default: {
                    this.t = (float)rect0.left;
                }
            }
            this.c(0.0f, z);
            float f3 = this.i0 == null ? 0.0f : ((float)this.i0.getHeight());
            StaticLayout staticLayout1 = this.i0;
            if(staticLayout1 == null || this.n0 <= 1) {
                f4 = this.H == null ? 0.0f : textPaint0.measureText(this.H, 0, this.H.length());
            }
            else {
                f4 = (float)staticLayout1.getWidth();
            }
            this.p = this.i0 == null ? 0 : this.i0.getLineCount();
            int v1 = GravityCompat.getAbsoluteGravity(this.j, ((int)this.I));
            Rect rect1 = this.g;
            switch(v1 & 0x70) {
                case 0x30: {
                    this.q = (float)rect1.top;
                    break;
                }
                case 80: {
                    float f5 = ((float)rect1.bottom) - f3;
                    this.q = textPaint0.descent() + f5;
                    break;
                }
                default: {
                    this.q = ((float)rect1.centerY()) - f3 / 2.0f;
                }
            }
            switch(v1 & 0x800007) {
                case 1: {
                    this.s = ((float)rect1.centerX()) - f4 / 2.0f;
                    break;
                }
                case 5: {
                    this.s = ((float)rect1.right) - f4;
                    break;
                }
                default: {
                    this.s = (float)rect1.left;
                }
            }
            Bitmap bitmap0 = this.K;
            if(bitmap0 != null) {
                bitmap0.recycle();
                this.K = null;
            }
            this.h(this.b);
            float f6 = this.b;
            RectF rectF0 = this.i;
            if(this.c) {
                if(f6 < this.e) {
                    rect0 = rect1;
                }
                rectF0.set(rect0);
            }
            else {
                rectF0.left = CollapsingTextHelper.e(rect1.left, rect0.left, f6, this.V);
                rectF0.top = CollapsingTextHelper.e(this.q, this.r, f6, this.V);
                rectF0.right = CollapsingTextHelper.e(rect1.right, rect0.right, f6, this.V);
                rectF0.bottom = CollapsingTextHelper.e(rect1.bottom, rect0.bottom, f6, this.V);
            }
            if(!this.c) {
                this.u = CollapsingTextHelper.e(this.s, this.t, f6, this.V);
                this.v = CollapsingTextHelper.e(this.q, this.r, f6, this.V);
                this.h(f6);
                f7 = f6;
            }
            else if(f6 < this.e) {
                this.u = this.s;
                this.v = this.q;
                this.h(0.0f);
                f7 = 0.0f;
            }
            else {
                this.u = this.t;
                this.v = this.r - ((float)Math.max(0, this.f));
                this.h(1.0f);
                f7 = 1.0f;
            }
            TimeInterpolator timeInterpolator0 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            this.k0 = 1.0f - CollapsingTextHelper.e(0.0f, 1.0f, 1.0f - f6, timeInterpolator0);
            ViewCompat.postInvalidateOnAnimation(view0);
            this.l0 = CollapsingTextHelper.e(1.0f, 0.0f, f6, timeInterpolator0);
            ViewCompat.postInvalidateOnAnimation(view0);
            ColorStateList colorStateList0 = this.n;
            if(this.o == colorStateList0) {
                textPaint0.setColor(this.getCurrentCollapsedTextColor());
            }
            else {
                textPaint0.setColor(CollapsingTextHelper.a(this.d(colorStateList0), this.getCurrentCollapsedTextColor(), f7));
            }
            float f8 = this.f0;
            float f9 = this.g0;
            if(f8 == f9) {
                textPaint0.setLetterSpacing(f8);
            }
            else {
                textPaint0.setLetterSpacing(CollapsingTextHelper.e(f9, f8, f6, timeInterpolator0));
            }
            this.N = AnimationUtils.lerp(this.b0, this.X, f6);
            this.O = AnimationUtils.lerp(this.c0, this.Y, f6);
            this.P = AnimationUtils.lerp(this.d0, this.Z, f6);
            int v2 = CollapsingTextHelper.a(this.d(this.e0), this.d(this.a0), f6);
            this.Q = v2;
            textPaint0.setShadowLayer(this.N, this.O, this.P, v2);
            if(this.c) {
                int v3 = textPaint0.getAlpha();
                textPaint0.setAlpha(((int)((f6 <= this.e ? AnimationUtils.lerp(1.0f, 0.0f, this.d, this.e, f6) : AnimationUtils.lerp(0.0f, 1.0f, this.e, 1.0f, f6)) * ((float)v3))));
            }
            ViewCompat.postInvalidateOnAnimation(view0);
        }
    }

    public void setCollapsedAndExpandedTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.o != colorStateList0 || this.n != colorStateList0) {
            this.o = colorStateList0;
            this.n = colorStateList0;
            this.recalculate();
        }
    }

    public void setCollapsedBounds(int v, int v1, int v2, int v3) {
        Rect rect0 = this.h;
        if(rect0.left != v || rect0.top != v1 || rect0.right != v2 || rect0.bottom != v3) {
            rect0.set(v, v1, v2, v3);
            this.S = true;
        }
    }

    public void setCollapsedBounds(@NonNull Rect rect0) {
        this.setCollapsedBounds(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    public void setCollapsedTextAppearance(int v) {
        View view0 = this.a;
        TextAppearance textAppearance0 = new TextAppearance(view0.getContext(), v);
        if(textAppearance0.getTextColor() != null) {
            this.o = textAppearance0.getTextColor();
        }
        if(textAppearance0.getTextSize() != 0.0f) {
            this.m = textAppearance0.getTextSize();
        }
        ColorStateList colorStateList0 = textAppearance0.shadowColor;
        if(colorStateList0 != null) {
            this.a0 = colorStateList0;
        }
        this.Y = textAppearance0.shadowDx;
        this.Z = textAppearance0.shadowDy;
        this.X = textAppearance0.shadowRadius;
        this.f0 = textAppearance0.letterSpacing;
        CancelableFontCallback cancelableFontCallback0 = this.E;
        if(cancelableFontCallback0 != null) {
            cancelableFontCallback0.cancel();
        }
        this.E = new CancelableFontCallback((Typeface typeface0) -> if(this.f(typeface0)) {
            this.recalculate();
        }, textAppearance0.getFallbackFont());
        textAppearance0.getFontAsync(view0.getContext(), this.E);
        this.recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList0) {
        if(this.o != colorStateList0) {
            this.o = colorStateList0;
            this.recalculate();
        }
    }

    public void setCollapsedTextGravity(int v) {
        if(this.k != v) {
            this.k = v;
            this.recalculate();
        }
    }

    public void setCollapsedTextSize(float f) {
        if(this.m != f) {
            this.m = f;
            this.recalculate();
        }
    }

    // 检测为 Lambda 实现
    public void setCollapsedTypeface(Typeface typeface0) [...]

    public void setCurrentOffsetY(int v) {
        this.f = v;
    }

    public void setExpandedBounds(int v, int v1, int v2, int v3) {
        Rect rect0 = this.g;
        if(rect0.left != v || rect0.top != v1 || rect0.right != v2 || rect0.bottom != v3) {
            rect0.set(v, v1, v2, v3);
            this.S = true;
        }
    }

    public void setExpandedBounds(@NonNull Rect rect0) {
        this.setExpandedBounds(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    public void setExpandedLetterSpacing(float f) {
        if(this.g0 != f) {
            this.g0 = f;
            this.recalculate();
        }
    }

    public void setExpandedTextAppearance(int v) {
        View view0 = this.a;
        TextAppearance textAppearance0 = new TextAppearance(view0.getContext(), v);
        if(textAppearance0.getTextColor() != null) {
            this.n = textAppearance0.getTextColor();
        }
        if(textAppearance0.getTextSize() != 0.0f) {
            this.l = textAppearance0.getTextSize();
        }
        ColorStateList colorStateList0 = textAppearance0.shadowColor;
        if(colorStateList0 != null) {
            this.e0 = colorStateList0;
        }
        this.c0 = textAppearance0.shadowDx;
        this.d0 = textAppearance0.shadowDy;
        this.b0 = textAppearance0.shadowRadius;
        this.g0 = textAppearance0.letterSpacing;
        CancelableFontCallback cancelableFontCallback0 = this.D;
        if(cancelableFontCallback0 != null) {
            cancelableFontCallback0.cancel();
        }
        this.D = new CancelableFontCallback((Typeface typeface0) -> if(this.g(typeface0)) {
            this.recalculate();
        }, textAppearance0.getFallbackFont());
        textAppearance0.getFontAsync(view0.getContext(), this.D);
        this.recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList0) {
        if(this.n != colorStateList0) {
            this.n = colorStateList0;
            this.recalculate();
        }
    }

    public void setExpandedTextGravity(int v) {
        if(this.j != v) {
            this.j = v;
            this.recalculate();
        }
    }

    public void setExpandedTextSize(float f) {
        if(this.l != f) {
            this.l = f;
            this.recalculate();
        }
    }

    // 检测为 Lambda 实现
    public void setExpandedTypeface(Typeface typeface0) [...]

    public void setExpansionFraction(float f) {
        float f2;
        float f1 = MathUtils.clamp(f, 0.0f, 1.0f);
        if(f1 != this.b) {
            this.b = f1;
            RectF rectF0 = this.i;
            Rect rect0 = this.h;
            Rect rect1 = this.g;
            if(this.c) {
                if(f1 < this.e) {
                    rect0 = rect1;
                }
                rectF0.set(rect0);
            }
            else {
                rectF0.left = CollapsingTextHelper.e(rect1.left, rect0.left, f1, this.V);
                rectF0.top = CollapsingTextHelper.e(this.q, this.r, f1, this.V);
                rectF0.right = CollapsingTextHelper.e(rect1.right, rect0.right, f1, this.V);
                rectF0.bottom = CollapsingTextHelper.e(rect1.bottom, rect0.bottom, f1, this.V);
            }
            if(!this.c) {
                this.u = CollapsingTextHelper.e(this.s, this.t, f1, this.V);
                this.v = CollapsingTextHelper.e(this.q, this.r, f1, this.V);
                this.h(f1);
                f2 = f1;
            }
            else if(f1 < this.e) {
                this.u = this.s;
                this.v = this.q;
                this.h(0.0f);
                f2 = 0.0f;
            }
            else {
                this.u = this.t;
                this.v = this.r - ((float)Math.max(0, this.f));
                this.h(1.0f);
                f2 = 1.0f;
            }
            TimeInterpolator timeInterpolator0 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            this.k0 = 1.0f - CollapsingTextHelper.e(0.0f, 1.0f, 1.0f - f1, timeInterpolator0);
            View view0 = this.a;
            ViewCompat.postInvalidateOnAnimation(view0);
            this.l0 = CollapsingTextHelper.e(1.0f, 0.0f, f1, timeInterpolator0);
            ViewCompat.postInvalidateOnAnimation(view0);
            ColorStateList colorStateList0 = this.n;
            TextPaint textPaint0 = this.T;
            if(this.o == colorStateList0) {
                textPaint0.setColor(this.getCurrentCollapsedTextColor());
            }
            else {
                textPaint0.setColor(CollapsingTextHelper.a(this.d(colorStateList0), this.getCurrentCollapsedTextColor(), f2));
            }
            float f3 = this.f0;
            float f4 = this.g0;
            if(f3 == f4) {
                textPaint0.setLetterSpacing(f3);
            }
            else {
                textPaint0.setLetterSpacing(CollapsingTextHelper.e(f4, f3, f1, timeInterpolator0));
            }
            this.N = AnimationUtils.lerp(this.b0, this.X, f1);
            this.O = AnimationUtils.lerp(this.c0, this.Y, f1);
            this.P = AnimationUtils.lerp(this.d0, this.Z, f1);
            int v = CollapsingTextHelper.a(this.d(this.e0), this.d(this.a0), f1);
            this.Q = v;
            textPaint0.setShadowLayer(this.N, this.O, this.P, v);
            if(this.c) {
                int v1 = textPaint0.getAlpha();
                textPaint0.setAlpha(((int)((f1 <= this.e ? AnimationUtils.lerp(1.0f, 0.0f, this.d, this.e, f1) : AnimationUtils.lerp(0.0f, 1.0f, this.e, 1.0f, f1)) * ((float)v1))));
            }
            ViewCompat.postInvalidateOnAnimation(view0);
        }
    }

    public void setFadeModeEnabled(boolean z) {
        this.c = z;
    }

    public void setFadeModeStartFraction(float f) {
        this.d = f;
        this.e = (1.0f - f) * 0.5f + f;
    }

    @RequiresApi(23)
    public void setHyphenationFrequency(int v) {
        this.q0 = v;
    }

    @RequiresApi(23)
    public void setLineSpacingAdd(float f) {
        this.o0 = f;
    }

    @RequiresApi(23)
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0) float f) {
        this.p0 = f;
    }

    public void setMaxLines(int v) {
        if(v != this.n0) {
            this.n0 = v;
            Bitmap bitmap0 = this.K;
            if(bitmap0 != null) {
                bitmap0.recycle();
                this.K = null;
            }
            this.recalculate();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator0) {
        this.V = timeInterpolator0;
        this.recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.J = z;
    }

    public final boolean setState(int[] arr_v) {
        this.R = arr_v;
        if(this.isStateful()) {
            this.recalculate();
            return true;
        }
        return false;
    }

    @RequiresApi(23)
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer0) {
        if(this.r0 != staticLayoutBuilderConfigurer0) {
            this.r0 = staticLayoutBuilderConfigurer0;
            this.recalculate(true);
        }
    }

    public void setText(@Nullable CharSequence charSequence0) {
        if(charSequence0 == null || !TextUtils.equals(this.G, charSequence0)) {
            this.G = charSequence0;
            this.H = null;
            Bitmap bitmap0 = this.K;
            if(bitmap0 != null) {
                bitmap0.recycle();
                this.K = null;
            }
            this.recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator0) {
        this.W = timeInterpolator0;
        this.recalculate();
    }

    public void setTitleTextEllipsize(@NonNull TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.F = textUtils$TruncateAt0;
        this.recalculate();
    }

    public void setTypefaces(Typeface typeface0) {
        if(this.f(typeface0) || this.g(typeface0)) {
            this.recalculate();
        }
    }
}

