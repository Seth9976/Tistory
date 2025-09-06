package d2;

import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import java.util.List;

public abstract class c {
    @DoNotInline
    public static void a(ContentCaptureSession contentCaptureSession0, List list0) {
        contentCaptureSession0.notifyViewsAppeared(list0);
    }
}

