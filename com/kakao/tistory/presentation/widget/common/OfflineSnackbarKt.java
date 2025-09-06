package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"OfflineSnackbar", "", "isOnline", "", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "(ZLandroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOfflineSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineSnackbar.kt\ncom/kakao/tistory/presentation/widget/common/OfflineSnackbarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,22:1\n1223#2,6:23\n*S KotlinDebug\n*F\n+ 1 OfflineSnackbar.kt\ncom/kakao/tistory/presentation/widget/common/OfflineSnackbarKt\n*L\n14#1:23,6\n*E\n"})
public final class OfflineSnackbarKt {
    @Composable
    public static final void OfflineSnackbar(boolean z, @NotNull SnackbarHostState snackbarHostState0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(snackbarHostState0, "snackbarHostState");
        Composer composer1 = composer0.startRestartGroup(0x1D4E5BCD);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(snackbarHostState0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1D4E5BCD, v1, -1, "com.kakao.tistory.presentation.widget.common.OfflineSnackbar (OfflineSnackbar.kt:11)");
            }
            int v2 = 0;
            String s = StringResources_androidKt.stringResource(string.label_exception_not_connected, composer1, 0);
            Boolean boolean0 = Boolean.valueOf(z);
            composer1.startReplaceGroup(0xDC5CB2F1);
            if((v1 & 0x70) == 0x20) {
                v2 = 1;
            }
            boolean z1 = composer1.changed(s);
            s1 s10 = composer1.rememberedValue();
            if((((v1 & 14) == 4 ? 1 : 0) | v2 | z1) != 0 || s10 == Composer.Companion.getEmpty()) {
                s10 = new s1(z, snackbarHostState0, s, null);
                composer1.updateRememberedValue(s10);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean0, s10, composer1, v1 & 14 | 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t1(z, snackbarHostState0, v));
        }
    }
}

