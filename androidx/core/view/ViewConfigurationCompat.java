package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import java.util.Objects;

public final class ViewConfigurationCompat {
    public static float getScaledHorizontalScrollFactor(@NonNull ViewConfiguration viewConfiguration0, @NonNull Context context0) {
        return r0.a(viewConfiguration0);
    }

    public static int getScaledHoverSlop(@NonNull ViewConfiguration viewConfiguration0) {
        return Build.VERSION.SDK_INT < 28 ? viewConfiguration0.getScaledTouchSlop() / 2 : s0.a(viewConfiguration0);
    }

    public static int getScaledMaximumFlingVelocity(@NonNull Context context0, @NonNull ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
        if(Build.VERSION.SDK_INT >= 34) {
            return t0.a(viewConfiguration0, v, v1, v2);
        }
        InputDevice inputDevice0 = InputDevice.getDevice(v);
        if(inputDevice0 == null || inputDevice0.getMotionRange(v1, v2) == null) {
            return 0x80000000;
        }
        Resources resources0 = context0.getResources();
        int v3 = v2 != 0x400000 || v1 != 26 ? -1 : resources0.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
        Objects.requireNonNull(viewConfiguration0);
        switch(v3) {
            case -1: {
                return viewConfiguration0.getScaledMaximumFlingVelocity();
            }
            case 0: {
                return 0x80000000;
            }
            default: {
                int v4 = resources0.getDimensionPixelSize(v3);
                return v4 < 0 ? 0x80000000 : v4;
            }
        }
    }

    public static int getScaledMinimumFlingVelocity(@NonNull Context context0, @NonNull ViewConfiguration viewConfiguration0, int v, int v1, int v2) {
        if(Build.VERSION.SDK_INT >= 34) {
            return t0.b(viewConfiguration0, v, v1, v2);
        }
        InputDevice inputDevice0 = InputDevice.getDevice(v);
        if(inputDevice0 == null || inputDevice0.getMotionRange(v1, v2) == null) {
            return 0x7FFFFFFF;
        }
        Resources resources0 = context0.getResources();
        int v3 = v2 != 0x400000 || v1 != 26 ? -1 : resources0.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
        Objects.requireNonNull(viewConfiguration0);
        switch(v3) {
            case -1: {
                return viewConfiguration0.getScaledMinimumFlingVelocity();
            }
            case 0: {
                return 0x7FFFFFFF;
            }
            default: {
                int v4 = resources0.getDimensionPixelSize(v3);
                return v4 < 0 ? 0x7FFFFFFF : v4;
            }
        }
    }

    @Deprecated
    public static int getScaledPagingTouchSlop(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.getScaledPagingTouchSlop();
    }

    public static float getScaledVerticalScrollFactor(@NonNull ViewConfiguration viewConfiguration0, @NonNull Context context0) {
        return r0.b(viewConfiguration0);
    }

    @Deprecated
    public static boolean hasPermanentMenuKey(ViewConfiguration viewConfiguration0) {
        return viewConfiguration0.hasPermanentMenuKey();
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(@NonNull ViewConfiguration viewConfiguration0, @NonNull Context context0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return s0.b(viewConfiguration0);
        }
        Resources resources0 = context0.getResources();
        int v = resources0.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return v != 0 && resources0.getBoolean(v);
    }
}

