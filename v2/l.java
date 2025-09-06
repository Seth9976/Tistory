package v2;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.z;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class l {
    @DoNotInline
    @JvmStatic
    @NotNull
    public static final OnBackInvokedCallback a(@Nullable Function0 function00) {
        return new z(function00, 1);
    }

    @DoNotInline
    @JvmStatic
    public static final void b(@NotNull View view0, @Nullable Object object0) {
        if(object0 instanceof OnBackInvokedCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
            if(onBackInvokedDispatcher0 != null) {
                onBackInvokedDispatcher0.registerOnBackInvokedCallback(1000000, ((OnBackInvokedCallback)object0));
            }
        }
    }

    @DoNotInline
    @JvmStatic
    public static final void c(@NotNull View view0, @Nullable Object object0) {
        if(object0 instanceof OnBackInvokedCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = view0.findOnBackInvokedDispatcher();
            if(onBackInvokedDispatcher0 != null) {
                onBackInvokedDispatcher0.unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object0));
            }
        }
    }
}

