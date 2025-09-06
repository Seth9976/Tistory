package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import d0.d0;
import d0.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\t\u001A\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"androidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "parentRegistry", "Landroidx/compose/runtime/saveable/Saver;", "Ld0/f0;", "", "", "", "saver", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazySaveableStateHolder.Companion {
    public LazySaveableStateHolder.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public final Saver saver(@Nullable SaveableStateRegistry saveableStateRegistry0) {
        d0 d00 = new d0(saveableStateRegistry0, 1);
        return SaverKt.Saver(e0.w, d00);
    }
}

