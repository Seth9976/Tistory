package androidx.compose.ui.platform;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.contentcapture.ContentCaptureManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map.Entry;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000B\n\u0002\b\t\"*\u0010\b\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00008G@GX\u0087\u000E¢\u0006\u0012\u0012\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"", "value", "getDisableContentCapture", "()Z", "setDisableContentCapture", "(Z)V", "getDisableContentCapture$annotations", "()V", "DisableContentCapture", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    public static final boolean access$accessibilityEquals(AccessibilityAction accessibilityAction0, Object object0) {
        if(accessibilityAction0 != object0) {
            return object0 instanceof AccessibilityAction ? Intrinsics.areEqual(accessibilityAction0.getLabel(), ((AccessibilityAction)object0).getLabel()) && (accessibilityAction0.getAction() != null || ((AccessibilityAction)object0).getAction() == null) && (accessibilityAction0.getAction() == null || ((AccessibilityAction)object0).getAction() != null) : false;
        }
        return true;
    }

    public static final boolean access$enabled(SemanticsNode semanticsNode0) {
        return !semanticsNode0.getConfig().contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    public static final boolean access$excludeLineAndPageGranularities(SemanticsNode semanticsNode0) {
        SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
        if(!semanticsNode0.getUnmergedConfig$ui_release().contains(semanticsProperties0.getEditableText()) || Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getFocused()), Boolean.TRUE)) {
            LayoutNode layoutNode0;
            for(layoutNode0 = semanticsNode0.getLayoutNode$ui_release().getParent$ui_release(); true; layoutNode0 = layoutNode0.getParent$ui_release()) {
                if(layoutNode0 == null) {
                    layoutNode0 = null;
                    break;
                }
                if(((Boolean)f.D.invoke(layoutNode0)).booleanValue()) {
                    break;
                }
            }
            if(layoutNode0 != null) {
                SemanticsConfiguration semanticsConfiguration0 = layoutNode0.getCollapsedSemantics$ui_release();
                return !(semanticsConfiguration0 == null ? false : Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, semanticsProperties0.getFocused()), Boolean.TRUE));
            }
            return false;
        }
        return true;
    }

    public static final LayoutNode access$findClosestParentNode(LayoutNode layoutNode0, Function1 function10) {
        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
        while(layoutNode1 != null) {
            if(!((Boolean)function10.invoke(layoutNode1)).booleanValue()) {
                layoutNode1 = layoutNode1.getParent$ui_release();
                continue;
            }
            return layoutNode1;
        }
        return null;
    }

    public static final boolean access$isRtl(SemanticsNode semanticsNode0) {
        return semanticsNode0.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    // 去混淆评级： 低(20)
    public static final boolean access$isVisible(SemanticsNode semanticsNode0) {
        return !semanticsNode0.isTransparent$ui_release() && !semanticsNode0.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser());
    }

    public static final boolean access$propertiesDeleted(SemanticsNode semanticsNode0, SemanticsConfiguration semanticsConfiguration0) {
        for(Object object0: semanticsConfiguration0) {
            if(!semanticsNode0.getConfig().contains(((SemanticsPropertyKey)((Map.Entry)object0).getKey()))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @ExperimentalComposeUiApi
    public static final boolean getDisableContentCapture() {
        return true;
    }

    @ExperimentalComposeUiApi
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use ContentCapture.isEnabled instead", replaceWith = @ReplaceWith(expression = "!ContentCaptureManager.isEnabled", imports = {"androidx.compose.ui.contentcapture.ContentCaptureManager.Companion.isEnabled"}))
    public static void getDisableContentCapture$annotations() {
    }

    @ExperimentalComposeUiApi
    public static final void setDisableContentCapture(boolean z) {
        ContentCaptureManager.Companion.setEnabled(z);
    }
}

