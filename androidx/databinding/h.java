package androidx.databinding;

import java.lang.ref.ReferenceQueue;

public final class h implements CreateWeakListener {
    public final int a;

    public h(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.databinding.CreateWeakListener
    public final w create(ViewDataBinding viewDataBinding0, int v, ReferenceQueue referenceQueue0) {
        switch(this.a) {
            case 0: {
                return new q(viewDataBinding0, v, referenceQueue0).a;
            }
            case 1: {
                return new o(viewDataBinding0, v, referenceQueue0).a;
            }
            case 2: {
                return new p(viewDataBinding0, v, referenceQueue0).a;
            }
            default: {
                return new m(viewDataBinding0, v, referenceQueue0).a;
            }
        }
    }
}

