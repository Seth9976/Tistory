package retrofit2.adapter.rxjava2;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

public final class f implements CallAdapter {
    public final Type a;
    public final Scheduler b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public f(Type type0, Scheduler scheduler0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = type0;
        this.b = scheduler0;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    @Override  // retrofit2.CallAdapter
    public final Object adapt(Call call0) {
        Observable observable0 = this.c ? new d(call0, 0) : new d(call0, 1);
        if(this.d) {
            observable0 = new b(observable0, 1);
        }
        else if(this.e) {
            observable0 = new b(observable0, 0);
        }
        Scheduler scheduler0 = this.b;
        if(scheduler0 != null) {
            observable0 = observable0.subscribeOn(scheduler0);
        }
        if(this.f) {
            return observable0.toFlowable(BackpressureStrategy.MISSING);
        }
        if(this.g) {
            return observable0.singleOrError();
        }
        if(this.h) {
            return observable0.singleElement();
        }
        return this.i ? observable0.ignoreElements() : RxJavaPlugins.onAssembly(observable0);
    }

    @Override  // retrofit2.CallAdapter
    public final Type responseType() {
        return this.a;
    }
}

