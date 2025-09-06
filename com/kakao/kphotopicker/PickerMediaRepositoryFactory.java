package com.kakao.kphotopicker;

import android.content.ContentResolver;
import android.content.Context;
import com.kakao.kphotopicker.loader.GalleryType;
import com.kakao.kphotopicker.loader.MediaRepository;
import com.kakao.kphotopicker.loader.column.AllMediaColumnImpl;
import com.kakao.kphotopicker.loader.column.ImageColumnImpl;
import com.kakao.kphotopicker.loader.column.VideoColumnImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J-\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/kphotopicker/PickerMediaRepositoryFactory;", "", "Landroid/content/Context;", "context", "Lcom/kakao/kphotopicker/loader/GalleryType;", "type", "", "", "excludeMimeTypes", "Lcom/kakao/kphotopicker/loader/MediaRepository;", "create", "(Landroid/content/Context;Lcom/kakao/kphotopicker/loader/GalleryType;Ljava/util/List;)Lcom/kakao/kphotopicker/loader/MediaRepository;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PickerMediaRepositoryFactory {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[GalleryType.values().length];
            try {
                arr_v[GalleryType.AllMedia.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[GalleryType.VideoOnly.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[GalleryType.ImageOnly.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final PickerMediaRepositoryFactory INSTANCE;

    static {
        PickerMediaRepositoryFactory.INSTANCE = new PickerMediaRepositoryFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final MediaRepository create(@NotNull Context context0, @NotNull GalleryType galleryType0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(galleryType0, "type");
        Intrinsics.checkNotNullParameter(list0, "excludeMimeTypes");
        switch(WhenMappings.$EnumSwitchMapping$0[galleryType0.ordinal()]) {
            case 1: {
                ContentResolver contentResolver0 = context0.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver0, "getContentResolver(...)");
                return new MediaRepository(contentResolver0, AllMediaColumnImpl.INSTANCE, list0);
            }
            case 2: {
                ContentResolver contentResolver1 = context0.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver1, "getContentResolver(...)");
                return new MediaRepository(contentResolver1, VideoColumnImpl.INSTANCE, list0);
            }
            case 3: {
                ContentResolver contentResolver2 = context0.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
                return new MediaRepository(contentResolver2, ImageColumnImpl.INSTANCE, list0);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static MediaRepository create$default(PickerMediaRepositoryFactory pickerMediaRepositoryFactory0, Context context0, GalleryType galleryType0, List list0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        return pickerMediaRepositoryFactory0.create(context0, galleryType0, list0);
    }
}

