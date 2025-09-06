package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001A+\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u000E\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001A\u0002H\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006²\u0006 \u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00030\b\"\u000E\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u0001X\u008A\u0084\u0002"}, d2 = {"rememberImmutableFunctionState", "Lkotlin/Function0;", "", "T", "newValue", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "presentation_prodRelease", "event", "Lcom/kakao/tistory/presentation/widget/common/FunctionState;"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFunctionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionState.kt\ncom/kakao/tistory/presentation/widget/common/FunctionStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,20:1\n1223#2,6:21\n1223#2,6:27\n81#3:33\n*S KotlinDebug\n*F\n+ 1 FunctionState.kt\ncom/kakao/tistory/presentation/widget/common/FunctionStateKt\n*L\n16#1:21,6\n19#1:27,6\n16#1:33\n*E\n"})
public final class FunctionStateKt {
    @Composable
    @NotNull
    public static final Function0 rememberImmutableFunctionState(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "newValue");
        composer0.startReplaceGroup(0x28A0D46A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x28A0D46A, v, -1, "com.kakao.tistory.presentation.widget.common.rememberImmutableFunctionState (FunctionState.kt:14)");
        }
        composer0.startReplaceGroup(0xB345FBF);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new FunctionState(function00), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        ((FunctionState)mutableState0.getValue()).update(function00);
        FunctionState functionState0 = (FunctionState)mutableState0.getValue();
        composer0.startReplaceGroup(187985208);
        boolean z = composer0.changed(functionState0);
        i1 i10 = composer0.rememberedValue();
        if(z || i10 == composer$Companion0.getEmpty()) {
            i10 = new i1(functionState0);
            composer0.updateRememberedValue(i10);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return i10;
    }
}

