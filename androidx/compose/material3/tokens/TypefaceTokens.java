package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0013\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001A\u0004\b\u0012\u0010\u000FR\u0017\u0010\u0016\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001A\u0004\b\u0015\u0010\u000F¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/tokens/TypefaceTokens;", "", "Landroidx/compose/ui/text/font/GenericFontFamily;", "a", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBrand", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Brand", "b", "getPlain", "Plain", "Landroidx/compose/ui/text/font/FontWeight;", "c", "Landroidx/compose/ui/text/font/FontWeight;", "getWeightBold", "()Landroidx/compose/ui/text/font/FontWeight;", "WeightBold", "d", "getWeightMedium", "WeightMedium", "e", "getWeightRegular", "WeightRegular", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TypefaceTokens {
    public static final int $stable;
    @NotNull
    public static final TypefaceTokens INSTANCE;
    public static final GenericFontFamily a;
    public static final GenericFontFamily b;
    public static final FontWeight c;
    public static final FontWeight d;
    public static final FontWeight e;

    static {
        TypefaceTokens.INSTANCE = new TypefaceTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        TypefaceTokens.a = FontFamily.Companion.getSansSerif();
        TypefaceTokens.b = FontFamily.Companion.getSansSerif();
        TypefaceTokens.c = FontWeight.Companion.getBold();
        TypefaceTokens.d = FontWeight.Companion.getMedium();
        TypefaceTokens.e = FontWeight.Companion.getNormal();
    }

    @NotNull
    public final GenericFontFamily getBrand() {
        return TypefaceTokens.a;
    }

    @NotNull
    public final GenericFontFamily getPlain() {
        return TypefaceTokens.b;
    }

    @NotNull
    public final FontWeight getWeightBold() {
        return TypefaceTokens.c;
    }

    @NotNull
    public final FontWeight getWeightMedium() {
        return TypefaceTokens.d;
    }

    @NotNull
    public final FontWeight getWeightRegular() {
        return TypefaceTokens.e;
    }
}

