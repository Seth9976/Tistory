package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface.Builder;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class k {
    public static final k a;

    static {
        k.a = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @ExperimentalTextApi
    @Nullable
    public final Typeface a(@NotNull AssetManager assetManager0, @NotNull String s, @Nullable Context context0, @NotNull Settings fontVariation$Settings0) {
        return context0 == null ? null : new Typeface.Builder(assetManager0, s).setFontVariationSettings(k.d(fontVariation$Settings0, context0)).build();
    }

    @DoNotInline
    @ExperimentalTextApi
    @Nullable
    public final Typeface b(@NotNull File file0, @Nullable Context context0, @NotNull Settings fontVariation$Settings0) {
        return context0 == null ? null : new Typeface.Builder(file0).setFontVariationSettings(k.d(fontVariation$Settings0, context0)).build();
    }

    @DoNotInline
    @ExperimentalTextApi
    @Nullable
    public final Typeface c(@NotNull ParcelFileDescriptor parcelFileDescriptor0, @Nullable Context context0, @NotNull Settings fontVariation$Settings0) {
        return context0 == null ? null : new Typeface.Builder(parcelFileDescriptor0.getFileDescriptor()).setFontVariationSettings(k.d(fontVariation$Settings0, context0)).build();
    }

    public static FontVariationAxis[] d(Settings fontVariation$Settings0, Context context0) {
        Density density0;
        if(context0 != null) {
            density0 = AndroidDensity_androidKt.Density(context0);
        }
        else if(!fontVariation$Settings0.getNeedsDensity$ui_text_release()) {
            density0 = DensityKt.Density(1.0f, 1.0f);
        }
        else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List list0 = fontVariation$Settings0.getSettings();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Setting fontVariation$Setting0 = (Setting)list0.get(v1);
            arrayList0.add(new FontVariationAxis(fontVariation$Setting0.getAxisName(), fontVariation$Setting0.toVariationValue(density0)));
        }
        return (FontVariationAxis[])arrayList0.toArray(new FontVariationAxis[0]);
    }
}

