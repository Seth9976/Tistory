package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001R,\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u00028G¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxDefaults;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "getPositionalThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "positionalThreshold", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,266:1\n77#2:267\n1#3:268\n1223#4,6:269\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults\n*L\n262#1:267\n262#1:269,6\n*E\n"})
public final class SwipeToDismissBoxDefaults {
    public static final int $stable;
    @NotNull
    public static final SwipeToDismissBoxDefaults INSTANCE;

    static {
        SwipeToDismissBoxDefaults.INSTANCE = new SwipeToDismissBoxDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @JvmName(name = "getPositionalThreshold")
    @NotNull
    public final Function1 getPositionalThreshold(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5C23F999, v, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:261)");
        }
        composer0.startReplaceGroup(0x91887C00);
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = composer0.changed(density0);
        jk jk0 = composer0.rememberedValue();
        if(z || jk0 == Composer.Companion.getEmpty()) {
            jk0 = new jk(density0, 1);
            composer0.updateRememberedValue(jk0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jk0;
    }
}

