package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.material3.gd;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0017¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ \u0010\u0013\u001A\u00020\n2\u0011\u0010\u0012\u001A\r\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u001D\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00158\u0014@RX\u0094\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "", "<set-?>", "F", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    public final MutableState E;
    public boolean F;

    @JvmOverloads
    public ComposeView(@NotNull Context context0) {
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public ComposeView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public ComposeView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.E = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public ComposeView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x190BF45A);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(this) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x190BF45A, v1, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            Function2 function20 = (Function2)this.E.getValue();
            if(function20 == null) {
                composer1.startReplaceGroup(358373017);
            }
            else {
                composer1.startReplaceGroup(150107752);
                function20.invoke(composer1, 0);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 2));
        }
    }

    @Override  // android.view.ViewGroup
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.F;
    }

    public static void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void setContent(@NotNull Function2 function20) {
        this.F = true;
        this.E.setValue(function20);
        if(this.isAttachedToWindow()) {
            this.createComposition();
        }
    }
}

