package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final boolean a;
    public final String b;
    public final String c;
    public final CommentListModel d;
    public final int e;

    public j(boolean z, String s, String s1, CommentListModel commentListModel0, int v) {
        this.a = z;
        this.b = s;
        this.c = s1;
        this.d = commentListModel0;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentBottomBarKt.CommentBottomBar(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

