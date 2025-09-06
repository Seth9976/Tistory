package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0081@\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001A\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u000B\u001A\u00020\u0003¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000F\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0013\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0018\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "", "Landroidx/compose/runtime/MutableState;", "", "state", "constructor-impl", "(Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/MutableState;", "attachToScope-impl", "(Landroidx/compose/runtime/MutableState;)V", "attachToScope", "invalidateScope-impl", "invalidateScope", "", "toString-impl", "(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/MutableState;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;)Z", "equals", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class ObservableScopeInvalidator {
    public final MutableState a;

    public ObservableScopeInvalidator(MutableState mutableState0) {
        this.a = mutableState0;
    }

    public static final void attachToScope-impl(MutableState mutableState0) {
        mutableState0.getValue();
    }

    public static final ObservableScopeInvalidator box-impl(MutableState mutableState0) {
        return new ObservableScopeInvalidator(mutableState0);
    }

    @NotNull
    public static MutableState constructor-impl(@NotNull MutableState mutableState0) [...] // Inlined contents

    public static MutableState constructor-impl$default(MutableState mutableState0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            SnapshotMutationPolicy snapshotMutationPolicy0 = SnapshotStateKt.neverEqualPolicy();
            return SnapshotStateKt.mutableStateOf(Unit.INSTANCE, snapshotMutationPolicy0);
        }
        return mutableState0;
    }

    @Override
    public boolean equals(Object object0) {
        return ObservableScopeInvalidator.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(MutableState mutableState0, Object object0) {
        return object0 instanceof ObservableScopeInvalidator ? Intrinsics.areEqual(mutableState0, ((ObservableScopeInvalidator)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(MutableState mutableState0, MutableState mutableState1) {
        return Intrinsics.areEqual(mutableState0, mutableState1);
    }

    @Override
    public int hashCode() {
        return ObservableScopeInvalidator.hashCode-impl(this.a);
    }

    public static int hashCode-impl(MutableState mutableState0) {
        return mutableState0.hashCode();
    }

    public static final void invalidateScope-impl(MutableState mutableState0) {
        mutableState0.setValue(Unit.INSTANCE);
    }

    @Override
    public String toString() {
        return "ObservableScopeInvalidator(state=" + this.a + ')';
    }

    public static String toString-impl(MutableState mutableState0) [...] // Inlined contents

    public final MutableState unbox-impl() {
        return this.a;
    }
}

