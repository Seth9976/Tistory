package androidx.compose.foundation.text;

import aa.d;
import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.g;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import j0.h1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A0\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\u001A(\u0010\u0000\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u000B2\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\f\u001A(\u0010\u0000\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\r2\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\u000E\u001A5\u0010\u000F\u001A\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0004\u001A\u00020\u00052\u000E\b\u0004\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\b¨\u0006\u0016"}, d2 = {"ContextMenuArea", "", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "enabled", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextItem", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "label", "Landroidx/compose/foundation/text/TextContextMenuItems;", "operation", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,104:1\n1223#2,6:105\n1223#2,6:111\n1223#2,6:117\n1223#2,6:123\n1223#2,6:129\n1223#2,6:135\n*S KotlinDebug\n*F\n+ 1 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n37#1:105,6\n40#1:111,6\n53#1:117,6\n56#1:123,6\n68#1:129,6\n71#1:135,6\n*E\n"})
public final class ContextMenu_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@NotNull TextFieldSelectionState textFieldSelectionState0, boolean z, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x7D608533);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(textFieldSelectionState0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7D608533, v1, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:51)");
            }
            ContextMenuState contextMenuState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(contextMenuState0 == composer$Companion0.getEmpty()) {
                contextMenuState0 = new ContextMenuState(null, 1, null);
                composer1.updateRememberedValue(contextMenuState0);
            }
            h1 h10 = composer1.rememberedValue();
            if(h10 == composer$Companion0.getEmpty()) {
                h10 = new h1(contextMenuState0, 1);
                composer1.updateRememberedValue(h10);
            }
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState0, h10, TextFieldSelectionState_androidKt.contextMenuBuilder(textFieldSelectionState0, contextMenuState0), null, z, function20, composer1, 0xE000 & v1 << 9 | 54 | v1 << 9 & 0x70000, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(textFieldSelectionState0, z, function20, v, 5));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@NotNull SelectionManager selectionManager0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(605522716);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(selectionManager0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, v1, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:66)");
            }
            ContextMenuState contextMenuState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(contextMenuState0 == composer$Companion0.getEmpty()) {
                contextMenuState0 = new ContextMenuState(null, 1, null);
                composer1.updateRememberedValue(contextMenuState0);
            }
            h1 h10 = composer1.rememberedValue();
            if(h10 == composer$Companion0.getEmpty()) {
                h10 = new h1(contextMenuState0, 2);
                composer1.updateRememberedValue(h10);
            }
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState0, h10, SelectionManager_androidKt.contextMenuBuilder(selectionManager0, contextMenuState0), null, false, function20, composer1, v1 << 12 & 0x70000 | 54, 24);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(selectionManager0, function20, v, 14));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuArea(@NotNull TextFieldSelectionManager textFieldSelectionManager0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x89A76B73);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(textFieldSelectionManager0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x89A76B73, v1, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            ContextMenuState contextMenuState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(contextMenuState0 == composer$Companion0.getEmpty()) {
                contextMenuState0 = new ContextMenuState(null, 1, null);
                composer1.updateRememberedValue(contextMenuState0);
            }
            h1 h10 = composer1.rememberedValue();
            if(h10 == composer$Companion0.getEmpty()) {
                h10 = new h1(contextMenuState0, 0);
                composer1.updateRememberedValue(h10);
            }
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState0, h10, TextFieldSelectionManager_androidKt.contextMenuBuilder(textFieldSelectionManager0, contextMenuState0), null, textFieldSelectionManager0.getEnabled(), function20, composer1, v1 << 12 & 0x70000 | 54, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(textFieldSelectionManager0, function20, v, 13));
        }
    }

    public static final void TextItem(@NotNull ContextMenuScope contextMenuScope0, @NotNull ContextMenuState contextMenuState0, @NotNull TextContextMenuItems textContextMenuItems0, boolean z, @NotNull Function0 function00) {
        ContextMenuScope.item$default(contextMenuScope0, new Function2(textContextMenuItems0) {
            public final TextContextMenuItems w;

            {
                this.w = textContextMenuItems0;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Composer)object0), ((Number)object1).intValue());
            }

            @Composable
            @NotNull
            public final String invoke(@Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(-1451087197);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1451087197, v, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:98)");
                }
                String s = this.w.resolvedString(composer0, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return s;
            }
        }, null, z, null, new Function0(function00, contextMenuState0) {
            public final Function0 w;
            public final ContextMenuState x;

            {
                this.w = function00;
                this.x = contextMenuState0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                this.w.invoke();
                ContextMenuState_androidKt.close(this.x);
            }
        }, 10, null);
    }
}

