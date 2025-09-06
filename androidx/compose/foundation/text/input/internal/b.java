package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics.Kotlin;

public final class b extends FunctionReferenceImpl implements Function1 {
    public final LegacyPlatformTextInputNode a;

    public b(LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0) {
        this.a = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0;
        super(1, Kotlin.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float[] arr_f = ((Matrix)object0).unbox-impl();
        AndroidLegacyPlatformTextInputServiceAdapter.access$startInput$localToScreen(this.a, arr_f);
        return Unit.INSTANCE;
    }
}

