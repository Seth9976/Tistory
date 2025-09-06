package io.reactivex.processors;

import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class ReplayProcessor extends FlowableProcessor {
    interface ReplayBuffer {
        void complete();

        void error(Throwable arg1);

        Throwable getError();

        @Nullable
        Object getValue();

        Object[] getValues(Object[] arg1);

        boolean isDone();

        void next(Object arg1);

        void replay(f arg1);

        int size();

        void trimHead();
    }

    public final ReplayBuffer b;
    public boolean c;
    public final AtomicReference d;
    public static final Object[] e;
    public static final f[] f;
    public static final f[] g;

    static {
        ReplayProcessor.e = new Object[0];
        ReplayProcessor.f = new f[0];
        ReplayProcessor.g = new f[0];
    }

    public ReplayProcessor(ReplayBuffer replayProcessor$ReplayBuffer0) {
        this.b = replayProcessor$ReplayBuffer0;
        this.d = new AtomicReference(ReplayProcessor.f);
    }

    public void cleanupBuffer() {
        this.b.trimHead();
    }

    @CheckReturnValue
    @NonNull
    public static ReplayProcessor create() {
        return new ReplayProcessor(new j(16));
    }

    @CheckReturnValue
    @NonNull
    public static ReplayProcessor create(int v) {
        return new ReplayProcessor(new j(v));
    }

    @CheckReturnValue
    @NonNull
    public static ReplayProcessor createWithSize(int v) {
        return new ReplayProcessor(new h(v));
    }

    @CheckReturnValue
    @NonNull
    public static ReplayProcessor createWithTime(long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return new ReplayProcessor(new g(0x7FFFFFFF, v, timeUnit0, scheduler0));
    }

    @CheckReturnValue
    @NonNull
    public static ReplayProcessor createWithTimeAndSize(long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        return new ReplayProcessor(new g(v1, v, timeUnit0, scheduler0));
    }

    public final void e(f f0) {
        while(true) {
            AtomicReference atomicReference0 = this.d;
            f[] arr_f = (f[])atomicReference0.get();
            if(arr_f == ReplayProcessor.g) {
                break;
            }
            f[] arr_f1 = ReplayProcessor.f;
            if(arr_f == arr_f1) {
                break;
            }
            int v = arr_f.length;
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_f[v1] == f0) {
                        break;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                v1 = -1;
                break;
            }
            if(v1 < 0) {
                return;
            }
            if(v != 1) {
                arr_f1 = new f[v - 1];
                System.arraycopy(arr_f, 0, arr_f1, 0, v1);
                System.arraycopy(arr_f, v1 + 1, arr_f1, v1, v - v1 - 1);
            }
            do {
                if(atomicReference0.compareAndSet(arr_f, arr_f1)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_f);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        return this.b.isDone() ? this.b.getError() : null;
    }

    public Object getValue() {
        return this.b.getValue();
    }

    public Object[] getValues() {
        Object[] arr_object = this.getValues(ReplayProcessor.e);
        return arr_object == ReplayProcessor.e ? new Object[0] : arr_object;
    }

    public Object[] getValues(Object[] arr_object) {
        return this.b.getValues(arr_object);
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.b.isDone() && this.b.getError() == null;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return ((f[])this.d.get()).length != 0;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.b.isDone() && this.b.getError() != null;
    }

    public boolean hasValue() {
        return this.b.size() != 0;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        ReplayBuffer replayProcessor$ReplayBuffer0 = this.b;
        replayProcessor$ReplayBuffer0.complete();
        f[] arr_f = (f[])this.d.getAndSet(ReplayProcessor.g);
        for(int v = 0; v < arr_f.length; ++v) {
            replayProcessor$ReplayBuffer0.replay(arr_f[v]);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        ReplayBuffer replayProcessor$ReplayBuffer0 = this.b;
        replayProcessor$ReplayBuffer0.error(throwable0);
        f[] arr_f = (f[])this.d.getAndSet(ReplayProcessor.g);
        for(int v = 0; v < arr_f.length; ++v) {
            replayProcessor$ReplayBuffer0.replay(arr_f[v]);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(this.c) {
            return;
        }
        ReplayBuffer replayProcessor$ReplayBuffer0 = this.b;
        replayProcessor$ReplayBuffer0.next(object0);
        f[] arr_f = (f[])this.d.get();
        for(int v = 0; v < arr_f.length; ++v) {
            replayProcessor$ReplayBuffer0.replay(arr_f[v]);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription0) {
        if(this.c) {
            subscription0.cancel();
            return;
        }
        subscription0.request(0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        f f0 = new f(subscriber0, this);
        subscriber0.onSubscribe(f0);
        while(true) {
            AtomicReference atomicReference0 = this.d;
            f[] arr_f = (f[])atomicReference0.get();
            if(arr_f == ReplayProcessor.g) {
                break;
            }
            f[] arr_f1 = new f[arr_f.length + 1];
            System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
            arr_f1[arr_f.length] = f0;
        label_8:
            if(atomicReference0.compareAndSet(arr_f, arr_f1)) {
                if(!f0.e) {
                    break;
                }
                this.e(f0);
                return;
            }
            if(atomicReference0.get() != arr_f) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_8;
        }
        this.b.replay(f0);
    }
}

