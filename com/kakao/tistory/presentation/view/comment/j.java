package com.kakao.tistory.presentation.view.comment;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final ModalBottomSheetState a;
    public final CommentListViewModel b;
    public final int c;

    public j(ModalBottomSheetState modalBottomSheetState0, CommentListViewModel commentListViewModel0, int v) {
        this.a = modalBottomSheetState0;
        this.b = commentListViewModel0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentBottomSheetKt.CommentBottomSheet(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

