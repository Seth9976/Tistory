package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Stable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A@\u0010\r\u001A\u00020\n2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A8\u0010\r\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A8\u0010\r\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"", "path", "Landroid/content/res/AssetManager;", "assetManager", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/Font;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Font", "Ljava/io/File;", "file", "Font-Ej4NQ78", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "AndroidFontKt")
public final class AndroidFontKt {
    @RequiresApi(26)
    @Stable
    @NotNull
    public static final Font Font-Ej4NQ78(@NotNull ParcelFileDescriptor parcelFileDescriptor0, @NotNull FontWeight fontWeight0, int v, @NotNull Settings fontVariation$Settings0) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor0, fontWeight0, v, fontVariation$Settings0, null);
    }

    @Stable
    @NotNull
    public static final Font Font-Ej4NQ78(@NotNull File file0, @NotNull FontWeight fontWeight0, int v, @NotNull Settings fontVariation$Settings0) {
        return new AndroidFileFont(file0, fontWeight0, v, fontVariation$Settings0, null);
    }

    public static Font Font-Ej4NQ78$default(ParcelFileDescriptor parcelFileDescriptor0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            fontVariation$Settings0 = FontVariation.INSTANCE.Settings-6EWAqTQ(fontWeight0, v, new Setting[0]);
        }
        return AndroidFontKt.Font-Ej4NQ78(parcelFileDescriptor0, fontWeight0, v, fontVariation$Settings0);
    }

    public static Font Font-Ej4NQ78$default(File file0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            fontVariation$Settings0 = FontVariation.INSTANCE.Settings-6EWAqTQ(fontWeight0, v, new Setting[0]);
        }
        return AndroidFontKt.Font-Ej4NQ78(file0, fontWeight0, v, fontVariation$Settings0);
    }

    @Stable
    @NotNull
    public static final Font Font-MuC2MFs(@NotNull String s, @NotNull AssetManager assetManager0, @NotNull FontWeight fontWeight0, int v, @NotNull Settings fontVariation$Settings0) {
        return new AndroidAssetFont(assetManager0, s, fontWeight0, v, fontVariation$Settings0, null);
    }

    public static Font Font-MuC2MFs$default(String s, AssetManager assetManager0, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        if((v1 & 16) != 0) {
            fontVariation$Settings0 = FontVariation.INSTANCE.Settings-6EWAqTQ(fontWeight0, v, new Setting[0]);
        }
        return AndroidFontKt.Font-MuC2MFs(s, assetManager0, fontWeight0, v, fontVariation$Settings0);
    }
}

