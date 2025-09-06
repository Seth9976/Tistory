package com.kakao.tistory.presentation.view.common.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.activity.h;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.databinding.DialogCommonBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\n\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0019\u0010\u0013\u001A\u00020\f2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0014\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001AR\"\u0010!\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010\u000ER\"\u0010)\u001A\u00020\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R$\u0010-\u001A\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010$\u001A\u0004\b+\u0010&\"\u0004\b,\u0010(R$\u00105\u001A\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b/\u00100\u001A\u0004\b1\u00102\"\u0004\b3\u00104R$\u00109\u001A\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b6\u00100\u001A\u0004\b7\u00102\"\u0004\b8\u00104R\"\u0010=\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b:\u0010\u001D\u001A\u0004\b;\u0010\u001F\"\u0004\b<\u0010\u000ERT\u0010I\u001A4\u0012\u0013\u0012\u00110\u0001\u00A2\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\f\u0018\u00010>8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\"\u0004\bG\u0010H\u00A8\u0006K"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/CommonDialog;", "Landroid/app/Dialog;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "theme", "(Landroid/content/Context;I)V", "", "visible", "", "setVisibleButtonLayout", "(Z)V", "hasShowingDuration", "setHasShowingDuration", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "show", "()V", "dismiss", "b", "Z", "getMIsCanceledOnTouchOutside", "()Z", "setMIsCanceledOnTouchOutside", "mIsCanceledOnTouchOutside", "", "c", "Ljava/lang/CharSequence;", "getMTitle", "()Ljava/lang/CharSequence;", "setMTitle", "(Ljava/lang/CharSequence;)V", "mTitle", "d", "getMMessage", "setMMessage", "mMessage", "", "e", "Ljava/lang/String;", "getLeftButtonLabel", "()Ljava/lang/String;", "setLeftButtonLabel", "(Ljava/lang/String;)V", "leftButtonLabel", "f", "getRightButtonLabel", "setRightButtonLabel", "rightButtonLabel", "g", "getRightButtonColorEnabled", "setRightButtonColorEnabled", "rightButtonColorEnabled", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "dialog", "buttonId", "j", "Lkotlin/jvm/functions/Function2;", "getOnClickCallback", "()Lkotlin/jvm/functions/Function2;", "setOnClickCallback", "(Lkotlin/jvm/functions/Function2;)V", "onClickCallback", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonDialog extends Dialog implements View.OnClickListener {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/CommonDialog$Companion;", "", "", "LEFT_BUTTON", "I", "RIGHT_BUTTON", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int LEFT_BUTTON = 1;
    public static final int RIGHT_BUTTON = 2;
    public final long a;
    public boolean b;
    public CharSequence c;
    public CharSequence d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public Handler i;
    public Function2 j;
    public final DialogCommonBinding k;

    static {
        CommonDialog.Companion = new Companion(null);
        CommonDialog.$stable = 8;
    }

    public CommonDialog(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.a = 1000L;
        this.b = true;
        this.c = "";
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.dialog_common, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.k = (DialogCommonBinding)viewDataBinding0;
        this.requestWindowFeature(1);
    }

    public CommonDialog(@NotNull Context context0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, v);
        this.a = 1000L;
        this.b = true;
        this.c = "";
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.dialog_common, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.k = (DialogCommonBinding)viewDataBinding0;
        this.requestWindowFeature(1);
    }

    public static final void a(CommonDialog commonDialog0) {
        Intrinsics.checkNotNullParameter(commonDialog0, "this$0");
        commonDialog0.dismiss();
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        this.i = null;
        super.dismiss();
    }

    @Nullable
    public final String getLeftButtonLabel() {
        return this.e;
    }

    public final boolean getMIsCanceledOnTouchOutside() {
        return this.b;
    }

    @Nullable
    public final CharSequence getMMessage() {
        return this.d;
    }

    @NotNull
    public final CharSequence getMTitle() {
        return this.c;
    }

    @Nullable
    public final Function2 getOnClickCallback() {
        return this.j;
    }

    public final boolean getRightButtonColorEnabled() {
        return this.g;
    }

    @Nullable
    public final String getRightButtonLabel() {
        return this.f;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        int v = view0.getId();
        if(v == id.common_dialog_left_button) {
            Function2 function20 = this.j;
            if(function20 != null) {
                function20.invoke(this, 1);
            }
        }
        else if(v == id.common_dialog_right_button) {
            Function2 function21 = this.j;
            if(function21 != null) {
                function21.invoke(this, 2);
            }
        }
    }

    @Override  // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle0) {
        int v3;
        super.onCreate(bundle0);
        this.setContentView(this.k.getRoot());
        this.setCanceledOnTouchOutside(this.b);
        int v = 0;
        int v1 = p.isBlank(this.c) ? 8 : 0;
        this.k.commonDialogTitleText.setVisibility(v1);
        this.k.commonDialogTitleText.setText(this.c);
        int v2 = this.d == null || p.isBlank(this.d) ? 8 : 0;
        this.k.commonDialogMessageText.setVisibility(v2);
        this.k.commonDialogMessageText.setText(this.d);
        this.k.commonDialogMessageText.setHighlightColor(0);
        MovementMethod movementMethod0 = LinkMovementMethod.getInstance();
        this.k.commonDialogMessageText.setMovementMethod(movementMethod0);
        this.k.commonDialogLeftButton.setOnClickListener(this);
        DialogCommonBinding dialogCommonBinding0 = this.k;
        AppCompatButton appCompatButton0 = dialogCommonBinding0.commonDialogLeftButton;
        String s = this.e;
        if(s == null) {
            dialogCommonBinding0.commonDialogRightButton.setBackgroundResource(drawable.selector_item_fff_pressed_f5_bottom_rounded_12dp);
            this.k.commonDialogDivider2.setVisibility(8);
            v3 = 8;
        }
        else {
            appCompatButton0.setText(s);
            v3 = 0;
        }
        appCompatButton0.setVisibility(v3);
        this.k.commonDialogRightButton.setOnClickListener(this);
        DialogCommonBinding dialogCommonBinding1 = this.k;
        AppCompatButton appCompatButton1 = dialogCommonBinding1.commonDialogRightButton;
        String s1 = this.f;
        if(s1 == null) {
            dialogCommonBinding1.commonDialogDivider2.setVisibility(8);
            v = 8;
        }
        else {
            if(this.g) {
                appCompatButton1.setTextColor(ContextCompat.getColor(this.getContext(), color.point1));
            }
            this.k.commonDialogRightButton.setText(s1);
        }
        appCompatButton1.setVisibility(v);
    }

    public final void setHasShowingDuration(boolean z) {
        this.h = z;
    }

    public final void setLeftButtonLabel(@Nullable String s) {
        this.e = s;
    }

    public final void setMIsCanceledOnTouchOutside(boolean z) {
        this.b = z;
    }

    public final void setMMessage(@Nullable CharSequence charSequence0) {
        this.d = charSequence0;
    }

    public final void setMTitle(@NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<set-?>");
        this.c = charSequence0;
    }

    public final void setOnClickCallback(@Nullable Function2 function20) {
        this.j = function20;
    }

    public final void setRightButtonColorEnabled(boolean z) {
        this.g = z;
    }

    public final void setRightButtonLabel(@Nullable String s) {
        this.f = s;
    }

    public final void setVisibleButtonLayout(boolean z) {
    }

    @Override  // android.app.Dialog
    public void show() {
        super.show();
        if(!this.h) {
            return;
        }
        if(this.i == null) {
            this.i = new Handler();
        }
        Handler handler0 = this.i;
        if(handler0 != null) {
            handler0.postDelayed(new h(this, 25), this.a);
        }
    }
}

