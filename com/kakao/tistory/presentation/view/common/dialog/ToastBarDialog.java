package com.kakao.tistory.presentation.view.common.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.h;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\r\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/ToastBarDialog;", "", "Landroid/app/Activity;", "activity", "", "messageStrResId", "<init>", "(Landroid/app/Activity;I)V", "", "isFullScreen", "", "showTop", "(Z)V", "showBottom", "()V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ToastBarDialog {
    public static final int $stable = 8;
    public final Activity a;
    public final int b;
    public Handler c;

    public ToastBarDialog(@NotNull Activity activity0, @StringRes int v) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super();
        this.a = activity0;
        this.b = v;
    }

    public static final void a(Dialog dialog0) {
        Intrinsics.checkNotNullParameter(dialog0, "$dialog");
        dialog0.dismiss();
    }

    public final void a(boolean z, boolean z1) {
        if(this.a.isFinishing()) {
            return;
        }
        Dialog dialog0 = z1 ? new Dialog(this.a, style.FullScreenDialog) : new Dialog(this.a, style.FullScreenDialogStatusBar);
        dialog0.requestWindowFeature(1);
        View view0 = LayoutInflater.from(dialog0.getContext()).inflate(layout.layout_toast_bar, null);
        ((TextView)view0.findViewById(id.toast_bar_message)).setText(dialog0.getContext().getString(this.b));
        dialog0.setContentView(view0);
        dialog0.setCanceledOnTouchOutside(false);
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setLayout(-1, -2);
            window0.setGravity((z ? 0x30 : 80));
            window0.clearFlags(2);
        }
        dialog0.show();
        if(this.c == null) {
            this.c = new Handler();
        }
        Handler handler0 = this.c;
        if(handler0 != null) {
            handler0.postDelayed(new h(dialog0, 27), 1500L);
        }
    }

    public final void showBottom() {
        this.a(false, false);
    }

    public final void showTop(boolean z) {
        this.a(true, z);
    }

    public static void showTop$default(ToastBarDialog toastBarDialog0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        toastBarDialog0.showTop(z);
    }
}

