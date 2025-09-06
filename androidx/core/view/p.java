package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;

public final class p implements LayoutInflater.Factory2 {
    public final LayoutInflaterFactory a;

    public p(LayoutInflaterFactory layoutInflaterFactory0) {
        this.a = layoutInflaterFactory0;
    }

    @Override  // android.view.LayoutInflater$Factory2
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        return this.a.onCreateView(view0, s, context0, attributeSet0);
    }

    @Override  // android.view.LayoutInflater$Factory
    public final View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.a.onCreateView(null, s, context0, attributeSet0);
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "androidx.core.view.p{" + this.a + "}";
    }
}

