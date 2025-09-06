package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k4 extends Lambda implements Function1 {
    public final int w;
    public final Object x;

    public k4(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                float f = ((Number)((Animatable)object0).getValue()).floatValue();
                n4 n40 = (n4)this.x;
                WindowInsetsAnimationController windowInsetsAnimationController0 = n40.e;
                if(windowInsetsAnimationController0 != null) {
                    Insets insets0 = windowInsetsAnimationController0.getCurrentInsets();
                    e4.p(windowInsetsAnimationController0, n40.c.adjustInsets(insets0, Math.round(f)));
                }
                return Unit.INSTANCE;
            }
            case 1: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                return new WindowInsetsConnection_androidKt.rememberWindowInsetsConnection.1.1.invoke..inlined.onDispose.1(((n4)this.x));
            }
            default: {
                ((InspectorInfo)object0).setName("padding");
                ((InspectorInfo)object0).getProperties().set("paddingValues", ((PaddingValues)this.x));
                return Unit.INSTANCE;
            }
        }
    }
}

