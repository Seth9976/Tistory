package p0;

import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class kb extends Lambda implements Function2 {
    public final int w;
    public final long x;
    public final Float y;
    public final Function2 z;

    public kb(long v, Float float0, Function2 function20) {
        this.w = 1;
        this.x = v;
        this.y = float0;
        this.z = function20;
        super(2);
    }

    public kb(Float float0, Function2 function20, long v) {
        this.w = 0;
        this.y = float0;
        this.z = function20;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(494684590, v, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:225)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(this.x)), ComposableLambdaKt.composableLambda(((Composer)object0), 0xBC842CEE, true, new kb(this.y, this.z, this.x)), ((Composer)object0), ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBC842CEE, v1, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:226)");
        }
        Function2 function20 = this.z;
        Float float0 = this.y;
        if(float0 == null) {
            ((Composer)object0).startReplaceableGroup(0xE5058752);
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Color.getAlpha-impl(this.x)), function20, ((Composer)object0), ProvidedValue.$stable);
        }
        else {
            ((Composer)object0).startReplaceableGroup(0xE505869E);
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(float0), function20, ((Composer)object0), ProvidedValue.$stable);
        }
        ((Composer)object0).endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

