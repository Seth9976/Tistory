package androidx.room;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.f;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class RxRoom {
    public static final Object NOTHING;

    static {
        RxRoom.NOTHING = new Object();
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static Flowable createFlowable(RoomDatabase roomDatabase0, boolean z, String[] arr_s, Callable callable0) {
        Scheduler scheduler0 = Schedulers.from((z ? roomDatabase0.getTransactionExecutor() : roomDatabase0.getQueryExecutor()));
        Maybe maybe0 = Maybe.fromCallable(callable0);
        return RxRoom.createFlowable(roomDatabase0, arr_s).subscribeOn(scheduler0).unsubscribeOn(scheduler0).observeOn(scheduler0).flatMapMaybe(new j1(maybe0, 0));
    }

    public static Flowable createFlowable(RoomDatabase roomDatabase0, String[] arr_s) {
        return Flowable.create(new i1(roomDatabase0, arr_s), BackpressureStrategy.LATEST);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Flowable createFlowable(RoomDatabase roomDatabase0, String[] arr_s, Callable callable0) {
        return RxRoom.createFlowable(roomDatabase0, false, arr_s, callable0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static Observable createObservable(RoomDatabase roomDatabase0, boolean z, String[] arr_s, Callable callable0) {
        Scheduler scheduler0 = Schedulers.from((z ? roomDatabase0.getTransactionExecutor() : roomDatabase0.getQueryExecutor()));
        Maybe maybe0 = Maybe.fromCallable(callable0);
        return RxRoom.createObservable(roomDatabase0, arr_s).subscribeOn(scheduler0).unsubscribeOn(scheduler0).observeOn(scheduler0).flatMapMaybe(new j1(maybe0, 1));
    }

    public static Observable createObservable(RoomDatabase roomDatabase0, String[] arr_s) {
        return Observable.create(new m1(roomDatabase0, arr_s));
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Observable createObservable(RoomDatabase roomDatabase0, String[] arr_s, Callable callable0) {
        return RxRoom.createObservable(roomDatabase0, false, arr_s, callable0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static Single createSingle(Callable callable0) {
        return Single.create(new f(callable0, 3));
    }
}

