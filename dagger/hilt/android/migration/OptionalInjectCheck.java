package dagger.hilt.android.migration;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.internal.migration.InjectedByHilt;
import dagger.hilt.internal.Preconditions;

public final class OptionalInjectCheck {
    public static boolean a(Object object0) {
        Preconditions.checkNotNull(object0);
        Preconditions.checkArgument(object0 instanceof InjectedByHilt, "\'%s\' is not an optionally injected android entry point. Check that you have annotated the class with both @AndroidEntryPoint and @OptionalInject.", new Object[]{object0.getClass()});
        return ((InjectedByHilt)object0).wasInjectedByHilt();
    }

    public static boolean wasInjectedByHilt(@NonNull Service service0) {
        return OptionalInjectCheck.a(service0);
    }

    public static boolean wasInjectedByHilt(@NonNull BroadcastReceiver broadcastReceiver0) {
        return OptionalInjectCheck.a(broadcastReceiver0);
    }

    public static boolean wasInjectedByHilt(@NonNull View view0) {
        return OptionalInjectCheck.a(view0);
    }

    public static boolean wasInjectedByHilt(@NonNull ComponentActivity componentActivity0) {
        return OptionalInjectCheck.a(componentActivity0);
    }

    public static boolean wasInjectedByHilt(@NonNull Fragment fragment0) {
        return OptionalInjectCheck.a(fragment0);
    }
}

