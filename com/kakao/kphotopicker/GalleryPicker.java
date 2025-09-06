package com.kakao.kphotopicker;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import jb.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0019\b\u0002\u0010\u000E\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000B¢\u0006\u0002\b\r¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0013\u001A\u00020\t2\u0019\b\u0002\u0010\u000E\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000B¢\u0006\u0002\b\r¢\u0006\u0004\b\u0010\u0010\u0014J\u001F\u0010\u0018\u001A\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u000F¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001A\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001C\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001C\u0010\u001BR\u0014\u0010\u001E\u001A\u00020\u001D8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001E\u0010\u001FR$\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010\u0006¨\u0006%"}, d2 = {"Lcom/kakao/kphotopicker/GalleryPicker;", "", "Lcom/kakao/kphotopicker/PhotoEditor;", "photoEditor", "", "initialize", "(Lcom/kakao/kphotopicker/PhotoEditor;)V", "Landroid/content/Context;", "context", "", "maxCount", "Lkotlin/Function1;", "Lcom/kakao/kphotopicker/PhotoPickerConfig;", "Lkotlin/ExtensionFunctionType;", "configBuilder", "Landroid/content/Intent;", "newIntent", "(Landroid/content/Context;ILkotlin/jvm/functions/Function1;)Landroid/content/Intent;", "remainCount", "totalCount", "(Landroid/content/Context;IILkotlin/jvm/functions/Function1;)Landroid/content/Intent;", "data", "", "Lcom/kakao/kphotopicker/picker/MediaItem;", "getMediaList", "(Landroid/content/Intent;)Ljava/util/List;", "REQUEST_CODE", "I", "REQUEST_CODE_SINGLE_PICK", "", "UNLIMITED_FILE_SIZE", "J", "a", "Lcom/kakao/kphotopicker/PhotoEditor;", "getPhotoEditor$kphotopicker_release", "()Lcom/kakao/kphotopicker/PhotoEditor;", "setPhotoEditor$kphotopicker_release", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GalleryPicker {
    @NotNull
    public static final GalleryPicker INSTANCE = null;
    public static final int REQUEST_CODE = 0x457;
    public static final int REQUEST_CODE_SINGLE_PICK = 0x45B;
    public static final long UNLIMITED_FILE_SIZE = -1L;
    public static PhotoEditor a;

    static {
        GalleryPicker.INSTANCE = new GalleryPicker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Nullable
    public final List getMediaList(@Nullable Intent intent0) {
        return intent0 != null ? intent0.getParcelableArrayListExtra("RESULT_MEDIA_LIST") : null;
    }

    @Nullable
    public final PhotoEditor getPhotoEditor$kphotopicker_release() {
        return GalleryPicker.a;
    }

    public final void initialize(@Nullable PhotoEditor photoEditor0) {
        GalleryPicker.a = photoEditor0;
    }

    public static void initialize$default(GalleryPicker galleryPicker0, PhotoEditor photoEditor0, int v, Object object0) {
        if((v & 1) != 0) {
            photoEditor0 = null;
        }
        galleryPicker0.initialize(photoEditor0);
    }

    @NotNull
    public final Intent newIntent(@NotNull Context context0, int v, int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function10, "configBuilder");
        PhotoPickerConfig photoPickerConfig0 = PhotoPickerConfig.Companion.create(v, v1);
        function10.invoke(photoPickerConfig0);
        return photoPickerConfig0.buildIntent(context0);
    }

    @NotNull
    public final Intent newIntent(@NotNull Context context0, int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function10, "configBuilder");
        PhotoPickerConfig photoPickerConfig0 = PhotoPickerConfig.Companion.create(v);
        function10.invoke(photoPickerConfig0);
        return photoPickerConfig0.buildIntent(context0);
    }

    public static Intent newIntent$default(GalleryPicker galleryPicker0, Context context0, int v, int v1, Function1 function10, int v2, Object object0) {
        if((v2 & 8) != 0) {
            function10 = a.y;
        }
        return galleryPicker0.newIntent(context0, v, v1, function10);
    }

    public static Intent newIntent$default(GalleryPicker galleryPicker0, Context context0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 4) != 0) {
            function10 = a.x;
        }
        return galleryPicker0.newIntent(context0, v, function10);
    }

    public final void setPhotoEditor$kphotopicker_release(@Nullable PhotoEditor photoEditor0) {
        GalleryPicker.a = photoEditor0;
    }
}

