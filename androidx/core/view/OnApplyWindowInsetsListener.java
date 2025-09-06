package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

public interface OnApplyWindowInsetsListener {
    @NonNull
    WindowInsetsCompat onApplyWindowInsets(@NonNull View arg1, @NonNull WindowInsetsCompat arg2);
}

