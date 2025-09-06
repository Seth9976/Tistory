package com.kakao.android.base.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.kakao.android.base.R.layout;
import com.kakao.android.base.R.style;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/android/base/ui/dialog/BaseLoadingDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "theme", "", "(Landroid/content/Context;I)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BaseLoadingDialog extends Dialog {
    public BaseLoadingDialog(@NotNull Context context0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, v);
        Window window0 = this.getWindow();
        if(window0 != null) {
            window0.requestFeature(1);
        }
        Window window1 = this.getWindow();
        if(window1 != null) {
            window1.clearFlags(2);
        }
        this.setContentView(layout.view_progress_loading);
        this.setCanceledOnTouchOutside(false);
    }

    public BaseLoadingDialog(Context context0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = style.Transparent;
        }
        this(context0, v);
    }
}

