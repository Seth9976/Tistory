package com.kakao.tistory.presentation.view.webview;

import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BB\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/TistoryJavaScriptInterface;", "", "Lkotlin/Function1;", "", "", "onChangedImageViewerState", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "imageViewerAppeared", "()V", "imageViewerDisappeared", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryJavaScriptInterface {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/TistoryJavaScriptInterface$Companion;", "", "", "INTERFACE_NAME", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String INTERFACE_NAME = "TistoryWebToApp";
    public final Function1 a;

    static {
        TistoryJavaScriptInterface.Companion = new Companion(null);
    }

    public TistoryJavaScriptInterface(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onChangedImageViewerState");
        super();
        this.a = function10;
    }

    @JavascriptInterface
    public final void imageViewerAppeared() {
        this.a.invoke(Boolean.TRUE);
    }

    @JavascriptInterface
    public final void imageViewerDisappeared() {
        this.a.invoke(Boolean.FALSE);
    }
}

