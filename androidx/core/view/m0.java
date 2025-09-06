package androidx.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import java.util.List;

public abstract class m0 {
    @DoNotInline
    public static View.AccessibilityDelegate a(View view0) {
        return view0.getAccessibilityDelegate();
    }

    @DoNotInline
    public static ContentCaptureSession b(View view0) {
        return view0.getContentCaptureSession();
    }

    @DoNotInline
    public static List c(View view0) {
        return view0.getSystemGestureExclusionRects();
    }

    @DoNotInline
    public static void d(@NonNull View view0, @NonNull Context context0, @NonNull int[] arr_v, @Nullable AttributeSet attributeSet0, @NonNull TypedArray typedArray0, int v, int v1) {
        view0.saveAttributeDataForStyleable(context0, arr_v, attributeSet0, typedArray0, v, v1);
    }

    @DoNotInline
    public static void e(View view0, ContentCaptureSessionCompat contentCaptureSessionCompat0) {
        view0.setContentCaptureSession((contentCaptureSessionCompat0 == null ? null : contentCaptureSessionCompat0.toContentCaptureSession()));
    }

    @DoNotInline
    public static void f(View view0, List list0) {
        view0.setSystemGestureExclusionRects(list0);
    }
}

