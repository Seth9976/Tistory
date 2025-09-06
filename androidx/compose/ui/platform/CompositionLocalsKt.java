package androidx.compose.ui.platform;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00C0\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A2\u0010\b\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0011\u0010\u0007\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u0006H\u0001\u00A2\u0006\u0004\b\b\u0010\t\"\u001F\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n8\u0006\u00A2\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F\"(\u0010\u0016\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n8GX\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0013\u0010\u000F\"&\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00170\n8GX\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0018\u0010\r\u0012\u0004\b\u001A\u0010\u0015\u001A\u0004\b\u0019\u0010\u000F\"\u001D\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001C0\n8\u0006\u00A2\u0006\f\n\u0004\b\u001D\u0010\r\u001A\u0004\b\u001E\u0010\u000F\"\u001D\u0010#\u001A\b\u0012\u0004\u0012\u00020 0\n8\u0006\u00A2\u0006\f\n\u0004\b!\u0010\r\u001A\u0004\b\"\u0010\u000F\"\u001D\u0010\'\u001A\b\u0012\u0004\u0012\u00020$0\n8\u0006\u00A2\u0006\f\n\u0004\b%\u0010\r\u001A\u0004\b&\u0010\u000F\"\u001D\u0010+\u001A\b\u0012\u0004\u0012\u00020(0\n8\u0006\u00A2\u0006\f\n\u0004\b)\u0010\r\u001A\u0004\b*\u0010\u000F\"&\u00100\u001A\b\u0012\u0004\u0012\u00020,0\n8GX\u0087\u0004\u00A2\u0006\u0012\n\u0004\b-\u0010\r\u0012\u0004\b/\u0010\u0015\u001A\u0004\b.\u0010\u000F\"\u001D\u00104\u001A\b\u0012\u0004\u0012\u0002010\n8\u0006\u00A2\u0006\f\n\u0004\b2\u0010\r\u001A\u0004\b3\u0010\u000F\"\u001D\u00108\u001A\b\u0012\u0004\u0012\u0002050\n8\u0006\u00A2\u0006\f\n\u0004\b6\u0010\r\u001A\u0004\b7\u0010\u000F\"\u001D\u0010<\u001A\b\u0012\u0004\u0012\u0002090\n8\u0006\u00A2\u0006\f\n\u0004\b:\u0010\r\u001A\u0004\b;\u0010\u000F\"\u001D\u0010@\u001A\b\u0012\u0004\u0012\u00020=0\n8\u0006\u00A2\u0006\f\n\u0004\b>\u0010\r\u001A\u0004\b?\u0010\u000F\"(\u0010E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010A0\n8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bB\u0010\r\u0012\u0004\bD\u0010\u0015\u001A\u0004\bC\u0010\u000F\"\u001F\u0010I\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010F0\n8\u0006\u00A2\u0006\f\n\u0004\bG\u0010\r\u001A\u0004\bH\u0010\u000F\"\u001D\u0010M\u001A\b\u0012\u0004\u0012\u00020J0\n8\u0006\u00A2\u0006\f\n\u0004\bK\u0010\r\u001A\u0004\bL\u0010\u000F\"\u001D\u0010P\u001A\b\u0012\u0004\u0012\u00020\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bN\u0010\r\u001A\u0004\bO\u0010\u000F\"\u001D\u0010T\u001A\b\u0012\u0004\u0012\u00020Q0\n8\u0006\u00A2\u0006\f\n\u0004\bR\u0010\r\u001A\u0004\bS\u0010\u000F\"\u001D\u0010X\u001A\b\u0012\u0004\u0012\u00020U0\n8\u0006\u00A2\u0006\f\n\u0004\bV\u0010\r\u001A\u0004\bW\u0010\u000F\"\"\u0010\\\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010Y0\n8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bZ\u0010\r\u001A\u0004\b[\u0010\u000F\" \u0010`\u001A\b\u0012\u0004\u0012\u00020]0\n8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b^\u0010\r\u001A\u0004\b_\u0010\u000F\"\u0017\u0010d\u001A\b\u0012\u0004\u0012\u00020]0a8F\u00A2\u0006\u0006\u001A\u0004\bb\u0010c\u00A8\u0006e"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/platform/UriHandler;", "uriHandler", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ProvideCommonCompositionLocals", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAccessibilityManager", "Landroidx/compose/ui/autofill/Autofill;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Landroidx/compose/ui/autofill/AutofillTree;", "c", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/platform/ClipboardManager;", "d", "getLocalClipboardManager", "LocalClipboardManager", "Landroidx/compose/ui/graphics/GraphicsContext;", "e", "getLocalGraphicsContext", "LocalGraphicsContext", "Landroidx/compose/ui/unit/Density;", "f", "getLocalDensity", "LocalDensity", "Landroidx/compose/ui/focus/FocusManager;", "g", "getLocalFocusManager", "LocalFocusManager", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "h", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "i", "getLocalFontFamilyResolver", "LocalFontFamilyResolver", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "j", "getLocalHapticFeedback", "LocalHapticFeedback", "Landroidx/compose/ui/input/InputModeManager;", "k", "getLocalInputModeManager", "LocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "l", "getLocalLayoutDirection", "LocalLayoutDirection", "Landroidx/compose/ui/text/input/TextInputService;", "m", "getLocalTextInputService", "getLocalTextInputService$annotations", "LocalTextInputService", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "n", "getLocalSoftwareKeyboardController", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/TextToolbar;", "o", "getLocalTextToolbar", "LocalTextToolbar", "p", "getLocalUriHandler", "LocalUriHandler", "Landroidx/compose/ui/platform/ViewConfiguration;", "q", "getLocalViewConfiguration", "LocalViewConfiguration", "Landroidx/compose/ui/platform/WindowInfo;", "r", "getLocalWindowInfo", "LocalWindowInfo", "Landroidx/compose/ui/input/pointer/PointerIconService;", "s", "getLocalPointerIconService", "LocalPointerIconService", "", "t", "getLocalProvidableScrollCaptureInProgress", "LocalProvidableScrollCaptureInProgress", "Landroidx/compose/runtime/CompositionLocal;", "getLocalScrollCaptureInProgress", "()Landroidx/compose/runtime/CompositionLocal;", "LocalScrollCaptureInProgress", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CompositionLocalsKt {
    public static final ProvidableCompositionLocal a;
    public static final ProvidableCompositionLocal b;
    public static final ProvidableCompositionLocal c;
    public static final ProvidableCompositionLocal d;
    public static final ProvidableCompositionLocal e;
    public static final ProvidableCompositionLocal f;
    public static final ProvidableCompositionLocal g;
    public static final ProvidableCompositionLocal h;
    public static final ProvidableCompositionLocal i;
    public static final ProvidableCompositionLocal j;
    public static final ProvidableCompositionLocal k;
    public static final ProvidableCompositionLocal l;
    public static final ProvidableCompositionLocal m;
    public static final ProvidableCompositionLocal n;
    public static final ProvidableCompositionLocal o;
    public static final ProvidableCompositionLocal p;
    public static final ProvidableCompositionLocal q;
    public static final ProvidableCompositionLocal r;
    public static final ProvidableCompositionLocal s;
    public static final ProvidableCompositionLocal t;

    static {
        CompositionLocalsKt.a = CompositionLocalKt.staticCompositionLocalOf(y.H);
        CompositionLocalsKt.b = CompositionLocalKt.staticCompositionLocalOf(y.I);
        CompositionLocalsKt.c = CompositionLocalKt.staticCompositionLocalOf(y.J);
        CompositionLocalsKt.d = CompositionLocalKt.staticCompositionLocalOf(y.K);
        CompositionLocalsKt.e = CompositionLocalKt.staticCompositionLocalOf(y.N);
        CompositionLocalsKt.f = CompositionLocalKt.staticCompositionLocalOf(y.L);
        CompositionLocalsKt.g = CompositionLocalKt.staticCompositionLocalOf(y.M);
        CompositionLocalsKt.h = CompositionLocalKt.staticCompositionLocalOf(y0.w);
        CompositionLocalsKt.i = CompositionLocalKt.staticCompositionLocalOf(x0.w);
        CompositionLocalsKt.j = CompositionLocalKt.staticCompositionLocalOf(y.O);
        CompositionLocalsKt.k = CompositionLocalKt.staticCompositionLocalOf(y.P);
        CompositionLocalsKt.l = CompositionLocalKt.staticCompositionLocalOf(y.Q);
        CompositionLocalsKt.m = CompositionLocalKt.staticCompositionLocalOf(y.U);
        CompositionLocalsKt.n = CompositionLocalKt.staticCompositionLocalOf(y.T);
        CompositionLocalsKt.o = CompositionLocalKt.staticCompositionLocalOf(y.V);
        CompositionLocalsKt.p = CompositionLocalKt.staticCompositionLocalOf(y.W);
        CompositionLocalsKt.q = CompositionLocalKt.staticCompositionLocalOf(y.X);
        CompositionLocalsKt.r = CompositionLocalKt.staticCompositionLocalOf(y.Y);
        CompositionLocalsKt.s = CompositionLocalKt.staticCompositionLocalOf(y.R);
        CompositionLocalsKt.t = CompositionLocalKt.compositionLocalOf$default(null, y.S, 1, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    @ExperimentalComposeUiApi
    public static final void ProvideCommonCompositionLocals(@NotNull Owner owner0, @NotNull UriHandler uriHandler0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x34224BAD);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(owner0) : composer1.changedInstance(owner0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? composer1.changed(uriHandler0) : composer1.changedInstance(uriHandler0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x34224BAD, v1, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            AccessibilityManager accessibilityManager0 = owner0.getAccessibilityManager();
            ProvidedValue providedValue0 = CompositionLocalsKt.a.provides(accessibilityManager0);
            Autofill autofill0 = owner0.getAutofill();
            ProvidedValue providedValue1 = CompositionLocalsKt.b.provides(autofill0);
            AutofillTree autofillTree0 = owner0.getAutofillTree();
            ProvidedValue providedValue2 = CompositionLocalsKt.c.provides(autofillTree0);
            ClipboardManager clipboardManager0 = owner0.getClipboardManager();
            ProvidedValue providedValue3 = CompositionLocalsKt.d.provides(clipboardManager0);
            Density density0 = owner0.getDensity();
            ProvidedValue providedValue4 = CompositionLocalsKt.f.provides(density0);
            FocusOwner focusOwner0 = owner0.getFocusOwner();
            ProvidedValue providedValue5 = CompositionLocalsKt.g.provides(focusOwner0);
            ResourceLoader font$ResourceLoader0 = owner0.getFontLoader();
            ProvidedValue providedValue6 = CompositionLocalsKt.h.providesDefault(font$ResourceLoader0);
            Resolver fontFamily$Resolver0 = owner0.getFontFamilyResolver();
            ProvidedValue providedValue7 = CompositionLocalsKt.i.providesDefault(fontFamily$Resolver0);
            HapticFeedback hapticFeedback0 = owner0.getHapticFeedBack();
            ProvidedValue providedValue8 = CompositionLocalsKt.j.provides(hapticFeedback0);
            InputModeManager inputModeManager0 = owner0.getInputModeManager();
            ProvidedValue providedValue9 = CompositionLocalsKt.k.provides(inputModeManager0);
            LayoutDirection layoutDirection0 = owner0.getLayoutDirection();
            ProvidedValue providedValue10 = CompositionLocalsKt.l.provides(layoutDirection0);
            TextInputService textInputService0 = owner0.getTextInputService();
            ProvidedValue providedValue11 = CompositionLocalsKt.m.provides(textInputService0);
            SoftwareKeyboardController softwareKeyboardController0 = owner0.getSoftwareKeyboardController();
            ProvidedValue providedValue12 = CompositionLocalsKt.n.provides(softwareKeyboardController0);
            TextToolbar textToolbar0 = owner0.getTextToolbar();
            ProvidedValue providedValue13 = CompositionLocalsKt.o.provides(textToolbar0);
            ProvidedValue providedValue14 = CompositionLocalsKt.p.provides(uriHandler0);
            ViewConfiguration viewConfiguration0 = owner0.getViewConfiguration();
            ProvidedValue providedValue15 = CompositionLocalsKt.q.provides(viewConfiguration0);
            WindowInfo windowInfo0 = owner0.getWindowInfo();
            ProvidedValue providedValue16 = CompositionLocalsKt.r.provides(windowInfo0);
            PointerIconService pointerIconService0 = owner0.getPointerIconService();
            ProvidedValue providedValue17 = CompositionLocalsKt.s.provides(pointerIconService0);
            GraphicsContext graphicsContext0 = owner0.getGraphicsContext();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providedValue0, providedValue1, providedValue2, providedValue3, providedValue4, providedValue5, providedValue6, providedValue7, providedValue8, providedValue9, providedValue10, providedValue11, providedValue12, providedValue13, providedValue14, providedValue15, providedValue16, providedValue17, CompositionLocalsKt.e.provides(graphicsContext0)}, function20, composer1, v1 >> 3 & 0x70 | ProvidedValue.$stable);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 2, owner0, uriHandler0, function20));
        }
    }

    public static final Void access$noLocalProvidedFor(String s) {
        throw new IllegalStateException(("CompositionLocal " + s + " not present").toString());
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalAccessibilityManager() {
        return CompositionLocalsKt.a;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal getLocalAutofill() {
        return CompositionLocalsKt.b;
    }

    @ExperimentalComposeUiApi
    public static void getLocalAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal getLocalAutofillTree() {
        return CompositionLocalsKt.c;
    }

    @ExperimentalComposeUiApi
    public static void getLocalAutofillTree$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalClipboardManager() {
        return CompositionLocalsKt.d;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalDensity() {
        return CompositionLocalsKt.f;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalFocusManager() {
        return CompositionLocalsKt.g;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalFontFamilyResolver() {
        return CompositionLocalsKt.i;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final ProvidableCompositionLocal getLocalFontLoader() {
        return CompositionLocalsKt.h;
    }

    @Deprecated(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @ReplaceWith(expression = "LocalFontFamilyResolver", imports = {}))
    public static void getLocalFontLoader$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalGraphicsContext() {
        return CompositionLocalsKt.e;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalHapticFeedback() {
        return CompositionLocalsKt.j;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalInputModeManager() {
        return CompositionLocalsKt.k;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalLayoutDirection() {
        return CompositionLocalsKt.l;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalPointerIconService() {
        return CompositionLocalsKt.s;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalProvidableScrollCaptureInProgress() {
        return CompositionLocalsKt.t;
    }

    @NotNull
    public static final CompositionLocal getLocalScrollCaptureInProgress() {
        return CompositionLocalsKt.t;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalSoftwareKeyboardController() {
        return CompositionLocalsKt.n;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalTextInputService() {
        return CompositionLocalsKt.m;
    }

    @Deprecated(message = "Use PlatformTextInputModifierNode instead.")
    public static void getLocalTextInputService$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalTextToolbar() {
        return CompositionLocalsKt.o;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalUriHandler() {
        return CompositionLocalsKt.p;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalViewConfiguration() {
        return CompositionLocalsKt.q;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalWindowInfo() {
        return CompositionLocalsKt.r;
    }
}

