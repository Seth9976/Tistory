package com.kakao.kphotopicker.loader;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.signature.ObjectKey;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import com.kakao.kphotopicker.picker.item.PhotoGalleryImageView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000F\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J-\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0017\u001A\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lcom/kakao/kphotopicker/loader/BitmapLoader;", "", "<init>", "()V", "Lcom/kakao/kphotopicker/picker/item/PhotoGalleryImageView;", "imageView", "Lcom/kakao/kphotopicker/picker/MediaItem;", "mediaItem", "", "loadGridImage", "(Lcom/kakao/kphotopicker/picker/item/PhotoGalleryImageView;Lcom/kakao/kphotopicker/picker/MediaItem;)V", "", "url", "", "dateModified", "loadImage", "(Lcom/kakao/kphotopicker/picker/item/PhotoGalleryImageView;Ljava/lang/String;J)V", "Landroid/widget/ImageView;", "", "viewWidth", "viewHeight", "loadPreviewImage", "(Landroid/widget/ImageView;Lcom/kakao/kphotopicker/picker/MediaItem;II)V", "THUMBNAIL_IMAGE_SIZE", "I", "getTHUMBNAIL_IMAGE_SIZE", "()I", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BitmapLoader {
    public static String a(MediaItem mediaItem0) {
        if(mediaItem0 instanceof Photo) {
            String s = ((Photo)mediaItem0).getEditedPath();
            return s == null ? ((Photo)mediaItem0).getUri() : s;
        }
        if(!(mediaItem0 instanceof Video)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((Video)mediaItem0).getUri();
    }

    public final int getTHUMBNAIL_IMAGE_SIZE() {
        return 300;
    }

    public final void loadGridImage(@NotNull PhotoGalleryImageView photoGalleryImageView0, @NotNull MediaItem mediaItem0) {
        Intrinsics.checkNotNullParameter(photoGalleryImageView0, "imageView");
        Intrinsics.checkNotNullParameter(mediaItem0, "mediaItem");
        ((RequestBuilder)((RequestBuilder)Glide.with(photoGalleryImageView0.getContext()).asBitmap().load(BitmapLoader.a(mediaItem0)).signature(new ObjectKey(mediaItem0.getDateModified()))).override(300, 300)).into(photoGalleryImageView0);
    }

    public final void loadImage(@NotNull PhotoGalleryImageView photoGalleryImageView0, @NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(photoGalleryImageView0, "imageView");
        Intrinsics.checkNotNullParameter(s, "url");
        ((RequestBuilder)((RequestBuilder)Glide.with(photoGalleryImageView0.getContext()).asBitmap().load(s).signature(new ObjectKey(v))).override(300, 300)).into(photoGalleryImageView0);
    }

    public final void loadPreviewImage(@NotNull ImageView imageView0, @NotNull MediaItem mediaItem0, int v, int v1) {
        Intrinsics.checkNotNullParameter(imageView0, "imageView");
        Intrinsics.checkNotNullParameter(mediaItem0, "mediaItem");
        ((RequestBuilder)((RequestBuilder)Glide.with(imageView0.getContext()).load(BitmapLoader.a(mediaItem0)).signature(new ObjectKey(mediaItem0.getDateModified()))).override(v, v1)).into(imageView0);
    }
}

