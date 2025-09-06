package androidx.fragment.app;

import android.view.View;

public final class q extends FragmentContainer {
    public final v a;
    public final DialogFragment b;

    public q(DialogFragment dialogFragment0, v v0) {
        this.b = dialogFragment0;
        this.a = v0;
        super();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.fragment.app.FragmentContainer
    public final View onFindViewById(int v) {
        return this.a.onHasView() ? this.a.onFindViewById(v) : this.b.onFindViewById(v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.fragment.app.FragmentContainer
    public final boolean onHasView() {
        return this.a.onHasView() || this.b.onHasView();
    }
}

