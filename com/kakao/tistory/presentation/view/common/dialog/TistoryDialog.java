package com.kakao.tistory.presentation.view.common.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.R.string;
import java.util.Calendar;
import kc.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00C7\u0002\u0018\u00002\u00020\u0001J\u009A\u0001\u0010\u0017\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t26\u0010\u0013\u001A2\u0012\u0013\u0012\u00110\f\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000B2#\b\u0002\u0010\u0016\u001A\u001D\u0012\u0013\u0012\u00110\u0015\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u00120\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018Ja\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u000426\u0010\u0013\u001A2\u0012\u0013\u0012\u00110\f\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000B\u00A2\u0006\u0004\b\u0019\u0010\u001AJ{\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u001B\u001A\u00020\t2\u0006\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\u000726\u0010\u0013\u001A2\u0012\u0013\u0012\u00110\f\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000B\u00A2\u0006\u0004\b\u0019\u0010\u001EJ\u001D\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010 \u001A\u00020\u001F\u00A2\u0006\u0004\b\u0019\u0010!Ja\u0010%\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\"\u001A\u0004\u0018\u00010\t2\b\u0010#\u001A\u0004\u0018\u00010\t26\u0010\u0013\u001A2\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000B\u00A2\u0006\u0004\b%\u0010&JW\u0010)\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010(\u001A\u0004\u0018\u00010\'26\u0010\u0013\u001A2\u0012\u0013\u0012\u00110$\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000B\u00A2\u0006\u0004\b)\u0010*J_\u0010.\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010+\u001A\u0004\u0018\u00010\'2\u0006\u0010,\u001A\u00020\u000726\u0010\u0013\u001A2\u0012\u0013\u0012\u00110-\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000B\u00A2\u0006\u0004\b.\u0010/\u00A8\u00060"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/TistoryDialog;", "", "Landroid/app/Activity;", "activity", "", "title", "message", "", "isCanceledOnTouchOutside", "", "button", "Lkotlin/Function2;", "Landroid/app/Dialog;", "Lkotlin/ParameterName;", "name", "dialog", "", "buttonId", "", "callback", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "cancelCallback", "showOk", "(Landroid/app/Activity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "showOkCancel", "(Landroid/app/Activity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)V", "leftButton", "rightButton", "rightButtonColorEnabled", "(Landroid/app/Activity;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "model", "(Landroid/app/Activity;Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;)V", "startTime", "endTime", "Lcom/kakao/tistory/presentation/view/common/dialog/CommonTimePickerDialog;", "showStartEndTimePickerDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Ljava/util/Calendar;", "nowTime", "showTimePickerDialog", "(Landroid/app/Activity;Ljava/util/Calendar;Lkotlin/jvm/functions/Function2;)V", "calendar", "hasMinDate", "Lcom/kakao/tistory/presentation/view/common/dialog/CommonDatePickerDialog;", "showDatePickerDialog", "(Landroid/app/Activity;Ljava/util/Calendar;ZLkotlin/jvm/functions/Function2;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryDialog.kt\ncom/kakao/tistory/presentation/view/common/dialog/TistoryDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class TistoryDialog {
    public static final int $stable;
    @NotNull
    public static final TistoryDialog INSTANCE;

    static {
        TistoryDialog.INSTANCE = new TistoryDialog();
    }

    public static final void a(Function1 function10, DialogInterface dialogInterface0) {
        Intrinsics.checkNotNullParameter(function10, "$cancelCallback");
        Intrinsics.checkNotNull(dialogInterface0);
        function10.invoke(dialogInterface0);
    }

    public final void showDatePickerDialog(@NotNull Activity activity0, @Nullable Calendar calendar0, boolean z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(function20, "callback");
        CommonDatePickerDialog commonDatePickerDialog0 = new CommonDatePickerDialog(activity0);
        commonDatePickerDialog0.setLeftButtonLabel(activity0.getString(string.label_dialog_cancel));
        commonDatePickerDialog0.setRightButtonLabel(activity0.getString(string.label_dialog_ok));
        commonDatePickerDialog0.setRightButtonColorEnabled(true);
        if(calendar0 != null) {
            commonDatePickerDialog0.setSelectedDate(calendar0);
        }
        commonDatePickerDialog0.setHasMinDate(z);
        commonDatePickerDialog0.setOnClickCallback(function20);
        if(!activity0.isFinishing()) {
            commonDatePickerDialog0.show();
        }
    }

    public final void showOk(@NotNull Activity activity0, @NotNull CharSequence charSequence0, @Nullable CharSequence charSequence1, boolean z, @NotNull String s, @NotNull Function2 function20, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(charSequence0, "title");
        Intrinsics.checkNotNullParameter(s, "button");
        Intrinsics.checkNotNullParameter(function20, "callback");
        Intrinsics.checkNotNullParameter(function10, "cancelCallback");
        CommonDialog commonDialog0 = new CommonDialog(activity0);
        commonDialog0.setMTitle(charSequence0);
        commonDialog0.setMMessage(charSequence1);
        commonDialog0.setMIsCanceledOnTouchOutside(z);
        commonDialog0.setRightButtonLabel(s);
        commonDialog0.setOnClickCallback(function20);
        commonDialog0.setOnCancelListener(new e(function10, 0));
        if(!activity0.isFinishing()) {
            commonDialog0.show();
        }
    }

    public static void showOk$default(TistoryDialog tistoryDialog0, Activity activity0, CharSequence charSequence0, CharSequence charSequence1, boolean z, String s, Function2 function20, Function1 function10, int v, Object object0) {
        String s2;
        if((v & 16) == 0) {
            s2 = s;
        }
        else {
            String s1 = activity0.getString(string.label_dialog_ok);
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            s2 = s1;
        }
        Function1 function11 = (v & 0x40) == 0 ? function10 : i.a;
        tistoryDialog0.showOk(activity0, charSequence0, ((v & 4) == 0 ? charSequence1 : null), ((v & 8) == 0 ? z : true), s2, function20, function11);
    }

    public final void showOkCancel(@NotNull Activity activity0, @NotNull DialogUIModel dialogUIModel0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(dialogUIModel0, "model");
        CommonDialog commonDialog0 = new CommonDialog(activity0);
        String s = activity0.getString(dialogUIModel0.getTitle());
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        commonDialog0.setMTitle(s);
        Integer integer0 = dialogUIModel0.getMessage();
        if(integer0 != null) {
            commonDialog0.setMMessage(activity0.getString(integer0.intValue()));
        }
        Integer integer1 = dialogUIModel0.getLeftButtonTitle();
        if(integer1 != null) {
            commonDialog0.setLeftButtonLabel(activity0.getString(integer1.intValue()));
        }
        Integer integer2 = dialogUIModel0.getRightButtonTitle();
        if(integer2 != null) {
            commonDialog0.setRightButtonLabel(activity0.getString(integer2.intValue()));
        }
        commonDialog0.setRightButtonColorEnabled(dialogUIModel0.getRightButtonColorEnabled());
        commonDialog0.setOnClickCallback(new j(dialogUIModel0));
        if(!activity0.isFinishing()) {
            commonDialog0.show();
        }
    }

    public final void showOkCancel(@NotNull Activity activity0, @NotNull CharSequence charSequence0, @Nullable CharSequence charSequence1, @NotNull String s, @NotNull String s1, boolean z, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(charSequence0, "title");
        Intrinsics.checkNotNullParameter(s, "leftButton");
        Intrinsics.checkNotNullParameter(s1, "rightButton");
        Intrinsics.checkNotNullParameter(function20, "callback");
        CommonDialog commonDialog0 = new CommonDialog(activity0);
        commonDialog0.setMTitle(charSequence0);
        commonDialog0.setMMessage(charSequence1);
        commonDialog0.setLeftButtonLabel(s);
        commonDialog0.setRightButtonLabel(s1);
        commonDialog0.setRightButtonColorEnabled(z);
        commonDialog0.setOnClickCallback(function20);
        if(!activity0.isFinishing()) {
            commonDialog0.show();
        }
    }

    public final void showOkCancel(@NotNull Activity activity0, @NotNull CharSequence charSequence0, @Nullable CharSequence charSequence1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(charSequence0, "title");
        Intrinsics.checkNotNullParameter(function20, "callback");
        CommonDialog commonDialog0 = new CommonDialog(activity0);
        commonDialog0.setMTitle(charSequence0);
        commonDialog0.setMMessage(charSequence1);
        commonDialog0.setLeftButtonLabel(activity0.getString(string.label_dialog_cancel));
        commonDialog0.setRightButtonLabel(activity0.getString(string.label_dialog_ok));
        commonDialog0.setOnClickCallback(function20);
        if(!activity0.isFinishing()) {
            commonDialog0.show();
        }
    }

    public static void showOkCancel$default(TistoryDialog tistoryDialog0, Activity activity0, CharSequence charSequence0, CharSequence charSequence1, String s, String s1, boolean z, Function2 function20, int v, Object object0) {
        tistoryDialog0.showOkCancel(activity0, charSequence0, ((v & 4) == 0 ? charSequence1 : null), s, s1, ((v & 0x20) == 0 ? z : false), function20);
    }

    public static void showOkCancel$default(TistoryDialog tistoryDialog0, Activity activity0, CharSequence charSequence0, CharSequence charSequence1, Function2 function20, int v, Object object0) {
        if((v & 4) != 0) {
            charSequence1 = null;
        }
        tistoryDialog0.showOkCancel(activity0, charSequence0, charSequence1, function20);
    }

    public final void showStartEndTimePickerDialog(@NotNull Activity activity0, @Nullable String s, @Nullable String s1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(function20, "callback");
        CommonTimePickerDialog commonTimePickerDialog0 = new CommonTimePickerDialog(activity0);
        commonTimePickerDialog0.setLeftButtonLabel(activity0.getString(string.label_dialog_cancel));
        commonTimePickerDialog0.setRightButtonLabel(activity0.getString(string.label_dialog_ok));
        commonTimePickerDialog0.setRightButtonColorEnabled(true);
        commonTimePickerDialog0.setTimePickerMode(3);
        commonTimePickerDialog0.setStartTime(s);
        commonTimePickerDialog0.setEndTime(s1);
        commonTimePickerDialog0.setOnClickCallback(function20);
        if(!activity0.isFinishing()) {
            commonTimePickerDialog0.show();
        }
    }

    public final void showTimePickerDialog(@NotNull Activity activity0, @Nullable Calendar calendar0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(function20, "callback");
        CommonTimePickerDialog commonTimePickerDialog0 = new CommonTimePickerDialog(activity0);
        commonTimePickerDialog0.setLeftButtonLabel(activity0.getString(string.label_dialog_cancel));
        commonTimePickerDialog0.setRightButtonLabel(activity0.getString(string.label_dialog_ok));
        commonTimePickerDialog0.setRightButtonColorEnabled(true);
        commonTimePickerDialog0.setTimePickerMode(4);
        if(calendar0 != null) {
            commonTimePickerDialog0.setSelectedTime(calendar0);
        }
        commonTimePickerDialog0.setOnClickCallback(function20);
        if(!activity0.isFinishing()) {
            commonTimePickerDialog0.show();
        }
    }
}

