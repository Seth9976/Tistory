package com.kakao.tistory.presentation.widget.common;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A+\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"BlogLogoView", "", "modifier", "Landroidx/compose/ui/Modifier;", "blog", "Lcom/kakao/tistory/domain/entity/Blog;", "placeHolder", "", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/domain/entity/Blog;ILandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogLogoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogLogoView.kt\ncom/kakao/tistory/presentation/widget/common/BlogLogoViewKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class BlogLogoViewKt {
    @Composable
    public static final void BlogLogoView(@Nullable Modifier modifier0, @Nullable Blog blog0, @DrawableRes int v, @Nullable Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(1692740711);
        if((v2 & 1) != 0) {
            modifier0 = Modifier.Companion;
        }
        if((v2 & 4) == 0) {
            v3 = v1;
        }
        else {
            v = drawable.ic_img_blogimg_default_s;
            v3 = v1 & -897;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1692740711, v3, -1, "com.kakao.tistory.presentation.widget.common.BlogLogoView (BlogLogoView.kt:14)");
        }
        Integer integer0 = v;
        if(blog0 != null) {
            String s = blog0.getLogoImageUrl();
            if(s != null) {
                if(s.length() <= 0) {
                    s = null;
                }
                if(s != null) {
                    integer0 = s;
                }
            }
        }
        CommonImageKt.CommonImage(integer0, null, modifier0, null, null, ContentScale.Companion.getCrop(), composer1, v3 << 6 & 0x380 | 0x30038, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(modifier0, blog0, v, v1, v2));
        }
    }
}

