package j4;

import android.os.Bundle;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

public final class c implements SavedStateProvider {
    public final Saver a;
    public final Object b;

    public c(Object object0, Saver saver0) {
        this.a = saver0;
        this.b = object0;
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        Intrinsics.checkNotNullParameter(this.a, "$saver");
        Intrinsics.checkNotNullParameter(this.b, "$value");
        d d0 = new d(SavedStateHandle.Companion);
        return BundleKt.bundleOf(new Pair[]{TuplesKt.to("value", this.a.save(d0, this.b))});
    }
}

