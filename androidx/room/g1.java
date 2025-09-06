package androidx.room;

import io.reactivex.FlowableEmitter;
import java.util.Set;

public final class g1 extends Observer {
    public final FlowableEmitter b;

    public g1(String[] arr_s, FlowableEmitter flowableEmitter0) {
        this.b = flowableEmitter0;
        super(arr_s);
    }

    @Override  // androidx.room.InvalidationTracker$Observer
    public final void onInvalidated(Set set0) {
        FlowableEmitter flowableEmitter0 = this.b;
        if(!flowableEmitter0.isCancelled()) {
            flowableEmitter0.onNext(RxRoom.NOTHING);
        }
    }
}

