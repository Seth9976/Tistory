package retrofit2;

import a7.b;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;
import okio.Timeout;

public final class h implements Call {
    public final Executor a;
    public final Call b;

    public h(Executor executor0, Call call0) {
        this.a = executor0;
        this.b = call0;
    }

    @Override  // retrofit2.Call
    public final void cancel() {
        this.b.cancel();
    }

    @Override
    public final Object clone() {
        return this.clone();
    }

    @Override  // retrofit2.Call
    public final Call clone() {
        Call call0 = this.b.clone();
        return new h(this.a, call0);
    }

    @Override  // retrofit2.Call
    public final void enqueue(Callback callback0) {
        Objects.requireNonNull(callback0, "callback == null");
        b b0 = new b(this, callback0, false, 29);
        this.b.enqueue(b0);
    }

    @Override  // retrofit2.Call
    public final Response execute() {
        return this.b.execute();
    }

    @Override  // retrofit2.Call
    public final boolean isCanceled() {
        return this.b.isCanceled();
    }

    @Override  // retrofit2.Call
    public final boolean isExecuted() {
        return this.b.isExecuted();
    }

    @Override  // retrofit2.Call
    public final Request request() {
        return this.b.request();
    }

    @Override  // retrofit2.Call
    public final Timeout timeout() {
        return this.b.timeout();
    }
}

