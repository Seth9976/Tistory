package androidx.core.app;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.LocusIdCompat;

public abstract class e {
    @DoNotInline
    public static Display a(ContextWrapper contextWrapper0) {
        return contextWrapper0.getDisplay();
    }

    @DoNotInline
    public static void b(@NonNull Activity activity0, @Nullable LocusIdCompat locusIdCompat0, @Nullable Bundle bundle0) {
        activity0.setLocusContext((locusIdCompat0 == null ? null : locusIdCompat0.toLocusId()), bundle0);
    }
}

