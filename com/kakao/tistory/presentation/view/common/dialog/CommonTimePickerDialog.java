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
import android.widget.TimePicker;
import androidx.activity.h;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.databinding.DialogCommonTimePickerBinding;
import com.kakao.tistory.presentation.view.common.widget.CommonTimePickerTimeWidget;
import java.util.Calendar;
import kc.b;
import kc.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001UB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\n\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0019\u0010\u0013\u001A\u00020\f2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0014\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001AR\"\u0010!\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010\u000ER$\u0010)\u001A\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R$\u0010-\u001A\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010$\u001A\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001A\u00020\n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010\u001D\u001A\u0004\b/\u0010\u001F\"\u0004\b0\u0010\u000ERT\u0010=\u001A4\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\f\u0018\u0001028\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010A\u001A\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b>\u0010$\u001A\u0004\b?\u0010&\"\u0004\b@\u0010(R$\u0010E\u001A\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010$\u001A\u0004\bC\u0010&\"\u0004\bD\u0010(R\"\u0010M\u001A\u00020F8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010H\u001A\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010T\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bN\u0010O\u001A\u0004\bP\u0010Q\"\u0004\bR\u0010S\u00A8\u0006V"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/CommonTimePickerDialog;", "Landroid/app/Dialog;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "theme", "(Landroid/content/Context;I)V", "", "visible", "", "setVisibleButtonLayout", "(Z)V", "hasShowingDuration", "setHasShowingDuration", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "show", "()V", "dismiss", "b", "Z", "getMIsCanceledOnTouchOutside", "()Z", "setMIsCanceledOnTouchOutside", "mIsCanceledOnTouchOutside", "", "c", "Ljava/lang/String;", "getLeftButtonLabel", "()Ljava/lang/String;", "setLeftButtonLabel", "(Ljava/lang/String;)V", "leftButtonLabel", "d", "getRightButtonLabel", "setRightButtonLabel", "rightButtonLabel", "e", "getRightButtonColorEnabled", "setRightButtonColorEnabled", "rightButtonColorEnabled", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "dialog", "buttonId", "h", "Lkotlin/jvm/functions/Function2;", "getOnClickCallback", "()Lkotlin/jvm/functions/Function2;", "setOnClickCallback", "(Lkotlin/jvm/functions/Function2;)V", "onClickCallback", "i", "getStartTime", "setStartTime", "startTime", "j", "getEndTime", "setEndTime", "endTime", "Ljava/util/Calendar;", "k", "Ljava/util/Calendar;", "getSelectedTime", "()Ljava/util/Calendar;", "setSelectedTime", "(Ljava/util/Calendar;)V", "selectedTime", "l", "I", "getTimePickerMode", "()I", "setTimePickerMode", "(I)V", "timePickerMode", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommonTimePickerDialog extends Dialog implements View.OnClickListener {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/CommonTimePickerDialog$Companion;", "", "", "LEFT_BUTTON", "I", "MODE_NOW_TIME", "MODE_START_AND_END", "RIGHT_BUTTON", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int LEFT_BUTTON = 1;
    public static final int MODE_NOW_TIME = 4;
    public static final int MODE_START_AND_END = 3;
    public static final int RIGHT_BUTTON = 2;
    public final long a;
    public boolean b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public Handler g;
    public Function2 h;
    public String i;
    public String j;
    public Calendar k;
    public int l;
    public final DialogCommonTimePickerBinding m;

    static {
        CommonTimePickerDialog.Companion = new Companion(null);
        CommonTimePickerDialog.$stable = 8;
    }

    public CommonTimePickerDialog(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.a = 1000L;
        this.b = true;
        Calendar calendar0 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar0, "getInstance(...)");
        this.k = calendar0;
        this.l = 3;
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.dialog_common_time_picker, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.m = (DialogCommonTimePickerBinding)viewDataBinding0;
        this.requestWindowFeature(1);
    }

    public CommonTimePickerDialog(@NotNull Context context0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, v);
        this.a = 1000L;
        this.b = true;
        Calendar calendar0 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar0, "getInstance(...)");
        this.k = calendar0;
        this.l = 3;
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.dialog_common_time_picker, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.m = (DialogCommonTimePickerBinding)viewDataBinding0;
        this.requestWindowFeature(1);
    }

    public static final void a(CommonTimePickerDialog commonTimePickerDialog0) {
        Intrinsics.checkNotNullParameter(commonTimePickerDialog0, "this$0");
        commonTimePickerDialog0.dismiss();
    }

    public static final void a(CommonTimePickerDialog commonTimePickerDialog0, View view0) {
        Intrinsics.checkNotNullParameter(commonTimePickerDialog0, "this$0");
        commonTimePickerDialog0.m.commonTimeEnd.setActive(false);
        int v = commonTimePickerDialog0.m.commonTimeStart.getHourOfDay();
        commonTimePickerDialog0.m.commonTimePicker.setHour(v);
        int v1 = commonTimePickerDialog0.m.commonTimeStart.getMinute();
        commonTimePickerDialog0.m.commonTimePicker.setMinute(v1);
        commonTimePickerDialog0.m.commonTimeStart.setActive(true);
    }

    public static final void a(CommonTimePickerDialog commonTimePickerDialog0, TimePicker timePicker0, int v, int v1) {
        Intrinsics.checkNotNullParameter(commonTimePickerDialog0, "this$0");
        if(commonTimePickerDialog0.m.commonTimeStart.isActive()) {
            commonTimePickerDialog0.m.commonTimeStart.setTime(v, v1);
        }
        if(commonTimePickerDialog0.m.commonTimeEnd.isActive()) {
            commonTimePickerDialog0.m.commonTimeEnd.setTime(v, v1);
        }
        Calendar calendar0 = commonTimePickerDialog0.k;
        calendar0.set(11, v);
        calendar0.set(12, v1);
    }

    public final void a() {
        int v3;
        int v2;
        int v1;
        int v;
        this.m.commonTimeStateContainer.setVisibility(0);
        this.m.commonTimeStart.setState(string.label_time_picker_start);
        CommonTimePickerTimeWidget commonTimePickerTimeWidget0 = this.m.commonTimeStart;
        String s = this.i;
        if(s == null) {
            v = 0;
        }
        else {
            Integer integer0 = o.toIntOrNull(s);
            v = integer0 == null ? 0 : integer0.intValue() / 100;
        }
        String s1 = this.i;
        if(s1 == null) {
            v1 = 0;
        }
        else {
            Integer integer1 = o.toIntOrNull(s1);
            v1 = integer1 == null ? 0 : integer1.intValue() % 100;
        }
        commonTimePickerTimeWidget0.setTime(v, v1);
        this.m.commonTimeStart.setActive(true);
        b b0 = new b(this, 0);
        this.m.commonTimeStart.setOnClickListener(b0);
        this.m.commonTimeEnd.setState(string.label_time_picker_end);
        CommonTimePickerTimeWidget commonTimePickerTimeWidget1 = this.m.commonTimeEnd;
        String s2 = this.j;
        if(s2 == null) {
            v2 = 0;
        }
        else {
            Integer integer2 = o.toIntOrNull(s2);
            v2 = integer2 == null ? 0 : integer2.intValue() / 100;
        }
        String s3 = this.j;
        if(s3 == null) {
            v3 = 0;
        }
        else {
            Integer integer3 = o.toIntOrNull(s3);
            v3 = integer3 == null ? 0 : integer3.intValue() % 100;
        }
        commonTimePickerTimeWidget1.setTime(v2, v3);
        this.m.commonTimeEnd.setActive(false);
        b b1 = new b(this, 1);
        this.m.commonTimeEnd.setOnClickListener(b1);
        this.m.commonTimeStart.performClick();
    }

    public static final void b(CommonTimePickerDialog commonTimePickerDialog0, View view0) {
        Intrinsics.checkNotNullParameter(commonTimePickerDialog0, "this$0");
        commonTimePickerDialog0.m.commonTimeStart.setActive(false);
        commonTimePickerDialog0.m.commonTimePicker.setCurrentHour(commonTimePickerDialog0.m.commonTimeEnd.getHourOfDay());
        commonTimePickerDialog0.m.commonTimePicker.setCurrentMinute(commonTimePickerDialog0.m.commonTimeEnd.getMinute());
        commonTimePickerDialog0.m.commonTimeEnd.setActive(true);
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        this.g = null;
        super.dismiss();
    }

    @Nullable
    public final String getEndTime() {
        return this.j;
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
        return this.h;
    }

    public final boolean getRightButtonColorEnabled() {
        return this.e;
    }

    @Nullable
    public final String getRightButtonLabel() {
        return this.d;
    }

    @NotNull
    public final Calendar getSelectedTime() {
        return this.k;
    }

    @Nullable
    public final String getStartTime() {
        return this.i;
    }

    public final int getTimePickerMode() {
        return this.l;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "v");
        int v = view0.getId();
        if(v == id.common_dialog_left_button) {
            Function2 function20 = this.h;
            if(function20 != null) {
                function20.invoke(this, 1);
            }
        }
        else if(v == id.common_dialog_right_button) {
            Function2 function21 = this.h;
            if(function21 != null) {
                this.i = this.m.commonTimeStart.getTimeString();
                this.j = this.m.commonTimeEnd.getTimeString();
                function21.invoke(this, 2);
            }
        }
    }

    @Override  // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle0) {
        int v1;
        super.onCreate(bundle0);
        this.setContentView(this.m.getRoot());
        this.setCanceledOnTouchOutside(this.b);
        Window window0 = this.getWindow();
        int v = 0;
        if(window0 != null) {
            window0.setBackgroundDrawable(new ColorDrawable(0));
        }
        if(this.l == 3) {
            this.a();
        }
        this.m.commonDialogLeftButton.setOnClickListener(this);
        AppCompatButton appCompatButton0 = this.m.commonDialogLeftButton;
        String s = this.c;
        if(s == null) {
            v1 = 8;
        }
        else {
            appCompatButton0.setText(s);
            v1 = 0;
        }
        appCompatButton0.setVisibility(v1);
        this.m.commonDialogRightButton.setOnClickListener(this);
        AppCompatButton appCompatButton1 = this.m.commonDialogRightButton;
        String s1 = this.d;
        if(s1 == null) {
            v = 8;
        }
        else {
            if(this.e) {
                appCompatButton1.setTextColor(ContextCompat.getColor(this.getContext(), color.gray1));
            }
            this.m.commonDialogRightButton.setText(s1);
        }
        appCompatButton1.setVisibility(v);
        c c0 = new c(this);
        this.m.commonTimePicker.setOnTimeChangedListener(c0);
    }

    public final void setEndTime(@Nullable String s) {
        this.j = s;
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
        this.h = function20;
    }

    public final void setRightButtonColorEnabled(boolean z) {
        this.e = z;
    }

    public final void setRightButtonLabel(@Nullable String s) {
        this.d = s;
    }

    public final void setSelectedTime(@NotNull Calendar calendar0) {
        Intrinsics.checkNotNullParameter(calendar0, "<set-?>");
        this.k = calendar0;
    }

    public final void setStartTime(@Nullable String s) {
        this.i = s;
    }

    public final void setTimePickerMode(int v) {
        this.l = v;
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
            handler0.postDelayed(new h(this, 26), this.a);
        }
    }
}

