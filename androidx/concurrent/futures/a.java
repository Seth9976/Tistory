package androidx.concurrent.futures;

public final class a extends AbstractResolvableFuture {
    public final b h;

    public a(b b0) {
        this.h = b0;
        super();
    }

    @Override  // androidx.concurrent.futures.AbstractResolvableFuture
    public final String pendingToString() {
        Completer callbackToFutureAdapter$Completer0 = (Completer)this.h.a.get();
        return callbackToFutureAdapter$Completer0 == null ? "Completer object has been garbage collected, future will fail soon" : "tag=[" + callbackToFutureAdapter$Completer0.a + "]";
    }
}

