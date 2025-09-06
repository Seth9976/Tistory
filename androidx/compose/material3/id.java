package androidx.compose.material3;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class id extends Lambda implements Function1 {
    public final int w;
    public final jd x;

    public id(jd jd0, int v) {
        this.w = v;
        this.x = jd0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
            this.x.show();
            return new ModalBottomSheet_androidKt.ModalBottomSheetDialog.1.1.invoke..inlined.onDispose.1(this.x);
        }
        OnBackPressedCallback onBackPressedCallback0 = (OnBackPressedCallback)object0;
        jd jd0 = this.x;
        if(jd0.e.getShouldDismissOnBackPress()) {
            jd0.d.invoke();
        }
        return Unit.INSTANCE;
    }
}

