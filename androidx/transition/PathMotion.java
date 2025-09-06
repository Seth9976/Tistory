package androidx.transition;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

public abstract class PathMotion {
    public PathMotion() {
    }

    public PathMotion(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
    }

    @NonNull
    public abstract Path getPath(float arg1, float arg2, float arg3, float arg4);
}

