package com.kakao.kphotopicker.loader;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import androidx.annotation.WorkerThread;
import com.kakao.kphotopicker.loader.column.ColumnInterface;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import lb.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0001\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u00062\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u001E\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u000F\u001A\u00020\u000EH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0014\u001A\u0004\u0018\u00010\u00132\u0006\u0010\u000F\u001A\u00020\u000EH\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001A\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001E\u001A\u0004\u0018\u00010\u00132\u0006\u0010\u001D\u001A\u00020\u001C¢\u0006\u0004\b\u001E\u0010\u001FJ\u0019\u0010!\u001A\u0004\u0018\u00010\u00132\u0006\u0010 \u001A\u00020\u001CH\u0007¢\u0006\u0004\b!\u0010\u001FR\u001A\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00060\"8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b#\u0010$R\u0014\u0010(\u001A\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b&\u0010\'R\u0014\u0010+\u001A\u00020\u001C8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b)\u0010*R\u001A\u0010-\u001A\b\u0012\u0004\u0012\u00020\u00060\"8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b,\u0010$R\u0014\u0010/\u001A\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b.\u0010\'R\u0014\u00101\u001A\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b0\u0010\'¨\u00062"}, d2 = {"Lcom/kakao/kphotopicker/loader/MediaRepository;", "Lcom/kakao/kphotopicker/loader/column/ColumnInterface;", "Landroid/content/ContentResolver;", "contentResolver", "columnInterface", "", "", "excludeMimeTypes", "<init>", "(Landroid/content/ContentResolver;Lcom/kakao/kphotopicker/loader/column/ColumnInterface;Ljava/util/List;)V", "", "bucketId", "getSelectionBy", "(Ljava/lang/Long;)Ljava/lang/String;", "Landroid/database/Cursor;", "cursor", "Lcom/kakao/kphotopicker/picker/Folder;", "parseBucket", "(Landroid/database/Cursor;)Ljava/util/List;", "Lcom/kakao/kphotopicker/picker/MediaItem;", "parseMedia", "(Landroid/database/Cursor;)Lcom/kakao/kphotopicker/picker/MediaItem;", "getFolders", "()Ljava/util/List;", "folder", "Lkotlinx/coroutines/flow/Flow;", "getMediaListFlow", "(Lcom/kakao/kphotopicker/picker/Folder;)Lkotlinx/coroutines/flow/Flow;", "Landroid/net/Uri;", "uri", "loadCameraVideo", "(Landroid/net/Uri;)Lcom/kakao/kphotopicker/picker/MediaItem;", "photoUri", "loadCameraPhoto", "", "getBucketProjection", "()[Ljava/lang/String;", "bucketProjection", "getBucketSelection", "()Ljava/lang/String;", "bucketSelection", "getContentUri", "()Landroid/net/Uri;", "contentUri", "getProjection", "projection", "getSelection", "selection", "getSortOrder", "sortOrder", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMediaRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaRepository.kt\ncom/kakao/kphotopicker/loader/MediaRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Cursor.kt\nandroidx/core/database/CursorKt\n*L\n1#1,219:1\n1#2:220\n37#3,2:221\n37#3,2:223\n37#3,2:227\n86#4:225\n86#4:226\n*S KotlinDebug\n*F\n+ 1 MediaRepository.kt\ncom/kakao/kphotopicker/loader/MediaRepository\n*L\n33#1:221,2\n57#1:223,2\n113#1:227,2\n60#1:225\n61#1:226\n*E\n"})
public final class MediaRepository implements ColumnInterface {
    public final ContentResolver a;
    public final ColumnInterface b;
    public final List c;
    public final String d;

    public MediaRepository(@NotNull ContentResolver contentResolver0, @NotNull ColumnInterface columnInterface0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        String s;
        Intrinsics.checkNotNullParameter(columnInterface0, "columnInterface");
        Intrinsics.checkNotNullParameter(list0, "excludeMimeTypes");
        super();
        this.a = contentResolver0;
        this.b = columnInterface0;
        this.c = list0;
        if(list0.isEmpty()) {
            s = null;
        }
        else {
            int v = list0.size();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add("?");
            }
            s = a.d("NOT mime_type COLLATE NOCASE IN (", CollectionsKt___CollectionsKt.joinToString$default(arrayList0, ", ", null, null, 0, null, null, 62, null), ")");
        }
        this.d = s;
    }

    public final String a(String s) {
        String s1 = this.d;
        if(s1 != null) {
            return p.isBlank(s) ? s1 : "(" + s + ") AND " + s1;
        }
        return s;
    }

    public static final int access$getPageSize(MediaRepository mediaRepository0, Cursor cursor0) {
        mediaRepository0.getClass();
        return cursor0.getPosition() == 0 ? 300 : 5000;
    }

    public static final List access$getScopeList(MediaRepository mediaRepository0, Cursor cursor0, int v, int v1) {
        Object object0;
        mediaRepository0.getClass();
        List list0 = new ArrayList();
        if(cursor0.moveToPosition(v)) {
            while(true) {
                try {
                label_3:
                    object0 = Result.constructor-impl(mediaRepository0.b.parseMedia(cursor0));
                }
                catch(Throwable throwable0) {
                    object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                }
                if(Result.isFailure-impl(object0)) {
                    object0 = null;
                }
                if(((MediaItem)object0) != null) {
                    ((ArrayList)list0).add(((MediaItem)object0));
                }
                if(cursor0.getPosition() < v + v1 - 1 && cursor0.moveToNext()) {
                    goto label_3;
                }
                break;
            }
        }
        return list0;
    }

    public static final Cursor access$queryMediasBy(MediaRepository mediaRepository0, Long long0) {
        Uri uri0 = mediaRepository0.b.getContentUri();
        String s = mediaRepository0.a(mediaRepository0.b.getSelectionBy(long0));
        String[] arr_s = mediaRepository0.b.getProjection();
        Object[] arr_object = mediaRepository0.c.toArray(new String[0]);
        String s1 = mediaRepository0.b.getSortOrder();
        return mediaRepository0.a.query(uri0, arr_s, s, ((String[])arr_object), s1);
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String[] getBucketProjection() {
        return this.b.getBucketProjection();
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getBucketSelection() {
        return this.b.getBucketSelection();
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public Uri getContentUri() {
        return this.b.getContentUri();
    }

    @SuppressLint({"InlinedApi"})
    @WorkerThread
    @NotNull
    public final List getFolders() throws Exception {
        Pair pair0;
        List list1;
        String[] arr_s = this.getBucketProjection();
        if(this.d != null && !ArraysKt___ArraysKt.contains(arr_s, "mime_type")) {
            arr_s = (String[])ArraysKt___ArraysJvmKt.plus(arr_s, "mime_type");
        }
        String s = this.a(this.getBucketSelection());
        Uri uri0 = this.getContentUri();
        List list0 = this.c;
        Object[] arr_object = list0.toArray(new String[0]);
        Cursor cursor0 = this.a.query(uri0, arr_s, s, ((String[])arr_object), "bucket_display_name");
        if(cursor0 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            try {
                try {
                    list1 = cursor0.moveToFirst() ? this.parseBucket(cursor0) : CollectionsKt__CollectionsKt.emptyList();
                }
                catch(Exception unused_ex) {
                    list1 = CollectionsKt__CollectionsKt.emptyList();
                }
                goto label_22;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable1;
            }
        label_22:
            CloseableKt.closeFinally(cursor0, null);
            if(list1 == null) {
                list1 = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        for(Object object0: list1) {
            Uri uri1 = this.getContentUri().buildUpon().encodedQuery("limit=1").build();
            String s1 = this.a(this.getSelectionBy(((Folder)object0).getBucketId()));
            String[] arr_s1 = this.getProjection();
            Object[] arr_object1 = list0.toArray(new String[0]);
            String s2 = this.getSortOrder();
            Cursor cursor1 = this.a.query(uri1, arr_s1, s1, ((String[])arr_object1), s2);
            if(cursor1 == null) {
                pair0 = null;
            }
            else {
                try {
                    long v = 0L;
                    cursor1.moveToFirst();
                    int v1 = cursor1.getColumnIndex("_id");
                    Long long0 = cursor1.isNull(v1) ? null : cursor1.getLong(v1);
                    long v2 = long0 == null ? 0L : ((long)long0);
                    int v3 = cursor1.getColumnIndex("date_modified");
                    Long long1 = cursor1.isNull(v3) ? null : cursor1.getLong(v3);
                    if(long1 != null) {
                        v = (long)long1;
                    }
                    pair0 = TuplesKt.to(Uri.withAppendedPath(this.getContentUri(), String.valueOf(v2)).toString(), v);
                    goto label_56;
                }
                catch(Exception unused_ex) {
                }
                catch(Throwable throwable2) {
                    throw throwable2;
                }
                pair0 = null;
                goto label_56;
                try {
                    throw throwable2;
                }
                catch(Throwable throwable3) {
                    CloseableKt.closeFinally(cursor1, throwable2);
                    throw throwable3;
                }
            label_56:
                CloseableKt.closeFinally(cursor1, null);
            }
            ((Folder)object0).setThumbnailUrl((pair0 == null ? null : ((String)pair0.getFirst())));
            ((Folder)object0).setDateModified((pair0 == null ? null : ((Long)pair0.getSecond())));
        }
        return list1;
    }

    @NotNull
    public final Flow getMediaListFlow(@Nullable Folder folder0) {
        return FlowKt.flow(new b(folder0, this, null));
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String[] getProjection() {
        return this.b.getProjection();
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSelection() {
        return this.b.getSelection();
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSelectionBy(@Nullable Long long0) {
        return this.b.getSelectionBy(long0);
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @NotNull
    public String getSortOrder() {
        return this.b.getSortOrder();
    }

    @SuppressLint({"InlinedApi"})
    @Nullable
    public final MediaItem loadCameraPhoto(@NotNull Uri uri0) {
        MediaItem mediaItem0;
        int v6;
        int v5;
        long v2;
        long v1;
        Intrinsics.checkNotNullParameter(uri0, "photoUri");
        Uri uri1 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String s = this.getSortOrder();
        Cursor cursor0 = this.a.query(uri0, new String[]{"_id", "_data", "mime_type", "date_modified", "datetaken", "_size", "orientation", "bucket_id"}, "", null, s);
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    ContentValues contentValues0 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
                    Long long0 = contentValues0.getAsLong("_id");
                    String s1 = Uri.withAppendedPath(uri1, String.valueOf(long0)).toString();
                    Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
                    Intrinsics.checkNotNull(long0);
                    long v = (long)long0;
                    String s2 = contentValues0.getAsString("_data");
                    Intrinsics.checkNotNullExpressionValue(s2, "getAsString(...)");
                    String s3 = contentValues0.getAsString("mime_type");
                    if(s3 == null) {
                        s3 = "";
                    }
                    else {
                        Intrinsics.checkNotNull(s3);
                    }
                    Long long1 = contentValues0.getAsLong("date_modified");
                    if(long1 == null) {
                        v1 = 0L;
                    }
                    else {
                        Intrinsics.checkNotNull(long1);
                        v1 = (long)long1;
                    }
                    Long long2 = contentValues0.getAsLong("datetaken");
                    if(long2 == null) {
                        v2 = 0L;
                    }
                    else {
                        Intrinsics.checkNotNull(long2);
                        v2 = (long)long2;
                    }
                    Integer integer0 = contentValues0.getAsInteger("orientation");
                    int v3 = integer0 == null ? 0 : ((int)integer0);
                    Long long3 = contentValues0.getAsLong("_size");
                    long v4 = long3 == null ? 0L : ((long)long3);
                    Integer integer1 = contentValues0.getAsInteger("width");
                    if(integer1 == null) {
                        v5 = 0;
                    }
                    else {
                        Intrinsics.checkNotNull(integer1);
                        v5 = (int)integer1;
                    }
                    Integer integer2 = contentValues0.getAsInteger("height");
                    if(integer2 == null) {
                        v6 = 0;
                    }
                    else {
                        Intrinsics.checkNotNull(integer2);
                        v6 = (int)integer2;
                    }
                    Long long4 = contentValues0.getAsLong("bucket_id");
                    Intrinsics.checkNotNullExpressionValue(long4, "getAsLong(...)");
                    mediaItem0 = new Photo(v, s2, s1, null, s3, v1, v2, v3, v4, v5, v6, long4.longValue());
                    goto label_55;
                }
                goto label_57;
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
        label_55:
            CloseableKt.closeFinally(cursor0, null);
            return mediaItem0;
        label_57:
            CloseableKt.closeFinally(cursor0, null);
            return null;
        }
        return null;
    }

    @Nullable
    public final MediaItem loadCameraVideo(@NotNull Uri uri0) {
        MediaItem mediaItem0;
        int v7;
        int v6;
        long v5;
        int v4;
        long v1;
        Intrinsics.checkNotNullParameter(uri0, "uri");
        String s = this.getSortOrder();
        Cursor cursor0 = this.a.query(uri0, new String[]{"_id", "_data", "mime_type", "date_modified", "datetaken", "duration", "_size", "width", "height", "bucket_id"}, "", null, s);
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    ContentValues contentValues0 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
                    Uri uri1 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    Long long0 = contentValues0.getAsLong("_id");
                    String s1 = Uri.withAppendedPath(uri1, String.valueOf(long0)).toString();
                    Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
                    Intrinsics.checkNotNull(long0);
                    long v = (long)long0;
                    String s2 = contentValues0.getAsString("_data");
                    Intrinsics.checkNotNullExpressionValue(s2, "getAsString(...)");
                    String s3 = contentValues0.getAsString("mime_type");
                    if(s3 == null) {
                        s3 = "";
                    }
                    else {
                        Intrinsics.checkNotNull(s3);
                    }
                    Long long1 = contentValues0.getAsLong("date_modified");
                    if(long1 == null) {
                        v1 = 0L;
                    }
                    else {
                        Intrinsics.checkNotNull(long1);
                        v1 = (long)long1;
                    }
                    Long long2 = contentValues0.getAsLong("datetaken");
                    long v2 = long2 == null ? 0L : ((long)long2);
                    Integer integer0 = contentValues0.getAsInteger("orientation");
                    int v3 = integer0 == null ? 0 : ((int)integer0);
                    Integer integer1 = contentValues0.getAsInteger("duration");
                    if(integer1 == null) {
                        v4 = 0;
                    }
                    else {
                        Intrinsics.checkNotNull(integer1);
                        v4 = (int)integer1;
                    }
                    Long long3 = contentValues0.getAsLong("_size");
                    if(long3 == null) {
                        v5 = 0L;
                    }
                    else {
                        Intrinsics.checkNotNull(long3);
                        v5 = (long)long3;
                    }
                    Integer integer2 = contentValues0.getAsInteger("width");
                    if(integer2 == null) {
                        v6 = 0;
                    }
                    else {
                        Intrinsics.checkNotNull(integer2);
                        v6 = (int)integer2;
                    }
                    Integer integer3 = contentValues0.getAsInteger("height");
                    if(integer3 == null) {
                        v7 = 0;
                    }
                    else {
                        Intrinsics.checkNotNull(integer3);
                        v7 = (int)integer3;
                    }
                    Long long4 = contentValues0.getAsLong("bucket_id");
                    Intrinsics.checkNotNullExpressionValue(long4, "getAsLong(...)");
                    mediaItem0 = new Video(v, s2, s1, s3, v1, v2, v3, v4, v5, v6, v7, long4.longValue());
                    goto label_61;
                }
                goto label_63;
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable0;
            }
        label_61:
            CloseableKt.closeFinally(cursor0, null);
            return mediaItem0;
        label_63:
            CloseableKt.closeFinally(cursor0, null);
            return null;
        }
        return null;
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @WorkerThread
    @NotNull
    public List parseBucket(@NotNull Cursor cursor0) {
        Intrinsics.checkNotNullParameter(cursor0, "cursor");
        return this.b.parseBucket(cursor0);
    }

    @Override  // com.kakao.kphotopicker.loader.column.ColumnInterface
    @WorkerThread
    @Nullable
    public MediaItem parseMedia(@NotNull Cursor cursor0) {
        Intrinsics.checkNotNullParameter(cursor0, "cursor");
        return this.b.parseMedia(cursor0);
    }
}

