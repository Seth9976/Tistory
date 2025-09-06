package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001A\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0016\u0010\u0010\u001A\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/platform/InspectableValue;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "info", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "inspectableElements", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    public final Function1 a;
    public InspectorInfo b;

    public InspectorValueInfo(@NotNull Function1 function10) {
        this.a = function10;
    }

    public final InspectorInfo a() {
        InspectorInfo inspectorInfo0 = this.b;
        if(inspectorInfo0 == null) {
            inspectorInfo0 = new InspectorInfo();
            this.a.invoke(inspectorInfo0);
        }
        this.b = inspectorInfo0;
        return inspectorInfo0;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @NotNull
    public Sequence getInspectableElements() {
        return this.a().getProperties();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public String getNameFallback() {
        return this.a().getName();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public Object getValueOverride() {
        return this.a().getValue();
    }
}

