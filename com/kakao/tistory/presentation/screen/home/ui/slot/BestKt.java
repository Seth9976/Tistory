package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Best;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotEntryListItemKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0017\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "BestPreview", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Best;", "homeSlot", "Best", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Best;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Best.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/BestKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,62:1\n148#2:63\n*S KotlinDebug\n*F\n+ 1 Best.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/BestKt\n*L\n42#1:63\n*E\n"})
public final class BestKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Best(@NotNull Best homeSlotUiState$Best0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(homeSlotUiState$Best0, "homeSlot");
        Composer composer1 = composer0.startRestartGroup(0x9CC76AD7);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9CC76AD7, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Best (Best.kt:38)");
        }
        SlotContainerKt.SlotContainer(null, false, PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, 0.0f, 13, null), ComposableLambdaKt.rememberComposableLambda(329454002, true, new e(homeSlotUiState$Best0), composer1, 54), composer1, 0xD80, 3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(homeSlotUiState$Best0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview
    public static final void BestPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x24D1389F);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x24D1389F, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.BestPreview (Best.kt:15)");
            }
            ArrayList arrayList0 = new ArrayList(4);
            for(int v1 = 0; v1 < 4; ++v1) {
                ThumbnailUiState thumbnailUiState0 = ThumbnailUiStateKt.toThumbnailItem("");
                ThumbnailUiState thumbnailUiState1 = ThumbnailUiStateKt.toThumbnailItem("");
                arrayList0.add(new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Best("", v1, "블로그 제목", thumbnailUiState0, i.a, "엔트리 제목", thumbnailUiState1, j.a, v1, v1, "1시간 전"));
            }
            BestKt.Best(new Best(null, null, arrayList0, 3, null), composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(v));
        }
    }

    public static final void access$BestContent(com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Best homeSlotUiStateContent$Best0, boolean z, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x5EBD8D30);
        int v1 = (v & 14) == 0 ? (composer1.changed(homeSlotUiStateContent$Best0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5EBD8D30, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.BestContent (Best.kt:53)");
            }
            SlotEntryListItemKt.SlotEntryListItemWithBlog(homeSlotUiStateContent$Best0, ComposableLambdaKt.rememberComposableLambda(-2049038013, true, new g(homeSlotUiStateContent$Best0), composer1, 54), z, composer1, v1 & 14 | 0x30 | v1 << 3 & 0x380, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(homeSlotUiStateContent$Best0, z, v));
        }
    }
}

