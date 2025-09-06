package com.kakao.tistory.presentation.view.common.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.CalendarView;
import androidx.activity.h;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.databinding.DialogCommonDatePickerBinding;
import java.util.Calendar;
import kc.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\n\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0019\u0010\u0013\u001A\u00020\f2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0014\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001AR\"\u0010!\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010\u000ER$\u0010)\u001A\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R$\u0010-\u001A\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010$\u001A\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010\u001D\u001A\u0004\b/\u0010\u001F\"\u0004\b0\u0010\u000ER\"\u00109\u001A\u0002028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b:\u0010\u001D\u001A\u0004\b;\u0010\u001F\"\u0004\b<\u0010\u000ERT\u0010I\u001A4\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\f\u0018\u00010>8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\"\u0004\bG\u0010H\u00A8\u0006K"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/CommonDatePickerDialog;", "Landroid/app/Dialog;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "theme", "(Landroid/content/Context;I)V", "", "visible", "", "setVisibleButtonLayout", "(Z)V", "hasShowingDuration", "setHasShowingDuration", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "show", "()V", "dismiss", "b", "Z", "getMIsCanceledOnTouchOutside", "()Z", "setMIsCanceledOnTouchOutside", "mIsCanceledOnTouchOutside", "", "c", "Ljava/lang/String;", "getLeftButtonLabel", "()Ljava/lang/String;", "setLeftButtonLabel", "(Ljava/lang/String;)V", "leftButtonLabel", "d", "getRightButtonLabel", "setRightButtonLabel", "rightButtonLabel", "e", "getRightButtonColorEnabled", "setRightButtonColorEnabled", "rightButtonColorEnabled", "Ljava/util/Calendar;", "h", "Ljava/util/Calendar;", "getSelectedDate", "()Ljava/util/Calendar;", "setSelectedDate", "(Ljava/util/Calendar;)V", "selectedDate", "i", "getHasMinDate", "setHasMinDate", "hasMinDate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "dialog", "buttonId", "j", "Lkotlin/jvm/functions/Function2;", "getOnClickCallback", "()Lkotlin/jvm/functions/Function2;", "setOnClickCallback", "(Lkotlin/jvm/functions/Function2;)V", "onClickCallback", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonDatePickerDialog extends Dialog implements View.OnClickListener {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/CommonDatePickerDialog$Companion;", "", "", "LEFT_BUTTON", "I", "RIGHT_BUTTON", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public Handler g;
    public Calendar h;
    public boolean i;
    public Function2 j;
    public final DialogCommonDatePickerBinding k;

    static {
        CommonDatePickerDialog.Companion = new Companion(null);
        CommonDatePickerDialog.$stable = 8;
    }

    public CommonDatePickerDialog(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.a = 1000L;
        this.b = true;
        Calendar calendar0 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar0, "getInstance(...)");
        this.h = calendar0;
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.dialog_common_date_picker, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.k = (DialogCommonDatePickerBinding)viewDataBinding0;
        this.requestWindowFeature(1);
    }

    public CommonDatePickerDialog(@NotNull Context context0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, v);
        this.a = 1000L;
        this.b = true;
        Calendar calendar0 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar0, "getInstance(...)");
        this.h = calendar0;
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.dialog_common_date_picker, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.k = (DialogCommonDatePickerBinding)viewDataBinding0;
        this.requestWindowFeature(1);
    }

    public static final void a(CommonDatePickerDialog commonDatePickerDialog0) {
        Intrinsics.checkNotNullParameter(commonDatePickerDialog0, "this$0");
        commonDatePickerDialog0.dismiss();
    }

    public static final void a(CommonDatePickerDialog commonDatePickerDialog0, CalendarView calendarView0, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(commonDatePickerDialog0, "this$0");
        Intrinsics.checkNotNullParameter(calendarView0, "<anonymous parameter 0>");
        commonDatePickerDialog0.h.set(v, v1, v2);
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        this.g = null;
        super.dismiss();
    }

    public final boolean getHasMinDate() {
        return this.i;
    }

    @Nullable
    public final String getLeftButtonLabel() {
        return this.c;
    }

    public final boolean getMIsCanceledOnTouchOutside() {
        return this.b;
    }

    @Nullable
    public final Function2 getOnClickCallback() {
        return this.j;
    }

    public final boolean getRightButtonColorEnabled() {
        return this.e;
    }

    @Nullable
    public final String getRightButtonLabel() {
        return this.d;
    }

    @NotNull
    public final Calendar getSelectedDate() {
        return this.h;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        int v = view0.getId();
        if(v == id.common_date_picker_left_button) {
            Function2 function20 = this.j;
            if(function20 != null) {
                function20.invoke(this, 1);
            }
        }
        else if(v == id.common_date_picker_right_button) {
            Function2 function21 = this.j;
            if(function21 != null) {
                function21.invoke(this, 2);
            }
        }
    }

    @Override  // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle0) {
        int v1;
        super.onCreate(bundle0);
        this.setContentView(this.k.getRoot());
        this.setCanceledOnTouchOutside(this.b);
        Window window0 = this.getWindow();
        int v = 0;
        if(window0 != null) {
            window0.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.k.commonDatePickerLeftButton.setOnClickListener(this);
        AppCompatButton appCompatButton0 = this.k.commonDatePickerLeftButton;
        String s = this.c;
        if(s == null) {
            v1 = 8;
        }
        else {
            appCompatButton0.setText(s);
            v1 = 0;
        }
        appCompatButton0.setVisibility(v1);
        this.k.commonDatePickerRightButton.setOnClickListener(this);
        AppCompatButton appCompatButton1 = this.k.commonDatePickerRightButton;
        String s1 = this.d;
        if(s1 == null) {
            v = 8;
        }
        else {
            if(this.e) {
                appCompatButton1.setTextColor(ContextCompat.getColor(this.getContext(), color.gray1));
            }
            this.k.commonDatePickerRightButton.setText(s1);
        }
        appCompatButton1.setVisibility(v);
        if(this.i) {
            long v2 = Calendar.getInstance().getTimeInMillis();
            this.k.commonDatePicker.setMinDate(v2 - 1000L);
        }
        a a0 = new a(this);
        this.k.commonDatePicker.setOnDateChangeListener(a0);
    }

    public final void setHasMinDate(boolean z) {
        this.i = z;
    }

    public final void setHasShowingDuration(boolean z) {
        this.f = z;
    }

    public final void setLeftButtonLabel(@Nullable String s) {
        this.c = s;
    }

    public final void setMIsCanceledOnTouchOutside(boolean z) {
        this.b = z;
    }

    public final void setOnClickCallback(@Nullable Function2 function20) {
        this.j = function20;
    }

    public final void setRightButtonColorEnabled(boolean z) {
        this.e = z;
    }

    public final void setRightButtonLabel(@Nullable String s) {
        this.d = s;
    }

    public final void setSelectedDate(@NotNull Calendar calendar0) {
        Intrinsics.checkNotNullParameter(calendar0, "<set-?>");
        this.h = calendar0;
    }

    public final void setVisibleButtonLayout(boolean z) {
    }

    @Override  // android.app.Dialog
    public void show() {
        super.show();
        if(!this.f) {
            return;
        }
        if(this.g == null) {
            this.g = new Handler();
        }
        Handler handler0 = this.g;
        if(handler0 != null) {
            handler0.postDelayed(new h(this, 24), this.a);
        }
    }
}

