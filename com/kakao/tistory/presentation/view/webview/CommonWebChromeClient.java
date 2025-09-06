package com.kakao.tistory.presentation.view.webview;

import android.app.Activity;
import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000E\u001A\u00020\r2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\n\u001A\u0004\u0018\u00010\b2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ7\u0010\u0010\u001A\u00020\r2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\n\u001A\u0004\u0018\u00010\b2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u0019\u0010\u0013\u001A\u00020\r2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u001C\u001A\u00020\r2\b\u0010\u0015\u001A\u0004\u0018\u00010\u00062\u0014\u0010\u0019\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u001D\u0010 \u001A\u00020\u001F2\u000E\u0010\u001E\u001A\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b \u0010!R(\u0010)\u001A\b\u0012\u0004\u0012\u00020\u001F0\"8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(¨\u0006*"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/CommonWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/webkit/WebView;", "view", "", "url", "message", "Landroid/webkit/JsResult;", "result", "", "onJsAlert", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z", "onJsConfirm", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "webView", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "uris", "", "onFileSelected", "([Landroid/net/Uri;)V", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getShowFileChooser", "()Lkotlin/jvm/functions/Function0;", "setShowFileChooser", "(Lkotlin/jvm/functions/Function0;)V", "showFileChooser", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class CommonWebChromeClient extends WebChromeClient {
    public static final int $stable = 8;
    public final Activity a;
    public Function0 b;
    public ValueCallback c;

    public CommonWebChromeClient(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super();
        this.a = activity0;
        this.b = b.a;
    }

    @NotNull
    public final Function0 getShowFileChooser() {
        return this.b;
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onConsoleMessage(@Nullable ConsoleMessage consoleMessage0) {
        String s = consoleMessage0 == null ? null : consoleMessage0.message();
        Logger.INSTANCE.log("WebView onConsoleMessage() : " + s);
        return true;
    }

    public final void onFileSelected(@Nullable Uri[] arr_uri) {
        if(arr_uri == null || arr_uri.length == 0) {
            ValueCallback valueCallback1 = this.c;
            if(valueCallback1 != null) {
                valueCallback1.onReceiveValue(null);
            }
        }
        else {
            ValueCallback valueCallback0 = this.c;
            if(valueCallback0 != null) {
                valueCallback0.onReceiveValue(arr_uri);
            }
        }
        this.c = null;
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onJsAlert(@Nullable WebView webView0, @Nullable String s, @Nullable String s1, @Nullable JsResult jsResult0) {
        if(webView0 != null && jsResult0 != null) {
            if(s1 != null) {
                a a0 = new a(jsResult0);
                TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s1, null, false, null, a0, null, 92, null);
            }
            return true;
        }
        return false;
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onJsConfirm(@Nullable WebView webView0, @Nullable String s, @Nullable String s1, @Nullable JsResult jsResult0) {
        String s6;
        String s5;
        String s4;
        String s3;
        JSONObject jSONObject0;
        String s2;
        if(webView0 != null && jsResult0 != null && s1 != null) {
            if(Intrinsics.areEqual(s, "https://cs.kakao.com/requests?service=175&locale=ko")) {
                f f0 = new f(jsResult0);
                TistoryDialog.showOkCancel$default(TistoryDialog.INSTANCE, this.a, s1, null, f0, 4, null);
                return true;
            }
            try {
                s2 = null;
                jSONObject0 = new JSONObject(s1);
                s3 = jSONObject0.optString("message");
            }
            catch(JSONException jSONException0) {
                s4 = null;
                goto label_28;
            }
            catch(Throwable throwable0) {
                s4 = null;
                goto label_40;
            }
            try {
                s5 = jSONObject0.optString("positive");
            }
            catch(JSONException jSONException0) {
                s4 = s3;
                goto label_28;
            }
            catch(Throwable throwable0) {
                s4 = s3;
                goto label_40;
            }
            try {
                s6 = jSONObject0.optString("negative");
                goto label_46;
            }
            catch(JSONException jSONException0) {
                s4 = s3;
                s2 = s5;
                try {
                label_28:
                    CrashlyticsUtils.INSTANCE.logException(jSONException0);
                }
                catch(Throwable throwable0) {
                    goto label_40;
                }
                if(s4 != null && s2 != null && s2.length() != 0) {
                    Intrinsics.checkNotNull(null);
                    e e0 = new e(jsResult0);
                    TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s4, null, false, null, e0, null, 76, null);
                    return true;
                }
                return false;
            }
            catch(Throwable throwable0) {
                s4 = s3;
                s2 = s5;
            }
        label_40:
            if(s4 == null || s2 == null || s2.length() == 0) {
                throw throwable0;
            }
            Intrinsics.checkNotNull(null);
            e e1 = new e(jsResult0);
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s4, null, false, null, e1, null, 76, null);
            return true;
        label_46:
            if(s3 != null) {
                boolean z = s6 == null || s6.length() == 0;
                boolean z1 = s5 == null || s5.length() == 0;
                if(!z && !z1) {
                    Intrinsics.checkNotNull(s6);
                    Intrinsics.checkNotNull(s5);
                    c c0 = new c(jsResult0);
                    TistoryDialog.showOkCancel$default(TistoryDialog.INSTANCE, this.a, s3, null, s6, s5, false, c0, 36, null);
                    return true;
                }
                if(!z) {
                    Intrinsics.checkNotNull(s5);
                    d d0 = new d(jsResult0);
                    TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s3, null, false, s5, d0, null, 76, null);
                    return true;
                }
                if(!z1) {
                    Intrinsics.checkNotNull(s6);
                    e e2 = new e(jsResult0);
                    TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s3, null, false, s6, e2, null, 76, null);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // android.webkit.WebChromeClient
    public boolean onShowFileChooser(@Nullable WebView webView0, @Nullable ValueCallback valueCallback0, @Nullable WebChromeClient.FileChooserParams webChromeClient$FileChooserParams0) {
        ValueCallback valueCallback1 = this.c;
        if(valueCallback1 != null) {
            valueCallback1.onReceiveValue(null);
        }
        this.c = valueCallback0;
        this.b.invoke();
        return true;
    }

    public final void setShowFileChooser(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "<set-?>");
        this.b = function00;
    }
}

