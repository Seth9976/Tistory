package ad;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class a extends AtomicReference implements Disposable {
    public final int a;

    public a(Object object0, int v) {
        this.a = v;
        super(ObjectHelper.requireNonNull(object0, "value is null"));
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.get() != null) {
            Object object0 = this.getAndSet(null);
            if(object0 != null) {
                switch(this.a) {
                    case 0: {
                        Action action0 = (Action)object0;
                        try {
                            action0.run();
                            return;
                        }
                        catch(Throwable throwable0) {
                            throw ExceptionHelper.wrapOrThrow(throwable0);
                        }
                    }
                    case 1: {
                        ((Runnable)object0).run();
                        return;
                    }
                    default: {
                        ((Subscription)object0).cancel();
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == null;
    }

    @Override
    public String toString() {
        return this.a == 1 ? "RunnableDisposable(disposed=" + this.isDisposed() + ", " + this.get() + ")" : super.toString();
    }
}

