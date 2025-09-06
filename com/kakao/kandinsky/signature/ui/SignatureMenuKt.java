package com.kakao.kandinsky.signature.ui;

import aa.d;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.kandinsky.designsystem.common.MenuListKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import va.v;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A+\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"SignatureMenu", "", "selected", "Lcom/kakao/kandinsky/signature/ui/SignatureMenu;", "onClick", "Lkotlin/Function1;", "(Lcom/kakao/kandinsky/signature/ui/SignatureMenu;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "signature_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SignatureMenuKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SignatureMenu(@Nullable SignatureMenu signatureMenu0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x335A1AEA);
        int v1 = (v & 14) == 0 ? (composer1.changed(signatureMenu0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x335A1AEA, v1, -1, "com.kakao.kandinsky.signature.ui.SignatureMenu (SignatureMenu.kt:21)");
            }
            MenuListKt.MenuList(null, null, ComposableLambdaKt.rememberComposableLambda(396551830, true, new v(0, signatureMenu0, function10), composer1, 54), composer1, 0x180, 3);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(signatureMenu0, function10, v, 25));
        }
    }
}

