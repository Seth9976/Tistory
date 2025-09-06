package androidx.recyclerview.widget;

import a5.b;

public final class p0 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;

    public p0() {
        this.a = true;
        this.f = 0;
        this.g = 0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LayoutState{mAvailable=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", mCurrentPosition=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", mItemDirection=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", mLayoutDirection=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", mStartLine=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", mEndLine=");
        return b.p(stringBuilder0, this.g, '}');
    }
}

