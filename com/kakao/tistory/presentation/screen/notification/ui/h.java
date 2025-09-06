package com.kakao.tistory.presentation.screen.notification.ui;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import com.kakao.tistory.presentation.R.style;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final Spanned a;

    public h(Spanned spanned0) {
        this.a = spanned0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Context)object0), "it");
        TextView textView0 = new TextView(((Context)object0));
        textView0.setText(this.a);
        textView0.setTextAppearance(style.Body1);
        textView0.setIncludeFontPadding(false);
        return textView0;
    }
}

