package androidx.recyclerview.widget;

import android.widget.EdgeEffect;

public final class t1 extends EdgeEffectFactory {
    @Override  // androidx.recyclerview.widget.RecyclerView$EdgeEffectFactory
    public final EdgeEffect createEdgeEffect(RecyclerView recyclerView0, int v) {
        return new EdgeEffect(recyclerView0.getContext());
    }
}

