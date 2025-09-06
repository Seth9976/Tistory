package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import androidx.annotation.NonNull;

public final class ContentProviderCompat {
    @NonNull
    public static Context requireContext(@NonNull ContentProvider contentProvider0) {
        Context context0 = contentProvider0.getContext();
        if(context0 == null) {
            throw new IllegalStateException("Cannot find context from the provider.");
        }
        return context0;
    }
}

