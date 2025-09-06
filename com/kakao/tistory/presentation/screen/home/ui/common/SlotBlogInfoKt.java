package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.kakao.tistory.presentation.design.ui.list.BlogTitleKt;
import com.kakao.tistory.presentation.design.ui.list.BlogTitleStyle;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Blog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001F\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"SlotBlogInfoOnImage", "", "blog", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotBlogInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotBlogInfo.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotBlogInfoKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,22:1\n148#2:23\n*S KotlinDebug\n*F\n+ 1 SlotBlogInfo.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotBlogInfoKt\n*L\n13#1:23\n*E\n"})
public final class SlotBlogInfoKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SlotBlogInfoOnImage(@NotNull Blog entryListUiState$Blog0, @Nullable PaddingValues paddingValues0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(entryListUiState$Blog0, "blog");
        Composer composer1 = composer0.startRestartGroup(0xA5D64849);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(entryListUiState$Blog0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                paddingValues0 = PaddingKt.PaddingValues-0680j_4(0.0f);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA5D64849, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotBlogInfoOnImage (SlotBlogInfo.kt:13)");
            }
            BlogTitleKt.BlogTitleWithThumbnail(entryListUiState$Blog0.getBlogImage(), entryListUiState$Blog0.getBlogTitle(), BlogTitleStyle.INSTANCE.getOnImage(), paddingValues0, entryListUiState$Blog0.getOnClickBlog(), false, composer1, v2 << 6 & 0x1C00 | 0x180, 0x20);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(entryListUiState$Blog0, paddingValues0, v, v1));
        }
    }
}

