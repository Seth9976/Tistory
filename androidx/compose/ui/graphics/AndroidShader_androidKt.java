package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\u001AL\u0010\u000E\u001A\u00060\nj\u0002`\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001AL\u0010\u0013\u001A\u00060\nj\u0002`\u000B2\u0006\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u00062\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A<\u0010\u0016\u001A\u00060\nj\u0002`\u000B2\u0006\u0010\u000F\u001A\u00020\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A.\u0010\u001D\u001A\u00060\nj\u0002`\u000B2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0019\u001A\u00020\b2\u0006\u0010\u001A\u001A\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001C\u001A\u001D\u0010\u001F\u001A\u00020\u001E2\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u001F\u0010 \u001A%\u0010#\u001A\u00020\"2\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001A\u00020\u001EH\u0001¢\u0006\u0004\b#\u0010$\u001A7\u0010\'\u001A\u0004\u0018\u00010&2\u000E\u0010%\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001A\u00020\u001EH\u0001¢\u0006\u0004\b\'\u0010(*\n\u0010)\"\u00020\n2\u00020\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "from", "to", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualLinearGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualSweepGradientShader", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "tileModeX", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualImageShader", "", "countTransparentColors", "(Ljava/util/List;)I", "numTransparentColors", "", "makeTransparentColors", "(Ljava/util/List;I)[I", "stops", "", "makeTransparentStops", "(Ljava/util/List;Ljava/util/List;I)[F", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n69#2,6:207\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:207,6\n*E\n"})
public final class AndroidShader_androidKt {
    @NotNull
    public static final Shader ActualImageShader-F49vj9s(@NotNull ImageBitmap imageBitmap0, int v, int v1) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap0), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v1));
    }

    @NotNull
    public static final Shader ActualLinearGradientShader-VjE6UOU(long v, long v1, @NotNull List list0, @Nullable List list1, int v2) {
        AndroidShader_androidKt.a(list0, list1);
        return new LinearGradient(Offset.getX-impl(v), Offset.getY-impl(v), Offset.getX-impl(v1), Offset.getY-impl(v1), AndroidShader_androidKt.makeTransparentColors(list0, 0), AndroidShader_androidKt.makeTransparentStops(list1, list0, 0), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v2));
    }

    @NotNull
    public static final Shader ActualRadialGradientShader-8uybcMk(long v, float f, @NotNull List list0, @Nullable List list1, int v1) {
        AndroidShader_androidKt.a(list0, list1);
        return new RadialGradient(Offset.getX-impl(v), Offset.getY-impl(v), f, AndroidShader_androidKt.makeTransparentColors(list0, 0), AndroidShader_androidKt.makeTransparentStops(list1, list0, 0), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v1));
    }

    @NotNull
    public static final Shader ActualSweepGradientShader-9KIMszo(long v, @NotNull List list0, @Nullable List list1) {
        AndroidShader_androidKt.a(list0, list1);
        return new SweepGradient(Offset.getX-impl(v), Offset.getY-impl(v), AndroidShader_androidKt.makeTransparentColors(list0, 0), AndroidShader_androidKt.makeTransparentStops(list1, list0, 0));
    }

    public static final void a(List list0, List list1) {
        if(list1 == null) {
            if(list0.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
            return;
        }
        if(list0.size() != list1.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List list0) [...] // Inlined contents

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List list0, int v) {
        int v1 = list0.size();
        int[] arr_v = new int[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_v[v2] = ColorKt.toArgb-8_81llA(((Color)list0.get(v2)).unbox-impl());
        }
        return arr_v;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List list0, @NotNull List list1, int v) {
        if(v == 0) {
            return list0 == null ? null : CollectionsKt___CollectionsKt.toFloatArray(list0);
        }
        float[] arr_f = new float[list1.size() + v];
        arr_f[0] = list0 == null ? 0.0f : ((Number)list0.get(0)).floatValue();
        int v1 = CollectionsKt__CollectionsKt.getLastIndex(list1);
        int v3 = 1;
        for(int v2 = 1; v2 < v1; ++v2) {
            long v4 = ((Color)list1.get(v2)).unbox-impl();
            float f = list0 == null ? ((float)v2) / ((float)CollectionsKt__CollectionsKt.getLastIndex(list1)) : ((Number)list0.get(v2)).floatValue();
            int v5 = v3 + 1;
            arr_f[v3] = f;
            if(Color.getAlpha-impl(v4) == 0.0f) {
                v3 += 2;
                arr_f[v5] = f;
            }
            else {
                v3 = v5;
            }
        }
        arr_f[v3] = list0 == null ? 1.0f : ((Number)list0.get(CollectionsKt__CollectionsKt.getLastIndex(list1))).floatValue();
        return arr_f;
    }
}

