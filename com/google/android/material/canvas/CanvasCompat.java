package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class CanvasCompat {
    public interface CanvasOperation {
        void run(@NonNull Canvas arg1);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas0, float f, float f1, float f2, float f3, int v) {
        return canvas0.saveLayerAlpha(f, f1, f2, f3, v);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas0, @Nullable RectF rectF0, int v) {
        return canvas0.saveLayerAlpha(rectF0, v);
    }
}

