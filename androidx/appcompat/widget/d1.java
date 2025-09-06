package androidx.appcompat.widget;

public final class d1 extends c1 {
    public final AppCompatTextView b;

    public d1(AppCompatTextView appCompatTextView0) {
        this.b = appCompatTextView0;
        super(appCompatTextView0);
    }

    @Override  // androidx.appcompat.widget.c1
    public final void setFirstBaselineToTopHeight(int v) {
        this.b.super.setFirstBaselineToTopHeight(v);
    }

    @Override  // androidx.appcompat.widget.c1
    public final void setLastBaselineToBottomHeight(int v) {
        this.b.super.setLastBaselineToBottomHeight(v);
    }
}

