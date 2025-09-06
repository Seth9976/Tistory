package ga;

import android.graphics.Bitmap;
import androidx.compose.runtime.ProduceStateScope;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.filter.ui.ImageState.Failed;
import com.kakao.kandinsky.filter.ui.ImageState.Success;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Function3 q;
    public final Filter r;
    public final int s;

    public e(Function3 function30, Filter filter0, int v, Continuation continuation0) {
        this.q = function30;
        this.r = filter0;
        this.s = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((ProduceStateScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProduceStateScope produceStateScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProduceStateScope produceStateScope0 = (ProduceStateScope)this.p;
                this.p = produceStateScope0;
                this.o = 1;
                Object object2 = this.q.invoke(this.r, Boxing.boxInt(this.s), this);
                if(object2 == object1) {
                    return object1;
                }
                produceStateScope1 = produceStateScope0;
                object0 = object2;
                break;
            }
            case 1: {
                produceStateScope1 = (ProduceStateScope)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ImageState.Failed imageState$Failed0 = ((Bitmap)object0) == null ? ImageState.Failed.INSTANCE : new ImageState.Success(((Bitmap)object0));
        produceStateScope1.setValue(imageState$Failed0);
        return Unit.INSTANCE;
    }
}

