package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.e3;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001J&\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "elevation", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,413:1\n154#2:414\n154#2:415\n154#2:416\n154#2:417\n154#2:418\n154#2:419\n154#2:420\n154#2:421\n83#3,3:422\n1116#4,6:425\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n*L\n219#1:414\n220#1:415\n224#1:416\n225#1:417\n243#1:418\n244#1:419\n245#1:420\n246#1:421\n248#1:422,3\n248#1:425,6\n*E\n"})
public final class FloatingActionButtonDefaults {
    public static final int $stable;
    @NotNull
    public static final FloatingActionButtonDefaults INSTANCE;

    static {
        FloatingActionButtonDefaults.INSTANCE = new FloatingActionButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    public final FloatingActionButtonElevation elevation-ixp7dh8(float f, float f1, Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xD902B9A4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD902B9A4, v, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:220)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation0 = this.elevation-xZ9-QkE(((v1 & 1) == 0 ? f : 6.0f), ((v1 & 2) == 0 ? f1 : 12.0f), 8.0f, 8.0f, composer0, v & 14 | 0xD80 | v & 0x70 | v << 6 & 0xE000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return floatingActionButtonElevation0;
    }

    @Composable
    @NotNull
    public final FloatingActionButtonElevation elevation-xZ9-QkE(float f, float f1, float f2, float f3, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(380403812);
        if((v1 & 1) != 0) {
            f = 6.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 12.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 8.0f;
        }
        if((v1 & 8) != 0) {
            f3 = 8.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(380403812, v, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:246)");
        }
        Object[] arr_object = {Dp.box-impl(f), Dp.box-impl(f1), Dp.box-impl(f2), Dp.box-impl(f3)};
        composer0.startReplaceableGroup(0xDE219177);
        boolean z = false;
        for(int v2 = 0; v2 < 4; ++v2) {
            z |= composer0.changed(arr_object[v2]);
        }
        e3 e30 = composer0.rememberedValue();
        if(z || e30 == Composer.Companion.getEmpty()) {
            e30 = new e3(f, f1, f2, f3);
            composer0.updateRememberedValue(e30);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return e30;
    }
}

