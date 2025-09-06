package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\b<\b\u00C0\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001D\u0010\u0010\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u001D\u0010\u0013\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0019\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001C\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u0016\u001A\u0004\b\u001B\u0010\u0018R\u0014\u0010\u001E\u001A\u00020\u001D8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u0004R\u001D\u0010!\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001F\u0010\u0004\u001A\u0004\b \u0010\u0006R\u0017\u0010$\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b\"\u0010\u0016\u001A\u0004\b#\u0010\u0018R\u0017\u0010\'\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b%\u0010\u0016\u001A\u0004\b&\u0010\u0018R\u0017\u0010*\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b(\u0010\u0016\u001A\u0004\b)\u0010\u0018R\u0017\u0010-\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b+\u0010\u0016\u001A\u0004\b,\u0010\u0018R\u001D\u00100\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b.\u0010\u0004\u001A\u0004\b/\u0010\u0006R\u0017\u00103\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b1\u0010\u0016\u001A\u0004\b2\u0010\u0018R\u0017\u00106\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b4\u0010\u0016\u001A\u0004\b5\u0010\u0018R\u001D\u00109\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b7\u0010\u0004\u001A\u0004\b8\u0010\u0006R\u0017\u0010<\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b:\u0010\u0016\u001A\u0004\b;\u0010\u0018R\u0017\u0010?\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b=\u0010\u0016\u001A\u0004\b>\u0010\u0018R\u0017\u0010B\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b@\u0010\u0016\u001A\u0004\bA\u0010\u0018R\u001D\u0010E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bC\u0010\u0004\u001A\u0004\bD\u0010\u0006R\u0017\u0010H\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bF\u0010\u0016\u001A\u0004\bG\u0010\u0018R\u0017\u0010K\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bI\u0010\u0016\u001A\u0004\bJ\u0010\u0018R\u001D\u0010N\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bL\u0010\u0004\u001A\u0004\bM\u0010\u0006R\u0017\u0010Q\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bO\u0010\u0016\u001A\u0004\bP\u0010\u0018R\u0017\u0010T\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bR\u0010\u0016\u001A\u0004\bS\u0010\u0018R\u001D\u0010W\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bU\u0010\u0004\u001A\u0004\bV\u0010\u0006R\u0017\u0010Z\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bX\u0010\u0016\u001A\u0004\bY\u0010\u0018R\u001D\u0010]\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b[\u0010\u0004\u001A\u0004\b\\\u0010\u0006R\u0017\u0010`\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b^\u0010\u0016\u001A\u0004\b_\u0010\u0018R\u0017\u0010c\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\ba\u0010\u0016\u001A\u0004\bb\u0010\u0018R\u001D\u0010f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bd\u0010\u0004\u001A\u0004\be\u0010\u0006R\u0017\u0010l\u001A\u00020g8\u0006\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u0010kR\u001D\u0010n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0004\u0010\u0004\u001A\u0004\bm\u0010\u0006R\u0014\u0010o\u001A\u00020\u001D8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\bo\u0010\u0004R\u0017\u0010r\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bp\u0010\u0016\u001A\u0004\bq\u0010\u0018R\u001D\u0010u\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bs\u0010\u0004\u001A\u0004\bt\u0010\u0006R\u0017\u0010x\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bv\u0010\u0016\u001A\u0004\bw\u0010\u0018R\u001D\u0010{\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\by\u0010\u0004\u001A\u0004\bz\u0010\u0006R\u0017\u0010~\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\b|\u0010\u0016\u001A\u0004\b}\u0010\u0018R\u001F\u0010\u0081\u0001\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\r\n\u0004\b\u007F\u0010\u0004\u001A\u0005\b\u0080\u0001\u0010\u0006R\u001A\u0010\u0084\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u0082\u0001\u0010\u0016\u001A\u0005\b\u0083\u0001\u0010\u0018R\u001A\u0010\u0087\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u0085\u0001\u0010\u0016\u001A\u0005\b\u0086\u0001\u0010\u0018R \u0010\u008A\u0001\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0088\u0001\u0010\u0004\u001A\u0005\b\u0089\u0001\u0010\u0006R\u001A\u0010\u008D\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u008B\u0001\u0010\u0016\u001A\u0005\b\u008C\u0001\u0010\u0018R \u0010\u0090\u0001\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u008E\u0001\u0010\u0004\u001A\u0005\b\u008F\u0001\u0010\u0006R\u001A\u0010\u0093\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u0091\u0001\u0010\u0016\u001A\u0005\b\u0092\u0001\u0010\u0018R \u0010\u0096\u0001\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u0094\u0001\u0010\u0004\u001A\u0005\b\u0095\u0001\u0010\u0006R\u001A\u0010\u0099\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u0097\u0001\u0010\u0016\u001A\u0005\b\u0098\u0001\u0010\u0018R \u0010\u009C\u0001\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u009A\u0001\u0010\u0004\u001A\u0005\b\u009B\u0001\u0010\u0006R\u001A\u0010\u009F\u0001\u001A\u00020\u00148\u0006\u00A2\u0006\u000E\n\u0005\b\u009D\u0001\u0010\u0016\u001A\u0005\b\u009E\u0001\u0010\u0018R \u0010\u00A2\u0001\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\n\u0005\b\u00A0\u0001\u0010\u0004\u001A\u0005\b\u00A1\u0001\u0010\u0006\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00A3\u0001"}, d2 = {"Landroidx/compose/material3/tokens/CheckboxTokens;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "b", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getContainerShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContainerShape", "c", "getContainerWidth-D9Ej5fM", "ContainerWidth", "d", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "e", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getSelectedContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "SelectedContainerColor", "f", "getSelectedDisabledContainerColor", "SelectedDisabledContainerColor", "", "SelectedDisabledContainerOpacity", "g", "getSelectedDisabledContainerOutlineWidth-D9Ej5fM", "SelectedDisabledContainerOutlineWidth", "h", "getSelectedDisabledIconColor", "SelectedDisabledIconColor", "i", "getSelectedErrorContainerColor", "SelectedErrorContainerColor", "j", "getSelectedErrorFocusContainerColor", "SelectedErrorFocusContainerColor", "k", "getSelectedErrorFocusIconColor", "SelectedErrorFocusIconColor", "l", "getSelectedErrorFocusOutlineWidth-D9Ej5fM", "SelectedErrorFocusOutlineWidth", "m", "getSelectedErrorHoverContainerColor", "SelectedErrorHoverContainerColor", "n", "getSelectedErrorHoverIconColor", "SelectedErrorHoverIconColor", "o", "getSelectedErrorHoverOutlineWidth-D9Ej5fM", "SelectedErrorHoverOutlineWidth", "p", "getSelectedErrorIconColor", "SelectedErrorIconColor", "q", "getSelectedErrorPressedContainerColor", "SelectedErrorPressedContainerColor", "r", "getSelectedErrorPressedIconColor", "SelectedErrorPressedIconColor", "s", "getSelectedErrorPressedOutlineWidth-D9Ej5fM", "SelectedErrorPressedOutlineWidth", "t", "getSelectedFocusContainerColor", "SelectedFocusContainerColor", "u", "getSelectedFocusIconColor", "SelectedFocusIconColor", "v", "getSelectedFocusOutlineWidth-D9Ej5fM", "SelectedFocusOutlineWidth", "w", "getSelectedHoverContainerColor", "SelectedHoverContainerColor", "x", "getSelectedHoverIconColor", "SelectedHoverIconColor", "y", "getSelectedHoverOutlineWidth-D9Ej5fM", "SelectedHoverOutlineWidth", "z", "getSelectedIconColor", "SelectedIconColor", "A", "getSelectedOutlineWidth-D9Ej5fM", "SelectedOutlineWidth", "B", "getSelectedPressedContainerColor", "SelectedPressedContainerColor", "C", "getSelectedPressedIconColor", "SelectedPressedIconColor", "D", "getSelectedPressedOutlineWidth-D9Ej5fM", "SelectedPressedOutlineWidth", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "E", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getStateLayerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "StateLayerShape", "getStateLayerSize-D9Ej5fM", "StateLayerSize", "UnselectedDisabledContainerOpacity", "G", "getUnselectedDisabledOutlineColor", "UnselectedDisabledOutlineColor", "H", "getUnselectedDisabledOutlineWidth-D9Ej5fM", "UnselectedDisabledOutlineWidth", "I", "getUnselectedErrorFocusOutlineColor", "UnselectedErrorFocusOutlineColor", "J", "getUnselectedErrorFocusOutlineWidth-D9Ej5fM", "UnselectedErrorFocusOutlineWidth", "K", "getUnselectedErrorHoverOutlineColor", "UnselectedErrorHoverOutlineColor", "L", "getUnselectedErrorHoverOutlineWidth-D9Ej5fM", "UnselectedErrorHoverOutlineWidth", "M", "getUnselectedErrorOutlineColor", "UnselectedErrorOutlineColor", "N", "getUnselectedErrorPressedOutlineColor", "UnselectedErrorPressedOutlineColor", "O", "getUnselectedErrorPressedOutlineWidth-D9Ej5fM", "UnselectedErrorPressedOutlineWidth", "P", "getUnselectedFocusOutlineColor", "UnselectedFocusOutlineColor", "Q", "getUnselectedFocusOutlineWidth-D9Ej5fM", "UnselectedFocusOutlineWidth", "R", "getUnselectedHoverOutlineColor", "UnselectedHoverOutlineColor", "S", "getUnselectedHoverOutlineWidth-D9Ej5fM", "UnselectedHoverOutlineWidth", "T", "getUnselectedOutlineColor", "UnselectedOutlineColor", "U", "getUnselectedOutlineWidth-D9Ej5fM", "UnselectedOutlineWidth", "V", "getUnselectedPressedOutlineColor", "UnselectedPressedOutlineColor", "W", "getUnselectedPressedOutlineWidth-D9Ej5fM", "UnselectedPressedOutlineWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCheckboxTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckboxTokens.kt\nandroidx/compose/material3/tokens/CheckboxTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,77:1\n158#2:78\n158#2:79\n158#2:80\n158#2:81\n158#2:82\n158#2:83\n158#2:84\n158#2:85\n158#2:86\n158#2:87\n158#2:88\n158#2:89\n158#2:90\n158#2:91\n158#2:92\n158#2:93\n158#2:94\n158#2:95\n158#2:96\n158#2:97\n158#2:98\n*S KotlinDebug\n*F\n+ 1 CheckboxTokens.kt\nandroidx/compose/material3/tokens/CheckboxTokens\n*L\n25#1:78\n26#1:79\n27#1:80\n28#1:81\n32#1:82\n37#1:83\n40#1:84\n44#1:85\n47#1:86\n50#1:87\n52#1:88\n55#1:89\n57#1:90\n60#1:91\n62#1:92\n64#1:93\n67#1:94\n69#1:95\n71#1:96\n73#1:97\n75#1:98\n*E\n"})
public final class CheckboxTokens {
    public static final int $stable = 0;
    public static final float A = 0.0f;
    public static final ColorSchemeKeyTokens B = null;
    public static final ColorSchemeKeyTokens C = null;
    public static final float D = 0.0f;
    public static final ShapeKeyTokens E = null;
    public static final float F = 0.0f;
    public static final ColorSchemeKeyTokens G = null;
    public static final float H = 0.0f;
    public static final ColorSchemeKeyTokens I = null;
    @NotNull
    public static final CheckboxTokens INSTANCE = null;
    public static final float J = 0.0f;
    public static final ColorSchemeKeyTokens K = null;
    public static final float L = 0.0f;
    public static final ColorSchemeKeyTokens M = null;
    public static final ColorSchemeKeyTokens N = null;
    public static final float O = 0.0f;
    public static final ColorSchemeKeyTokens P = null;
    public static final float Q = 0.0f;
    public static final ColorSchemeKeyTokens R = null;
    public static final float S = 0.0f;
    public static final float SelectedDisabledContainerOpacity = 0.38f;
    public static final ColorSchemeKeyTokens T = null;
    public static final float U = 0.0f;
    public static final float UnselectedDisabledContainerOpacity = 0.38f;
    public static final ColorSchemeKeyTokens V;
    public static final float W;
    public static final float a;
    public static final RoundedCornerShape b;
    public static final float c;
    public static final float d;
    public static final ColorSchemeKeyTokens e;
    public static final ColorSchemeKeyTokens f;
    public static final float g;
    public static final ColorSchemeKeyTokens h;
    public static final ColorSchemeKeyTokens i;
    public static final ColorSchemeKeyTokens j;
    public static final ColorSchemeKeyTokens k;
    public static final float l;
    public static final ColorSchemeKeyTokens m;
    public static final ColorSchemeKeyTokens n;
    public static final float o;
    public static final ColorSchemeKeyTokens p;
    public static final ColorSchemeKeyTokens q;
    public static final ColorSchemeKeyTokens r;
    public static final float s;
    public static final ColorSchemeKeyTokens t;
    public static final ColorSchemeKeyTokens u;
    public static final float v;
    public static final ColorSchemeKeyTokens w;
    public static final ColorSchemeKeyTokens x;
    public static final float y;
    public static final ColorSchemeKeyTokens z;

