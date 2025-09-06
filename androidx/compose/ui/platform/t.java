package androidx.compose.ui.platform;

import androidx.annotation.DoNotInline;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public abstract class t {
    @DoNotInline
    @JvmStatic
    public static final void a(@NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, @NotNull SemanticsNode semanticsNode0) {
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
            SemanticsActions semanticsActions0 = SemanticsActions.INSTANCE;
            AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPageUp());
            if(accessibilityAction0 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x1020046, accessibilityAction0.getLabel()));
            }
            AccessibilityAction accessibilityAction1 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPageDown());
            if(accessibilityAction1 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x1020047, accessibilityAction1.getLabel()));
            }
            AccessibilityAction accessibilityAction2 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPageLeft());
            if(accessibilityAction2 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x1020048, accessibilityAction2.getLabel()));
            }
            AccessibilityAction accessibilityAction3 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsActions0.getPageRight());
            if(accessibilityAction3 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x1020049, accessibilityAction3.getLabel()));
            }
        }
    }
}

