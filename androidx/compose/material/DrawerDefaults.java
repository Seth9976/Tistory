package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001A\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0017\u0010\r\u001A\u00020\n8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000E"}, d2 = {"Landroidx/compose/material/DrawerDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getElevation-D9Ej5fM", "()F", "Elevation", "", "ScrimOpacity", "Landroidx/compose/ui/graphics/Color;", "getScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "scrimColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,915:1\n154#2:916\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n*L\n772#1:916\n*E\n"})
public final class DrawerDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final DrawerDefaults INSTANCE = null;
    public static final float ScrimOpacity = 0.32f;
    public static final float a;

    static {
        DrawerDefaults.INSTANCE = new DrawerDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        DrawerDefaults.a = 16.0f;
    }

    public final float getElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getScrimColor")
    public final long getScrimColor(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x24CA1EEE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x24CA1EEE, v, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:775)");
        }
        long v1 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return v1;
    }
}

