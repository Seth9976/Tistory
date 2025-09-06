package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.ComposeView;
import com.kakao.tistory.domain.entity.CategoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final CategoryViewHolder a;
    public final CategoryItem b;
    public final boolean c;
    public final Function0 d;

    public d(CategoryViewHolder blogCategoryDialogAdapter$CategoryViewHolder0, CategoryItem categoryItem0, boolean z, Function0 function00) {
        this.a = blogCategoryDialogAdapter$CategoryViewHolder0;
        this.b = categoryItem0;
        this.c = z;
        this.d = function00;
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
            ComposerKt.traceEventStart(750949598, v, -1, "com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogAdapter.CategoryViewHolder.bind.<anonymous> (BlogCategoryDialogAdapter.kt:142)");
        }
        this.a.Content(this.b, this.c, this.d, ((Composer)object0), ComposeView.$stable << 9 | 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

