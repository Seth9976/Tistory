package com.kakao.kphotopicker.loader.column;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import androidx.annotation.WorkerThread;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\u0013\u001A\u00020\u000E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0018\u001A\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R \u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001A\u0004\b\u001A\u0010\fR\u001A\u0010\u001E\u001A\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001C\u0010\u0015\u001A\u0004\b\u001D\u0010\u0017R\u001A\u0010\u001F\u001A\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001F\u0010\u0015\u001A\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"Lcom/kakao/kphotopicker/loader/column/ImageColumnImpl;", "Lcom/kakao/kphotopicker/loader/column/ColumnInterface;", "Landroid/database/Cursor;", "cursor", "Lcom/kakao/kphotopicker/picker/MediaItem;", "parseMedia", "(Landroid/database/Cursor;)Lcom/kakao/kphotopicker/picker/MediaItem;", "", "", "a", "[Ljava/lang/String;", "getBucketProjection", "()[Ljava/lang/String;", "bucketProjection", "Landroid/net/Uri;", "b", "Landroid/net/Uri;", "getContentUri", "()Landroid/net/Uri;", "contentUri", "c", "Ljava/lang/String;", "getSortOrder", "()Ljava/lang/String;", "sortOrder", "d", "getProjection", "projection", "e", "getSelection", "selection", "bucketSelection", "getBucketSelection", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImageColumnImpl implements ColumnInterface {
    @NotNull
    public static final ImageColumnImpl INSTANCE;
    public static final String[] a;
    public static final Uri b;
    public static final String c;
    public static final String[] d;
    public static final String e;

    static {
        ImageColumnImpl.INSTANCE = new ImageColumnImpl();  // 初始化器: Ljava/lang/Object;-><init>()V
        ImageColumnImpl.a = new String[]{"bucket_id", "bucket_display_name"};
        Uri uri0 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(uri0, "EXTERNAL_CONTENT_URI");
        ImageColumnImpl.b = uri0;
        ImageColumnImpl.c = "date_modified DESC, _id DESC";
        ImageColumnImpl.d = new String[]{"_id", "_data", "mime_type", "date_modified", "datetaken", "_size", "orientation", "width", "height", "bucket_id"};
        ImageColumnImpl.e = "";
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String[] getBucketProjection() {
        return ImageColumnImpl.a;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getBucketSelection() {
        return "";
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public Uri getContentUri() {
        return ImageColumnImpl.b;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String[] getProjection() {
        return ImageColumnImpl.d;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSelection() {
        return ImageColumnImpl.e;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSelectionBy(@Nullable Long long0) {
        return DefaultImpls.getSelectionBy(this, long0);
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSortOrder() {
        return ImageColumnImpl.c;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @WorkerThread
    @NotNull
    public List parseBucket(@NotNull Cursor cursor0) {
        return DefaultImpls.parseBucket(this, cursor0);
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @SuppressLint({"InlinedApi"})
    @NotNull
    public MediaItem parseMedia(@NotNull Cursor cursor0) {
        Intrinsics.checkNotNullParameter(cursor0, "cursor");
        ContentValues contentValues0 = new ContentValues();
        DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
        Uri uri0 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Long long0 = contentValues0.getAsLong("_id");
        Intrinsics.checkNotNull(long0);
        long v = (long)long0;
        String s = contentValues0.getAsString("_data");
        Intrinsics.checkNotNullExpressionValue(s, "getAsString(...)");
        String s1 = Uri.withAppendedPath(uri0, String.valueOf(long0)).toString();
        Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
        String s2 = contentValues0.getAsString("mime_type");
        if(s2 == null) {
            s2 = "";
        }
        Long long1 = contentValues0.getAsLong("date_modified");
        long v1 = 0L;
        long v2 = long1 == null ? 0L : ((long)long1);
        Long long2 = contentValues0.getAsLong("datetaken");
        long v3 = long2 == null ? 0L : ((long)long2);
        Integer integer0 = contentValues0.getAsInteger("orientation");
        int v4 = integer0 == null ? 0 : ((int)integer0);
        Long long3 = contentValues0.getAsLong("_size");
        if(long3 != null) {
            v1 = (long)long3;
        }
        Integer integer1 = contentValues0.getAsInteger("width");
        Integer integer2 = contentValues0.getAsInteger("height");
        Long long4 = contentValues0.getAsLong("bucket_id");
        Intrinsics.checkNotNullExpressionValue(long4, "getAsLong(...)");
        return new Photo(v, s, s1, null, s2, v2, v3, v4, v1, (integer1 == null ? 0 : ((int)integer1)), (integer2 == null ? 0 : ((int)integer2)), long4.longValue());
    }
}

