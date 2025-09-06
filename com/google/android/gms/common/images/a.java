package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.HashSet;

public final class a implements Runnable {
    public final zag a;
    public final ImageManager b;

    public a(ImageManager imageManager0, zag zag0) {
        this.b = imageManager0;
        this.a = zag0;
    }

    @Override
    public final void run() {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        ImageReceiver imageManager$ImageReceiver0 = (ImageReceiver)this.b.d.get(this.a);
        if(imageManager$ImageReceiver0 != null) {
            this.b.d.remove(this.a);
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            imageManager$ImageReceiver0.b.remove(this.a);
        }
        zag zag0 = this.a;
        c c0 = zag0.a;
        Uri uri0 = c0.a;
        if(uri0 != null) {
            Long long0 = (Long)this.b.f.get(uri0);
            if(long0 != null) {
                if(SystemClock.elapsedRealtime() - ((long)long0) < 3600000L) {
                    this.a.a(this.b.a, true);
                    return;
                }
                this.b.f.remove(c0.a);
            }
            this.a.zaa(null, false, true, false);
            ImageReceiver imageManager$ImageReceiver1 = (ImageReceiver)this.b.e.get(c0.a);
            if(imageManager$ImageReceiver1 == null) {
                imageManager$ImageReceiver1 = new ImageReceiver(this.b, c0.a);
                this.b.e.put(c0.a, imageManager$ImageReceiver1);
            }
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            imageManager$ImageReceiver1.b.add(this.a);
            zag zag1 = this.a;
            if(!(zag1 instanceof zaf)) {
                this.b.d.put(zag1, imageManager$ImageReceiver1);
            }
            synchronized(ImageManager.g) {
                HashSet hashSet0 = ImageManager.h;
                if(!hashSet0.contains(c0.a)) {
                    hashSet0.add(c0.a);
                    imageManager$ImageReceiver1.a();
                }
            }
            return;
        }
        zag0.a(this.b.a, true);
    }
}

