package ca;

import androidx.compose.runtime.MutableFloatState;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.utils.NumberExtensionKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class j1 extends SuspendLambda implements Function2 {
    public final float o;
    public final int p;
    public final MutableFloatState q;
    public final MutableFloatState r;

    public j1(float f, int v, MutableFloatState mutableFloatState0, MutableFloatState mutableFloatState1, Continuation continuation0) {
        this.o = f;
        this.p = v;
        this.q = mutableFloatState0;
        this.r = mutableFloatState1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j1(this.o, this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        MutableFloatState mutableFloatState0 = this.q;
        float f = KDSliderKt.access$KDSlider$lambda$10(mutableFloatState0);
        MutableFloatState mutableFloatState1 = this.r;
        float f1 = KDSliderKt.access$KDSlider$offsetToValue(f, this.p, mutableFloatState1);
        float f2 = this.o;
        if(f1 != NumberExtensionKt.round(f2, this.p)) {
            KDSliderKt.access$KDSlider$lambda$11(mutableFloatState0, KDSliderKt.access$KDSlider$valueToOffset(f2, mutableFloatState1));
        }
        return Unit.INSTANCE;
    }
}

