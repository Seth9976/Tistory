package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A)\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"DeleteBottomSheet", "", "onDeleteClick", "Lkotlin/Function0;", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class DeleteBottomSheetKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DeleteBottomSheet(@NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onDeleteClick");
        Intrinsics.checkNotNullParameter(function01, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(1037376697);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037376697, v1, -1, "com.kakao.tistory.presentation.screen.notification.ui.DeleteBottomSheet (DeleteBottomSheet.kt:12)");
            }
            TistoryComposeBottomSheetKt.TistoryComposeBottomSheet(false, function01, ComposableLambdaKt.rememberComposableLambda(0x3B703D4, true, new e(function00, function01), composer1, 54), composer1, v1 & 0x70 | 0x180, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(function00, function01, v));
        }
    }
}

