package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u00C7\u0002\u0018\u00002\u00020\u0001R5\u0010\f\u001A \u0012\u001C\u0012\u001A\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR)\u0010\u0010\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u000BR)\u0010\u0013\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0011\u0010\t\u001A\u0004\b\u0012\u0010\u000BRS\u0010\u001C\u001A>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0015\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0015\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00070\u00140\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\t\u001A\u0004\b\u001B\u0010\u000BRH\u0010\"\u001A3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001D0\u001F\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00140\u00028\u0006\u00A2\u0006\f\n\u0004\b \u0010\t\u001A\u0004\b!\u0010\u000BR/\u0010&\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b$\u0010\t\u001A\u0004\b%\u0010\u000BR2\u0010*\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b(\u0010\t\u001A\u0004\b)\u0010\u000BR>\u0010.\u001A)\u0012%\u0012#\u0012\u001F\u0012\u001D\u0012\u0013\u0012\u00110\u0015\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010\t\u001A\u0004\b-\u0010\u000BR;\u00102\u001A&\u0012\"\u0012 \u0012\u001C\u0012\u001A\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070/0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b0\u0010\t\u001A\u0004\b1\u0010\u000BR/\u00105\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u0010\t\u001A\u0004\b4\u0010\u000BR/\u00108\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b6\u0010\t\u001A\u0004\b7\u0010\u000BR/\u0010;\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b9\u0010\t\u001A\u0004\b:\u0010\u000BR)\u0010>\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b<\u0010\t\u001A\u0004\b=\u0010\u000BR/\u0010A\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b?\u0010\t\u001A\u0004\b@\u0010\u000BR)\u0010D\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bB\u0010\t\u001A\u0004\bC\u0010\u000BR2\u0010I\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bE\u0010\t\u0012\u0004\bG\u0010H\u001A\u0004\bF\u0010\u000BR)\u0010L\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bJ\u0010\t\u001A\u0004\bK\u0010\u000BR)\u0010O\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bM\u0010\t\u001A\u0004\bN\u0010\u000BR)\u0010R\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bP\u0010\t\u001A\u0004\bQ\u0010\u000BR)\u0010U\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bS\u0010\t\u001A\u0004\bT\u0010\u000BR)\u0010X\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bV\u0010\t\u001A\u0004\bW\u0010\u000BR)\u0010[\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bY\u0010\t\u001A\u0004\bZ\u0010\u000BR)\u0010^\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\\\u0010\t\u001A\u0004\b]\u0010\u000BR#\u0010b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0_0\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0018\u0010\t\u001A\u0004\ba\u0010\u000BR)\u0010d\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0019\u0010\t\u001A\u0004\bc\u0010\u000BR)\u0010g\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\be\u0010\t\u001A\u0004\bf\u0010\u000BR)\u0010j\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bh\u0010\t\u001A\u0004\bi\u0010\u000BR)\u0010m\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bk\u0010\t\u001A\u0004\bl\u0010\u000BR5\u0010p\u001A \u0012\u001C\u0012\u001A\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bn\u0010\t\u001A\u0004\bo\u0010\u000B\u00A8\u0006q"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", "b", "getOnClick", "OnClick", "c", "getOnLongClick", "OnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "x", "y", "d", "getScrollBy", "ScrollBy", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lkotlin/coroutines/Continuation;", "e", "getScrollByOffset", "ScrollByOffset", "", "f", "getScrollToIndex", "ScrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "g", "getOnAutofillText$ui_release", "OnAutofillText", "progress", "h", "getSetProgress", "SetProgress", "Lkotlin/Function3;", "i", "getSetSelection", "SetSelection", "j", "getSetText", "SetText", "k", "getSetTextSubstitution", "SetTextSubstitution", "l", "getShowTextSubstitution", "ShowTextSubstitution", "m", "getClearTextSubstitution", "ClearTextSubstitution", "n", "getInsertTextAtCursor", "InsertTextAtCursor", "o", "getOnImeAction", "OnImeAction", "p", "getPerformImeAction", "getPerformImeAction$annotations", "()V", "PerformImeAction", "q", "getCopyText", "CopyText", "r", "getCutText", "CutText", "s", "getPasteText", "PasteText", "t", "getExpand", "Expand", "u", "getCollapse", "Collapse", "v", "getDismiss", "Dismiss", "w", "getRequestFocus", "RequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "CustomActions", "getPageUp", "PageUp", "z", "getPageLeft", "PageLeft", "A", "getPageDown", "PageDown", "B", "getPageRight", "PageRight", "C", "getGetScrollViewportLength", "GetScrollViewportLength", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1617:1\n609#2:1618\n608#2,9:1619\n609#2:1628\n608#2,9:1629\n609#2:1638\n608#2,9:1639\n609#2:1648\n608#2,9:1649\n609#2:1658\n608#2,9:1659\n609#2:1668\n608#2,9:1669\n609#2:1678\n608#2,9:1679\n609#2:1688\n608#2,9:1689\n609#2:1698\n608#2,9:1699\n609#2:1708\n608#2,9:1709\n609#2:1718\n608#2,9:1719\n609#2:1728\n608#2,9:1729\n609#2:1738\n608#2,9:1739\n609#2:1748\n608#2,9:1749\n609#2:1758\n608#2,9:1759\n609#2:1768\n608#2,9:1769\n609#2:1778\n608#2,9:1779\n609#2:1788\n608#2,9:1789\n609#2:1798\n608#2,9:1799\n609#2:1808\n608#2,9:1809\n609#2:1818\n608#2,9:1819\n609#2:1828\n608#2,9:1829\n609#2:1838\n608#2,9:1839\n609#2:1848\n608#2,9:1849\n609#2:1858\n608#2,9:1859\n609#2:1868\n608#2,9:1869\n609#2:1878\n608#2,9:1879\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n307#1:1618\n307#1:1619,9\n312#1:1628\n312#1:1629,9\n317#1:1638\n317#1:1639,9\n322#1:1648\n322#1:1649,9\n332#1:1658\n332#1:1659,9\n339#1:1668\n339#1:1669,9\n344#1:1678\n344#1:1679,9\n349#1:1688\n349#1:1689,9\n354#1:1698\n354#1:1699,9\n359#1:1708\n359#1:1709,9\n364#1:1718\n364#1:1719,9\n369#1:1728\n369#1:1729,9\n374#1:1738\n374#1:1739,9\n379#1:1748\n379#1:1749,9\n391#1:1758\n391#1:1759,9\n396#1:1768\n396#1:1769,9\n401#1:1778\n401#1:1779,9\n406#1:1788\n406#1:1789,9\n411#1:1798\n411#1:1799,9\n416#1:1808\n416#1:1809,9\n421#1:1818\n421#1:1819,9\n426#1:1828\n426#1:1829,9\n437#1:1838\n437#1:1839,9\n442#1:1848\n442#1:1849,9\n447#1:1858\n447#1:1859,9\n452#1:1868\n452#1:1869,9\n458#1:1878\n458#1:1879,9\n*E\n"})
public final class SemanticsActions {
    public static final int $stable;
    public static final SemanticsPropertyKey A;
    public static final SemanticsPropertyKey B;
    public static final SemanticsPropertyKey C;
    @NotNull
    public static final SemanticsActions INSTANCE;
    public static final SemanticsPropertyKey a;
    public static final SemanticsPropertyKey b;
    public static final SemanticsPropertyKey c;
    public static final SemanticsPropertyKey d;
    public static final SemanticsPropertyKey e;
    public static final SemanticsPropertyKey f;
    public static final SemanticsPropertyKey g;
    public static final SemanticsPropertyKey h;
    public static final SemanticsPropertyKey i;
    public static final SemanticsPropertyKey j;
    public static final SemanticsPropertyKey k;
    public static final SemanticsPropertyKey l;
    public static final SemanticsPropertyKey m;
    public static final SemanticsPropertyKey n;
    public static final SemanticsPropertyKey o;
    public static final SemanticsPropertyKey p;
    public static final SemanticsPropertyKey q;
    public static final SemanticsPropertyKey r;
    public static final SemanticsPropertyKey s;
    public static final SemanticsPropertyKey t;
    public static final SemanticsPropertyKey u;
    public static final SemanticsPropertyKey v;
    public static final SemanticsPropertyKey w;
    public static final SemanticsPropertyKey x;
    public static final SemanticsPropertyKey y;
    public static final SemanticsPropertyKey z;

