package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function2 {
    public final TextFieldValue a;
    public final Function1 b;
    public final CommentItem c;
    public final CommentItem d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final FocusRequester h;
    public final Function1 i;
    public final Function1 j;
    public final int k;
    public final int l;

    public t(TextFieldValue textFieldValue0, Function1 function10, CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, boolean z, String s, boolean z1, FocusRequester focusRequester0, Function1 function11, Function1 function12, int v, int v1) {
        this.a = textFieldValue0;
        this.b = function10;
        this.c = commentItemType$CommentItem0;
        this.d = commentItemType$CommentItem1;
        this.e = z;
        this.f = s;
        this.g = z1;
        this.h = focusRequester0;
        this.i = function11;
        this.j = function12;
        this.k = v;
        this.l = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentEditFieldKt.CommentEditField(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ((Composer)object0), (this.k | 1) & -920350135 | ((0x24924924 & (this.k | 1)) >> 1 | 306783378 & (this.k | 1)) | (306783378 & (this.k | 1)) << 1 & (0x24924924 & (this.k | 1)), this.l);
        return Unit.INSTANCE;
    }
}

