package jb;

import android.media.MediaScannerConnection.OnScanCompletedListener;
import android.net.Uri;
import com.kakao.kphotopicker.PhotoPickerActivity;
import kotlin.jvm.internal.Intrinsics;

public final class d implements MediaScannerConnection.OnScanCompletedListener {
    public final PhotoPickerActivity a;

    public d(PhotoPickerActivity photoPickerActivity0) {
        this.a = photoPickerActivity0;
    }

    @Override  // android.media.MediaScannerConnection$OnScanCompletedListener
    public final void onScanCompleted(String s, Uri uri0) {
        Intrinsics.checkNotNullParameter(this.a, "this$0");
        this.a.h().addPhotoImage(uri0);
    }
}

