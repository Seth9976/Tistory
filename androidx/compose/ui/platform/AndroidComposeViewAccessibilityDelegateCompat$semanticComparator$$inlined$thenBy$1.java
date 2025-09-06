package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000E\u0010\u0004\u001A\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0006\u001A\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n550#2:329\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat.semanticComparator..inlined.thenBy.1 implements Comparator {
    public final Comparator a;
    public final Comparator b;

    public AndroidComposeViewAccessibilityDelegateCompat.semanticComparator..inlined.thenBy.1(Comparator comparator0, Comparator comparator1) {
        this.a = comparator0;
        this.b = comparator1;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = this.a.compare(object0, object1);
        return v == 0 ? this.b.compare(((SemanticsNode)object0).getLayoutNode$ui_release(), ((SemanticsNode)object1).getLayoutNode$ui_release()) : v;
    }
}

