package androidx.work;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001A\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Landroidx/work/InputMerger;", "()V", "merge", "Landroidx/work/Data;", "inputs", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OverwritingInputMerger extends InputMerger {
    @Override  // androidx.work.InputMerger
    @NotNull
    public Data merge(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "inputs");
        Builder data$Builder0 = new Builder();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: list0) {
            Map map0 = ((Data)object0).getKeyValueMap();
            Intrinsics.checkNotNullExpressionValue(map0, "input.keyValueMap");
            linkedHashMap0.putAll(map0);
        }
        data$Builder0.putAll(linkedHashMap0);
        Data data0 = data$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(data0, "output.build()");
        return data0;
    }
}

