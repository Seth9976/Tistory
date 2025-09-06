package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final ThumbnailUiState a;

    public j(ThumbnailUiState thumbnailUiState0) {
        this.a = thumbnailUiState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x62355B90, v, -1, "com.kakao.tistory.presentation.design.ui.list.BlogTitleWithThumbnail.<anonymous> (BlogTitle.kt:55)");
        }
        BlogThumbnailKt.BlogThumbnail-EUb7tLY(this.a, 18.0f, null, true, null, ((Composer)object0), 0xC30, 20);
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(Modifier.Companion, 6.0f), ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

