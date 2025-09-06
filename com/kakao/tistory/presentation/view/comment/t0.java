package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function2 {
    public final CommentFragment a;
    public final CommentListModel b;
    public final int c;

    public t0(CommentFragment commentFragment0, CommentListModel commentListModel0, int v) {
        this.a = commentFragment0;
        this.b = commentListModel0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.CommentListPage(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

