package jb;

import android.content.Intent;
import com.kakao.kphotopicker.GalleryPicker;
import com.kakao.kphotopicker.PhotoEditor;
import com.kakao.kphotopicker.PhotoPickerActivity;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final PhotoPickerActivity w;

    public g(PhotoPickerActivity photoPickerActivity0) {
        this.w = photoPickerActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((List)object0), "photoList");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
        for(Object object1: ((List)object0)) {
            Photo mediaItem$Photo0 = (Photo)object1;
            String s = mediaItem$Photo0.getEditedPath();
            if(s == null) {
                s = mediaItem$Photo0.getData();
            }
            arrayList0.add(s);
        }
        PhotoPickerActivity photoPickerActivity0 = this.w;
        photoPickerActivity0.y = (List)object0;
        PhotoEditor photoEditor0 = GalleryPicker.INSTANCE.getPhotoEditor$kphotopicker_release();
        if(photoEditor0 != null) {
            File file0 = photoPickerActivity0.getCacheDir();
            String s1 = file0 == null ? null : file0.getAbsolutePath();
            if(s1 == null) {
                s1 = "";
            }
            Intent intent0 = photoEditor0.newIntent(photoPickerActivity0, arrayList0, s1);
            if(intent0 != null) {
                photoPickerActivity0.E.launch(intent0);
            }
        }
        return Unit.INSTANCE;
    }
}

