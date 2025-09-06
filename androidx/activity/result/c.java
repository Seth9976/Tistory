package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public final ActivityResultCallback a;
    public final ActivityResultContract b;

    public c(ActivityResultContract activityResultContract0, ActivityResultCallback activityResultCallback0) {
        Intrinsics.checkNotNullParameter(activityResultCallback0, "callback");
        Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
        super();
        this.a = activityResultCallback0;
        this.b = activityResultContract0;
    }
}

