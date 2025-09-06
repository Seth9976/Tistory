package com.kakao.tistory.presentation.view.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.n;
import com.kakao.tistory.presentation.common.Logger;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 G2\u00020\u0001:\u0003GHIB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B\u001B\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u0004\u0010\u000BJ\r\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\r\u0010\u000EJ2\u0010\u0016\u001A\u00020\u00142#\u0010\u0015\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000F\u00A2\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001A\u00020\u00142!\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000F\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001A\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\f\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001C\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ+\u0010\u001C\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00102\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u001EH\u0016\u00A2\u0006\u0004\b\u001C\u0010 J!\u0010#\u001A\u00020\u00142\u0012\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u000F\u00A2\u0006\u0004\b#\u0010\u0017J/\u0010(\u001A\u00020\u00142\u0006\u0010$\u001A\u00020\t2\u0006\u0010%\u001A\u00020\t2\u0006\u0010&\u001A\u00020\t2\u0006\u0010\'\u001A\u00020\tH\u0014\u00A2\u0006\u0004\b(\u0010)J\u0019\u0010,\u001A\u00020\f2\b\u0010+\u001A\u0004\u0018\u00010*H\u0016\u00A2\u0006\u0004\b,\u0010-R\u001B\u00103\u001A\u00020.8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102R\u001B\u00108\u001A\u0002048BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b5\u00100\u001A\u0004\b6\u00107R$\u0010@\u001A\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R0\u0010F\u001A\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000F8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010D\"\u0004\bE\u0010\u0017\u00A8\u0006J"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/EntryWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onBackPressed", "()Z", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "", "callback", "setOnPageFinishedCallback", "(Lkotlin/jvm/functions/Function1;)V", "setOnShouldOverrideUrlCallback", "redirectEnabled", "setRedirectEnabled", "(Z)V", "loadUrl", "(Ljava/lang/String;)V", "", "additionalHttpHeaders", "(Ljava/lang/String;Ljava/util/Map;)V", "Lcom/kakao/tistory/presentation/common/redirect/RedirectData;", "function", "setOnRedirect", "scrollX", "scrollY", "oldScrollX", "oldScrollY", "onScrollChanged", "(IIII)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/kakao/tistory/presentation/view/webview/CommonWebViewClient;", "a", "Lkotlin/Lazy;", "getCommonWebViewClient", "()Lcom/kakao/tistory/presentation/view/webview/CommonWebViewClient;", "commonWebViewClient", "Lcom/kakao/tistory/presentation/view/webview/CommonFullScreenWebChromeClient;", "b", "getCommonWebChromeClient", "()Lcom/kakao/tistory/presentation/view/webview/CommonFullScreenWebChromeClient;", "commonWebChromeClient", "Lcom/kakao/tistory/presentation/view/webview/EntryWebView$ScrollListener;", "c", "Lcom/kakao/tistory/presentation/view/webview/EntryWebView$ScrollListener;", "getScrollListener", "()Lcom/kakao/tistory/presentation/view/webview/EntryWebView$ScrollListener;", "setScrollListener", "(Lcom/kakao/tistory/presentation/view/webview/EntryWebView$ScrollListener;)V", "scrollListener", "d", "Lkotlin/jvm/functions/Function1;", "getOnChangedImageViewerState", "()Lkotlin/jvm/functions/Function1;", "setOnChangedImageViewerState", "onChangedImageViewerState", "Companion", "ScrollListener", "ScrollStatus", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EntryWebView extends WebView {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/EntryWebView$Companion;", "", "", "USER_AGENT_KEY", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0005H&J\b\u0010\b\u001A\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/EntryWebView$ScrollListener;", "", "onOverScroll", "", "deltaY", "", "onScroll", "scrollY", "onScrollReleased", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface ScrollListener {
        void onOverScroll(int arg1);

        void onScroll(int arg1);

        void onScrollReleased();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/EntryWebView$ScrollStatus;", "", "OverScroll", "Scroll", "Selection", "None", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum ScrollStatus {
        OverScroll,
        Scroll,
        Selection,
        None;

        public static final ScrollStatus[] a;
        public static final EnumEntries b;

        static {
            ScrollStatus.a = arr_entryWebView$ScrollStatus;
            Intrinsics.checkNotNullParameter(arr_entryWebView$ScrollStatus, "entries");
            ScrollStatus.b = new a(arr_entryWebView$ScrollStatus);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return ScrollStatus.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Lazy a;
    public final Lazy b;
    public ScrollListener c;
    public Function1 d;
    public ScrollStatus e;
    public MotionEvent f;
    public MotionEvent g;
    public static final String h;

    static {
        EntryWebView.Companion = new Companion(null);
        EntryWebView.$stable = 8;
        EntryWebView.h = "Tistory/3.0.8_3080;APP_AND";
    }

    public EntryWebView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.a = c.lazy(new c0(this));
        this.b = c.lazy(new b0(this));
        this.setWebViewClient(this.getCommonWebViewClient());
        this.setWebChromeClient(this.getCommonWebChromeClient());
        if((this.getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setUserAgentString("Tistory/3.0.8_3080;APP_AND;" + webSettings0.getUserAgentString());
        String s = webSettings0.getUserAgentString();
        Logger.INSTANCE.log("CommonWebView userAgent=" + s);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings0.setTextZoom(100);
        webSettings0.setMixedContentMode(0);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setLoadWithOverviewMode(true);
        this.setOnLongClickListener(new n(this, 2));
        this.addJavascriptInterface(new TistoryJavaScriptInterface(new a0(this)), "TistoryWebToApp");
        this.e = ScrollStatus.None;
    }

    public EntryWebView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        this.a = c.lazy(new c0(this));
        this.b = c.lazy(new b0(this));
        this.setWebViewClient(this.getCommonWebViewClient());
        this.setWebChromeClient(this.getCommonWebChromeClient());
        if((this.getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setUserAgentString("Tistory/3.0.8_3080;APP_AND;" + webSettings0.getUserAgentString());
        String s = webSettings0.getUserAgentString();
        Logger.INSTANCE.log("CommonWebView userAgent=" + s);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings0.setTextZoom(100);
        webSettings0.setMixedContentMode(0);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setLoadWithOverviewMode(true);
        this.setOnLongClickListener(new n(this, 2));
        this.addJavascriptInterface(new TistoryJavaScriptInterface(new a0(this)), "TistoryWebToApp");
        this.e = ScrollStatus.None;
    }

    public EntryWebView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.a = c.lazy(new c0(this));
        this.b = c.lazy(new b0(this));
        this.setWebViewClient(this.getCommonWebViewClient());
        this.setWebChromeClient(this.getCommonWebChromeClient());
        if((this.getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setUserAgentString("Tistory/3.0.8_3080;APP_AND;" + webSettings0.getUserAgentString());
        String s = webSettings0.getUserAgentString();
        Logger.INSTANCE.log("CommonWebView userAgent=" + s);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings0.setTextZoom(100);
        webSettings0.setMixedContentMode(0);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setLoadWithOverviewMode(true);
        this.setOnLongClickListener(new n(this, 2));
        this.addJavascriptInterface(new TistoryJavaScriptInterface(new a0(this)), "TistoryWebToApp");
        this.e = ScrollStatus.None;
    }

    public static final boolean a(EntryWebView entryWebView0, View view0) {
        Intrinsics.checkNotNullParameter(entryWebView0, "this$0");
        if(entryWebView0.e == ScrollStatus.OverScroll) {
            return true;
        }
        entryWebView0.e = ScrollStatus.Selection;
        return false;
    }

    private final CommonFullScreenWebChromeClient getCommonWebChromeClient() {
        return (CommonFullScreenWebChromeClient)this.b.getValue();
    }

    private final CommonWebViewClient getCommonWebViewClient() {
        return (CommonWebViewClient)this.a.getValue();
    }

    @Nullable
    public final Function1 getOnChangedImageViewerState() {
        return this.d;
    }

    @Nullable
    public final ScrollListener getScrollListener() {
        return this.c;
    }

    @Override  // android.webkit.WebView
    public void loadUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        Logger.INSTANCE.log("loadUrl() : url=" + s);
        super.loadUrl(s);
    }

    @Override  // android.webkit.WebView
    public void loadUrl(@NotNull String s, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(map0, "additionalHttpHeaders");
        Logger.INSTANCE.log("loadUrl() : url=" + s + ", additionalHeaders=" + map0);
        super.loadUrl(s, map0);
    }

    public final boolean onBackPressed() {
        return this.getCommonWebChromeClient().onBackPressed();
    }

    @Override  // android.webkit.WebView
    public void onScrollChanged(int v, int v1, int v2, int v3) {
        ScrollListener entryWebView$ScrollListener0 = this.c;
        if(entryWebView$ScrollListener0 != null) {
            entryWebView$ScrollListener0.onScroll(v1);
        }
    }

    @Override  // android.webkit.WebView
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent0) {
        if(motionEvent0 != null && motionEvent0.getAction() == 0) {
            MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
            this.f = motionEvent1;
            this.g = motionEvent1;
            this.e = ScrollStatus.None;
            this.setHapticFeedbackEnabled(true);
        }
        int v = 2;
        int v1 = 0;
        if(motionEvent0 != null && motionEvent0.getAction() == 2 && this.e == ScrollStatus.None) {
            int v2 = (int)motionEvent0.getY();
            int v3 = this.g == null ? 0 : ((int)this.g.getY());
            if(this.getScrollY() != 0 || v2 - v3 <= 0) {
                this.e = ScrollStatus.Scroll;
            }
            else {
                this.e = ScrollStatus.OverScroll;
                this.setHapticFeedbackEnabled(false);
            }
        }
        if(this.e == ScrollStatus.OverScroll) {
            int v4 = motionEvent0 == null ? 0 : ((int)motionEvent0.getY());
            int v5 = this.g == null ? 0 : ((int)this.g.getY());
            this.g = MotionEvent.obtain(motionEvent0);
            long v6 = 0L;
            long v7 = motionEvent0 == null ? 0L : motionEvent0.getDownTime();
            if(motionEvent0 != null) {
                v6 = motionEvent0.getEventTime();
            }
            if(motionEvent0 != null) {
                v = motionEvent0.getAction();
            }
            float f = this.f == null ? 0.0f : this.f.getX();
            float f1 = this.f == null ? 0.0f : this.f.getY();
            if(motionEvent0 != null) {
                v1 = motionEvent0.getMetaState();
            }
            MotionEvent motionEvent2 = MotionEvent.obtain(v7, v6, v, f, f1, v1);
            ScrollListener entryWebView$ScrollListener0 = this.c;
            if(entryWebView$ScrollListener0 != null) {
                entryWebView$ScrollListener0.onOverScroll(v4 - v5);
            }
            if(motionEvent0 != null && motionEvent0.getAction() == 1) {
                ScrollListener entryWebView$ScrollListener1 = this.c;
                if(entryWebView$ScrollListener1 != null) {
                    entryWebView$ScrollListener1.onScrollReleased();
                }
                this.e = ScrollStatus.None;
                this.f = null;
                this.g = null;
            }
            return super.onTouchEvent(motionEvent2);
        }
        return super.onTouchEvent(motionEvent0);
    }

    public final void setOnChangedImageViewerState(@Nullable Function1 function10) {
        this.d = function10;
    }

    public final void setOnPageFinishedCallback(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        this.getCommonWebViewClient().setOnPageFinishedCallback(function10);
    }

    public final void setOnRedirect(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        this.getCommonWebViewClient().setOnRedirect(function10);
    }

    public final void setOnShouldOverrideUrlCallback(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        this.getCommonWebViewClient().setOnShouldOverrideUrlCallback(function10);
    }

    public final void setRedirectEnabled(boolean z) {
        this.getCommonWebViewClient().setRedirectEnabled(z);
    }

    public final void setScrollListener(@Nullable ScrollListener entryWebView$ScrollListener0) {
        this.c = entryWebView$ScrollListener0;
    }
}

