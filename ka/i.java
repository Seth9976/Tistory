package ka;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.mosaic.MosaicViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class i extends SuspendLambda implements Function2 {
    public Object o;
    public final MosaicViewModel p;
    public final State q;

    public i(MosaicViewModel mosaicViewModel0, State state0, Continuation continuation0) {
        this.p = mosaicViewModel0;
        this.q = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i(this.p, this.q, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0 = this.p.getBitmapLoader();
        BuildersKt.launch$default(coroutineScope0, null, null, new f(this.q, mosaicAndBlurBitmapLoader0, null), 3, null);
        BuildersKt.launch$default(coroutineScope0, null, null, new h(this.q, mosaicAndBlurBitmapLoader0, null), 3, null);
        return Unit.INSTANCE;
    }
}

