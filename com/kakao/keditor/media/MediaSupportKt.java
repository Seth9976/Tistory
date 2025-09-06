package com.kakao.keditor.media;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore.Video.Media;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.plugin.KeditorPlugin;
import com.kakao.keditor.plugin.KeditorPluginKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0002\u001A\u001E\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00072\u0006\u0010\u0002\u001A\u00020\u0003\u001A$\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001A\u00020\u000B\u001A(\u0010\f\u001A\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001A\u00020\u000E¨\u0006\u000F"}, d2 = {"orientation", "", "exifInterface", "Landroid/media/ExifInterface;", "byOrientation", "Lkotlin/Pair;", "", "Landroid/graphics/BitmapFactory$Options;", "imageSize", "Lcom/kakao/keditor/plugin/KeditorPlugin;", "uri", "Landroid/net/Uri;", "videoSize", "data", "", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class MediaSupportKt {
    @NotNull
    public static final Pair byOrientation(@NotNull BitmapFactory.Options bitmapFactory$Options0, @NotNull ExifInterface exifInterface0) {
        Intrinsics.checkNotNullParameter(bitmapFactory$Options0, "<this>");
        Intrinsics.checkNotNullParameter(exifInterface0, "exifInterface");
        float f = MediaSupportKt.orientation(exifInterface0);
        return f != 90.0f && f != 270.0f ? new Pair(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight) : new Pair(bitmapFactory$Options0.outHeight, bitmapFactory$Options0.outWidth);
    }

    @Nullable
    public static final Pair imageSize(@NotNull KeditorPlugin keditorPlugin0, @NotNull Uri uri0) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(uri0, "uri");
        Activity activity0 = KeditorPluginKt.findActivity(keditorPlugin0);
        if(activity0 != null) {
            try {
                String s = uri0.toString();
                Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
                if(!p.startsWith$default(s, "content", false, 2, null)) {
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(uri0.toString(), bitmapFactory$Options0);
                    return MediaSupportKt.byOrientation(bitmapFactory$Options0, new ExifInterface(uri0.toString()));
                }
                ParcelFileDescriptor parcelFileDescriptor0 = activity0.getContentResolver().openFileDescriptor(uri0, "r");
                if(parcelFileDescriptor0 != null) {
                    try {
                        BitmapFactory.Options bitmapFactory$Options1 = new BitmapFactory.Options();
                        bitmapFactory$Options1.inJustDecodeBounds = true;
                        BitmapFactory.decodeFileDescriptor(parcelFileDescriptor0.getFileDescriptor(), null, bitmapFactory$Options1);
                        pair0 = MediaSupportKt.byOrientation(bitmapFactory$Options1, new ExifInterface(parcelFileDescriptor0.getFileDescriptor()));
                    }
                    catch(Throwable throwable0) {
                        CloseableKt.closeFinally(parcelFileDescriptor0, throwable0);
                        throw throwable0;
                    }
                    CloseableKt.closeFinally(parcelFileDescriptor0, null);
                    return pair0;
                }
            }
            catch(Exception exception0) {
                Keditor.INSTANCE.log(keditorPlugin0, "Fail to found uri [" + uri0 + "]: " + exception0.getMessage());
            }
        }
        return null;
    }

    private static final float orientation(ExifInterface exifInterface0) {
        switch(exifInterface0.getAttributeInt("Orientation", 0)) {
            case 3: {
                return 180.0f;
            }
            case 6: {
                return 90.0f;
            }
            case 8: {
                return 270.0f;
            }
            default: {
                return 0.0f;
            }
        }
    }

    @Nullable
    public static final Pair videoSize(@NotNull KeditorPlugin keditorPlugin0, @NotNull String s) {
        Pair pair0;
        Cursor cursor0;
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(s, "data");
        Activity activity0 = KeditorPluginKt.findActivity(keditorPlugin0);
        if(activity0 == null) {
            cursor0 = null;
        }
        else {
            ContentResolver contentResolver0 = activity0.getContentResolver();
            cursor0 = contentResolver0 == null ? null : contentResolver0.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "mime_type", "datetaken", "_size", "width", "height", "bucket_id"}, "_data = ?", new String[]{s}, null);
        }
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    ContentValues contentValues0 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
                    pair0 = TuplesKt.to(contentValues0.getAsInteger("width"), contentValues0.getAsInteger("height"));
                    goto label_20;
                }
                goto label_22;
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
        label_20:
            CloseableKt.closeFinally(cursor0, null);
            return pair0;
        label_22:
            CloseableKt.closeFinally(cursor0, null);
            return null;
        }
        return null;
    }
}

