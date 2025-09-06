package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000H&¢\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\u000E\u001A\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H¦\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001B\u001A\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0013\u0010\u001E\u001A\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010#\u001A\b\u0012\u0004\u0012\u00020 0\u001F8F¢\u0006\u0006\u001A\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "N", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectableValue;", "<init>", "()V", "create", "()Landroidx/compose/ui/Modifier$Node;", "node", "", "update", "(Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "inspectableElements", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public abstract class ModifierNodeElement implements Element, InspectableValue {
    public static final int $stable;
    public InspectorInfo a;

    public final InspectorInfo a() {
        InspectorInfo inspectorInfo0 = this.a;
        if(inspectorInfo0 == null) {
            inspectorInfo0 = new InspectorInfo();
            inspectorInfo0.setName(Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName());
            this.inspectableProperties(inspectorInfo0);
            this.a = inspectorInfo0;
        }
        return inspectorInfo0;
    }

    @NotNull
    public abstract Node create();

    @Override
    public abstract boolean equals(@Nullable Object arg1);

    @Override  // androidx.compose.ui.platform.InspectableValue
    @NotNull
    public final Sequence getInspectableElements() {
        return this.a().getProperties();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public final String getNameFallback() {
        return this.a().getName();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @Nullable
    public final Object getValueOverride() {
        return this.a().getValue();
    }

    @Override
    public abstract int hashCode();

    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        Actual_jvmKt.tryPopulateReflectively(inspectorInfo0, this);
    }

    public abstract void update(@NotNull Node arg1);
}

