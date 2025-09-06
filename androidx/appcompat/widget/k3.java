package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a0;
import java.util.Objects;

public abstract class k3 {
    @DoNotInline
    @Nullable
    public static OnBackInvokedDispatcher a(@NonNull View view0) {
        return view0.findOnBackInvokedDispatcher();
    }

    @DoNotInline
    @NonNull
    public static OnBackInvokedCallback b(@NonNull Runnable runnable0) {
        Objects.requireNonNull(runnable0);
        return new a0(runnable0, 1);
    }

    @DoNotInline
    public static void c(@NonNull Object object0, @NonNull Object object1) {
        ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(1000000, ((OnBackInvokedCallback)object1));
    }

    @DoNotInline
    public static void d(@NonNull Object object0, @NonNull Object object1) {
        ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
    }
}

