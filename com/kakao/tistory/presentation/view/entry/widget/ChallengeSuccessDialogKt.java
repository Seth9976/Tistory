package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeDialogKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001A9\u0010\u0007\u001A\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/presentation/widget/dialog/DialogFactory;", "Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "result", "Lkotlin/Function0;", "", "callback", "cancelCallback", "ChallengeSuccessDialog", "(Lcom/kakao/tistory/presentation/widget/dialog/DialogFactory;Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ChallengeSuccessDialogKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ChallengeSuccessDialog(@NotNull DialogFactory dialogFactory0, @NotNull ChallengeResult challengeResult0, @NotNull Function0 function00, @Nullable Function0 function01, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(dialogFactory0, "<this>");
        Intrinsics.checkNotNullParameter(challengeResult0, "result");
        Intrinsics.checkNotNullParameter(function00, "callback");
        Composer composer1 = composer0.startRestartGroup(0x3F38A01D);
        if((v1 & 4) == 0) {
            v2 = v;
        }
        else {
            function01 = dialogFactory0.getDismiss();
            v2 = v & 0xFFFFE3FF;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3F38A01D, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.ChallengeSuccessDialog (ChallengeSuccessDialog.kt:57)");
        }
        AndroidDialog_androidKt.Dialog(function01, null, ComposableLambdaKt.rememberComposableLambda(0x6D5793B4, true, new c(challengeResult0, function00, function01), composer1, 54), composer1, v2 >> 9 & 14 | 0x180, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(dialogFactory0, challengeResult0, function00, function01, v, v1));
        }
    }

    public static final void access$Button(Function0 function00, ButtonColors roundButtonDefaults$ButtonColors0, String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xBAEDD190);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(roundButtonDefaults$ButtonColors0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBAEDD190, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.Button (ChallengeSuccessDialog.kt:136)");
            }
            RoundButtonKt.RoundButton(function00, null, roundButtonDefaults$ButtonColors0, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(0x25336234, true, new a(s), composer1, 54), composer1, v1 & 14 | 0x30000C00 | v1 << 3 & 0x380, 0x1F2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(function00, roundButtonDefaults$ButtonColors0, s, v));
        }
    }

    public static final void access$ChallengeSuccessDialogPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1205214137);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1205214137, v, -1, "com.kakao.tistory.presentation.view.entry.widget.ChallengeSuccessDialogPreview (ChallengeSuccessDialog.kt:31)");
            }
            TistoryComposeDialogKt.DialogHandler(FlowKt.flow(new e(null)), ComposableSingletons.ChallengeSuccessDialogKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(v));
        }
    }
}

