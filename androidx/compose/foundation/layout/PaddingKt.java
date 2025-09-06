package androidx.compose.foundation.layout;

import aa.e0;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001A\u001A\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001A&\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001A:\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\n\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\u00032\b\b\u0002\u0010\f\u001A\u00020\u00032\b\b\u0002\u0010\r\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A>\u0010\u0010\u001A\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\u00032\b\b\u0002\u0010\u0013\u001A\u00020\u00032\b\b\u0002\u0010\r\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A\u0019\u0010\u0016\u001A\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001A\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001A\u0019\u0010\u001A\u001A\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001A\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001A\u0014\u0010\u001B\u001A\u00020\u0011*\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0001H\u0007\u001A\u001E\u0010\u001B\u001A\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001E\u001A*\u0010\u001B\u001A\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001F\u0010 \u001A>\u0010\u001B\u001A\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\u00032\b\b\u0002\u0010\f\u001A\u00020\u00032\b\b\u0002\u0010\r\u001A\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n148#2:485\n148#2:486\n148#2:487\n148#2:488\n148#2:489\n148#2:490\n148#2:491\n148#2:492\n148#2:493\n148#2:494\n148#2:495\n148#2:496\n148#2:497\n148#2:498\n148#2:499\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n51#1:485\n52#1:486\n53#1:487\n54#1:488\n84#1:489\n85#1:490\n157#1:491\n158#1:492\n159#1:493\n160#1:494\n284#1:495\n294#1:496\n295#1:497\n296#1:498\n297#1:499\n*E\n"})
public final class PaddingKt {
    @Stable
    @NotNull
    public static final PaddingValues PaddingValues-0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    @Stable
    @NotNull
    public static final PaddingValues PaddingValues-YgX7TsA(float f, float f1) {
        return new PaddingValuesImpl(f, f1, f, f1, null);
    }

    public static PaddingValues PaddingValues-YgX7TsA$default(float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return PaddingKt.PaddingValues-YgX7TsA(f, f1);
    }

    @Stable
    @NotNull
    public static final PaddingValues PaddingValues-a9UjIt4(float f, float f1, float f2, float f3) {
        return new PaddingValuesImpl(f, f1, f2, f3, null);
    }

    public static PaddingValues PaddingValues-a9UjIt4$default(float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return PaddingKt.PaddingValues-a9UjIt4(f, f1, f2, f3);
    }

    @Stable
    @NotNull
    public static final Modifier absolutePadding-qDBjuR0(@NotNull Modifier modifier0, float f, float f1, float f2, float f3) {
        return modifier0.then(new PaddingElement(f, f1, f2, f3, false, new l3(f, f1, f2, f3, 0)));
    }

    public static Modifier absolutePadding-qDBjuR0$default(Modifier modifier0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return PaddingKt.absolutePadding-qDBjuR0(modifier0, f, f1, f2, f3);
    }

    @Stable
    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues0, @NotNull LayoutDirection layoutDirection0) {
        return layoutDirection0 == LayoutDirection.Ltr ? paddingValues0.calculateRightPadding-u2uoSUM(layoutDirection0) : paddingValues0.calculateLeftPadding-u2uoSUM(layoutDirection0);
    }

    @Stable
    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues0, @NotNull LayoutDirection layoutDirection0) {
        return layoutDirection0 == LayoutDirection.Ltr ? paddingValues0.calculateLeftPadding-u2uoSUM(layoutDirection0) : paddingValues0.calculateRightPadding-u2uoSUM(layoutDirection0);
    }

    @Stable
    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier0, @NotNull PaddingValues paddingValues0) {
        return modifier0.then(new PaddingValuesElement(paddingValues0, new k4(paddingValues0, 2)));
    }

    @Stable
    @NotNull
    public static final Modifier padding-3ABfNKs(@NotNull Modifier modifier0, float f) {
        return modifier0.then(new PaddingElement(f, f, f, f, true, new e0(f, 1)));
    }

    @Stable
    @NotNull
    public static final Modifier padding-VpY3zN4(@NotNull Modifier modifier0, float f, float f1) {
        return modifier0.then(new PaddingElement(f, f1, f, f1, true, new f3(f, f1, 2)));
    }

    public static Modifier padding-VpY3zN4$default(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return PaddingKt.padding-VpY3zN4(modifier0, f, f1);
    }

    @Stable
    @NotNull
    public static final Modifier padding-qDBjuR0(@NotNull Modifier modifier0, float f, float f1, float f2, float f3) {
        return modifier0.then(new PaddingElement(f, f1, f2, f3, true, new l3(f, f1, f2, f3, 1)));
    }

    public static Modifier padding-qDBjuR0$default(Modifier modifier0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return PaddingKt.padding-qDBjuR0(modifier0, f, f1, f2, f3);
    }
}

