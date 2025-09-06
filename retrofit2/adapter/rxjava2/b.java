package retrofit2.adapter.rxjava2;

import dd.n;
import io.reactivex.Observable;
import io.reactivex.Observer;

public final class b extends Observable {
    public final int a;
    public final Observable b;

    public b(Observable observable0, int v) {
        this.a = v;
        super();
        this.b = observable0;
    }

    @Override  // io.reactivex.Observable
    public final void subscribeActual(Observer observer0) {
        if(this.a != 0) {
            n n0 = new n(observer0, 4);
            this.b.subscribe(n0);
            return;
        }
        a a0 = new a(observer0);
        this.b.subscribe(a0);
    }
}

