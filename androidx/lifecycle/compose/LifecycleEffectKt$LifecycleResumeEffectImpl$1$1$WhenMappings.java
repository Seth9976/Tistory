package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle.Event;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class LifecycleEffectKt.LifecycleResumeEffectImpl.1.1.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[Event.values().length];
        try {
            arr_v[Event.ON_RESUME.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[Event.ON_PAUSE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        LifecycleEffectKt.LifecycleResumeEffectImpl.1.1.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

