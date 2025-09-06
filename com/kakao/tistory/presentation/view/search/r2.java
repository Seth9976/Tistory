package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r2 extends Lambda implements Function0 {
    public final TextFieldValue a;
    public final MutableState b;

    public r2(TextFieldValue textFieldValue0, MutableState mutableState0) {
        this.a = textFieldValue0;
        this.b = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long v = SearchToolbarKt.access$SearchTextField$lambda$5(this.b).getSelection-d9O1mEE();
        if(TextRange.equals-impl0(this.a.getSelection-d9O1mEE(), v)) {
            TextRange textRange0 = SearchToolbarKt.access$SearchTextField$lambda$5(this.b).getComposition-MzsxiRA();
            if(!Intrinsics.areEqual(this.a.getComposition-MzsxiRA(), textRange0)) {
                SearchToolbarKt.access$SearchTextField$lambda$6(this.b, this.a);
                return Unit.INSTANCE;
            }
        }
        else {
            SearchToolbarKt.access$SearchTextField$lambda$6(this.b, this.a);
        }
        return Unit.INSTANCE;
    }
}

