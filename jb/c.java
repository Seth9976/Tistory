package jb;

import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.compose.foundation.text.selection.b1;
import com.kakao.kphotopicker.GalleryPicker;
import com.kakao.kphotopicker.PhotoEditor;
import com.kakao.kphotopicker.PhotoPickerActivity;
import com.kakao.kphotopicker.util.Logger;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class c implements ActivityResultCallback {
    public final int a;
    public final PhotoPickerActivity b;

    public c(PhotoPickerActivity photoPickerActivity0, int v) {
        this.a = v;
        this.b = photoPickerActivity0;
        super();
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object object0) {
        PhotoPickerActivity photoPickerActivity0 = this.b;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(photoPickerActivity0, "this$0");
                if(((ActivityResult)object0).getResultCode() != -1) {
                    if(Build.VERSION.SDK_INT >= 29) {
                        Uri uri0 = photoPickerActivity0.F;
                        if(uri0 != null) {
                            photoPickerActivity0.getContentResolver().delete(uri0, null, null);
                        }
                    }
                    else {
                        photoPickerActivity0.getClass();
                    }
                }
                else if(photoPickerActivity0.F != null) {
                    photoPickerActivity0.h().addPhotoImage(photoPickerActivity0.F);
                }
                else {
                    File file0 = photoPickerActivity0.G;
                    if(file0 != null) {
                        Intrinsics.checkNotNull(file0);
                        MediaScannerConnection.scanFile(photoPickerActivity0, new String[]{file0.getPath()}, null, new d(photoPickerActivity0));
                    }
                }
                photoPickerActivity0.F = null;
                photoPickerActivity0.G = null;
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(photoPickerActivity0, "this$0");
                if(((ActivityResult)object0).getResultCode() == -1) {
                    Uri uri1 = photoPickerActivity0.F;
                    if(uri1 == null) {
                        Intent intent0 = ((ActivityResult)object0).getData();
                        uri1 = intent0 == null ? null : intent0.getData();
                    }
                    Logger.INSTANCE.log("camera video url " + uri1 + " ");
                    photoPickerActivity0.h().addVideoMediaItemFromCamera(uri1, new com.kakao.kphotopicker.d(photoPickerActivity0), new b1(photoPickerActivity0, 12));
                }
                else if(Build.VERSION.SDK_INT >= 29) {
                    Uri uri2 = photoPickerActivity0.F;
                    if(uri2 != null) {
                        photoPickerActivity0.getContentResolver().delete(uri2, null, null);
                    }
                }
                else {
                    photoPickerActivity0.getClass();
                }
                photoPickerActivity0.F = null;
                return;
            }
            default: {
                Intrinsics.checkNotNullParameter(photoPickerActivity0, "this$0");
                PhotoEditor photoEditor0 = GalleryPicker.INSTANCE.getPhotoEditor$kphotopicker_release();
                Map map0 = photoEditor0 == null ? null : photoEditor0.onActivityResult(((ActivityResult)object0).getResultCode(), ((ActivityResult)object0).getData());
                if(map0 != null) {
                    List list0 = photoPickerActivity0.y;
                    if(list0 != null) {
                        photoPickerActivity0.h().updatePhoto(list0, map0);
                    }
                }
                photoPickerActivity0.y = null;
            }
        }
    }
}

