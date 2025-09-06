package com.kakao.tistory.presentation.view.editor;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.datepicker.t;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u0010\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/UploadProgressDialog;", "Landroid/app/Dialog;", "Landroid/content/Context;", "context", "Landroid/view/View$OnClickListener;", "cancelListener", "<init>", "(Landroid/content/Context;Landroid/view/View$OnClickListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "progressCount", "totalCount", "setProgress", "(II)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UploadProgressDialog extends Dialog {
    public static final int $stable = 8;
    public final View.OnClickListener a;
    public TextView b;
    public ProgressBar c;

    public UploadProgressDialog(@NotNull Context context0, @NotNull View.OnClickListener view$OnClickListener0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(view$OnClickListener0, "cancelListener");
        super(context0);
        this.a = view$OnClickListener0;
    }

    public static final void a(UploadProgressDialog uploadProgressDialog0, View view0) {
        Intrinsics.checkNotNullParameter(uploadProgressDialog0, "this$0");
        uploadProgressDialog0.a.onClick(view0);
        uploadProgressDialog0.dismiss();
    }

    @Override  // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(View.inflate(this.getContext(), layout.dialog_upload_file, null), new WindowManager.LayoutParams(-1, -1));
        this.c = (ProgressBar)this.findViewById(id.dialog_progressbar);
        this.b = (TextView)this.findViewById(id.dialog_progress_textview);
        Window window0 = this.getWindow();
        if(window0 != null) {
            window0.setGravity(17);
        }
        Window window1 = this.getWindow();
        if(window1 != null) {
            window1.setBackgroundDrawable(new ColorDrawable(this.getContext().getResources().getColor(color.transparent)));
        }
        Window window2 = this.getWindow();
        if(window2 != null) {
            window2.clearFlags(2);
        }
        Window window3 = this.getWindow();
        if(window3 != null) {
            WindowManager.LayoutParams windowManager$LayoutParams0 = window3.getAttributes();
            if(windowManager$LayoutParams0 != null) {
                windowManager$LayoutParams0.width = -1;
                windowManager$LayoutParams0.height = -1;
            }
        }
        View view0 = this.findViewById(id.ke_dialog_cancel);
        if(view0 != null) {
            view0.setOnClickListener(new t(this, 16));
        }
    }

    public final void setProgress(int v, int v1) {
        ProgressBar progressBar0 = this.c;
        if(progressBar0 != null) {
            progressBar0.setProgress(((int)(((float)v) / ((float)v1) * 100.0f)));
        }
        TextView textView0 = this.b;
        if(textView0 != null) {
            String s = String.format("%d/<font color=\'#909090\'>%d</font> 업로드 중", Arrays.copyOf(new Object[]{v, v1}, 2));
            Intrinsics.checkNotNullExpressionValue(s, "format(...)");
            textView0.setText(Html.fromHtml(s));
        }
    }
}

