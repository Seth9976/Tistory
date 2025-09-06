package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u000E\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000E\u0012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00010\u000E\u0012\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/tooling/data/CallGroup;", "Landroidx/compose/ui/tooling/data/Group;", "", "key", "", "name", "Landroidx/compose/ui/unit/IntRect;", "box", "Landroidx/compose/ui/tooling/data/SourceLocation;", "location", "identity", "", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "parameters", "", "data", "children", "", "isInline", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/lang/Object;Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Z)V", "i", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CallGroup extends Group {
    public static final int $stable = 8;
    public final List i;

    public CallGroup(@Nullable Object object0, @Nullable String s, @NotNull IntRect intRect0, @Nullable SourceLocation sourceLocation0, @Nullable Object object1, @NotNull List list0, @NotNull Collection collection0, @NotNull Collection collection1, boolean z) {
        super(object0, s, sourceLocation0, object1, intRect0, collection0, collection1, z, null);
        this.i = list0;
    }

    @Override  // androidx.compose.ui.tooling.data.Group
    @NotNull
    public List getParameters() {
        return this.i;
    }
}

