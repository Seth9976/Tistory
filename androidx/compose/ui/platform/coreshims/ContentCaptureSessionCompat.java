package androidx.compose.ui.platform.coreshims;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.k;
import d2.a;
import d2.b;
import d2.c;
import java.util.List;
import java.util.Objects;

@RestrictTo({Scope.LIBRARY})
public class ContentCaptureSessionCompat {
    public final Object a;
    public final View b;

    public ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession0, View view0) {
        this.a = contentCaptureSession0;
        this.b = view0;
    }

    @Nullable
    public AutofillId newAutofillId(long v) {
        if(Build.VERSION.SDK_INT >= 29) {
            AutofillIdCompat autofillIdCompat0 = ViewCompatShims.getAutofillId(this.b);
            Objects.requireNonNull(autofillIdCompat0);
            return b.a(((ContentCaptureSession)this.a), autofillIdCompat0.toAutofillId(), v);
        }
        return null;
    }

    @Nullable
    public ViewStructureCompat newVirtualViewStructure(@NonNull AutofillId autofillId0, long v) {
        return Build.VERSION.SDK_INT < 29 ? null : ViewStructureCompat.toViewStructureCompat(b.c(((ContentCaptureSession)this.a), autofillId0, v));
    }

    public void notifyViewTextChanged(@NonNull AutofillId autofillId0, @Nullable CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 29) {
            b.e(((ContentCaptureSession)this.a), autofillId0, charSequence0);
        }
    }

    public void notifyViewsAppeared(@NonNull List list0) {
        int v = Build.VERSION.SDK_INT;
        Object object0 = this.a;
        if(v >= 34) {
            c.a(((ContentCaptureSession)object0), list0);
            return;
        }
        if(v >= 29) {
            View view0 = this.b;
            ViewStructure viewStructure0 = b.b(((ContentCaptureSession)object0), view0);
            a.a(viewStructure0).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(((ContentCaptureSession)object0), viewStructure0);
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                b.d(((ContentCaptureSession)object0), ((ViewStructure)list0.get(v1)));
            }
            ViewStructure viewStructure1 = b.b(((ContentCaptureSession)object0), view0);
            a.a(viewStructure1).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(((ContentCaptureSession)object0), viewStructure1);
        }
    }

    public void notifyViewsDisappeared(@NonNull long[] arr_v) {
        int v = Build.VERSION.SDK_INT;
        Object object0 = this.a;
        View view0 = this.b;
        if(v >= 34) {
            AutofillIdCompat autofillIdCompat0 = ViewCompatShims.getAutofillId(view0);
            Objects.requireNonNull(autofillIdCompat0);
            b.f(((ContentCaptureSession)object0), autofillIdCompat0.toAutofillId(), arr_v);
            return;
        }
        if(v >= 29) {
            ViewStructure viewStructure0 = b.b(((ContentCaptureSession)object0), view0);
            a.a(viewStructure0).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(((ContentCaptureSession)object0), viewStructure0);
            AutofillIdCompat autofillIdCompat1 = ViewCompatShims.getAutofillId(view0);
            Objects.requireNonNull(autofillIdCompat1);
            b.f(((ContentCaptureSession)object0), autofillIdCompat1.toAutofillId(), arr_v);
            ViewStructure viewStructure1 = b.b(((ContentCaptureSession)object0), view0);
            a.a(viewStructure1).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(((ContentCaptureSession)object0), viewStructure1);
        }
    }

    @NonNull
    @RequiresApi(29)
    public ContentCaptureSession toContentCaptureSession() {
        return k.l(this.a);
    }

    @NonNull
    @RequiresApi(29)
    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession0, @NonNull View view0) {
        return new ContentCaptureSessionCompat(contentCaptureSession0, view0);
    }
}

