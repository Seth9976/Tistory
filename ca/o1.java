package ca;

import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;

public final class o1 extends FunctionReferenceImpl implements SuspendFunction, Function3 {
    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        return KDSliderKt.access$Slider$suspendConversion1(((Function2)this.receiver), ((CoroutineScope)object0), ((Number)object1).floatValue(), ((Continuation)object2));
    }
}

