package androidx.room;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.disposables.Disposables;

public final class i1 implements FlowableOnSubscribe {
    public final String[] a;
    public final RoomDatabase b;

    public i1(RoomDatabase roomDatabase0, String[] arr_s) {
        this.a = arr_s;
        this.b = roomDatabase0;
    }

    @Override  // io.reactivex.FlowableOnSubscribe
    public final void subscribe(FlowableEmitter flowableEmitter0) {
        g1 g10 = new g1(this.a, flowableEmitter0);
        if(!flowableEmitter0.isCancelled()) {
            this.b.getInvalidationTracker().addObserver(g10);
            flowableEmitter0.setDisposable(Disposables.fromAction(new h1(this, g10)));
        }
        if(!flowableEmitter0.isCancelled()) {
            flowableEmitter0.onNext(RxRoom.NOTHING);
        }
    }
}

