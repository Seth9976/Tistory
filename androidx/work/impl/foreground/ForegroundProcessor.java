package androidx.work.impl.foreground;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface ForegroundProcessor {
    void startForeground(@NonNull String arg1, @NonNull ForegroundInfo arg2);
}

