package com.kakao.android.base.utils;

import android.app.Activity;
import android.content.Context;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0007\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/android/base/utils/UiUtils;", "", "Landroid/view/View;", "view", "", "showSoftInput", "(Landroid/view/View;)Z", "hideSoftInput", "Landroid/app/Activity;", "activity", "", "(Landroid/app/Activity;)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UiUtils {
    @NotNull
    public static final UiUtils INSTANCE;

    static {
        UiUtils.INSTANCE = new UiUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void hideSoftInput(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        View view0 = activity0.getCurrentFocus();
        if(view0 != null) {
            UiUtils.INSTANCE.getClass();
            Object object0 = activity0.getSystemService("input_method");
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager)object0).hideSoftInputFromWindow(view0.getWindowToken(), 0);
        }
    }

    public final boolean hideSoftInput(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        ResultReceiver resultReceiver0 = new ResultReceiver(null);
        Context context0 = view0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        Object object0 = context0.getSystemService("input_method");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return ((InputMethodManager)object0).hideSoftInputFromWindow(view0.getWindowToken(), 0, resultReceiver0);
    }

    public final boolean showSoftInput(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        ResultReceiver resultReceiver0 = new ResultReceiver(null);
        Context context0 = view0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        Object object0 = context0.getSystemService("input_method");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return view0.requestFocus() && ((InputMethodManager)object0).showSoftInput(view0, 1, resultReceiver0);
    }
}

