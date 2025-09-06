package p0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.material.SliderKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import qd.a;

public final class f8 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final float q;
    public final float r;
    public final float s;

    public f8(float f, float f1, float f2, Continuation continuation0) {
        this.q = f;
        this.r = f1;
        this.s = f2;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f8(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f8)this.create(((DragScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                DragScope dragScope0 = (DragScope)this.p;
                FloatRef ref$FloatRef0 = new FloatRef();
                ref$FloatRef0.element = this.q;
                Animatable animatable0 = AnimatableKt.Animatable$default(this.q, 0.0f, 2, null);
                e8 e80 = new e8(dragScope0, ref$FloatRef0);
                this.o = 1;
                return animatable0.animateTo(Boxing.boxFloat(this.r), SliderKt.g, Boxing.boxFloat(this.s), e80, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

