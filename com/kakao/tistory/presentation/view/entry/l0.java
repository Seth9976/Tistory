package com.kakao.tistory.presentation.view.entry;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.kakao.tistory.presentation.view.webview.EntryWebView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class l0 extends Lambda implements Function1 {
    public final EntryViewActivity a;
    public final Function0 b;
    public final MutableState c;
    public final NestedScrollDispatcher d;
    public final CoroutineScope e;
    public final MutableState f;

    public l0(EntryViewActivity entryViewActivity0, Function0 function00, MutableState mutableState0, NestedScrollDispatcher nestedScrollDispatcher0, CoroutineScope coroutineScope0, MutableState mutableState1) {
        this.a = entryViewActivity0;
        this.b = function00;
        this.c = mutableState0;
        this.d = nestedScrollDispatcher0;
        this.e = coroutineScope0;
        this.f = mutableState1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Context)object0), "it");
        EntryWebView entryWebView0 = new EntryWebView(((Context)object0));
        this.a.v = entryWebView0;
        entryWebView0.setOnPageFinishedCallback(new i0(this.b));
        EntryViewActivity.access$initWebView(this.a, entryWebView0);
        entryWebView0.setScrollListener(new EntryViewActivity.WebView.1.1.1.1.2(this.c, this.d, this.e));
        entryWebView0.setOnChangedImageViewerState(new k0(this.a, this.f));
        return entryWebView0;
    }
}

