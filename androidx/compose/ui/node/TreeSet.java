package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\u001A\u0010\u0003\u001A\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/TreeSet;", "E", "Ljava/util/TreeSet;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Comparator;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TreeSet extends java.util.TreeSet {
    public static final int $stable;

    public TreeSet(@NotNull Comparator comparator0) {
        super(comparator0);
    }

    public int getSize() {
        return super.size();
    }

    @Override
    public final int size() {
        return this.getSize();
    }
}

