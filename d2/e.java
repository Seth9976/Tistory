package d2;

import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;

public abstract class e {
    @DoNotInline
    public static ContentCaptureSession a(View view0) {
        return view0.getContentCaptureSession();
    }
}

