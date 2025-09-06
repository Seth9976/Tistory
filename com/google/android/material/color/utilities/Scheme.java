package com.google.android.material.color.utilities;

import a5.b;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

@RestrictTo({Scope.LIBRARY_GROUP})
@CheckReturnValue
public class Scheme {
    public int A;
    public int B;
    public int C;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public Scheme() {
    }

    public Scheme(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10, int v11, int v12, int v13, int v14, int v15, int v16, int v17, int v18, int v19, int v20, int v21, int v22, int v23, int v24, int v25, int v26, int v27, int v28) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
        this.j = v9;
        this.k = v10;
        this.l = v11;
        this.m = v12;
        this.n = v13;
        this.o = v14;
        this.p = v15;
        this.q = v16;
        this.r = v17;
        this.s = v18;
        this.t = v19;
        this.u = v20;
        this.v = v21;
        this.w = v22;
        this.x = v23;
        this.y = v24;
        this.z = v25;
        this.A = v26;
        this.B = v27;
        this.C = v28;
    }

    public static Scheme a(CorePalette corePalette0) {
        return new Scheme().withPrimary(corePalette0.a1.tone(80)).withOnPrimary(corePalette0.a1.tone(20)).withPrimaryContainer(corePalette0.a1.tone(30)).withOnPrimaryContainer(corePalette0.a1.tone(90)).withSecondary(corePalette0.a2.tone(80)).withOnSecondary(corePalette0.a2.tone(20)).withSecondaryContainer(corePalette0.a2.tone(30)).withOnSecondaryContainer(corePalette0.a2.tone(90)).withTertiary(corePalette0.a3.tone(80)).withOnTertiary(corePalette0.a3.tone(20)).withTertiaryContainer(corePalette0.a3.tone(30)).withOnTertiaryContainer(corePalette0.a3.tone(90)).withError(corePalette0.error.tone(80)).withOnError(corePalette0.error.tone(20)).withErrorContainer(corePalette0.error.tone(30)).withOnErrorContainer(corePalette0.error.tone(80)).withBackground(corePalette0.n1.tone(10)).withOnBackground(corePalette0.n1.tone(90)).withSurface(corePalette0.n1.tone(10)).withOnSurface(corePalette0.n1.tone(90)).withSurfaceVariant(corePalette0.n2.tone(30)).withOnSurfaceVariant(corePalette0.n2.tone(80)).withOutline(corePalette0.n2.tone(60)).withOutlineVariant(corePalette0.n2.tone(30)).withShadow(corePalette0.n1.tone(0)).withScrim(corePalette0.n1.tone(0)).withInverseSurface(corePalette0.n1.tone(90)).withInverseOnSurface(corePalette0.n1.tone(20)).withInversePrimary(corePalette0.a1.tone(40));
    }

    public static Scheme b(CorePalette corePalette0) {
        return new Scheme().withPrimary(corePalette0.a1.tone(40)).withOnPrimary(corePalette0.a1.tone(100)).withPrimaryContainer(corePalette0.a1.tone(90)).withOnPrimaryContainer(corePalette0.a1.tone(10)).withSecondary(corePalette0.a2.tone(40)).withOnSecondary(corePalette0.a2.tone(100)).withSecondaryContainer(corePalette0.a2.tone(90)).withOnSecondaryContainer(corePalette0.a2.tone(10)).withTertiary(corePalette0.a3.tone(40)).withOnTertiary(corePalette0.a3.tone(100)).withTertiaryContainer(corePalette0.a3.tone(90)).withOnTertiaryContainer(corePalette0.a3.tone(10)).withError(corePalette0.error.tone(40)).withOnError(corePalette0.error.tone(100)).withErrorContainer(corePalette0.error.tone(90)).withOnErrorContainer(corePalette0.error.tone(10)).withBackground(corePalette0.n1.tone(99)).withOnBackground(corePalette0.n1.tone(10)).withSurface(corePalette0.n1.tone(99)).withOnSurface(corePalette0.n1.tone(10)).withSurfaceVariant(corePalette0.n2.tone(90)).withOnSurfaceVariant(corePalette0.n2.tone(30)).withOutline(corePalette0.n2.tone(50)).withOutlineVariant(corePalette0.n2.tone(80)).withShadow(corePalette0.n1.tone(0)).withScrim(corePalette0.n1.tone(0)).withInverseSurface(corePalette0.n1.tone(20)).withInverseOnSurface(corePalette0.n1.tone(0x5F)).withInversePrimary(corePalette0.a1.tone(80));
    }

    public static Scheme dark(int v) {
        return Scheme.a(CorePalette.of(v));
    }

    public static Scheme darkContent(int v) {
        return Scheme.a(CorePalette.contentOf(v));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Scheme)) {
            return false;
        }
        if(!super.equals(object0)) {
            return false;
        }
        Scheme scheme0 = (Scheme)object0;
        if(this.a != scheme0.a) {
            return false;
        }
        if(this.b != scheme0.b) {
            return false;
        }
        if(this.c != scheme0.c) {
            return false;
        }
        if(this.d != scheme0.d) {
            return false;
        }
        if(this.e != scheme0.e) {
            return false;
        }
        if(this.f != scheme0.f) {
            return false;
        }
        if(this.g != scheme0.g) {
            return false;
        }
        if(this.h != scheme0.h) {
            return false;
        }
        if(this.i != scheme0.i) {
            return false;
        }
        if(this.j != scheme0.j) {
            return false;
        }
        if(this.k != scheme0.k) {
            return false;
        }
        if(this.l != scheme0.l) {
            return false;
        }
        if(this.m != scheme0.m) {
            return false;
        }
        if(this.n != scheme0.n) {
            return false;
        }
        if(this.o != scheme0.o) {
            return false;
        }
        if(this.p != scheme0.p) {
            return false;
        }
        if(this.q != scheme0.q) {
            return false;
        }
        if(this.r != scheme0.r) {
            return false;
        }
        if(this.s != scheme0.s) {
            return false;
        }
        if(this.t != scheme0.t) {
            return false;
        }
        if(this.u != scheme0.u) {
            return false;
        }
        if(this.v != scheme0.v) {
            return false;
        }
        if(this.w != scheme0.w) {
            return false;
        }
        if(this.x != scheme0.x) {
            return false;
        }
        if(this.y != scheme0.y) {
            return false;
        }
        if(this.z != scheme0.z) {
            return false;
        }
        if(this.A != scheme0.A) {
            return false;
        }
        return this.B == scheme0.B ? this.C == scheme0.C : false;
    }

    public int getBackground() {
        return this.q;
    }

    public int getError() {
        return this.m;
    }

    public int getErrorContainer() {
        return this.o;
    }

    public int getInverseOnSurface() {
        return this.B;
    }

    public int getInversePrimary() {
        return this.C;
    }

    public int getInverseSurface() {
        return this.A;
    }

    public int getOnBackground() {
        return this.r;
    }

    public int getOnError() {
        return this.n;
    }

    public int getOnErrorContainer() {
        return this.p;
    }

    public int getOnPrimary() {
        return this.b;
    }

    public int getOnPrimaryContainer() {
        return this.d;
    }

    public int getOnSecondary() {
        return this.f;
    }

    public int getOnSecondaryContainer() {
        return this.h;
    }

    public int getOnSurface() {
        return this.t;
    }

    public int getOnSurfaceVariant() {
        return this.v;
    }

    public int getOnTertiary() {
        return this.j;
    }

    public int getOnTertiaryContainer() {
        return this.l;
    }

    public int getOutline() {
        return this.w;
    }

    public int getOutlineVariant() {
        return this.x;
    }

    public int getPrimary() {
        return this.a;
    }

    public int getPrimaryContainer() {
        return this.c;
    }

    public int getScrim() {
        return this.z;
    }

    public int getSecondary() {
        return this.e;
    }

    public int getSecondaryContainer() {
        return this.g;
    }

    public int getShadow() {
        return this.y;
    }

    public int getSurface() {
        return this.s;
    }

    public int getSurfaceVariant() {
        return this.u;
    }

    public int getTertiary() {
        return this.i;
    }

    public int getTertiaryContainer() {
        return this.k;
    }

    @Override
    public int hashCode() {
        return ((((((((((((((((((((((((((((super.hashCode() * 0x1F + this.a) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i) * 0x1F + this.j) * 0x1F + this.k) * 0x1F + this.l) * 0x1F + this.m) * 0x1F + this.n) * 0x1F + this.o) * 0x1F + this.p) * 0x1F + this.q) * 0x1F + this.r) * 0x1F + this.s) * 0x1F + this.t) * 0x1F + this.u) * 0x1F + this.v) * 0x1F + this.w) * 0x1F + this.x) * 0x1F + this.y) * 0x1F + this.z) * 0x1F + this.A) * 0x1F + this.B) * 0x1F + this.C;
    }

    public static Scheme light(int v) {
        return Scheme.b(CorePalette.of(v));
    }

    public static Scheme lightContent(int v) {
        return Scheme.b(CorePalette.contentOf(v));
    }

    public void setBackground(int v) {
        this.q = v;
    }

    public void setError(int v) {
        this.m = v;
    }

    public void setErrorContainer(int v) {
        this.o = v;
    }

    public void setInverseOnSurface(int v) {
        this.B = v;
    }

    public void setInversePrimary(int v) {
        this.C = v;
    }

    public void setInverseSurface(int v) {
        this.A = v;
    }

    public void setOnBackground(int v) {
        this.r = v;
    }

    public void setOnError(int v) {
        this.n = v;
    }

    public void setOnErrorContainer(int v) {
        this.p = v;
    }

    public void setOnPrimary(int v) {
        this.b = v;
    }

    public void setOnPrimaryContainer(int v) {
        this.d = v;
    }

    public void setOnSecondary(int v) {
        this.f = v;
    }

    public void setOnSecondaryContainer(int v) {
        this.h = v;
    }

    public void setOnSurface(int v) {
        this.t = v;
    }

    public void setOnSurfaceVariant(int v) {
        this.v = v;
    }

    public void setOnTertiary(int v) {
        this.j = v;
    }

    public void setOnTertiaryContainer(int v) {
        this.l = v;
    }

    public void setOutline(int v) {
        this.w = v;
    }

    public void setOutlineVariant(int v) {
        this.x = v;
    }

    public void setPrimary(int v) {
        this.a = v;
    }

    public void setPrimaryContainer(int v) {
        this.c = v;
    }

    public void setScrim(int v) {
        this.z = v;
    }

    public void setSecondary(int v) {
        this.e = v;
    }

    public void setSecondaryContainer(int v) {
        this.g = v;
    }

    public void setShadow(int v) {
        this.y = v;
    }

    public void setSurface(int v) {
        this.s = v;
    }

    public void setSurfaceVariant(int v) {
        this.u = v;
    }

    public void setTertiary(int v) {
        this.i = v;
    }

    public void setTertiaryContainer(int v) {
        this.k = v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Scheme{primary=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", onPrimary=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", primaryContainer=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", onPrimaryContainer=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", secondary=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", onSecondary=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", secondaryContainer=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", onSecondaryContainer=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", tertiary=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", onTertiary=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", tertiaryContainer=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", onTertiaryContainer=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", error=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", onError=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", errorContainer=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", onErrorContainer=");
        stringBuilder0.append(this.p);
        stringBuilder0.append(", background=");
        stringBuilder0.append(this.q);
        stringBuilder0.append(", onBackground=");
        stringBuilder0.append(this.r);
        stringBuilder0.append(", surface=");
        stringBuilder0.append(this.s);
        stringBuilder0.append(", onSurface=");
        stringBuilder0.append(this.t);
        stringBuilder0.append(", surfaceVariant=");
        stringBuilder0.append(this.u);
        stringBuilder0.append(", onSurfaceVariant=");
        stringBuilder0.append(this.v);
        stringBuilder0.append(", outline=");
        stringBuilder0.append(this.w);
        stringBuilder0.append(", outlineVariant=");
        stringBuilder0.append(this.x);
        stringBuilder0.append(", shadow=");
        stringBuilder0.append(this.y);
        stringBuilder0.append(", scrim=");
        stringBuilder0.append(this.z);
        stringBuilder0.append(", inverseSurface=");
        stringBuilder0.append(this.A);
        stringBuilder0.append(", inverseOnSurface=");
        stringBuilder0.append(this.B);
        stringBuilder0.append(", inversePrimary=");
        return b.p(stringBuilder0, this.C, '}');
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int v) {
        this.q = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int v) {
        this.m = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int v) {
        this.o = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int v) {
        this.B = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int v) {
        this.C = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int v) {
        this.A = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int v) {
        this.r = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int v) {
        this.n = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int v) {
        this.p = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int v) {
        this.b = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int v) {
        this.d = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int v) {
        this.f = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int v) {
        this.h = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int v) {
        this.t = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int v) {
        this.v = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int v) {
        this.j = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int v) {
        this.l = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int v) {
        this.w = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int v) {
        this.x = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int v) {
        this.a = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int v) {
        this.c = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int v) {
        this.z = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int v) {
        this.e = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int v) {
        this.g = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int v) {
        this.y = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int v) {
        this.s = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int v) {
        this.u = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int v) {
        this.i = v;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int v) {
        this.k = v;
        return this;
    }
}

