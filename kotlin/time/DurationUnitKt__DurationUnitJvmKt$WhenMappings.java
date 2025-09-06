package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class DurationUnitKt__DurationUnitJvmKt.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[TimeUnit.values().length];
        try {
            arr_v[TimeUnit.NANOSECONDS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TimeUnit.MICROSECONDS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TimeUnit.MILLISECONDS.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TimeUnit.SECONDS.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TimeUnit.MINUTES.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TimeUnit.HOURS.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TimeUnit.DAYS.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        DurationUnitKt__DurationUnitJvmKt.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}

