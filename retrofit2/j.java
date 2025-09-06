package retrofit2;

import okhttp3.Call.Factory;

public final class j extends m {
    public final CallAdapter d;

    public j(i0 i00, Factory call$Factory0, Converter converter0, CallAdapter callAdapter0) {
        super(i00, call$Factory0, converter0);
        this.d = callAdapter0;
    }

    @Override  // retrofit2.m
    public final Object b(s s0, Object[] arr_object) {
        return this.d.adapt(s0);
    }
}

