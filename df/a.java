package df;

import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;

public final class a extends Lambda implements Function0 {
    public final int w;
    public final StaticScopeForKotlinEnum x;

    public a(StaticScopeForKotlinEnum staticScopeForKotlinEnum0, int v) {
        this.w = v;
        this.x = staticScopeForKotlinEnum0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w == 0 ? CollectionsKt__CollectionsKt.listOf(new SimpleFunctionDescriptor[]{DescriptorFactory.createEnumValueOfMethod(StaticScopeForKotlinEnum.access$getContainingClass$p(this.x)), DescriptorFactory.createEnumValuesMethod(StaticScopeForKotlinEnum.access$getContainingClass$p(this.x))}) : CollectionsKt__CollectionsKt.listOfNotNull(DescriptorFactory.createEnumEntriesProperty(StaticScopeForKotlinEnum.access$getContainingClass$p(this.x)));
    }
}

