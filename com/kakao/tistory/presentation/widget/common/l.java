package com.kakao.tistory.presentation.widget.common;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kakao.tistory.presentation.R.color;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public static final l a;

    static {
        l.a = new l();
    }

    public l() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Context)object0), "context");
        TextView textView0 = new TextView(((Context)object0));
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        textView0.setLetterSpacing(-0.01f);
        textView0.setTextSize(13.0f);
        textView0.setTextColor(ContextCompat.getColor(((Context)object0), color.gray2));
        return textView0;
    }
}

