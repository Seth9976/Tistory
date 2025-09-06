package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"SlotSpace", "", "(Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotSpace.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotSpaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,17:1\n148#2:18\n*S KotlinDebug\n*F\n+ 1 SlotSpace.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotSpaceKt\n*L\n15#1:18\n*E\n"})
public final class SlotSpaceKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SlotSpace(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFD5BC14C);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFD5BC14C, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotSpace (SlotSpace.kt:10)");
            }
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 10.0f), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l1(v));
        }
    }
}

