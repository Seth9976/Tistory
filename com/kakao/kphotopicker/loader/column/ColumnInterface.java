package com.kakao.kphotopicker.loader.column;

import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.n;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0014\u001A\u00020\u00042\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\u0006\u0010\u001B\u001A\u00020\u001CH\u0017J\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u001E2\u0006\u0010\u001B\u001A\u00020\u001CH\'R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0018\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0006R\u0012\u0010\u0010\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\tR\u0012\u0010\u0012\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\t¨\u0006\u001F"}, d2 = {"Lcom/kakao/kphotopicker/loader/column/ColumnInterface;", "", "bucketProjection", "", "", "getBucketProjection", "()[Ljava/lang/String;", "bucketSelection", "getBucketSelection", "()Ljava/lang/String;", "contentUri", "Landroid/net/Uri;", "getContentUri", "()Landroid/net/Uri;", "projection", "getProjection", "selection", "getSelection", "sortOrder", "getSortOrder", "getSelectionBy", "bucketId", "", "(Ljava/lang/Long;)Ljava/lang/String;", "parseBucket", "", "Lcom/kakao/kphotopicker/picker/Folder;", "cursor", "Landroid/database/Cursor;", "parseMedia", "Lcom/kakao/kphotopicker/picker/MediaItem;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ColumnInterface {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nColumnInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColumnInterface.kt\ncom/kakao/kphotopicker/loader/column/ColumnInterface$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
    public static final class DefaultImpls {
        @NotNull
        public static String getSelectionBy(@NotNull ColumnInterface columnInterface0, @Nullable Long long0) {
            if(long0 != null && !p.isBlank(columnInterface0.getSelection())) {
                return "bucket_id=" + long0 + " AND (" + columnInterface0.getSelection() + ")";
            }
            if(long0 == null) {
                return p.isBlank(columnInterface0.getSelection()) ? columnInterface0.getSelection() : columnInterface0.getSelection();
            }
            return "bucket_id=" + long0;
        }

        @WorkerThread
        @NotNull
        public static List parseBucket(@NotNull ColumnInterface columnInterface0, @NotNull Cursor cursor0) {
            Intrinsics.checkNotNullParameter(cursor0, "cursor");
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            try {
                int v = cursor0.getColumnIndex("bucket_id");
                int v1 = cursor0.getColumnIndex("bucket_display_name");
                cursor0.moveToFirst();
                do {
                    long v2 = cursor0.getLong(v);
                    String s = cursor0.getString(v1);
                    if(s != null) {
                        Intrinsics.checkNotNull(s);
                        Folder folder0 = (Folder)linkedHashMap0.get(v2);
                        if(folder0 == null) {
                            linkedHashMap0.put(v2, new Folder(v2, s, 1, null, null, 24, null));
                        }
                        else {
                            folder0.setBucketSize(folder0.getBucketSize() + 1);
                        }
                    }
                }
                while(cursor0.moveToNext());
                goto label_21;
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
        label_21:
            CloseableKt.closeFinally(cursor0, null);
            List list0 = CollectionsKt___CollectionsKt.toMutableList(linkedHashMap0.values());
            n.sortWith(list0, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    return p.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE).compare(((Folder)object0).getBucketName(), ((Folder)object1).getBucketName());
                }
            });
            return list0;
        }
    }

    @NotNull
    String[] getBucketProjection();

    @NotNull
    String getBucketSelection();

    @NotNull
    Uri getContentUri();

    @NotNull
    String[] getProjection();

    @NotNull
    String getSelection();

    @NotNull
    String getSelectionBy(@Nullable Long arg1);

    @NotNull
    String getSortOrder();

    @WorkerThread
    @NotNull
    List parseBucket(@NotNull Cursor arg1);

    @WorkerThread
    @Nullable
    MediaItem parseMedia(@NotNull Cursor arg1);
}

