package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale.DefaultImpls;
import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class d1 implements MotionDurationScale {
    public final MutableFloatState a;

    public d1() {
        this.a = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final Object fold(Object object0, Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final Element get(Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    @Override  // androidx.compose.ui.MotionDurationScale
    public final float getScaleFactor() {
        return this.a.getFloatValue();
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final CoroutineContext minusKey(Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }
}

