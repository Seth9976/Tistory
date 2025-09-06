package androidx.core.content;

import android.content.UriMatcher;
import androidx.annotation.NonNull;
import androidx.core.util.Predicate;

public class UriMatcherCompat {
    @NonNull
    public static Predicate asPredicate(@NonNull UriMatcher uriMatcher0) {
        return new o(uriMatcher0, 1);
    }
}

