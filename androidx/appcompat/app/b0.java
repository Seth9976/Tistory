package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.n;
import androidx.annotation.DoNotInline;
import java.util.Objects;

public abstract class b0 {
    @DoNotInline
    public static OnBackInvokedDispatcher a(Activity activity0) {
        return activity0.getOnBackInvokedDispatcher();
    }

    @DoNotInline
    public static OnBackInvokedCallback b(Object object0, i0 i00) {
        Objects.requireNonNull(i00);
        OnBackInvokedCallback onBackInvokedCallback0 = new a0(i00, 0);
        n.v(((OnBackInvokedDispatcher)object0), ((a0)onBackInvokedCallback0));
        return onBackInvokedCallback0;
    }

    @DoNotInline
    public static void c(Object object0, Object object1) {
        ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
    }
}

