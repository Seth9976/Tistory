package o3;

import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static AutofillId a(ContentCaptureSession contentCaptureSession0, AutofillId autofillId0, long v) {
        return contentCaptureSession0.newAutofillId(autofillId0, v);
    }

    @DoNotInline
    public static ViewStructure b(ContentCaptureSession contentCaptureSession0, View view0) {
        return contentCaptureSession0.newViewStructure(view0);
    }

    @DoNotInline
    public static ViewStructure c(ContentCaptureSession contentCaptureSession0, AutofillId autofillId0, long v) {
        return contentCaptureSession0.newVirtualViewStructure(autofillId0, v);
    }

    @DoNotInline
    public static void d(ContentCaptureSession contentCaptureSession0, ViewStructure viewStructure0) {
        contentCaptureSession0.notifyViewAppeared(viewStructure0);
    }

    @DoNotInline
    public static void e(ContentCaptureSession contentCaptureSession0, AutofillId autofillId0, CharSequence charSequence0) {
        contentCaptureSession0.notifyViewTextChanged(autofillId0, charSequence0);
    }

    @DoNotInline
    public static void f(ContentCaptureSession contentCaptureSession0, AutofillId autofillId0, long[] arr_v) {
        contentCaptureSession0.notifyViewsDisappeared(autofillId0, arr_v);
    }
}

