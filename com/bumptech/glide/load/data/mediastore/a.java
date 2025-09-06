package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video.Thumbnails;

public final class a implements ThumbnailQuery {
    public final int a;
    public final ContentResolver b;
    public static final String[] c;
    public static final String[] d;

    static {
        a.c = new String[]{"_data"};
        a.d = new String[]{"_data"};
    }

    public a(ContentResolver contentResolver0, int v) {
        this.a = v;
        this.b = contentResolver0;
        super();
    }

    @Override  // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
    public final Cursor query(Uri uri0) {
        if(this.a != 0) {
            String[] arr_s = {uri0.getLastPathSegment()};
            return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a.d, "kind = 1 AND video_id = ?", arr_s, null);
        }
        String[] arr_s1 = {uri0.getLastPathSegment()};
        return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a.c, "kind = 1 AND image_id = ?", arr_s1, null);
    }
}