    static {
        CheckboxTokens.INSTANCE = new CheckboxTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        CheckboxTokens.a = 18.0f;
        CheckboxTokens.b = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(2.0f);
        CheckboxTokens.c = 18.0f;
        CheckboxTokens.d = 18.0f;
        CheckboxTokens.e = ColorSchemeKeyTokens.Primary;
        CheckboxTokens.f = ColorSchemeKeyTokens.OnSurface;
        CheckboxTokens.g = 0.0f;
        CheckboxTokens.h = ColorSchemeKeyTokens.Surface;
        CheckboxTokens.i = ColorSchemeKeyTokens.Error;
        CheckboxTokens.j = ColorSchemeKeyTokens.Error;
        CheckboxTokens.k = ColorSchemeKeyTokens.OnError;
        CheckboxTokens.l = 0.0f;
        CheckboxTokens.m = ColorSchemeKeyTokens.Error;
        CheckboxTokens.n = ColorSchemeKeyTokens.OnError;
        CheckboxTokens.o = 0.0f;
        CheckboxTokens.p = ColorSchemeKeyTokens.OnError;
        CheckboxTokens.q = ColorSchemeKeyTokens.Error;
        CheckboxTokens.r = ColorSchemeKeyTokens.OnError;
        CheckboxTokens.s = 0.0f;
        CheckboxTokens.t = ColorSchemeKeyTokens.Primary;
        CheckboxTokens.u = ColorSchemeKeyTokens.OnPrimary;
        CheckboxTokens.v = 0.0f;
        CheckboxTokens.w = ColorSchemeKeyTokens.Primary;
        CheckboxTokens.x = ColorSchemeKeyTokens.OnPrimary;
        CheckboxTokens.y = 0.0f;
        CheckboxTokens.z = ColorSchemeKeyTokens.OnPrimary;
        CheckboxTokens.A = 0.0f;
        CheckboxTokens.B = ColorSchemeKeyTokens.Primary;
        CheckboxTokens.C = ColorSchemeKeyTokens.OnPrimary;
        CheckboxTokens.D = 0.0f;
        CheckboxTokens.E = ShapeKeyTokens.CornerFull;
        CheckboxTokens.F = 40.0f;
        CheckboxTokens.G = ColorSchemeKeyTokens.OnSurface;
        CheckboxTokens.H = 2.0f;
        CheckboxTokens.I = ColorSchemeKeyTokens.Error;
        CheckboxTokens.J = 2.0f;
        CheckboxTokens.K = ColorSchemeKeyTokens.Error;
        CheckboxTokens.L = 2.0f;
        CheckboxTokens.M = ColorSchemeKeyTokens.Error;
        CheckboxTokens.N = ColorSchemeKeyTokens.Error;
        CheckboxTokens.O = 2.0f;
        CheckboxTokens.P = ColorSchemeKeyTokens.OnSurface;
        CheckboxTokens.Q = 2.0f;
        CheckboxTokens.R = ColorSchemeKeyTokens.OnSurface;
        CheckboxTokens.S = 2.0f;
        CheckboxTokens.T = ColorSchemeKeyTokens.OnSurfaceVariant;
        CheckboxTokens.U = 2.0f;
        CheckboxTokens.V = ColorSchemeKeyTokens.OnSurface;
        CheckboxTokens.W = 2.0f;
    }

