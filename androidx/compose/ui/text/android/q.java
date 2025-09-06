package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

public final class q {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final TextDirectionHeuristic f;
    public final Layout.Alignment g;
    public final int h;
    public final TextUtils.TruncateAt i;
    public final int j;
    public final float k;
    public final float l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int[] t;
    public final int[] u;

    public q(CharSequence charSequence0, TextPaint textPaint0, int v, int v1, int v2, TextDirectionHeuristic textDirectionHeuristic0, Layout.Alignment layout$Alignment0, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int v8, int v9, int[] arr_v, int[] arr_v1) {
        this.a = charSequence0;
        this.b = v;
        this.c = v1;
        this.d = textPaint0;
        this.e = v2;
        this.f = textDirectionHeuristic0;
        this.g = layout$Alignment0;
        this.h = v3;
        this.i = textUtils$TruncateAt0;
        this.j = v4;
        this.k = f;
        this.l = f1;
        this.m = v5;
        this.n = z;
        this.o = z1;
        this.p = v6;
        this.q = v7;
        this.r = v8;
        this.s = v9;
        this.t = arr_v;
        this.u = arr_v1;
        if(v < 0 || v > v1) {
            throw new IllegalArgumentException("invalid start value");
        }
        if(v1 < 0 || v1 > charSequence0.length()) {
            throw new IllegalArgumentException("invalid end value");
        }
        if(v3 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if(v2 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if(v4 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if(f < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }
}

