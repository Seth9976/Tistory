package androidx.core.view;

import android.os.Build.VERSION;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class HapticFeedbackConstantsCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HapticFeedbackFlags {
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HapticFeedbackType {
    }

    public static final int CLOCK_TICK = 4;
    public static final int CONFIRM = 16;
    public static final int CONTEXT_CLICK = 6;
    public static final int DRAG_START = 25;
    public static final int FLAG_IGNORE_VIEW_SETTING = 1;
    public static final int GESTURE_END = 13;
    public static final int GESTURE_START = 12;
    public static final int GESTURE_THRESHOLD_ACTIVATE = 23;
    public static final int GESTURE_THRESHOLD_DEACTIVATE = 24;
    public static final int KEYBOARD_PRESS = 3;
    public static final int KEYBOARD_RELEASE = 7;
    public static final int KEYBOARD_TAP = 3;
    public static final int LONG_PRESS = 0;
    public static final int NO_HAPTICS = -1;
    public static final int REJECT = 17;
    public static final int SEGMENT_FREQUENT_TICK = 27;
    public static final int SEGMENT_TICK = 26;
    public static final int TEXT_HANDLE_MOVE = 9;
    public static final int TOGGLE_OFF = 22;
    public static final int TOGGLE_ON = 21;
    public static final int VIRTUAL_KEY = 1;
    public static final int VIRTUAL_KEY_RELEASE = 8;

    public static int a(int v) {
        if(v == -1) {
            return -1;
        }
        int v1 = Build.VERSION.SDK_INT;
        int v2 = 6;
        if(v1 < 34) {
            switch(v) {
                case 25: {
                    v = 0;
                    break;
                }
                case 21: 
                case 23: 
                case 26: {
                    v = 6;
                    break;
                }
                case 22: 
                case 24: 
                case 27: {
                    v = 4;
                }
            }
        }
        if(v1 < 30) {
            switch(v) {
                case 13: {
                    break;
                }
                case 12: 
                case 16: {
                    return 1;
                }
                case 17: {
                    return 0;
                }
                default: {
                    return v1 < 27 && (v == 7 || v == 8 || v == 9) ? -1 : v;
                }
            }
        }
        else {
            v2 = v;
        }
        return v1 < 27 && (v2 == 7 || v2 == 8 || v2 == 9) ? -1 : v2;
    }
}

