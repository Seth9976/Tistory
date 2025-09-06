package androidx.recyclerview.widget;

public final class a1 {
    public final ViewTypeLookup a;
    public final StableIdLookup b;
    public final Adapter c;
    public final l d;
    public int e;
    public final z0 f;

    public a1(Adapter recyclerView$Adapter0, l l0, ViewTypeStorage viewTypeStorage0, StableIdLookup stableIdStorage$StableIdLookup0) {
        z0 z00 = new z0(this);
        this.f = z00;
        this.c = recyclerView$Adapter0;
        this.d = l0;
        this.a = viewTypeStorage0.createViewTypeWrapper(this);
        this.b = stableIdStorage$StableIdLookup0;
        this.e = recyclerView$Adapter0.getItemCount();
        recyclerView$Adapter0.registerAdapterDataObserver(z00);
    }
}

