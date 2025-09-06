package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0001H\u000B¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,256:1\n1223#2,6:257\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:257,6\n*E\n"})
public final class WindowInsetsPadding_androidKt.windowInsetsPadding.1 extends Lambda implements Function3 {
    public final Function1 w;

    public WindowInsetsPadding_androidKt.windowInsetsPadding.1(Function1 function10) {
        this.w = function10;
        super(3);
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x15733969);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x15733969, v, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
        }
        WindowInsetsHolder windowInsetsHolder0 = WindowInsetsHolder.Companion.current(composer0, 6);
        boolean z = composer0.changed(windowInsetsHolder0);
        InsetsPaddingModifier insetsPaddingModifier0 = composer0.rememberedValue();
        if(z || insetsPaddingModifier0 == Composer.Companion.getEmpty()) {
            insetsPaddingModifier0 = new InsetsPaddingModifier(((WindowInsets)this.w.invoke(windowInsetsHolder0)));
            composer0.updateRememberedValue(insetsPaddingModifier0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return insetsPaddingModifier0;
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
    }
}

