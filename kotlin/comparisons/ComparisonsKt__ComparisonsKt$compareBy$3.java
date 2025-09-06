package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000E\u0010\u0004\u001A\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0006\u001A\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
public final class ComparisonsKt__ComparisonsKt.compareBy.3 implements Comparator {
    public final Comparator a;
    public final Function1 b;

    public ComparisonsKt__ComparisonsKt.compareBy.3(Comparator comparator0, Function1 function10) {
        this.a = comparator0;
        this.b = function10;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        Object object2 = this.b.invoke(object0);
        Object object3 = this.b.invoke(object1);
        return this.a.compare(object2, object3);
    }
}

