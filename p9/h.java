package p9;

import com.kakao.kandinsky.base.KDMviViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class h extends AdaptedFunctionReference implements SuspendFunction, Function3 {
    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        return KDMviViewModel.access$uiState$handleIntent(((KDMviViewModel)this.receiver), object0, object1, ((Continuation)object2));
    }
}

