package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.kakao.keditor.media.MediaSupportKt;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridCellItem;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A \u0010\u0000\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005\u001A\u0014\u0010\u0006\u001A\u00020\u0007*\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"imageSize", "Lkotlin/Pair;", "", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "pathToItem", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "activity", "Landroid/app/Activity;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ImageGridPluginSpecKt {
    @Nullable
    public static final Pair imageSize(@NotNull Context context0, @NotNull Uri uri0) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(uri0, "uri");
        String s = uri0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        if(p.startsWith$default(s, "content", false, 2, null)) {
            ParcelFileDescriptor parcelFileDescriptor0 = context0.getContentResolver().openFileDescriptor(uri0, "r");
            if(parcelFileDescriptor0 != null) {
                try {
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(parcelFileDescriptor0.getFileDescriptor(), null, bitmapFactory$Options0);
                    pair0 = MediaSupportKt.byOrientation(bitmapFactory$Options0, new ExifInterface(parcelFileDescriptor0.getFileDescriptor()));
                }
                catch(Throwable throwable0) {
                    CloseableKt.closeFinally(parcelFileDescriptor0, throwable0);
                    throw throwable0;
                }
                CloseableKt.closeFinally(parcelFileDescriptor0, null);
                return pair0;
            }
            return null;
        }
        BitmapFactory.Options bitmapFactory$Options1 = new BitmapFactory.Options();
        bitmapFactory$Options1.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri0.toString(), bitmapFactory$Options1);
        return MediaSupportKt.byOrientation(bitmapFactory$Options1, new ExifInterface(uri0.toString()));
    }

    @NotNull
    public static final ImageGridCellItem pathToItem(@NotNull Uri uri0, @Nullable Activity activity0) {
        Intrinsics.checkNotNullParameter(uri0, "<this>");
        ImageGridCellItem imageGridCellItem0 = new ImageGridCellItem(null, 0, 0, 0.0, null, null, null, false, false, 0x1FF, null);
        String s = uri0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        imageGridCellItem0.setSrc(s);
        if(activity0 != null) {
            Pair pair0 = ImageGridPluginSpecKt.imageSize(activity0, uri0);
            if(pair0 != null) {
                imageGridCellItem0.setOriginWidth(((Number)pair0.getFirst()).intValue());
                imageGridCellItem0.setOriginHeight(((Number)pair0.getSecond()).intValue());
            }
        }
        imageGridCellItem0.setLocation(Location.LOCAL);
        return imageGridCellItem0;
    }
}

