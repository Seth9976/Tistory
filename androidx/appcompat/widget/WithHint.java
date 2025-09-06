package androidx.appcompat.widget;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public interface WithHint {
    @Nullable
    CharSequence getHint();
}

