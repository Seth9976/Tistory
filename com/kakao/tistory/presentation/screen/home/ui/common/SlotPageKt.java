package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.compose.FlowExtKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Page;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001AR\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\u001D\u0010\t\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000B\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000E²\u0006\u0014\u0010\u000F\u001A\u00020\u0010\"\b\b\u0000\u0010\u0002*\u00020\u0003X\u008A\u0084\u0002²\u0006\u001A\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\u00020\u000B\"\b\b\u0000\u0010\u0002*\u00020\u0003X\u008A\u0084\u0002"}, d2 = {"SlotPage", "", "T", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "Landroidx/compose/foundation/layout/ColumnScope;", "page", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Page;", "moreButtonColor", "Lcom/kakao/tistory/presentation/screen/home/ui/common/SlotMoreButtonColor;", "content", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Page;Lcom/kakao/tistory/presentation/screen/home/ui/common/SlotMoreButtonColor;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease", "currentIndex", "", "list"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotPage.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotPageKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,39:1\n148#2:40\n81#3:41\n81#3:42\n*S KotlinDebug\n*F\n+ 1 SlotPage.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotPageKt\n*L\n33#1:40\n25#1:41\n26#1:42\n*E\n"})
public final class SlotPageKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SlotPage(@NotNull ColumnScope columnScope0, @NotNull Page homeSlotUiState$Page0, @Nullable SlotMoreButtonColor slotMoreButtonColor0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(columnScope0, "<this>");
        Intrinsics.checkNotNullParameter(homeSlotUiState$Page0, "page");
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0x9D80E5D0);
        SlotMoreButtonColor slotMoreButtonColor1 = (v1 & 2) == 0 ? slotMoreButtonColor0 : new SlotMoreButtonColor(0L, 0L, 0L, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9D80E5D0, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotPage (SlotPage.kt:23)");
        }
        State state0 = FlowExtKt.collectAsStateWithLifecycle(homeSlotUiState$Page0.getCurrentIndex(), 0, null, null, null, composer1, 56, 14);
        function30.invoke(((List)FlowExtKt.collectAsStateWithLifecycle(homeSlotUiState$Page0.getCurrentPageContents(), CollectionsKt__CollectionsKt.emptyList(), null, null, null, composer1, 56, 14).getValue()), composer1, ((int)(v >> 6 & 0x70 | 8)));
        SlotMoreButtonKt.SlotMoreButton(PaddingKt.padding-qDBjuR0$default(columnScope0.align(Modifier.Companion, Alignment.Companion.getCenterHorizontally()), 0.0f, 0.0f, 0.0f, 24.0f, 7, null), ((Number)state0.getValue()).intValue() + 1, homeSlotUiState$Page0.getTotalPages(), slotMoreButtonColor1, new j1(homeSlotUiState$Page0), composer1, v << 3 & 0x1C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k1(columnScope0, homeSlotUiState$Page0, slotMoreButtonColor1, function30, v, v1));
        }
    }
}

