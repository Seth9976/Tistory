package com.kakao.keditor.plugin.pluginspec.contentsearch.webview;

import a5.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.content.ContextCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.R.color;
import com.kakao.keditor.plugin.pluginspec.contentsearch.ContentSearchPhase;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u001B\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000E\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u001CJ\u0016\u0010\u001D\u001A\u00020\u000F2\u0006\u0010\u001E\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u001FR\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\t\u001A\u001F\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F\u0018\u00010\nX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0014\u001A\u00020\u0015X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "javascriptInterface", "Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface;", "onLoadingListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isLoading", "", "getOnLoadingListener", "()Lkotlin/jvm/functions/Function1;", "setOnLoadingListener", "(Lkotlin/jvm/functions/Function1;)V", "phase", "Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPhase;", "getPhase", "()Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPhase;", "setPhase", "(Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPhase;)V", "initOnActionListener", "onActionListener", "Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewJavascriptInterface$OnActionListener;", "loadUrlWith", "serviceType", "", "contentType", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContentSearchWebView extends WebView {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001A\n \n*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000B"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebView$Companion;", "", "()V", "INTERFACE_NAME", "", "QUERY_PARAM_CONTENT_TYPE", "QUERY_PARAM_DARK_COLOR10", "QUERY_PARAM_SERVICE_TYPE", "SCHEME", "TAG", "kotlin.jvm.PlatformType", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    @NotNull
    private static final String INTERFACE_NAME = "AndroidJavascriptInterfaces";
    @NotNull
    private static final String QUERY_PARAM_CONTENT_TYPE = "content_type";
    @NotNull
    private static final String QUERY_PARAM_DARK_COLOR10 = "dark_color10";
    @NotNull
    private static final String QUERY_PARAM_SERVICE_TYPE = "service_type";
    @NotNull
    private static final String SCHEME = "https";
    private static final String TAG;
    @NotNull
    private final ContentSearchWebViewJavascriptInterface javascriptInterface;
    @Nullable
    private Function1 onLoadingListener;
    @NotNull
    private ContentSearchPhase phase;

    static {
        ContentSearchWebView.Companion = new Companion(null);
        ContentSearchWebView.TAG = "ContentSearchWebView";
    }

    @JvmOverloads
    public ContentSearchWebView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 2, null);
    }

    @JvmOverloads
    public ContentSearchWebView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        this.phase = ContentSearchPhase.PRODUCTION;
        ContentSearchWebViewJavascriptInterface contentSearchWebViewJavascriptInterface0 = new ContentSearchWebViewJavascriptInterface();
        this.javascriptInterface = contentSearchWebViewJavascriptInterface0;
        this.setBackgroundColor(ContextCompat.getColor(context0, color.ke_color_primary_background));
        if(Build.VERSION.SDK_INT >= 29 && WebViewFeature.isFeatureSupported("ALGORITHMIC_DARKENING")) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(this.getSettings(), true);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setTextZoom(100);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setMixedContentMode(0);
        webSettings0.setUserAgentString(webSettings0.getUserAgentString() + "; aKeditor/" + Keditor.INSTANCE.version());
        this.setWebViewClient(new WebViewClient() {
            @Override  // android.webkit.WebViewClient
            public void onPageFinished(@Nullable WebView webView0, @Nullable String s) {
                Function1 function10 = ContentSearchWebView.this.getOnLoadingListener();
                if(function10 != null) {
                    function10.invoke(Boolean.FALSE);
                }
            }

            @Override  // android.webkit.WebViewClient
            public void onPageStarted(@Nullable WebView webView0, @Nullable String s, @Nullable Bitmap bitmap0) {
                Function1 function10 = ContentSearchWebView.this.getOnLoadingListener();
                if(function10 != null) {
                    function10.invoke(Boolean.TRUE);
                }
            }
        });
        this.addJavascriptInterface(contentSearchWebViewJavascriptInterface0, "AndroidJavascriptInterfaces");
        WebView.setWebContentsDebuggingEnabled(false);
    }

    public ContentSearchWebView(Context context0, AttributeSet attributeSet0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    @Nullable
    public final Function1 getOnLoadingListener() {
        return this.onLoadingListener;
    }

    @NotNull
    public final ContentSearchPhase getPhase() {
        return this.phase;
    }

    public final void initOnActionListener(@NotNull OnActionListener contentSearchWebViewJavascriptInterface$OnActionListener0) {
        Intrinsics.checkNotNullParameter(contentSearchWebViewJavascriptInterface$OnActionListener0, "onActionListener");
        this.javascriptInterface.setOnActionListener(contentSearchWebViewJavascriptInterface$OnActionListener0);
    }

    public final void loadUrlWith(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "serviceType");
        Intrinsics.checkNotNullParameter(s1, "contentType");
        int v = ContextCompat.getColor(this.getContext(), color.ke_content_search_dark_color10);
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").authority(this.phase.getHost()).appendQueryParameter("dark_color10", b.f(1, "#%06X", "format(...)", new Object[]{((int)(v & 0xFFFFFF))}));
        if(s.length() > 0) {
            uri$Builder0.appendQueryParameter("service_type", s);
        }
        if(s1.length() > 0) {
            uri$Builder0.appendQueryParameter("content_type", s1);
        }
        this.loadUrl(uri$Builder0.build().toString());
    }

    public final void setOnLoadingListener(@Nullable Function1 function10) {
        this.onLoadingListener = function10;
    }

    public final void setPhase(@NotNull ContentSearchPhase contentSearchPhase0) {
        Intrinsics.checkNotNullParameter(contentSearchPhase0, "<set-?>");
        this.phase = contentSearchPhase0;
    }
}

