package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.internal.Intrinsics;

public final class e0 implements ViewTranslationCallback {
    public static final e0 a;

    static {
        e0.a = new e0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view0) {
        Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView)view0).getContentCaptureManager$ui_release().onClearTranslation$ui_release();
        return true;
    }

    @Override  // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view0) {
        Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView)view0).getContentCaptureManager$ui_release().onHideTranslation$ui_release();
        return true;
    }

    @Override  // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view0) {
        Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView)view0).getContentCaptureManager$ui_release().onShowTranslation$ui_release();
        return true;
    }
}

