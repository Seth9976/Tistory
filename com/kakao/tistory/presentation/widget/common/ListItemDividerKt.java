package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A&\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"ListItemDivider", "", "showDivider", "", "horizontalPadding", "Landroidx/compose/ui/unit/Dp;", "ListItemDivider-rAjV9yQ", "(ZFLandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nListItemDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItemDivider.kt\ncom/kakao/tistory/presentation/widget/common/ListItemDividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,20:1\n148#2:21\n148#2:22\n*S KotlinDebug\n*F\n+ 1 ListItemDivider.kt\ncom/kakao/tistory/presentation/widget/common/ListItemDividerKt\n*L\n13#1:21\n17#1:22\n*E\n"})
public final class ListItemDividerKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ListItemDivider-rAjV9yQ(boolean z, float f, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xEF001879);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                z = true;
            }
            if((v1 & 2) != 0) {
                f = 20.0f;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEF001879, v2, -1, "com.kakao.tistory.presentation.widget.common.ListItemDivider (ListItemDivider.kt:12)");
            }
            if(!z) {
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                if(scopeUpdateScope0 != null) {
                    scopeUpdateScope0.updateScope(new o1(false, f, v, v1));
                }
                return;
            }
            DividerKt.HorizontalDivider-9IZ8Weo(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, f, 0.0f, 2, null), 1.0f, 0L, composer1, 0x1B0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new p1(z, f, v, v1));
        }
    }
}

