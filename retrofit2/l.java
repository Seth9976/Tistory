package retrofit2;

import kotlin.coroutines.Continuation;
import okhttp3.Call.Factory;

public final class l extends m {
    public final CallAdapter d;

    public l(i0 i00, Factory call$Factory0, Converter converter0, CallAdapter callAdapter0) {
        super(i00, call$Factory0, converter0);
        this.d = callAdapter0;
    }

    @Override  // retrofit2.m
    public final Object b(s s0, Object[] arr_object) {
        Call call0 = (Call)this.d.adapt(s0);
        Continuation continuation0 = (Continuation)arr_object[arr_object.length - 1];
        try {
            return KotlinExtensions.awaitResponse(call0, continuation0);
        }
        catch(Exception exception0) {
            return KotlinExtensions.suspendAndThrow(exception0, continuation0);
        }
    }
}

