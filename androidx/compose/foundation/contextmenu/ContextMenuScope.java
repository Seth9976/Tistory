package androidx.compose.foundation.contextmenu;

import aa.d;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import j0.s1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\u000B\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u0003Jn\u0010\u001B\u001A\u00020\u00062\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122*\b\u0002\u0010\u0019\u001A$\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\u0002\b\u000E2\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "<init>", "()V", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "colors", "", "Content$foundation_release", "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/runtime/Composer;I)V", "Content", "clear$foundation_release", "clear", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "label", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Color;", "Lkotlin/ParameterName;", "name", "iconColor", "leadingIcon", "onClick", "item", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,415:1\n33#2,6:416\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuScope\n*L\n235#1:416,6\n*E\n"})
public final class ContextMenuScope {
    public static final int $stable;
    public final SnapshotStateList a;

    public ContextMenuScope() {
        this.a = SnapshotStateKt.mutableStateListOf();
    }

    @Composable
    public final void Content$foundation_release(@NotNull ContextMenuColors contextMenuColors0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1320309496);
        int v1 = (v & 6) == 0 ? (composer1.changed(contextMenuColors0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(this) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1320309496, v1, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            SnapshotStateList snapshotStateList0 = this.a;
            int v2 = snapshotStateList0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((Function3)snapshotStateList0.get(v3)).invoke(contextMenuColors0, composer1, ((int)(v1 & 14)));
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(this, contextMenuColors0, v, 26));
        }
    }

    public final void clear$foundation_release() {
        this.a.clear();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void item(@NotNull Function2 function20, @NotNull Modifier modifier0, boolean z, @Nullable Function3 function30, @NotNull Function0 function00) {
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xF9F600C, true, new s1(function20, z, modifier0, function30, function00, 1));
        this.a.add(composableLambda0);
    }

    public static void item$default(ContextMenuScope contextMenuScope0, Function2 function20, Modifier modifier0, boolean z, Function3 function30, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            modifier0 = Modifier.Companion;
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function30 = null;
        }
        contextMenuScope0.item(function20, modifier0, z, function30, function00);
    }
}

