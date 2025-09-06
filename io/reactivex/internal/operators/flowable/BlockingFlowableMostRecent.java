package io.reactivex.internal.operators.flowable;

import androidx.datastore.preferences.protobuf.z2;
import io.reactivex.Flowable;
import java.util.Iterator;

public final class BlockingFlowableMostRecent implements Iterable {
    public final Flowable a;
    public final Object b;

    public BlockingFlowableMostRecent(Flowable flowable0, Object object0) {
        this.a = flowable0;
        this.b = object0;
    }

    @Override
    public Iterator iterator() {
        d d0 = new d();  // 初始化器: Lio/reactivex/subscribers/DefaultSubscriber;-><init>()V
        d0.b = this.b;
        this.a.subscribe(d0);
        return new z2(d0);
    }
}

