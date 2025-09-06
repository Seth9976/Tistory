package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final int w;
    public final Function2 x;
    public final Function2 y;

    public j(Function2 function20, Function2 function21, int v) {
        this.w = v;
        this.x = function20;
        this.y = function21;
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
                    ComposerKt.traceEventStart(0x707B6565, v1, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                }
                ((Composer)object0).startReplaceGroup(1497073862);
                Function2 function21 = this.x;
                if(function21 != null) {
                    function21.invoke(((Composer)object0), 0);
                }
                ((Composer)object0).endReplaceGroup();
                this.y.invoke(((Composer)object0), 0);
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
                    ComposerKt.traceEventStart(0x455A457C, v2, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                }
                AlertDialogKt.AlertDialogFlowRow-ixp7dh8(8.0f, 12.0f, ComposableLambdaKt.rememberComposableLambda(0x707B6565, true, new j(this.x, this.y, 0), ((Composer)object0), 54), ((Composer)object0), 438);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x4A02F473, v3, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:107)");
                }
                ((Composer)object0).startReplaceGroup(0xD189FF69);
                Function2 function22 = this.x;
                if(function22 != null) {
                    function22.invoke(((Composer)object0), 0);
                }
                ((Composer)object0).endReplaceGroup();
                this.y.invoke(((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                int v4 = ((Number)object1).intValue();
                if((v4 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x264973CA, v4, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:103)");
                }
                AlertDialogKt.AlertDialogFlowRow-ixp7dh8(8.0f, 12.0f, ComposableLambdaKt.rememberComposableLambda(0x4A02F473, true, new j(this.x, this.y, 2), ((Composer)object0), 54), ((Composer)object0), 438);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                int v5 = ((Number)object1).intValue();
                if((v5 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x617EF585, v5, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:164)");
                }
                SegmentedButtonKt.access$SegmentedButtonContent(this.x, this.y, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                int v6 = ((Number)object1).intValue();
                if((v6 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(383378045, v6, -1, "androidx.compose.material3.SegmentedButton.<anonymous> (SegmentedButton.kt:243)");
                }
                SegmentedButtonKt.access$SegmentedButtonContent(this.x, this.y, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1789213604, v, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:84)");
                }
                ((Composer)object0).startReplaceableGroup(0xC19FEE8A);
                Function2 function20 = this.x;
                if(function20 != null) {
                    function20.invoke(((Composer)object0), 0);
                }
                ((Composer)object0).endReplaceableGroup();
                this.y.invoke(((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

