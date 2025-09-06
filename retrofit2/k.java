package retrofit2;

import kotlin.coroutines.Continuation;
import okhttp3.Call.Factory;

public final class k extends m {
    public final CallAdapter d;
    public final boolean e;

    public k(i0 i00, Factory call$Factory0, Converter converter0, CallAdapter callAdapter0, boolean z) {
        super(i00, call$Factory0, converter0);
        this.d = callAdapter0;
        this.e = z;
    }

    @Override  // retrofit2.m
    public final Object b(s s0, Object[] arr_object) {
        Call call0 = (Call)this.d.adapt(s0);
        Continuation continuation0 = (Continuation)arr_object[arr_object.length - 1];
        try {
            return this.e ? KotlinExtensions.awaitUnit(call0, continuation0) : KotlinExtensions.await(call0, continuation0);
        }
        catch(VirtualMachineError | ThreadDeath | LinkageError virtualMachineError0) {
        }
        catch(Throwable throwable0) {
            return KotlinExtensions.suspendAndThrow(throwable0, continuation0);
        }
        throw virtualMachineError0;
    }
}

