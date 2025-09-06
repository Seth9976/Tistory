package cd;

import com.kakao.sdk.user.RxUserApiClient;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.flowable.f2;
import io.reactivex.internal.operators.observable.ObserverResourceWrapper;
import io.reactivex.internal.subscribers.SubscriberResourceWrapper;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a implements Consumer {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) {
        switch(this.a) {
            case 0: {
                ((Action)this.b).run();
                return;
            }
            case 1: {
                ((ConcurrentLinkedQueue)this.b).offer(((f2)object0));
                return;
            }
            case 2: {
                ((SubscriberResourceWrapper)this.b).setResource(((Disposable)object0));
                return;
            }
            case 3: {
                ((ObserverResourceWrapper)this.b).setResource(((Disposable)object0));
                return;
            }
            case 4: {
                Intrinsics.checkExpressionValueIsNotNull(((Function1)this.b).invoke(object0), "invoke(...)");
                return;
            }
            default: {
                Throwable throwable0 = (Throwable)object0;
                RxUserApiClient.access$getTokenManagerProvider$p(((RxUserApiClient)this.b)).getManager().clear();
            }
        }
    }
}

