package androidx.recyclerview.widget;

import android.database.Observable;

public final class m1 extends Observable {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for(int v = this.mObservers.size() - 1; v >= 0; --v) {
            ((AdapterDataObserver)this.mObservers.get(v)).onChanged();
        }
    }

    public final void c(int v, int v1) {
        for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
            ((AdapterDataObserver)this.mObservers.get(v2)).onItemRangeMoved(v, v1, 1);
        }
    }

    public final void d(int v, int v1, Object object0) {
        for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
            ((AdapterDataObserver)this.mObservers.get(v2)).onItemRangeChanged(v, v1, object0);
        }
    }

    public final void e(int v, int v1) {
        for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
            ((AdapterDataObserver)this.mObservers.get(v2)).onItemRangeInserted(v, v1);
        }
    }

    public final void f(int v, int v1) {
        for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
            ((AdapterDataObserver)this.mObservers.get(v2)).onItemRangeRemoved(v, v1);
        }
    }

    public final void g() {
        for(int v = this.mObservers.size() - 1; v >= 0; --v) {
            ((AdapterDataObserver)this.mObservers.get(v)).onStateRestorationPolicyChanged();
        }
    }
}

