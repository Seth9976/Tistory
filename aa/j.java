package aa;

import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationVisibility;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class j extends SuspendLambda implements Function2 {
    public final DecorationVisibility o;
    public final DecorationControllerInterface p;
    public final Object q;

    public j(DecorationVisibility decorationVisibility0, DecorationControllerInterface decorationControllerInterface0, Object object0, Continuation continuation0) {
        this.o = decorationVisibility0;
        this.p = decorationControllerInterface0;
        this.q = object0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(this.o == DecorationVisibility.Gone) {
            this.p.onOutOfImage(this.q);
        }
        return Unit.INSTANCE;
    }
}

