package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final Modifier a;
    public final TextFieldValue b;
    public final Function1 c;
    public final CommentItem d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final FocusRequester h;
    public final Function0 i;
    public final Function1 j;
    public final int k;
    public final int l;

    public x(Modifier modifier0, TextFieldValue textFieldValue0, Function1 function10, CommentItem commentItemType$CommentItem0, boolean z, boolean z1, String s, FocusRequester focusRequester0, Function0 function00, Function1 function11, int v, int v1) {
        this.a = modifier0;
        this.b = textFieldValue0;
        this.c = function10;
        this.d = commentItemType$CommentItem0;
        this.e = z;
        this.f = z1;
        this.g = s;
        this.h = focusRequester0;
        this.i = function00;
        this.j = function11;
        this.k = v;
        this.l = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentEditFieldKt.CommentModifyEditField(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ((Composer)object0), (this.k | 1) & -920350135 | ((0x24924924 & (this.k | 1)) >> 1 | 306783378 & (this.k | 1)) | (306783378 & (this.k | 1)) << 1 & (0x24924924 & (this.k | 1)), this.l);
        return Unit.INSTANCE;
    }
}

