package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

public final class ObservableSampleTimed extends a {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;
    public final boolean d;

    public ObservableSampleTimed(ObservableSource observableSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        super(observableSource0);
        this.a = v;
        this.b = timeUnit0;
        this.c = scheduler0;
        this.d = z;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        SerializedObserver serializedObserver0 = new SerializedObserver(observer0);
        if(this.d) {
            f3 f30 = new f3(serializedObserver0, this.a, this.b, this.c);
            this.source.subscribe(f30);
            return;
        }
        g3 g30 = new g3(serializedObserver0, this.a, this.b, this.c);  // 初始化器: Lio/reactivex/internal/operators/observable/h3;-><init>(Lio/reactivex/observers/SerializedObserver;JLjava/util/concurrent/TimeUnit;Lio/reactivex/Scheduler;)V
        this.source.subscribe(g30);
    }
}

