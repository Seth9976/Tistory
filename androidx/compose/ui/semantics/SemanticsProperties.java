package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import g2.c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009C\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u00C7\u0002\u0018\u00002\u00020\u0001R#\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010\u0006\u001A\u0004\b\u000B\u0010\bR\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010\u0006\u001A\u0004\b\u000F\u0010\bR\u001D\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0011\u0010\u0006\u001A\u0004\b\u0012\u0010\bR\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0015\u0010\u0006\u001A\u0004\b\u0016\u0010\bR\u001D\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00180\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0019\u0010\u0006\u001A\u0004\b\u001A\u0010\bR\u001D\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001C0\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001D\u0010\u0006\u001A\u0004\b\u001E\u0010\bR\u001D\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006\u00A2\u0006\f\n\u0004\b \u0010\u0006\u001A\u0004\b!\u0010\bR\u001D\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u0006\u001A\u0004\b$\u0010\bR\u001D\u0010)\u001A\b\u0012\u0004\u0012\u00020&0\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010\u0006\u001A\u0004\b(\u0010\bR\u001D\u0010-\u001A\b\u0012\u0004\u0012\u00020*0\u00028\u0006\u00A2\u0006\f\n\u0004\b+\u0010\u0006\u001A\u0004\b,\u0010\bR\u001D\u00100\u001A\b\u0012\u0004\u0012\u00020*0\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010\u0006\u001A\u0004\b/\u0010\bR&\u00105\u001A\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b1\u0010\u0006\u0012\u0004\b3\u00104\u001A\u0004\b2\u0010\bR \u00109\u001A\b\u0012\u0004\u0012\u0002060\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b7\u0010\u0006\u001A\u0004\b8\u0010\bR \u0010=\u001A\b\u0012\u0004\u0012\u00020:0\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b;\u0010\u0006\u001A\u0004\b<\u0010\bR\u001D\u0010A\u001A\b\u0012\u0004\u0012\u00020>0\u00028\u0006\u00A2\u0006\f\n\u0004\b?\u0010\u0006\u001A\u0004\b@\u0010\bR\u001D\u0010E\u001A\b\u0012\u0004\u0012\u00020B0\u00028\u0006\u00A2\u0006\f\n\u0004\bC\u0010\u0006\u001A\u0004\bD\u0010\bR\u001D\u0010H\u001A\b\u0012\u0004\u0012\u00020B0\u00028\u0006\u00A2\u0006\f\n\u0004\bF\u0010\u0006\u001A\u0004\bG\u0010\bR\u001D\u0010K\u001A\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006\u00A2\u0006\f\n\u0004\bI\u0010\u0006\u001A\u0004\bJ\u0010\bR\u001D\u0010N\u001A\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006\u00A2\u0006\f\n\u0004\bL\u0010\u0006\u001A\u0004\bM\u0010\bR\u001D\u0010R\u001A\b\u0012\u0004\u0012\u00020O0\u00028\u0006\u00A2\u0006\f\n\u0004\bP\u0010\u0006\u001A\u0004\bQ\u0010\bR\u001D\u0010U\u001A\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006\u00A2\u0006\f\n\u0004\bS\u0010\u0006\u001A\u0004\bT\u0010\bR#\u0010Y\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\bW\u0010\u0006\u001A\u0004\bX\u0010\bR\u001D\u0010\\\u001A\b\u0012\u0004\u0012\u00020V0\u00028\u0006\u00A2\u0006\f\n\u0004\bZ\u0010\u0006\u001A\u0004\b[\u0010\bR\u001D\u0010_\u001A\b\u0012\u0004\u0012\u00020*0\u00028\u0006\u00A2\u0006\f\n\u0004\b]\u0010\u0006\u001A\u0004\b^\u0010\bR\u001D\u0010b\u001A\b\u0012\u0004\u0012\u00020V0\u00028\u0006\u00A2\u0006\f\n\u0004\b`\u0010\u0006\u001A\u0004\ba\u0010\bR\u001D\u0010f\u001A\b\u0012\u0004\u0012\u00020c0\u00028\u0006\u00A2\u0006\f\n\u0004\bd\u0010\u0006\u001A\u0004\be\u0010\bR\u001D\u0010j\u001A\b\u0012\u0004\u0012\u00020g0\u00028\u0006\u00A2\u0006\f\n\u0004\bh\u0010\u0006\u001A\u0004\bi\u0010\bR\u001D\u0010m\u001A\b\u0012\u0004\u0012\u00020*0\u00028\u0006\u00A2\u0006\f\n\u0004\bk\u0010\u0006\u001A\u0004\bl\u0010\bR\u001D\u0010q\u001A\b\u0012\u0004\u0012\u00020n0\u00028\u0006\u00A2\u0006\f\n\u0004\bo\u0010\u0006\u001A\u0004\bp\u0010\bR\u001D\u0010t\u001A\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006\u00A2\u0006\f\n\u0004\br\u0010\u0006\u001A\u0004\bs\u0010\bR\u001D\u0010w\u001A\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006\u00A2\u0006\f\n\u0004\bu\u0010\u0006\u001A\u0004\bv\u0010\bR)\u0010|\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020y0x0\u00028\u0006\u00A2\u0006\f\n\u0004\bz\u0010\u0006\u001A\u0004\b{\u0010\bR\u001D\u0010\u007F\u001A\b\u0012\u0004\u0012\u00020*0\u00028\u0006\u00A2\u0006\f\n\u0004\b}\u0010\u0006\u001A\u0004\b~\u0010\bR \u0010\u0082\u0001\u001A\b\u0012\u0004\u0012\u00020y0\u00028\u0006\u00A2\u0006\u000E\n\u0005\b\u0080\u0001\u0010\u0006\u001A\u0005\b\u0081\u0001\u0010\bR#\u0010\u0085\u0001\u001A\b\u0012\u0004\u0012\u00020*0\u00028FX\u0087\u0004\u00A2\u0006\u000E\u0012\u0005\b\u0084\u0001\u00104\u001A\u0005\b\u0083\u0001\u0010\b\u00A8\u0006\u0086\u0001"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "a", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getContentDescription", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", "b", "getStateDescription", "StateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "c", "getProgressBarRangeInfo", "ProgressBarRangeInfo", "d", "getPaneTitle", "PaneTitle", "", "e", "getSelectableGroup", "SelectableGroup", "Landroidx/compose/ui/semantics/CollectionInfo;", "f", "getCollectionInfo", "CollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "g", "getCollectionItemInfo", "CollectionItemInfo", "h", "getHeading", "Heading", "i", "getDisabled", "Disabled", "Landroidx/compose/ui/semantics/LiveRegionMode;", "j", "getLiveRegion", "LiveRegion", "", "k", "getFocused", "Focused", "l", "getIsTraversalGroup", "IsTraversalGroup", "m", "getInvisibleToUser", "getInvisibleToUser$annotations", "()V", "InvisibleToUser", "Landroidx/compose/ui/autofill/ContentType;", "n", "getContentType$ui_release", "ContentType", "Landroidx/compose/ui/autofill/ContentDataType;", "o", "getContentDataType$ui_release", "ContentDataType", "", "p", "getTraversalIndex", "TraversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "q", "getHorizontalScrollAxisRange", "HorizontalScrollAxisRange", "r", "getVerticalScrollAxisRange", "VerticalScrollAxisRange", "s", "getIsPopup", "IsPopup", "t", "getIsDialog", "IsDialog", "Landroidx/compose/ui/semantics/Role;", "u", "getRole", "Role", "v", "getTestTag", "TestTag", "Landroidx/compose/ui/text/AnnotatedString;", "w", "getText", "Text", "x", "getTextSubstitution", "TextSubstitution", "y", "getIsShowingTextSubstitution", "IsShowingTextSubstitution", "z", "getEditableText", "EditableText", "Landroidx/compose/ui/text/TextRange;", "A", "getTextSelectionRange", "TextSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "B", "getImeAction", "ImeAction", "C", "getSelected", "Selected", "Landroidx/compose/ui/state/ToggleableState;", "D", "getToggleableState", "ToggleableState", "E", "getPassword", "Password", "F", "getError", "Error", "Lkotlin/Function1;", "", "G", "getIndexForKey", "IndexForKey", "H", "getIsEditable", "IsEditable", "I", "getMaxTextLength", "MaxTextLength", "getIsContainer", "getIsContainer$annotations", "IsContainer", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SemanticsProperties {
    public static final int $stable;
    public static final SemanticsPropertyKey A;
    public static final SemanticsPropertyKey B;
    public static final SemanticsPropertyKey C;
    public static final SemanticsPropertyKey D;
    public static final SemanticsPropertyKey E;
    public static final SemanticsPropertyKey F;
    public static final SemanticsPropertyKey G;
    public static final SemanticsPropertyKey H;
    public static final SemanticsPropertyKey I;
    @NotNull
    public static final SemanticsProperties INSTANCE;
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
        SemanticsProperties.INSTANCE = new SemanticsProperties();  // 初始化器: Ljava/lang/Object;-><init>()V
        SemanticsProperties.a = SemanticsPropertiesKt.AccessibilityKey("ContentDescription", c.y);
        SemanticsProperties.b = SemanticsPropertiesKt.AccessibilityKey("StateDescription");
        SemanticsProperties.c = SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");
        SemanticsProperties.d = SemanticsPropertiesKt.AccessibilityKey("PaneTitle", c.D);
        SemanticsProperties.e = SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");
        SemanticsProperties.f = SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");
        SemanticsProperties.g = SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");
        SemanticsProperties.h = SemanticsPropertiesKt.AccessibilityKey("Heading");
        SemanticsProperties.i = SemanticsPropertiesKt.AccessibilityKey("Disabled");
        SemanticsProperties.j = SemanticsPropertiesKt.AccessibilityKey("LiveRegion");
        SemanticsProperties.k = SemanticsPropertiesKt.AccessibilityKey("Focused");
        SemanticsProperties.l = SemanticsPropertiesKt.AccessibilityKey("IsTraversalGroup");
        SemanticsProperties.m = new SemanticsPropertyKey("InvisibleToUser", c.A);
        SemanticsProperties.n = new SemanticsPropertyKey("ContentType", c.z);
        SemanticsProperties.o = new SemanticsPropertyKey("ContentDataType", c.x);
        SemanticsProperties.p = SemanticsPropertiesKt.AccessibilityKey("TraversalIndex", c.H);
        SemanticsProperties.q = SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");
        SemanticsProperties.r = SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");
        SemanticsProperties.s = SemanticsPropertiesKt.AccessibilityKey("IsPopup", c.C);
        SemanticsProperties.t = SemanticsPropertiesKt.AccessibilityKey("IsDialog", c.B);
        SemanticsProperties.u = SemanticsPropertiesKt.AccessibilityKey("Role", c.E);
        SemanticsProperties.v = new SemanticsPropertyKey("TestTag", false, c.F);
        SemanticsProperties.w = SemanticsPropertiesKt.AccessibilityKey("Text", c.G);
        SemanticsProperties.x = new SemanticsPropertyKey("TextSubstitution", null, 2, null);
        SemanticsProperties.y = new SemanticsPropertyKey("IsShowingTextSubstitution", null, 2, null);
        SemanticsProperties.z = SemanticsPropertiesKt.AccessibilityKey("EditableText");
        SemanticsProperties.A = SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");
        SemanticsProperties.B = SemanticsPropertiesKt.AccessibilityKey("ImeAction");
        SemanticsProperties.C = SemanticsPropertiesKt.AccessibilityKey("Selected");
        SemanticsProperties.D = SemanticsPropertiesKt.AccessibilityKey("ToggleableState");
        SemanticsProperties.E = SemanticsPropertiesKt.AccessibilityKey("Password");
        SemanticsProperties.F = SemanticsPropertiesKt.AccessibilityKey("Error");
        SemanticsProperties.G = new SemanticsPropertyKey("IndexForKey", null, 2, null);
        SemanticsProperties.H = new SemanticsPropertyKey("IsEditable", null, 2, null);
        SemanticsProperties.I = new SemanticsPropertyKey("MaxTextLength", null, 2, null);
        SemanticsProperties.$stable = 8;
    }

    @NotNull
    public final SemanticsPropertyKey getCollectionInfo() {
        return SemanticsProperties.f;
    }

    @NotNull
    public final SemanticsPropertyKey getCollectionItemInfo() {
        return SemanticsProperties.g;
    }

    @NotNull
    public final SemanticsPropertyKey getContentDataType$ui_release() {
        return SemanticsProperties.o;
    }

    @NotNull
    public final SemanticsPropertyKey getContentDescription() {
        return SemanticsProperties.a;
    }

    @NotNull
    public final SemanticsPropertyKey getContentType$ui_release() {
        return SemanticsProperties.n;
    }

    @NotNull
    public final SemanticsPropertyKey getDisabled() {
        return SemanticsProperties.i;
    }

    @NotNull
    public final SemanticsPropertyKey getEditableText() {
        return SemanticsProperties.z;
    }

    @NotNull
    public final SemanticsPropertyKey getError() {
        return SemanticsProperties.F;
    }

    @NotNull
    public final SemanticsPropertyKey getFocused() {
        return SemanticsProperties.k;
    }

    @NotNull
    public final SemanticsPropertyKey getHeading() {
        return SemanticsProperties.h;
    }

    @NotNull
    public final SemanticsPropertyKey getHorizontalScrollAxisRange() {
        return SemanticsProperties.q;
    }

    @NotNull
    public final SemanticsPropertyKey getImeAction() {
        return SemanticsProperties.B;
    }

    @NotNull
    public final SemanticsPropertyKey getIndexForKey() {
        return SemanticsProperties.G;
    }

    @NotNull
    public final SemanticsPropertyKey getInvisibleToUser() {
        return SemanticsProperties.m;
    }

    @ExperimentalComposeUiApi
    public static void getInvisibleToUser$annotations() {
    }

    @NotNull
    public final SemanticsPropertyKey getIsContainer() {
        return SemanticsProperties.l;
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "IsTraversalGroup", imports = {}))
    public static void getIsContainer$annotations() {
    }

    @NotNull
    public final SemanticsPropertyKey getIsDialog() {
        return SemanticsProperties.t;
    }

    @NotNull
    public final SemanticsPropertyKey getIsEditable() {
        return SemanticsProperties.H;
    }

    @NotNull
    public final SemanticsPropertyKey getIsPopup() {
        return SemanticsProperties.s;
    }

    @NotNull
    public final SemanticsPropertyKey getIsShowingTextSubstitution() {
        return SemanticsProperties.y;
    }

    @NotNull
    public final SemanticsPropertyKey getIsTraversalGroup() {
        return SemanticsProperties.l;
    }

    @NotNull
    public final SemanticsPropertyKey getLiveRegion() {
        return SemanticsProperties.j;
    }

    @NotNull
    public final SemanticsPropertyKey getMaxTextLength() {
        return SemanticsProperties.I;
    }

    @NotNull
    public final SemanticsPropertyKey getPaneTitle() {
        return SemanticsProperties.d;
    }

    @NotNull
    public final SemanticsPropertyKey getPassword() {
        return SemanticsProperties.E;
    }

    @NotNull
    public final SemanticsPropertyKey getProgressBarRangeInfo() {
        return SemanticsProperties.c;
    }

    @NotNull
    public final SemanticsPropertyKey getRole() {
        return SemanticsProperties.u;
    }

    @NotNull
    public final SemanticsPropertyKey getSelectableGroup() {
        return SemanticsProperties.e;
    }

    @NotNull
    public final SemanticsPropertyKey getSelected() {
        return SemanticsProperties.C;
    }

    @NotNull
    public final SemanticsPropertyKey getStateDescription() {
        return SemanticsProperties.b;
    }

    @NotNull
    public final SemanticsPropertyKey getTestTag() {
        return SemanticsProperties.v;
    }

    @NotNull
    public final SemanticsPropertyKey getText() {
        return SemanticsProperties.w;
    }

    @NotNull
    public final SemanticsPropertyKey getTextSelectionRange() {
        return SemanticsProperties.A;
    }

    @NotNull
    public final SemanticsPropertyKey getTextSubstitution() {
        return SemanticsProperties.x;
    }

    @NotNull
    public final SemanticsPropertyKey getToggleableState() {
        return SemanticsProperties.D;
    }

    @NotNull
    public final SemanticsPropertyKey getTraversalIndex() {
        return SemanticsProperties.p;
    }

    @NotNull
    public final SemanticsPropertyKey getVerticalScrollAxisRange() {
        return SemanticsProperties.r;
    }
}

