package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.view.comment.BaseCommentTiara;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public final CommentModifyModel a;
    public final BaseCommentTiara b;
    public final int c;

    public g1(CommentModifyModel commentModifyModel0, BaseCommentTiara baseCommentTiara0, int v) {
        this.a = commentModifyModel0;
        this.b = baseCommentTiara0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentModifyPageKt.CommentModifyPage(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

