package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function1 {
    public final MutableState a;
    public final MutableState b;
    public final z1 c;
    public final MentionVisualTransformation d;
    public final TextFieldValue e;

    public c0(MutableState mutableState0, MutableState mutableState1, z1 z10, MentionVisualTransformation mentionVisualTransformation0, TextFieldValue textFieldValue0) {
        this.a = mutableState0;
        this.b = mutableState1;
        this.c = z10;
        this.d = mentionVisualTransformation0;
        this.e = textFieldValue0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        CommentEditFieldKt.access$TextFieldWithMention$lambda$27(this.a, IntSize.getHeight-impl(((IntSize)object0).unbox-impl()));
        TextLayoutResult textLayoutResult0 = CommentEditFieldKt.access$TextFieldWithMention$lambda$23(this.b);
        if(textLayoutResult0 != null) {
            int v = CommentEditFieldKt.access$TextFieldWithMention$lambda$26(this.a);
            CommentEditFieldKt.access$TextFieldWithMention$updateMentionScroll(this.c, this.d, this.e, textLayoutResult0, v);
        }
        return Unit.INSTANCE;
    }
}

