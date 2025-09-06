package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface WindowInsetsAnimationControlListenerCompat {
    void onCancelled(@Nullable WindowInsetsAnimationControllerCompat arg1);

    void onFinished(@NonNull WindowInsetsAnimationControllerCompat arg1);

    void onReady(@NonNull WindowInsetsAnimationControllerCompat arg1, int arg2);
}

