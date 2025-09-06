package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p0.u8;

public final class m2 extends Lambda implements Function2 {
    public final int w;
    public final long x;
    public final Object y;
    public final Object z;

    public m2(long v, Object object0, Object object1, int v1) {
        this.w = v1;
        this.x = v;
        this.y = object0;
        this.z = object1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x3902DB2E, v1, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)");
                }
                TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getLabelLarge();
                ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x4F204156, true, new l2(((PaddingValues)this.y), ((Function3)this.z)), ((Composer)object0), 54);
                ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(this.x, textStyle0, composableLambda0, ((Composer)object0), 0x180);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xADD89A81, v2, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:216)");
                }
                ButtonColors buttonColors0 = ButtonDefaults.INSTANCE.textButtonColors-ro_MJ88(0L, this.x, 0L, 0L, ((Composer)object0), 0x6000, 13);
                SnackbarData snackbarData0 = (SnackbarData)this.y;
                boolean z = ((Composer)object0).changed(snackbarData0);
                sl sl0 = ((Composer)object0).rememberedValue();
                if(z || sl0 == Composer.Companion.getEmpty()) {
                    sl0 = new sl(snackbarData0, 1);
                    ((Composer)object0).updateRememberedValue(sl0);
                }
                ButtonKt.TextButton(sl0, null, false, null, buttonColors0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0x1F0F8424, true, new jm(((String)this.z), 0), ((Composer)object0), 54), ((Composer)object0), 0x30000000, 494);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x6DE142B0, v3, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:165)");
                }
                androidx.compose.material.ButtonColors buttonColors1 = androidx.compose.material.ButtonDefaults.INSTANCE.textButtonColors-RGew2ao(0L, this.x, 0L, ((Composer)object0), 0xC00, 5);
                androidx.compose.material.ButtonKt.TextButton(new u8(((androidx.compose.material.SnackbarData)this.y), 1), null, false, null, null, null, null, buttonColors1, null, ComposableLambdaKt.composableLambda(((Composer)object0), 0xC89E4C13, true, new jm(((String)this.z), 1)), ((Composer)object0), 0x30000000, 382);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1263707005, v, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
                }
                TextFieldImplKt.access$Decoration-3J-VO9M(this.x, ((TextStyle)this.y), ((Function2)this.z), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

