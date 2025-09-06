package androidx.fragment.app;

import android.view.View;

public final class v extends FragmentContainer {
    public final Fragment a;

    public v(Fragment fragment0) {
        this.a = fragment0;
        super();
    }

    @Override  // androidx.fragment.app.FragmentContainer
    public final View onFindViewById(int v) {
        Fragment fragment0 = this.a;
        View view0 = fragment0.mView;
        if(view0 == null) {
            throw new IllegalStateException("Fragment " + fragment0 + " does not have a view");
        }
        return view0.findViewById(v);
    }

    @Override  // androidx.fragment.app.FragmentContainer
    public final boolean onHasView() {
        return this.a.mView != null;
    }
}

