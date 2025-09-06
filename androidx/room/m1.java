package androidx.room;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposables;

public final class m1 implements ObservableOnSubscribe {
    public final String[] a;
    public final RoomDatabase b;

    public m1(RoomDatabase roomDatabase0, String[] arr_s) {
        this.a = arr_s;
        this.b = roomDatabase0;
    }

    @Override  // io.reactivex.ObservableOnSubscribe
    public final void subscribe(ObservableEmitter observableEmitter0) {
        k1 k10 = new k1(this.a, observableEmitter0);
        this.b.getInvalidationTracker().addObserver(k10);
        observableEmitter0.setDisposable(Disposables.fromAction(new l1(this, k10)));
        observableEmitter0.onNext(RxRoom.NOTHING);
    }
}

