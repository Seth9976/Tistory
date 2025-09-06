package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d4 extends Lambda implements Function1 {
    public final WindowInsetsHolder w;
    public final View x;

    public d4(WindowInsetsHolder windowInsetsHolder0, View view0) {
        this.w = windowInsetsHolder0;
        this.x = view0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        this.w.incrementAccessors(this.x);
        return new WindowInsetsHolder.Companion.current.1.1.invoke..inlined.onDispose.1(this.w, this.x);
    }
}

