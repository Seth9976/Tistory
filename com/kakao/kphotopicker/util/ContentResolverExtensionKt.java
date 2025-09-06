package com.kakao.kphotopicker.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A#\u0010\u0006\u001A\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/ContentResolver;", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Lcom/kakao/kphotopicker/picker/MediaItem;", "getKeMediaItem", "(Landroid/content/ContentResolver;Landroid/content/Context;Landroid/net/Uri;)Lcom/kakao/kphotopicker/picker/MediaItem;", "kphotopicker_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContentResolverExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentResolverExtension.kt\ncom/kakao/kphotopicker/util/ContentResolverExtensionKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,154:1\n37#2,2:155\n37#2,2:157\n*S KotlinDebug\n*F\n+ 1 ContentResolverExtension.kt\ncom/kakao/kphotopicker/util/ContentResolverExtensionKt\n*L\n20#1:155,2\n40#1:157,2\n*E\n"})
public final class ContentResolverExtensionKt {
    public static final MediaItem a(String s, String s1) {
        if(s1 != null && s1.length() != 0) {
            if(Intrinsics.areEqual(s, "video")) {
                return new Video(0L, "", s1, "", 0L, 0L, 0, 0, 0L, 0x500, 720, 0L);
            }
            if(Intrinsics.areEqual(s, "image")) {
                return new Photo(0L, s1, "", null, "", 0L, 0L, 0, 0L, 0, 0, 0L);
            }
        }
        return null;
    }

    @Nullable
    public static final MediaItem getKeMediaItem(@NotNull ContentResolver contentResolver0, @NotNull Context context0, @NotNull Uri uri0) {
        Photo mediaItem$Photo0;
        Video mediaItem$Video0;
        Long long4;
        int v7;
        int v6;
        int v5;
        int v4;
        long v3;
        long v2;
        long v1;
        String s6;
        String s4;
        Long long0;
        String s3;
        Uri uri2;
        Intrinsics.checkNotNullParameter(contentResolver0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(uri0, "uri");
        String s = contentResolver0.getType(uri0);
        int v = 0;
        String s1 = ((String[])StringsKt__StringsKt.split$default((s == null ? "" : s), new String[]{"/"}, false, 0, 6, null).toArray(new String[0]))[0];
        if(p.isBlank(s1)) {
            return null;
        }
        if(DocumentsContract.isDocumentUri(context0, uri0)) {
            String s2 = DocumentsContract.getDocumentId(uri0);
            Intrinsics.checkNotNull(s2);
            if(p.startsWith$default(s2, "raw:", false, 2, null)) {
                return ContentResolverExtensionKt.a(s1, p.replaceFirst$default(s2, "raw:", "", false, 4, null));
            }
            String[] arr_s = (String[])new Regex(":").split(s2, 0).toArray(new String[0]);
            Uri uri1 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            if(Intrinsics.areEqual(s1, "image")) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            }
            else {
                Intrinsics.areEqual(s1, "video");
                uri2 = uri1;
            }
            Cursor cursor0 = contentResolver0.query(uri2, new String[]{"_id", "_data", "mime_type", "date_modified", "datetaken", "_size", "width", "height", "bucket_id"}, "_id=?", new String[]{arr_s[1]}, null);
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToFirst()) {
                        ContentValues contentValues0 = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
                        s3 = contentValues0.getAsString("_data");
                        if(s3 == null) {
                            goto label_99;
                        }
                        Intrinsics.checkNotNull(s3);
                        long0 = contentValues0.getAsLong("_id");
                        s4 = Uri.withAppendedPath(uri1, String.valueOf(long0)).toString();
                        Intrinsics.checkNotNullExpressionValue(s4, "toString(...)");
                        String s5 = contentValues0.getAsString("mime_type");
                        if(s5 == null) {
                            s6 = "";
                        }
                        else {
                            Intrinsics.checkNotNull(s5);
                            s6 = s5;
                        }
                        Long long1 = contentValues0.getAsLong("date_modified");
                        v1 = 0L;
                        if(long1 == null) {
                            v2 = 0L;
                        }
                        else {
                            Intrinsics.checkNotNull(long1);
                            v2 = (long)long1;
                        }
                        Long long2 = contentValues0.getAsLong("datetaken");
                        if(long2 == null) {
                            v3 = 0L;
                        }
                        else {
                            Intrinsics.checkNotNull(long2);
                            v3 = (long)long2;
                        }
                        Integer integer0 = contentValues0.getAsInteger("orientation");
                        if(integer0 == null) {
                            v4 = 0;
                        }
                        else {
                            Intrinsics.checkNotNull(integer0);
                            v4 = (int)integer0;
                        }
                        Integer integer1 = contentValues0.getAsInteger("duration");
                        if(integer1 == null) {
                            v5 = 0;
                        }
                        else {
                            Intrinsics.checkNotNull(integer1);
                            v5 = (int)integer1;
                        }
                        Long long3 = contentValues0.getAsLong("_size");
                        if(long3 != null) {
                            Intrinsics.checkNotNull(long3);
                            v1 = (long)long3;
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
                        if(integer3 != null) {
                            Intrinsics.checkNotNull(integer3);
                            v = (int)integer3;
                        }
                        v7 = v;
                        long4 = contentValues0.getAsLong("bucket_id");
                        if(Intrinsics.areEqual(s1, "video")) {
                            Intrinsics.checkNotNull(long0);
                            long v8 = (long)long0;
                            if(v6 <= 0) {
                                v6 = 0x500;
                            }
                            if(v7 <= 0) {
                                v7 = 720;
                            }
                            Intrinsics.checkNotNull(long4);
                            mediaItem$Video0 = new Video(v8, s3, s4, s6, v2, v3, v4, v5, v1, v6, v7, ((long)long4));
                            goto label_87;
                        }
                        goto label_89;
                    }
                    goto label_101;
                }
                catch(Throwable throwable0) {
                    CloseableKt.closeFinally(cursor0, throwable0);
                    throw throwable0;
                }
            label_87:
                CloseableKt.closeFinally(cursor0, null);
                return mediaItem$Video0;
                try {
                label_89:
                    if(Intrinsics.areEqual(s1, "image")) {
                        Intrinsics.checkNotNull(long0);
                        Intrinsics.checkNotNull(long4);
                        mediaItem$Photo0 = new Photo(((long)long0), s3, s4, null, s6, v2, v3, v4, v1, v6, v7, ((long)long4));
                        goto label_97;
                    }
                    goto label_101;
                }
                catch(Throwable throwable0) {
                    CloseableKt.closeFinally(cursor0, throwable0);
                    throw throwable0;
                }
            label_97:
                CloseableKt.closeFinally(cursor0, null);
                return mediaItem$Photo0;
            label_99:
                CloseableKt.closeFinally(cursor0, null);
                return null;
            label_101:
                CloseableKt.closeFinally(cursor0, null);
                return null;
            }
            return null;
        }
        return ContentResolverExtensionKt.a(s1, RealPathUtil.INSTANCE.getPath(context0, uri0));
    }
}

