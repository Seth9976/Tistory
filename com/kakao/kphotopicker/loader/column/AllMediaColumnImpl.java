package com.kakao.kphotopicker.loader.column;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import androidx.annotation.WorkerThread;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\u001A\u0010\f\u001A\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR \u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0018\u001A\u00020\u000E8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u001A\u0010\u001B\u001A\u00020\u000E8\u0016X\u0097D¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001A\u0004\b\u001A\u0010\u0017R \u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u0010\u001A\u0004\b\u001D\u0010\u0012R\u001A\u0010!\u001A\u00020\u000E8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001F\u0010\u0015\u001A\u0004\b \u0010\u0017¨\u0006\""}, d2 = {"Lcom/kakao/kphotopicker/loader/column/AllMediaColumnImpl;", "Lcom/kakao/kphotopicker/loader/column/ColumnInterface;", "Landroid/database/Cursor;", "cursor", "Lcom/kakao/kphotopicker/picker/MediaItem;", "parseMedia", "(Landroid/database/Cursor;)Lcom/kakao/kphotopicker/picker/MediaItem;", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "getContentUri", "()Landroid/net/Uri;", "contentUri", "", "", "b", "[Ljava/lang/String;", "getBucketProjection", "()[Ljava/lang/String;", "bucketProjection", "c", "Ljava/lang/String;", "getBucketSelection", "()Ljava/lang/String;", "bucketSelection", "d", "getSortOrder", "sortOrder", "e", "getProjection", "projection", "f", "getSelection", "selection", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AllMediaColumnImpl implements ColumnInterface {
    @NotNull
    public static final AllMediaColumnImpl INSTANCE;
    public static final Uri a;
    public static final String[] b;
    public static final String c;
    public static final String d;
    public static final String[] e;
    public static final String f;

    static {
        AllMediaColumnImpl.INSTANCE = new AllMediaColumnImpl();  // 初始化器: Ljava/lang/Object;-><init>()V
        Uri uri0 = MediaStore.Files.getContentUri("external");
        Intrinsics.checkNotNullExpressionValue(uri0, "getContentUri(...)");
        AllMediaColumnImpl.a = uri0;
        AllMediaColumnImpl.b = new String[]{"bucket_id", "bucket_display_name"};
        AllMediaColumnImpl.c = "media_type=1 OR media_type=3";
        AllMediaColumnImpl.d = "date_modified DESC, _id DESC";
        AllMediaColumnImpl.e = new String[]{"_id", "_data", "media_type", "date_modified", "datetaken", "orientation", "duration", "_size", "width", "height", "mime_type", "bucket_id"};
        AllMediaColumnImpl.f = "media_type=1 OR media_type=3";
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String[] getBucketProjection() {
        return AllMediaColumnImpl.b;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getBucketSelection() {
        return AllMediaColumnImpl.c;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public Uri getContentUri() {
        return AllMediaColumnImpl.a;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String[] getProjection() {
        return AllMediaColumnImpl.e;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSelection() {
        return AllMediaColumnImpl.f;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSelectionBy(@Nullable Long long0) {
        return DefaultImpls.getSelectionBy(this, long0);
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSortOrder() {
        return AllMediaColumnImpl.d;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @WorkerThread
    @NotNull
    public List parseBucket(@NotNull Cursor cursor0) {
        return DefaultImpls.parseBucket(this, cursor0);
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @SuppressLint({"InlinedApi"})
    @Nullable
    public MediaItem parseMedia(@NotNull Cursor cursor0) {
        Intrinsics.checkNotNullParameter(cursor0, "cursor");
        int v = cursor0.getColumnIndex("media_type");
        ContentValues contentValues0 = new ContentValues();
        DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
        try {
            int v1 = 0;
            long v2 = 0L;
            switch(cursor0.getInt(v)) {
                case 1: {
                    Long long0 = contentValues0.getAsLong("_id");
                    String s = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, String.valueOf(long0)).toString();
                    Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
                    Intrinsics.checkNotNull(long0);
                    long v3 = (long)long0;
                    String s1 = contentValues0.getAsString("_data");
                    Intrinsics.checkNotNullExpressionValue(s1, "getAsString(...)");
                    String s2 = contentValues0.getAsString("mime_type");
                    Long long1 = contentValues0.getAsLong("date_modified");
                    long v4 = long1 == null ? 0L : ((long)long1);
                    Long long2 = contentValues0.getAsLong("datetaken");
                    long v5 = long2 == null ? 0L : ((long)long2);
                    Integer integer0 = contentValues0.getAsInteger("orientation");
                    int v6 = integer0 == null ? 0 : ((int)integer0);
                    Long long3 = contentValues0.getAsLong("_size");
                    if(long3 != null) {
                        v2 = (long)long3;
                    }
                    Integer integer1 = contentValues0.getAsInteger("width");
                    int v7 = integer1 == null ? 0 : ((int)integer1);
                    Integer integer2 = contentValues0.getAsInteger("height");
                    if(integer2 != null) {
                        v1 = (int)integer2;
                    }
                    Long long4 = contentValues0.getAsLong("bucket_id");
                    Intrinsics.checkNotNullExpressionValue(long4, "getAsLong(...)");
                    return new Photo(v3, s1, s, null, (s2 == null ? "" : s2), v4, v5, v6, v2, v7, v1, long4.longValue());
                }
                case 3: {
                    Long long5 = contentValues0.getAsLong("_id");
                    String s3 = Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, String.valueOf(long5)).toString();
                    Intrinsics.checkNotNullExpressionValue(s3, "toString(...)");
                    Intrinsics.checkNotNull(long5);
                    long v8 = (long)long5;
                    String s4 = contentValues0.getAsString("_data");
                    Intrinsics.checkNotNullExpressionValue(s4, "getAsString(...)");
                    String s5 = contentValues0.getAsString("mime_type");
                    Long long6 = contentValues0.getAsLong("date_modified");
                    long v9 = long6 == null ? 0L : ((long)long6);
                    Long long7 = contentValues0.getAsLong("datetaken");
                    long v10 = long7 == null ? 0L : ((long)long7);
                    Integer integer3 = contentValues0.getAsInteger("orientation");
                    int v11 = integer3 == null ? 0 : ((int)integer3);
                    Integer integer4 = contentValues0.getAsInteger("duration");
                    Intrinsics.checkNotNullExpressionValue(integer4, "getAsInteger(...)");
                    int v12 = integer4.intValue();
                    Long long8 = contentValues0.getAsLong("_size");
                    if(long8 != null) {
                        v2 = (long)long8;
                    }
                    Integer integer5 = contentValues0.getAsInteger("width");
                    int v13 = integer5 == null ? 0 : ((int)integer5);
                    Integer integer6 = contentValues0.getAsInteger("height");
                    if(integer6 != null) {
                        v1 = (int)integer6;
                    }
                    Long long9 = contentValues0.getAsLong("bucket_id");
                    Intrinsics.checkNotNullExpressionValue(long9, "getAsLong(...)");
                    return new Video(v8, s4, s3, (s5 == null ? "" : s5), v9, v10, v11, v12, v2, v13, v1, long9.longValue());
                }
                default: {
                    return null;
                }
            }
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

