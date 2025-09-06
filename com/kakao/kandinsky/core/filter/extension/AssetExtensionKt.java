package com.kakao.kandinsky.core.filter.extension;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\u001A\u0016\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0000\u001A\u0014\u0010\u0005\u001A\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"loadBitmapFromAsset", "Landroid/graphics/Bitmap;", "Landroid/content/res/AssetManager;", "fileName", "", "readTextFileFromAssets", "filter_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class AssetExtensionKt {
    @Nullable
    public static final Bitmap loadBitmapFromAsset(@NotNull AssetManager assetManager0, @NotNull String s) {
        Bitmap bitmap0;
        Intrinsics.checkNotNullParameter(assetManager0, "<this>");
        Intrinsics.checkNotNullParameter(s, "fileName");
        try {
            InputStream inputStream0 = assetManager0.open(s);
            try {
                bitmap0 = BitmapFactory.decodeStream(inputStream0);
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(inputStream0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(inputStream0, null);
            return bitmap0;
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return null;
        }
    }

    @NotNull
    public static final String readTextFileFromAssets(@NotNull AssetManager assetManager0, @NotNull String s) {
        byte[] arr_b;
        Intrinsics.checkNotNullParameter(assetManager0, "<this>");
        Intrinsics.checkNotNullParameter(s, "fileName");
        try {
            InputStream inputStream0 = assetManager0.open(s);
            try {
                arr_b = new byte[inputStream0.available()];
                inputStream0.read(arr_b);
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(inputStream0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(inputStream0, null);
            return new String(arr_b, Charsets.UTF_8);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return "";
        }
    }
}

