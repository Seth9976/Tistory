package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import ca.t1;
import fg.c;
import j0.a;
import j0.b;
import j0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001A,\u0010\t\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001A\u0010\u000F\u001A\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u001A\u0010\u0012\u001A\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001A\u0004\b\u0011\u0010\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/selection/OffsetProvider;", "offsetProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpSize;", "minTouchTargetSize", "", "CursorHandle-USBMPiE", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "CursorHandle", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getCursorHandleHeight", "()F", "CursorHandleHeight", "b", "getCursorHandleWidth", "CursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,107:1\n1223#2,6:108\n148#3:114\n83#4:115\n68#4:116\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n53#1:108,6\n44#1:114\n45#1:115\n45#1:116\n*E\n"})
public final class AndroidCursorHandle_androidKt {
    public static final float a;
    public static final float b;

    static {
        AndroidCursorHandle_androidKt.a = 25.0f;
        AndroidCursorHandle_androidKt.b = 20.710678f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CursorHandle-USBMPiE(@NotNull OffsetProvider offsetProvider0, @NotNull Modifier modifier0, long v, @Nullable Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(1776202187);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (((v1 & 8) == 0 ? composer1.changed(offsetProvider0) : composer1.changedInstance(offsetProvider0)) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= ((v2 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v3 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
            }
            else if((v2 & 4) != 0) {
                v = 0x7FC000007FC00000L;
                v3 &= -897;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1776202187, v3, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
            }
            boolean z = (v3 & 14) == 4 || (v3 & 8) != 0 && composer1.changedInstance(offsetProvider0);
            c c0 = composer1.rememberedValue();
            if(z || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(offsetProvider0, 9);
                composer1.updateRememberedValue(c0);
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x9D712E02, true, new a(SemanticsModifierKt.semantics$default(modifier0, false, c0, 1, null), v), composer1, 54);
            AndroidSelectionHandles_androidKt.HandlePopup(offsetProvider0, Alignment.Companion.getTopCenter(), composableLambda0, composer1, v3 & 14 | 0x1B0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(offsetProvider0, modifier0, v, v1, v2));
        }
    }

    public static final void access$DefaultCursorHandle(Modifier modifier0, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(694251107);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 3) != 2 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694251107, v2, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            SpacerKt.Spacer(ComposedModifierKt.composed$default(SizeKt.size-VpY3zN4(modifier0, AndroidCursorHandle_androidKt.b, AndroidCursorHandle_androidKt.a), null, e.w, 1, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t1(modifier0, v, v1));
        }
    }

    public static final float getCursorHandleHeight() {
        return AndroidCursorHandle_androidKt.a;
    }

    public static final float getCursorHandleWidth() {
        return AndroidCursorHandle_androidKt.b;
    }
}

