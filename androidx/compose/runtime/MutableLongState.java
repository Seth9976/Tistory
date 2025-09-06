package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0018\u0010\u0004\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00038W@WX\u0096\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/MutableState;", "", "longValue", "getLongValue", "()J", "setLongValue", "(J)V", "value", "getValue", "()Ljava/lang/Long;", "setValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface MutableLongState extends LongState, MutableState {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        @NotNull
        public static Long getValue(@NotNull MutableLongState mutableLongState0) {
            return MutableLongState.access$getValue$jd(mutableLongState0);
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        public static void setValue(@NotNull MutableLongState mutableLongState0, long v) {
            mutableLongState0.super.setValue(v);
        }
    }

    static long access$getValue$jd(MutableLongState mutableLongState0) {
        return (long)mutableLongState0.super.getValue();
    }

    @Override  // androidx.compose.runtime.LongState
    long getLongValue();

    @Override  // androidx.compose.runtime.LongState
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    @NotNull
    default Long getValue() {
        return this.getLongValue();
    }

    @Override  // androidx.compose.runtime.LongState, androidx.compose.runtime.MutableState
    default Object getValue() {
        return this.getValue();
    }

    void setLongValue(long arg1);

    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    default void setValue(long v) {
        this.setLongValue(v);
    }

    @Override  // androidx.compose.runtime.MutableState
    default void setValue(Object object0) {
        this.setValue(((Number)object0).longValue());
    }
}

