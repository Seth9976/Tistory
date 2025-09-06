package com.kakao.tistory.presentation.design.ui.loading;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001C\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0006"}, d2 = {"CircularLoading", "", "color", "Landroidx/compose/ui/graphics/Color;", "CircularLoading-Iv8Zu3U", "(JLandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCircularLoading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularLoading.kt\ncom/kakao/tistory/presentation/design/ui/loading/CircularLoadingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,25:1\n148#2:26\n*S KotlinDebug\n*F\n+ 1 CircularLoading.kt\ncom/kakao/tistory/presentation/design/ui/loading/CircularLoadingKt\n*L\n22#1:26\n*E\n"})
public final class CircularLoadingKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CircularLoading-Iv8Zu3U(long v, @Nullable Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xFACD96D);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v3 & 11) != 2 || !composer1.getSkipping()) {
            if((v2 & 1) != 0) {
                v = 0L;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFACD96D, v3, -1, "com.kakao.tistory.presentation.design.ui.loading.CircularLoading (CircularLoading.kt:16)");
            }
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.wrapContentWidth$default(PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 20.0f), Alignment.Companion.getCenterHorizontally(), false, 2, null), v, 0.0f, 0L, 0, composer1, v3 << 3 & 0x70 | 6, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, v1, v2));
        }
    }
}