    static {
        SemanticsActions.INSTANCE = new SemanticsActions();  // 初始化器: Ljava/lang/Object;-><init>()V
        SemanticsPropertiesKt.ActionPropertyKey.1 semanticsPropertiesKt$ActionPropertyKey$10 = SemanticsPropertiesKt.ActionPropertyKey.1.INSTANCE;
        SemanticsActions.a = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.b = SemanticsPropertiesKt.AccessibilityKey("OnClick", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.c = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.d = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.e = new SemanticsPropertyKey("ScrollByOffset", null, 2, null);
        SemanticsActions.f = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.g = SemanticsPropertiesKt.AccessibilityKey("OnAutofillText", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.h = SemanticsPropertiesKt.AccessibilityKey("SetProgress", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.i = SemanticsPropertiesKt.AccessibilityKey("SetSelection", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.j = SemanticsPropertiesKt.AccessibilityKey("SetText", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.k = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.l = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.m = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.n = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.o = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.p = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.q = SemanticsPropertiesKt.AccessibilityKey("CopyText", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.r = SemanticsPropertiesKt.AccessibilityKey("CutText", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.s = SemanticsPropertiesKt.AccessibilityKey("PasteText", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.t = SemanticsPropertiesKt.AccessibilityKey("Expand", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.u = SemanticsPropertiesKt.AccessibilityKey("Collapse", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.v = SemanticsPropertiesKt.AccessibilityKey("Dismiss", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.w = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.x = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
        SemanticsActions.y = SemanticsPropertiesKt.AccessibilityKey("PageUp", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.z = SemanticsPropertiesKt.AccessibilityKey("PageLeft", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.A = SemanticsPropertiesKt.AccessibilityKey("PageDown", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.B = SemanticsPropertiesKt.AccessibilityKey("PageRight", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.C = SemanticsPropertiesKt.AccessibilityKey("GetScrollViewportLength", semanticsPropertiesKt$ActionPropertyKey$10);
        SemanticsActions.$stable = 8;
    }

    @NotNull
    public final SemanticsPropertyKey getClearTextSubstitution() {
        return SemanticsActions.m;
    }

    @NotNull
    public final SemanticsPropertyKey getCollapse() {
        return SemanticsActions.u;
    }

    @NotNull
    public final SemanticsPropertyKey getCopyText() {
        return SemanticsActions.q;
    }

    @NotNull
    public final SemanticsPropertyKey getCustomActions() {
        return SemanticsActions.x;
    }

    @NotNull
    public final SemanticsPropertyKey getCutText() {
        return SemanticsActions.r;
    }

    @NotNull
    public final SemanticsPropertyKey getDismiss() {
        return SemanticsActions.v;
    }

    @NotNull
    public final SemanticsPropertyKey getExpand() {
        return SemanticsActions.t;
    }

    @NotNull
    public final SemanticsPropertyKey getGetScrollViewportLength() {
        return SemanticsActions.C;
    }

    @NotNull
    public final SemanticsPropertyKey getGetTextLayoutResult() {
        return SemanticsActions.a;
    }

    @NotNull
    public final SemanticsPropertyKey getInsertTextAtCursor() {
        return SemanticsActions.n;
    }

    @NotNull
    public final SemanticsPropertyKey getOnAutofillText$ui_release() {
        return SemanticsActions.g;
    }

    @NotNull
    public final SemanticsPropertyKey getOnClick() {
        return SemanticsActions.b;
    }

    @NotNull
    public final SemanticsPropertyKey getOnImeAction() {
        return SemanticsActions.o;
    }

    @NotNull
    public final SemanticsPropertyKey getOnLongClick() {
        return SemanticsActions.c;
    }

    @NotNull
    public final SemanticsPropertyKey getPageDown() {
        return SemanticsActions.A;
    }

    @NotNull
    public final SemanticsPropertyKey getPageLeft() {
        return SemanticsActions.z;
    }

    @NotNull
    public final SemanticsPropertyKey getPageRight() {
        return SemanticsActions.B;
    }

    @NotNull
    public final SemanticsPropertyKey getPageUp() {
        return SemanticsActions.y;
    }

    @NotNull
    public final SemanticsPropertyKey getPasteText() {
        return SemanticsActions.s;
    }

    @NotNull
    public final SemanticsPropertyKey getPerformImeAction() {
        return SemanticsActions.p;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use `SemanticsActions.OnImeAction` instead.", replaceWith = @ReplaceWith(expression = "OnImeAction", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnImeAction"}))
    public static void getPerformImeAction$annotations() {
    }

    @NotNull
    public final SemanticsPropertyKey getRequestFocus() {
        return SemanticsActions.w;
    }

    @NotNull
    public final SemanticsPropertyKey getScrollBy() {
        return SemanticsActions.d;
    }

    @NotNull
    public final SemanticsPropertyKey getScrollByOffset() {
        return SemanticsActions.e;
    }

    @NotNull
    public final SemanticsPropertyKey getScrollToIndex() {
        return SemanticsActions.f;
    }

    @NotNull
    public final SemanticsPropertyKey getSetProgress() {
        return SemanticsActions.h;
    }

    @NotNull
    public final SemanticsPropertyKey getSetSelection() {
        return SemanticsActions.i;
    }

    @NotNull
    public final SemanticsPropertyKey getSetText() {
        return SemanticsActions.j;
    }

    @NotNull
    public final SemanticsPropertyKey getSetTextSubstitution() {
        return SemanticsActions.k;
    }

    @NotNull
    public final SemanticsPropertyKey getShowTextSubstitution() {
        return SemanticsActions.l;
    }
}

