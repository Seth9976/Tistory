package jb;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import com.kakao.kphotopicker.PhotoPickerActivity;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final PhotoPickerActivity w;

    public h(PhotoPickerActivity photoPickerActivity0) {
        this.w = photoPickerActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        String s1;
        PhotoPickerActivity photoPickerActivity0;
        Intrinsics.checkNotNullParameter(((List)object0), "it");
        if(!((List)object0).isEmpty()) {
            Iterator iterator0 = ((List)object0).iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                boolean z1 = false;
                photoPickerActivity0 = this.w;
                if(!z) {
                    break;
                }
                Object object1 = iterator0.next();
                MediaItem mediaItem0 = (MediaItem)object1;
                if(mediaItem0 instanceof Photo) {
                    boolean z2 = ((Photo)mediaItem0).getWidth() <= 0 || ((Photo)mediaItem0).getHeight() <= 0;
                    String s = ((Photo)mediaItem0).getEditedPath();
                    if(s == null || s.length() == 0) {
                        z1 = true;
                    }
                    if(z2 || !z1) {
                        if(z1) {
                            s1 = ((Photo)mediaItem0).getData();
                        }
                        else {
                            s1 = ((Photo)mediaItem0).getEditedPath();
                            Intrinsics.checkNotNull(s1);
                        }
                        Pair pair0 = PhotoPickerActivity.access$getImageBounds(photoPickerActivity0, s1);
                        ((Photo)mediaItem0).setWidth(((Number)pair0.getFirst()).intValue());
                        ((Photo)mediaItem0).setHeight(((Number)pair0.getSecond()).intValue());
                    }
                }
            }
            Intent intent0 = new Intent();
            intent0.putParcelableArrayListExtra("RESULT_MEDIA_LIST", new ArrayList(((List)object0)));
            intent0.setData(Uri.parse(((MediaItem)CollectionsKt___CollectionsKt.first(((List)object0))).src()));
            for(Object object2: ((List)object0)) {
                MediaItem mediaItem1 = (MediaItem)object2;
                if(intent0.getClipData() == null) {
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                    for(Object object3: ((List)object0)) {
                        arrayList0.add(((MediaItem)object3).mimeType());
                    }
                    intent0.setClipData(new ClipData(new ClipDescription("", ((String[])arrayList0.toArray(new String[0]))), new ClipData.Item(Uri.parse(mediaItem1.src()))));
                }
                else {
                    ClipData clipData0 = intent0.getClipData();
                    if(clipData0 != null) {
                        clipData0.addItem(new ClipData.Item(Uri.parse(mediaItem1.src())));
                    }
                }
            }
            intent0.putExtra("ke_image_grid", photoPickerActivity0.h().getHasGroupImage());
            photoPickerActivity0.setResult(-1, intent0);
            photoPickerActivity0.finish();
        }
        return Unit.INSTANCE;
    }
}

