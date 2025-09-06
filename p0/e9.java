package p0;

import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SnackbarKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.e1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class e9 extends Lambda implements Function2 {
    public final int w;
    public final Function x;
    public final Object y;
    public final boolean z;

    public e9(Function2 function20, Function2 function21, boolean z, int v) {
        this.w = v;
        this.x = function20;
        this.y = function21;
        this.z = z;
        super(2);
    }

    public e9(boolean z, Function3 function30, RowScopeInstance rowScopeInstance0) {
        this.w = 3;
        this.z = z;
        this.x = function30;
        this.y = rowScopeInstance0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        float f;
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD6AF9AD, v1, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:101)");
                }
                Function2 function20 = (Function2)this.y;
                Function2 function21 = (Function2)this.x;
                if(function21 == null) {
                    ((Composer)object0).startReplaceableGroup(0x38F13E4);
                    SnackbarKt.access$TextOnlySnackbar(function20, ((Composer)object0), 0);
                }
                else if(this.z) {
                    ((Composer)object0).startReplaceableGroup(0x38F1425);
                    SnackbarKt.access$NewLineButtonSnackbar(function20, function21, ((Composer)object0), 0);
                }
                else {
                    ((Composer)object0).startReplaceableGroup(59708520);
                    SnackbarKt.access$OneRowSnackbar(function20, function21, ((Composer)object0), 0);
                }
                ((Composer)object0).endReplaceableGroup();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x739851BC, v2, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:99)");
                }
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getBody2(), ComposableLambdaKt.composableLambda(((Composer)object0), 0xD6AF9AD, true, new e9(((Function2)this.x), ((Function2)this.y), this.z, 0)), ((Composer)object0), 0x30);
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
                    ComposerKt.traceEventStart(-2084221700, v3, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:98)");
                }
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(ContentAlpha.INSTANCE.getHigh(((Composer)object0), 6)), ComposableLambdaKt.composableLambda(((Composer)object0), 0x739851BC, true, new e9(((Function2)this.x), ((Function2)this.y), this.z, 1)), ((Composer)object0), ProvidedValue.$stable | 0x30);
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
                    ComposerKt.traceEventStart(0x46F56D98, v, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:164)");
                }
                if(this.z) {
                    ((Composer)object0).startReplaceableGroup(0x8C070BB8);
                    f = ContentAlpha.INSTANCE.getHigh(((Composer)object0), 6);
                }
                else {
                    ((Composer)object0).startReplaceableGroup(0x8C070BCF);
                    f = ContentAlpha.INSTANCE.getDisabled(((Composer)object0), 6);
                }
                ((Composer)object0).endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f), ComposableLambdaKt.composableLambda(((Composer)object0), 0x9A509258, true, new e1(((Function3)this.x), ((RowScopeInstance)this.y), 3)), ((Composer)object0), ProvidedValue.$stable | 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

