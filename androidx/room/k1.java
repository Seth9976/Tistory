package androidx.room;

import io.reactivex.ObservableEmitter;
import java.util.Set;

public final class k1 extends Observer {
    public final ObservableEmitter b;

    public k1(String[] arr_s, ObservableEmitter observableEmitter0) {
        this.b = observableEmitter0;
        super(arr_s);
    }

    @Override  // androidx.room.InvalidationTracker$Observer
    public final void onInvalidated(Set set0) {
        this.b.onNext(RxRoom.NOTHING);
    }
}

