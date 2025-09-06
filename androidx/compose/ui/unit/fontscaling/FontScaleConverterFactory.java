package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tR.\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00070\n8\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b\u000B\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;", "", "", "fontScale", "", "isNonLinearFontScalingActive", "(F)Z", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "forScale", "(F)Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "Landroidx/collection/SparseArrayCompat;", "b", "Landroidx/collection/SparseArrayCompat;", "getSLookupTables", "()Landroidx/collection/SparseArrayCompat;", "setSLookupTables", "(Landroidx/collection/SparseArrayCompat;)V", "getSLookupTables$annotations", "()V", "sLookupTables", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontScaleConverterFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,235:1\n54#2,7:236\n*S KotlinDebug\n*F\n+ 1 FontScaleConverterFactory.android.kt\nandroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory\n*L\n99#1:236,7\n*E\n"})
public final class FontScaleConverterFactory {
    public static final int $stable;
    @NotNull
    public static final FontScaleConverterFactory INSTANCE;
    public static final float[] a;
    public static volatile SparseArrayCompat b;
    public static final Object[] c;

    static {
        FontScaleConverterFactory.INSTANCE = new FontScaleConverterFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
        FontScaleConverterFactory.a = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        FontScaleConverterFactory.b = new SparseArrayCompat(0, 1, null);
        Object[] arr_object = new Object[0];
        FontScaleConverterFactory.c = arr_object;
        synchronized(arr_object) {
            FontScaleConverterFactory.b(FontScaleConverterFactory.b, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.799999f, 21.799999f, 25.200001f, 30.0f, 100.0f}));
            FontScaleConverterFactory.b(FontScaleConverterFactory.b, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.799999f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            FontScaleConverterFactory.b(FontScaleConverterFactory.b, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            FontScaleConverterFactory.b(FontScaleConverterFactory.b, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.799999f, 32.799999f, 34.799999f, 100.0f}));
            FontScaleConverterFactory.b(FontScaleConverterFactory.b, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if(((float)FontScaleConverterFactory.b.keyAt(0)) / 100.0f - 0.01f <= 1.03f) {
            InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        FontScaleConverterFactory.$stable = 8;
    }

    public static void a(float f, FontScaleConverterTable fontScaleConverterTable0) {
        synchronized(FontScaleConverterFactory.c) {
            SparseArrayCompat sparseArrayCompat0 = FontScaleConverterFactory.b.clone();
            FontScaleConverterFactory.INSTANCE.getClass();
            FontScaleConverterFactory.b(sparseArrayCompat0, f, fontScaleConverterTable0);
            FontScaleConverterFactory.b = sparseArrayCompat0;
        }
    }

    public static void b(SparseArrayCompat sparseArrayCompat0, float f, FontScaleConverterTable fontScaleConverterTable0) {
        sparseArrayCompat0.put(((int)(f * 100.0f)), fontScaleConverterTable0);
    }

    @AnyThread
    @Nullable
    public final FontScaleConverter forScale(float f) {
        FontScaleConverter fontScaleConverter2;
        FontScaleConverter fontScaleConverter1;
        if(!this.isNonLinearFontScalingActive(f)) {
            return null;
        }
        FontScaleConverterFactory.INSTANCE.getClass();
        FontScaleConverter fontScaleConverter0 = (FontScaleConverter)FontScaleConverterFactory.b.get(((int)(f * 100.0f)));
        if(fontScaleConverter0 != null) {
            return fontScaleConverter0;
        }
        int v1 = FontScaleConverterFactory.b.indexOfKey(((int)(f * 100.0f)));
        if(v1 >= 0) {
            return (FontScaleConverter)FontScaleConverterFactory.b.valueAt(v1);
        }
        int v2 = -(v1 + 1) - 1;
        float f1 = 1.0f;
        if(-(v1 + 1) >= FontScaleConverterFactory.b.size()) {
            fontScaleConverter1 = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f});
            FontScaleConverterFactory.a(f, ((FontScaleConverterTable)fontScaleConverter1));
            return fontScaleConverter1;
        }
        float[] arr_f = FontScaleConverterFactory.a;
        if(v2 < 0) {
            fontScaleConverter2 = new FontScaleConverterTable(arr_f, arr_f);
        }
        else {
            f1 = ((float)FontScaleConverterFactory.b.keyAt(v2)) / 100.0f;
            fontScaleConverter2 = (FontScaleConverter)FontScaleConverterFactory.b.valueAt(v2);
        }
        float f2 = ((float)FontScaleConverterFactory.b.keyAt(-(v1 + 1))) / 100.0f;
        float f3 = MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, f1, f2, f);
        FontScaleConverter fontScaleConverter3 = (FontScaleConverter)FontScaleConverterFactory.b.valueAt(-(v1 + 1));
        float[] arr_f1 = new float[9];
        for(int v = 0; v < 9; ++v) {
            float f4 = arr_f[v];
            float f5 = fontScaleConverter2.convertSpToDp(f4);
            float f6 = fontScaleConverter3.convertSpToDp(f4);
            arr_f1[v] = MathUtils.INSTANCE.lerp(f5, f6, f3);
        }
        fontScaleConverter1 = new FontScaleConverterTable(arr_f, arr_f1);
        FontScaleConverterFactory.a(f, ((FontScaleConverterTable)fontScaleConverter1));
        return fontScaleConverter1;
    }

    @NotNull
    public final SparseArrayCompat getSLookupTables() {
        return FontScaleConverterFactory.b;
    }

    @VisibleForTesting
    public static void getSLookupTables$annotations() {
    }

    @AnyThread
    public final boolean isNonLinearFontScalingActive(float f) {
        return f >= 1.03f;
    }

    public final void setSLookupTables(@NotNull SparseArrayCompat sparseArrayCompat0) {
        FontScaleConverterFactory.b = sparseArrayCompat0;
    }
}

