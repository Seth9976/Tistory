package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A#\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"SortSelectButton", "", "sort", "", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryTopAppBarSort.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryTopAppBarSort.kt\ncom/kakao/tistory/presentation/widget/common/TistoryTopAppBarSortKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,42:1\n148#2:43\n148#2:44\n*S KotlinDebug\n*F\n+ 1 TistoryTopAppBarSort.kt\ncom/kakao/tistory/presentation/widget/common/TistoryTopAppBarSortKt\n*L\n23#1:43\n24#1:44\n*E\n"})
public final class TistoryTopAppBarSortKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SortSelectButton(@NotNull String s, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "sort");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(-879104965);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-879104965, v1, -1, "com.kakao.tistory.presentation.widget.common.SortSelectButton (TistoryTopAppBarSort.kt:21)");
            }
            ButtonKt.TextButton(function00, OffsetKt.offset-VpY3zN4(Modifier.Companion, 8.0f, 13.0f), false, null, null, null, null, PaddingKt.PaddingValues-YgX7TsA(8.0f, 13.0f), null, ComposableLambdaKt.rememberComposableLambda(0x686F6DDE, true, new w4(s), composer1, 54), composer1, v1 >> 3 & 14 | 0x30C00030, 380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x4(s, function00, v));
        }
    }
}

