package androidx.startup;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public final class StartupException extends RuntimeException {
    public StartupException(@NonNull String s) {
        super(s);
    }

    public StartupException(@NonNull String s, @NonNull Throwable throwable0) {
        super(s, throwable0);
    }

    public StartupException(@NonNull Throwable throwable0) {
        super(throwable0);
    }
}

