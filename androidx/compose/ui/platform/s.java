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

public abstract class s {
    @DoNotInline
    @JvmStatic
    public static final void a(@NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, @NotNull SemanticsNode semanticsNode0) {
        if(AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$enabled(semanticsNode0)) {
            AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress());
            if(accessibilityAction0 != null) {
                accessibilityNodeInfoCompat0.addAction(new AccessibilityActionCompat(0x102003D, accessibilityAction0.getLabel()));
            }
        }
    }
}

