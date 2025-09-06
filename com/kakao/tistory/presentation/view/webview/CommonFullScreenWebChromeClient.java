package com.kakao.tistory.presentation.view.webview;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000B\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/CommonFullScreenWebChromeClient;", "Lcom/kakao/tistory/presentation/view/webview/CommonWebChromeClient;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/view/View;", "view", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "callback", "", "onShowCustomView", "(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V", "onHideCustomView", "()V", "", "onBackPressed", "()Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonFullScreenWebChromeClient extends CommonWebChromeClient {
    public static final int $stable = 8;
    public final Activity d;
    public final FrameLayout.LayoutParams e;
    public WebChromeClient.CustomViewCallback f;
    public View g;
    public boolean h;

    public CommonFullScreenWebChromeClient(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super(activity0);
        this.d = activity0;
        this.e = new FrameLayout.LayoutParams(-1, -1);
    }

    public final boolean onBackPressed() {
        if(this.h) {
            this.onHideCustomView();
            return true;
        }
        return false;
    }

    @Override  // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.d.setRequestedOrientation(1);
        WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0 = this.f;
        if(webChromeClient$CustomViewCallback0 != null) {
            webChromeClient$CustomViewCallback0.onCustomViewHidden();
        }
        this.f = null;
        View view0 = this.g;
        this.h = false;
        Window window0 = this.d.getWindow();
        View view1 = this.d.getWindow().getDecorView();
        Intrinsics.checkNotNull(view1, "null cannot be cast to non-null type android.widget.FrameLayout");
        if(this.h) {
            ((FrameLayout)view1).addView(view0, this.e);
            window0.addFlags(0x400);
            window0.getDecorView().setSystemUiVisibility(0xF06);
        }
        else {
            ((FrameLayout)view1).removeView(view0);
            window0.clearFlags(0x400);
            window0.getDecorView().setSystemUiVisibility(0x600);
        }
        this.g = null;
        super.onHideCustomView();
    }

    @Override  // android.webkit.WebChromeClient
    public void onShowCustomView(@Nullable View view0, @Nullable WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        if(this.h) {
            this.onHideCustomView();
        }
        this.d.setRequestedOrientation(4);
        this.f = webChromeClient$CustomViewCallback0;
        this.h = true;
        Window window0 = this.d.getWindow();
        View view1 = this.d.getWindow().getDecorView();
        Intrinsics.checkNotNull(view1, "null cannot be cast to non-null type android.widget.FrameLayout");
        if(this.h) {
            ((FrameLayout)view1).addView(view0, this.e);
            window0.addFlags(0x400);
            window0.getDecorView().setSystemUiVisibility(0xF06);
        }
        else {
            ((FrameLayout)view1).removeView(view0);
            window0.clearFlags(0x400);
            window0.getDecorView().setSystemUiVisibility(0x600);
        }
        this.g = view0;
        super.onShowCustomView(view0, webChromeClient$CustomViewCallback0);
    }
}

