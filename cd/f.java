package cd;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

public final class f implements Consumer {
    public final int a;

    public f(int v) {
        this.a = v;
        super();
    }

    private final void a(Object object0) {
    }

    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) {
        switch(this.a) {
            case 0: {
                break;
            }
            case 1: {
                RxJavaPlugins.onError(((Throwable)object0));
                break;
            }
            case 2: {
                ((Subscription)object0).request(0x7FFFFFFFFFFFFFFFL);
                return;
            }
            default: {
                RxJavaPlugins.onError(new OnErrorNotImplementedException(((Throwable)object0)));
            }
        }
    }

    @Override
    public String toString() {
        return this.a == 0 ? "EmptyConsumer" : super.toString();
    }
}

