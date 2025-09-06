package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Reply;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function2 {
    public final Reply a;
    public final int b;

    public t1(Reply commentItemUIModel$Reply0, int v) {
        this.a = commentItemUIModel$Reply0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ReplyKt.Reply(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

