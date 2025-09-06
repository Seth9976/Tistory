package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt___StringsKt;

public final class t extends Lambda implements Function1 {
    public final MutableState a;
    public final MutableState b;

    public t(MutableState mutableState0, MutableState mutableState1) {
        this.a = mutableState0;
        this.b = mutableState1;
        super(1);
    }

    public final void a(TextLayoutResult textLayoutResult0) {
        Intrinsics.checkNotNullParameter(textLayoutResult0, "it");
        if(!NotificationListKt.access$QuoteText$lambda$9(this.a)) {
            if(textLayoutResult0.getHasVisualOverflow()) {
                int v = textLayoutResult0.getMultiParagraph().getLineEnd(1, true);
                String s = StringsKt___StringsKt.take(NotificationListKt.access$QuoteText$lambda$6(this.b), v - 2);
                NotificationListKt.access$QuoteText$lambda$7(this.b, s + "...");
            }
            NotificationListKt.access$QuoteText$lambda$10(this.a, true);
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a(((TextLayoutResult)object0));
        return Unit.INSTANCE;
    }
}

