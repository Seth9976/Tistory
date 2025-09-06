package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.design.ui.list.BlogTitleKt;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Blog;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function3 {
    public final Entry a;

    public b0(Entry entryListUiState$Entry0) {
        this.a = entryListUiState$Entry0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(z) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-209484957, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotEntryListItemWithBlogThumbnail.<anonymous> (SlotEntryListItem.kt:49)");
        }
        BlogTitleKt.BlogTitleWithThumbnail(((Blog)this.a).getBlogImage(), ((Blog)this.a).getBlogTitle(), null, null, ((Blog)this.a).getOnClickBlog(), z, ((Composer)object1), v << 15 & 0x70000, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

