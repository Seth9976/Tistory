package androidx.activity.result;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class d {
    public final Lifecycle a;
    public final ArrayList b;

    public d(Lifecycle lifecycle0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        super();
        this.a = lifecycle0;
        this.b = new ArrayList();
    }
}

