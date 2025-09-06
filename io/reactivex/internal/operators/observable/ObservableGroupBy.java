package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableGroupBy extends a {
    public static final class GroupByObserver extends AtomicInteger implements Observer, Disposable {
        public final Observer a;
        public final Function b;
        public final Function c;
        public final int d;
        public final boolean e;
        public final ConcurrentHashMap f;
        public Disposable g;
        public final AtomicBoolean h;
        public static final Object i;

        static {
            GroupByObserver.i = new Object();
        }

        public GroupByObserver(Observer observer0, Function function0, Function function1, int v, boolean z) {
            this.h = new AtomicBoolean();
            this.a = observer0;
            this.b = function0;
            this.c = function1;
            this.d = v;
            this.e = z;
            this.f = new ConcurrentHashMap();
            this.lazySet(1);
        }

        public void cancel(Object object0) {
            if(object0 == null) {
                object0 = GroupByObserver.i;
            }
            this.f.remove(object0);
            if(this.decrementAndGet() == 0) {
                this.g.dispose();
            }
        }

        @Override  // io.reactivex.disposables.Disposable
        public void dispose() {
            if(this.h.compareAndSet(false, true) && this.decrementAndGet() == 0) {
                this.g.dispose();
            }
        }

        @Override  // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.h.get();
        }

        @Override  // io.reactivex.Observer
        public void onComplete() {
            ArrayList arrayList0 = new ArrayList(this.f.values());
            this.f.clear();
            for(Object object0: arrayList0) {
                ((m1)object0).b.e = true;
                ((m1)object0).b.a();
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.Observer
        public void onError(Throwable throwable0) {
            ArrayList arrayList0 = new ArrayList(this.f.values());
            this.f.clear();
            for(Object object0: arrayList0) {
                ((m1)object0).b.f = throwable0;
                ((m1)object0).b.e = true;
                ((m1)object0).b.a();
            }
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.Observer
        public void onNext(Object object0) {
            Object object3;
            Object object1;
            try {
                object1 = this.b.apply(object0);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.g.dispose();
                this.onError(throwable0);
                return;
            }
            Object object2 = object1 == null ? GroupByObserver.i : object1;
            ConcurrentHashMap concurrentHashMap0 = this.f;
            m1 m10 = (m1)concurrentHashMap0.get(object2);
            if(m10 == null) {
                if(this.h.get()) {
                    return;
                }
                m1 m11 = new m1(object1, new n1(this.d, this, object1, this.e));
                concurrentHashMap0.put(object2, m11);
                this.getAndIncrement();
                this.a.onNext(m11);
                m10 = m11;
            }
            try {
                object3 = ObjectHelper.requireNonNull(this.c.apply(object0), "The value supplied is null");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.g.dispose();
                this.onError(throwable1);
                return;
            }
            m10.b.b.offer(object3);
            m10.b.a();
        }

        @Override  // io.reactivex.Observer
        public void onSubscribe(Disposable disposable0) {
            if(DisposableHelper.validate(this.g, disposable0)) {
                this.g = disposable0;
                this.a.onSubscribe(this);
            }
        }
    }

    public final Function a;
    public final Function b;
    public final int c;
    public final boolean d;

    public ObservableGroupBy(ObservableSource observableSource0, Function function0, Function function1, int v, boolean z) {
        super(observableSource0);
        this.a = function0;
        this.b = function1;
        this.c = v;
        this.d = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        GroupByObserver observableGroupBy$GroupByObserver0 = new GroupByObserver(observer0, this.a, this.b, this.c, this.d);
        this.source.subscribe(observableGroupBy$GroupByObserver0);
    }
}

