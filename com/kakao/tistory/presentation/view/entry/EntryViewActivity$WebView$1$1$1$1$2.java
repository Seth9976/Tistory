package com.kakao.tistory.presentation.view.entry;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.kakao.tistory.presentation.view.webview.EntryWebView.ScrollListener;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000F\u0010\t\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"com/kakao/tistory/presentation/view/entry/EntryViewActivity$WebView$1$1$1$1$2", "Lcom/kakao/tistory/presentation/view/webview/EntryWebView$ScrollListener;", "", "scrollY", "", "onScroll", "(I)V", "deltaY", "onOverScroll", "onScrollReleased", "()V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EntryViewActivity.WebView.1.1.1.1.2 implements ScrollListener {
    public final MutableState a;
    public final NestedScrollDispatcher b;
    public final CoroutineScope c;

    public EntryViewActivity.WebView.1.1.1.1.2(MutableState mutableState0, NestedScrollDispatcher nestedScrollDispatcher0, CoroutineScope coroutineScope0) {
        this.a = mutableState0;
        this.b = nestedScrollDispatcher0;
        this.c = coroutineScope0;
        super();
    }

    @Override  // com.kakao.tistory.presentation.view.webview.EntryWebView$ScrollListener
    public void onOverScroll(int v) {
        if(v < 0) {
            this.b.dispatchPreScroll-OzD1aCk(OffsetKt.Offset(0.0f, v), 1);
            return;
        }
        this.b.dispatchPostScroll-DzOQY0M(0L, OffsetKt.Offset(0.0f, v), 1);
    }

    @Override  // com.kakao.tistory.presentation.view.webview.EntryWebView$ScrollListener
    public void onScroll(int v) {
        EntryViewActivity.access$WebView$lambda$2(this.a, v);
    }

    @Override  // com.kakao.tistory.presentation.view.webview.EntryWebView$ScrollListener
    public void onScrollReleased() {
        j0 j00 = new j0(this.b, null);
        BuildersKt.launch$default(this.c, null, null, j00, 3, null);
    }
}

