package androidx.core.os;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

interface LocaleListInterface {
    Locale get(int arg1);

    @Nullable
    Locale getFirstMatch(@NonNull String[] arg1);

    Object getLocaleList();

    @IntRange(from = -1L)
    int indexOf(Locale arg1);

    boolean isEmpty();

    @IntRange(from = 0L)
    int size();

    String toLanguageTags();
}

