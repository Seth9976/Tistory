package androidx.compose.ui.platform.coreshims;

import android.os.Build.VERSION;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import d2.d;
import d2.e;
import d2.f;

@RestrictTo({Scope.LIBRARY})
public class ViewCompatShims {
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @Nullable
    public static AutofillIdCompat getAutofillId(@NonNull View view0) {
        return AutofillIdCompat.toAutofillIdCompat(d.a(view0));
    }

    @Nullable
    public static ContentCaptureSessionCompat getContentCaptureSession(@NonNull View view0) {
        if(Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSession0 = e.a(view0);
            return contentCaptureSession0 == null ? null : ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSession0, view0);
        }
        return null;
    }

    public static void setImportantForContentCapture(@NonNull View view0, int v) {
        if(Build.VERSION.SDK_INT >= 30) {
            f.a(view0, v);
        }
    }
}

