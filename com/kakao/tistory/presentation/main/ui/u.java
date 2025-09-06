package com.kakao.tistory.presentation.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogShape;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final Blog a;
    public final String b;

    public u(Blog blog0, String s) {
        this.a = blog0;
        this.b = s;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ThumbnailUiState thumbnailUiState0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4D55F9C0, v, -1, "com.kakao.tistory.presentation.main.ui.BottomBarMyItem.<anonymous>.<anonymous> (MainBottomBar.kt:130)");
        }
        Blog blog0 = this.a;
        if(blog0 == null) {
            thumbnailUiState0 = null;
        }
        else {
            String s = blog0.getLogoImageUrl();
            thumbnailUiState0 = s == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s);
        }
        BlogThumbnailKt.BlogThumbnail-EUb7tLY(thumbnailUiState0, 26.0f, DrawModifierKt.drawWithCache(ClipKt.clip(Modifier.Companion, BlogShape.INSTANCE), t.a), false, this.b, ((Composer)object0), 0x30, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

