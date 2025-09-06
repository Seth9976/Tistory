package androidx.compose.ui.tooling;

import java.util.Set;
import kotlin.Metadata;
import o2.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/tooling/CompositionDataRecord;", "", "store", "", "Landroidx/compose/runtime/tooling/CompositionData;", "getStore", "()Ljava/util/Set;", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface CompositionDataRecord {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/CompositionDataRecord$Companion;", "", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "create", "()Landroidx/compose/ui/tooling/CompositionDataRecord;", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final CompositionDataRecord create() {
            return new d();
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        CompositionDataRecord.Companion = Companion.a;
    }

    @NotNull
    Set getStore();
}

