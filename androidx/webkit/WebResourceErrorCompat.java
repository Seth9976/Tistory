package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class WebResourceErrorCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NetErrorCode {
    }

    @NonNull
    public abstract CharSequence getDescription();

    public abstract int getErrorCode();
}

