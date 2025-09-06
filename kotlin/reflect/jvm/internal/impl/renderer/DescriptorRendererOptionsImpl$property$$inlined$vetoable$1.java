package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n+ 2 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n1#1,70:1\n61#2,5:71\n*E\n"})
public final class DescriptorRendererOptionsImpl.property..inlined.vetoable.1 extends ObservableProperty {
    public final DescriptorRendererOptionsImpl b;

    public DescriptorRendererOptionsImpl.property..inlined.vetoable.1(Object object0, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl0) {
        this.b = descriptorRendererOptionsImpl0;
        super(object0);
    }

    @Override  // kotlin.properties.ObservableProperty
    public boolean beforeChange(@NotNull KProperty kProperty0, Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(kProperty0, "property");
        if(this.b.isLocked()) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}

