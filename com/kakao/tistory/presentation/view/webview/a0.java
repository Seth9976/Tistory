package com.kakao.tistory.presentation.view.webview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final EntryWebView a;

    public a0(EntryWebView entryWebView0) {
        this.a = entryWebView0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Boolean)object0).getClass();
        Function1 function10 = this.a.getOnChangedImageViewerState();
        if(function10 != null) {
            function10.invoke(((Boolean)object0));
        }
        return Unit.INSTANCE;
    }
}

