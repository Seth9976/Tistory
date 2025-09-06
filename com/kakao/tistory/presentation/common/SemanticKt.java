package com.kakao.tistory.presentation.common;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\u001A%\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"contentDescription", "Landroidx/compose/ui/Modifier;", "values", "", "", "(Landroidx/compose/ui/Modifier;[Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemantic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semantic.kt\ncom/kakao/tistory/presentation/common/SemanticKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,17:1\n1223#2,6:18\n*S KotlinDebug\n*F\n+ 1 Semantic.kt\ncom/kakao/tistory/presentation/common/SemanticKt\n*L\n14#1:18,6\n*E\n"})
public final class SemanticKt {
    @Composable
    @NotNull
    public static final Modifier contentDescription(@NotNull Modifier modifier0, @NotNull String[] arr_s, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(arr_s, "values");
        composer0.startReplaceGroup(797018019);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(797018019, v, -1, "com.kakao.tistory.presentation.common.contentDescription (Semantic.kt:10)");
        }
        String s = ArraysKt___ArraysKt.joinToString$default(arr_s, " ", null, null, 0, null, null, 62, null);
        composer0.startReplaceGroup(1915821780);
        boolean z = composer0.changed(s);
        b b0 = composer0.rememberedValue();
        if(z || b0 == Composer.Companion.getEmpty()) {
            b0 = new b(s);
            composer0.updateRememberedValue(b0);
        }
        composer0.endReplaceGroup();
        Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, b0, 1, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier1;
    }
}

