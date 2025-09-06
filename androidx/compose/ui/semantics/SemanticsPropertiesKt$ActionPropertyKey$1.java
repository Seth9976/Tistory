package androidx.compose.ui.semantics;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\u0010\u0000\u001A\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u00032\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/ui/semantics/AccessibilityAction;", "T", "Lkotlin/Function;", "", "parentValue", "childValue", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1\n*L\n1#1,1617:1\n*E\n"})
public final class SemanticsPropertiesKt.ActionPropertyKey.1 extends Lambda implements Function2 {
    public static final SemanticsPropertiesKt.ActionPropertyKey.1 INSTANCE;

    static {
        SemanticsPropertiesKt.ActionPropertyKey.1.INSTANCE = new SemanticsPropertiesKt.ActionPropertyKey.1();
    }

    public SemanticsPropertiesKt.ActionPropertyKey.1() {
        super(2);
    }

    @Nullable
    public final AccessibilityAction invoke(@Nullable AccessibilityAction accessibilityAction0, @NotNull AccessibilityAction accessibilityAction1) {
        String s;
        if(accessibilityAction0 == null) {
            s = accessibilityAction1.getLabel();
        }
        else {
            s = accessibilityAction0.getLabel();
            if(s == null) {
                s = accessibilityAction1.getLabel();
            }
        }
        if(accessibilityAction0 != null) {
            Function function0 = accessibilityAction0.getAction();
            return function0 == null ? new AccessibilityAction(s, accessibilityAction1.getAction()) : new AccessibilityAction(s, function0);
        }
        return new AccessibilityAction(s, accessibilityAction1.getAction());
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((AccessibilityAction)object0), ((AccessibilityAction)object1));
    }
}

