package a;

import com.kakao.kandinsky.preview.PreviewAnimator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class d1 extends SuspendLambda implements Function2 {
    public final PreviewAnimator a;
    public final int b;
    public final int c;

    public d1(PreviewAnimator previewAnimator0, int v, int v1, Continuation continuation0) {
        this.a = previewAnimator0;
        this.b = v;
        this.c = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d1(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.a.startBounceAnimation(this.b, this.c);
        return Unit.INSTANCE;
    }
}

