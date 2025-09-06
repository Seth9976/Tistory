package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.b0;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A&\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006H\u0007\u001A+\u0010\u0007\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"BasicTooltipState", "Landroidx/compose/foundation/BasicTooltipState;", "initialIsVisible", "", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "rememberBasicTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BasicTooltipState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,246:1\n1223#2,6:247\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:247,6\n*E\n"})
public final class BasicTooltipKt {
    @ExperimentalFoundationApi
    @Stable
    @NotNull
    public static final BasicTooltipState BasicTooltipState(boolean z, boolean z1, @NotNull MutatorMutex mutatorMutex0) {
        return new b0(z, z1, mutatorMutex0);
    }

    public static BasicTooltipState BasicTooltipState$default(boolean z, boolean z1, MutatorMutex mutatorMutex0, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            mutatorMutex0 = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipKt.BasicTooltipState(z, z1, mutatorMutex0);
    }

    @ExperimentalFoundationApi
    @Composable
    @NotNull
    public static final BasicTooltipState rememberBasicTooltipState(boolean z, boolean z1, @Nullable MutatorMutex mutatorMutex0, @Nullable Composer composer0, int v, int v1) {
        int v2 = 0;
        if((v1 & 1) != 0) {
            z = false;
        }
        if((v1 & 2) != 0) {
            z1 = true;
        }
        if((v1 & 4) != 0) {
            mutatorMutex0 = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x42FCBC9D, v, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:82)");
        }
        int v3 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(z1)) && (v & 0x30) != 0x20 ? 0 : 1;
        if((v & 0x380 ^ 0x180) > 0x100 && composer0.changed(mutatorMutex0) || (v & 0x180) == 0x100) {
            v2 = 1;
        }
        b0 b00 = composer0.rememberedValue();
        if((v3 | v2) != 0 || b00 == Composer.Companion.getEmpty()) {
            b00 = new b0(z, z1, mutatorMutex0);
            composer0.updateRememberedValue(b00);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return b00;
    }
}

