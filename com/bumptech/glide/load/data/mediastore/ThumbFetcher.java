package com.bumptech.glide.load.data.mediastore;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.ExifOrientationStream;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import jeb.synthetic.TWR;

public class ThumbFetcher implements DataFetcher {
    public final Uri a;
    public final b b;
    public InputStream c;

    public ThumbFetcher(Uri uri0, b b0) {
        this.a = uri0;
        this.b = b0;
    }

    public static ThumbFetcher a(Context context0, Uri uri0, ThumbnailQuery thumbnailQuery0) {
        ArrayPool arrayPool0 = Glide.get(context0).getArrayPool();
        return new ThumbFetcher(uri0, new b(Glide.get(context0).getRegistry().getImageHeaderParsers(), thumbnailQuery0, arrayPool0, context0.getContentResolver()));
    }

    public final InputStream b() {
        int v;
        InputStream inputStream0;
        String s;
        Cursor cursor1;
        Uri uri0 = this.a;
        b b0 = this.b;
        b0.getClass();
        Cursor cursor0 = null;
        try {
            cursor1 = null;
            cursor1 = b0.a.query(uri0);
            goto label_10;
        }
        catch(SecurityException securityException0) {
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
    label_10:
        if(cursor1 == null) {
        label_25:
            if(cursor1 != null) {
                cursor1.close();
            }
        label_27:
            s = null;
        }
        else {
            try {
                try {
                    if(cursor1.moveToFirst()) {
                        s = cursor1.getString(0);
                        goto label_23;
                    }
                    else {
                        goto label_25;
                    }
                    goto label_28;
                }
                catch(SecurityException securityException0) {
                }
            label_15:
                if(Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri0, securityException0);
                }
            }
            catch(Throwable throwable0) {
                goto label_21;
            }
            if(cursor1 != null) {
                cursor1.close();
                goto label_27;
            label_21:
                TWR.safeClose$NT(cursor1, throwable0);
                throw throwable0;
            label_23:
                cursor1.close();
                goto label_28;
            }
            goto label_27;
        }
    label_28:
        if(TextUtils.isEmpty(s)) {
            inputStream0 = null;
        }
        else {
            File file0 = new File(s);
            if(!file0.exists() || 0L >= file0.length()) {
                inputStream0 = null;
            }
            else {
                Uri uri1 = Uri.fromFile(file0);
                try {
                    inputStream0 = b0.c.openInputStream(uri1);
                }
                catch(NullPointerException nullPointerException0) {
                    throw (FileNotFoundException)new FileNotFoundException("NPE opening uri: " + uri0 + " -> " + uri1).initCause(nullPointerException0);
                }
            }
        }
        if(inputStream0 == null) {
            goto label_57;
        }
        else {
            b0.getClass();
            try {
                try {
                    cursor0 = b0.c.openInputStream(uri0);
                    v = ImageHeaderParserUtils.getOrientation(b0.d, ((InputStream)cursor0), b0.b);
                    goto label_54;
                }
                catch(IOException | NullPointerException iOException0) {
                }
                if(Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri0, iOException0);
                }
            }
            catch(Throwable throwable1) {
                goto label_51;
            }
            if(cursor0 == null) {
                goto label_57;
            }
            else {
                try {
                    ((InputStream)cursor0).close();
                }
                catch(IOException unused_ex) {
                }
                goto label_57;
            label_51:
                if(cursor0 != null) {
                    try {
                        ((InputStream)cursor0).close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                throw throwable1;
            label_54:
                if(cursor0 != null) {
                    try {
                        ((InputStream)cursor0).close();
                        goto label_58;
                    label_57:
                        v = -1;
                    }
                    catch(IOException unused_ex) {
                    }
                }
            }
        }
    label_58:
        return v != -1 ? new ExifOrientationStream(inputStream0, v) : inputStream0;
    }

    public static ThumbFetcher buildImageFetcher(Context context0, Uri uri0) {
        return ThumbFetcher.a(context0, uri0, new a(context0.getContentResolver(), 0));
    }

    public static ThumbFetcher buildVideoFetcher(Context context0, Uri uri0) {
        return ThumbFetcher.a(context0, uri0, new a(context0.getContentResolver(), 1));
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream0 = this.c;
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class getDataClass() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority0, @NonNull DataCallback dataFetcher$DataCallback0) {
        try {
            InputStream inputStream0 = this.b();
            this.c = inputStream0;
            dataFetcher$DataCallback0.onDataReady(inputStream0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", fileNotFoundException0);
            }
            dataFetcher$DataCallback0.onLoadFailed(fileNotFoundException0);
        }
    }
}

