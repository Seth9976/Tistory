package com.kakao.common.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001B\u0010\u0003\u001A\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0011\u0010\u0005\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0011\u0010\b\u001A\u00020\u0001*\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "", "showAnyway", "showSoftInput", "(Landroid/content/Context;Z)Z", "hideSoftInput", "(Landroid/content/Context;)Z", "Landroid/view/View;", "imeVisible", "(Landroid/view/View;)Z", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SoftInputKt {
    public static final boolean hideSoftInput(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        InputMethodManager inputMethodManager0 = null;
        Window window0 = context0 instanceof Activity ? ((Activity)context0).getWindow() : null;
        if(window0 != null) {
            View view0 = window0.getDecorView();
            if(view0 != null) {
                Object object0 = context0.getSystemService("input_method");
                if(object0 instanceof InputMethodManager) {
                    inputMethodManager0 = (InputMethodManager)object0;
                }
                return inputMethodManager0 == null ? false : inputMethodManager0.hideSoftInputFromWindow(view0.getWindowToken(), 0);
            }
        }
        return false;
    }

    public static final boolean imeVisible(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        WindowInsetsCompat windowInsetsCompat0 = ViewCompat.getRootWindowInsets(view0.getRootView());
        return windowInsetsCompat0 == null ? false : windowInsetsCompat0.isVisible(8);
    }

    public static final boolean showSoftInput(@NotNull Context context0, boolean z) {
        InputMethodManager inputMethodManager0 = null;
        Intrinsics.checkNotNullParameter(context0, "<this>");
        if(z || context0.getResources().getConfiguration().hardKeyboardHidden != 1) {
            Window window0 = context0 instanceof Activity ? ((Activity)context0).getWindow() : null;
            if(window0 != null) {
                View view0 = window0.getCurrentFocus();
                if(view0 != null) {
                    Object object0 = context0.getSystemService("input_method");
                    if(object0 instanceof InputMethodManager) {
                        inputMethodManager0 = (InputMethodManager)object0;
                    }
                    return inputMethodManager0 == null ? false : inputMethodManager0.showSoftInput(view0, 0);
                }
            }
        }
        return false;
    }

    public static boolean showSoftInput$default(Context context0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return SoftInputKt.showSoftInput(context0, z);
    }
}