    public final float getContainerHeight-D9Ej5fM() {
        return CheckboxTokens.a;
    }

    @NotNull
    public final RoundedCornerShape getContainerShape() {
        return CheckboxTokens.b;
    }

    public final float getContainerWidth-D9Ej5fM() {
        return CheckboxTokens.c;
    }

    public final float getIconSize-D9Ej5fM() {
        return CheckboxTokens.d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return CheckboxTokens.e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDisabledContainerColor() {
        return CheckboxTokens.f;
    }

    public final float getSelectedDisabledContainerOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDisabledIconColor() {
        return CheckboxTokens.h;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorContainerColor() {
        return CheckboxTokens.i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorFocusContainerColor() {
        return CheckboxTokens.j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorFocusIconColor() {
        return CheckboxTokens.k;
    }

    public final float getSelectedErrorFocusOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorHoverContainerColor() {
        return CheckboxTokens.m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorHoverIconColor() {
        return CheckboxTokens.n;
    }

    public final float getSelectedErrorHoverOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorIconColor() {
        return CheckboxTokens.p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorPressedContainerColor() {
        return CheckboxTokens.q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorPressedIconColor() {
        return CheckboxTokens.r;
    }

    public final float getSelectedErrorPressedOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusContainerColor() {
        return CheckboxTokens.t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return CheckboxTokens.u;
    }

    public final float getSelectedFocusOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverContainerColor() {
        return CheckboxTokens.w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return CheckboxTokens.x;
    }

    public final float getSelectedHoverOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return CheckboxTokens.z;
    }

    public final float getSelectedOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedContainerColor() {
        return CheckboxTokens.B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return CheckboxTokens.C;
    }

    public final float getSelectedPressedOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.D;
    }

    @NotNull
    public final ShapeKeyTokens getStateLayerShape() {
        return CheckboxTokens.E;
    }

    public final float getStateLayerSize-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDisabledOutlineColor() {
        return CheckboxTokens.G;
    }

    public final float getUnselectedDisabledOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorFocusOutlineColor() {
        return CheckboxTokens.I;
    }

    public final float getUnselectedErrorFocusOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorHoverOutlineColor() {
        return CheckboxTokens.K;
    }

    public final float getUnselectedErrorHoverOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorOutlineColor() {
        return CheckboxTokens.M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorPressedOutlineColor() {
        return CheckboxTokens.N;
    }

    public final float getUnselectedErrorPressedOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return CheckboxTokens.P;
    }

    public final float getUnselectedFocusOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.Q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverOutlineColor() {
        return CheckboxTokens.R;
    }

    public final float getUnselectedHoverOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return CheckboxTokens.T;
    }

    public final float getUnselectedOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedOutlineColor() {
        return CheckboxTokens.V;
    }

    public final float getUnselectedPressedOutlineWidth-D9Ej5fM() {
        return CheckboxTokens.W;
    }
}

