package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

public interface ViewPropertyAnimatorListener {
    void onAnimationCancel(@NonNull View arg1);

    void onAnimationEnd(@NonNull View arg1);

    void onAnimationStart(@NonNull View arg1);
}

