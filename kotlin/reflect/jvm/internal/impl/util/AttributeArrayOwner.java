package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

public abstract class AttributeArrayOwner extends AbstractArrayMapOwner {
    public ArrayMap a;

    public AttributeArrayOwner() {
        Intrinsics.checkNotNull(EmptyArrayMap.INSTANCE, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(EmptyArrayMap.INSTANCE);
    }

    public AttributeArrayOwner(@NotNull ArrayMap arrayMap0) {
        Intrinsics.checkNotNullParameter(arrayMap0, "arrayMap");
        super();
        this.a = arrayMap0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    public final ArrayMap getArrayMap() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final void registerComponent(@NotNull KClass kClass0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(kClass0, "tClass");
        Intrinsics.checkNotNullParameter(object0, "value");
        int v = this.getTypeRegistry().getId(kClass0);
        switch(this.a.getSize()) {
            case 0: {
                this.a = new OneElementArrayMap(object0, v);
                return;
            }
            case 1: {
                ArrayMap arrayMap0 = this.a;
                Intrinsics.checkNotNull(arrayMap0, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                if(((OneElementArrayMap)arrayMap0).getIndex() == v) {
                    this.a = new OneElementArrayMap(object0, v);
                    return;
                }
                ArrayMapImpl arrayMapImpl0 = new ArrayMapImpl();
                this.a = arrayMapImpl0;
                arrayMapImpl0.set(((OneElementArrayMap)arrayMap0).getIndex(), ((OneElementArrayMap)arrayMap0).getValue());
            }
        }
        this.a.set(v, object0);
    }
}

