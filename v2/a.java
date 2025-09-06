package v2;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.1.1.invoke..inlined.onDispose.1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final int w;
    public final o x;

    public a(o o0, int v) {
        this.w = v;
        this.x = o0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            OnBackPressedCallback onBackPressedCallback0 = (OnBackPressedCallback)object0;
            o o0 = this.x;
            if(o0.e.getDismissOnBackPress()) {
                o0.d.invoke();
            }
            return Unit.INSTANCE;
        }
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        this.x.show();
        return new AndroidDialog_androidKt.Dialog.1.1.invoke..inlined.onDispose.1(this.x);
    }
}

