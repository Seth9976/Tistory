package z5;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public final class b implements Function1, Callback {
    public final int a;
    public final Object b;
    public final Object c;

    public b(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.a != 0) {
            ((OverridingStrategy)this.b).inheritanceConflict(((CallableMemberDescriptor)this.c), ((CallableMemberDescriptor)object0));
            return Unit.INSTANCE;
        }
        Throwable throwable0 = (Throwable)object0;
        try {
            ((Call)this.b).cancel();
        }
        catch(Throwable unused_ex) {
        }
        return Unit.INSTANCE;
    }

    @Override  // okhttp3.Callback
    public void onFailure(Call call0, IOException iOException0) {
        if(!call0.isCanceled()) {
            Object object0 = Result.constructor-impl(ResultKt.createFailure(iOException0));
            ((CancellableContinuationImpl)this.c).resumeWith(object0);
        }
    }

    @Override  // okhttp3.Callback
    public void onResponse(Call call0, Response response0) {
        ((CancellableContinuationImpl)this.c).resumeWith(response0);
    }
}

