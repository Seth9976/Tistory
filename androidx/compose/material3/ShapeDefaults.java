package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.tokens.ShapeTokens;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u0017\u0010\u0013\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/ShapeDefaults;", "", "Landroidx/compose/foundation/shape/CornerBasedShape;", "a", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "ExtraSmall", "b", "getSmall", "Small", "c", "getMedium", "Medium", "d", "getLarge", "Large", "e", "getExtraLarge", "ExtraLarge", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ShapeDefaults {
    public static final int $stable;
    @NotNull
    public static final ShapeDefaults INSTANCE;
    public static final RoundedCornerShape a;
    public static final RoundedCornerShape b;
    public static final RoundedCornerShape c;
    public static final RoundedCornerShape d;
    public static final RoundedCornerShape e;

    static {
        ShapeDefaults.INSTANCE = new ShapeDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        ShapeDefaults.a = ShapeTokens.INSTANCE.getCornerExtraSmall();
        ShapeDefaults.b = ShapeTokens.INSTANCE.getCornerSmall();
        ShapeDefaults.c = ShapeTokens.INSTANCE.getCornerMedium();
        ShapeDefaults.d = ShapeTokens.INSTANCE.getCornerLarge();
        ShapeDefaults.e = ShapeTokens.INSTANCE.getCornerExtraLarge();
    }

    @NotNull
    public final CornerBasedShape getExtraLarge() {
        return ShapeDefaults.e;
    }

    @NotNull
    public final CornerBasedShape getExtraSmall() {
        return ShapeDefaults.a;
    }

    @NotNull
    public final CornerBasedShape getLarge() {
        return ShapeDefaults.d;
    }

    @NotNull
    public final CornerBasedShape getMedium() {
        return ShapeDefaults.c;
    }

    @NotNull
    public final CornerBasedShape getSmall() {
        return ShapeDefaults.b;
    }
}

