package fd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class n extends AtomicReference implements FlowableSubscriber {
    public final o a;
    public final BiFunction b;
    public Object c;
    public boolean d;

    public n(o o0, BiFunction biFunction0) {
        this.a = o0;
        this.b = biFunction0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(!this.d) {
            this.d = true;
            this.a.a(this.c);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        this.a.innerError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.d) {
            try {
                Object object1 = this.c;
                if(object1 == null) {
                    this.c = object0;
                    return;
                }
                this.c = ObjectHelper.requireNonNull(this.b.apply(object1, object0), "The reducer returned a null value");
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                ((Subscription)this.get()).cancel();
                this.onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

