package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001AB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BB!\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f¢\u0006\u0004\b\n\u0010\u000FJ\'\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u00012\u0006\u0010\u0012\u001A\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001B"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "Lkotlin/reflect/KMutableProperty2;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "value", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "setter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KMutableProperty2Impl extends KProperty2Impl implements KMutableProperty2 {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00028\u00032\u0006\u0010\u000B\u001A\u00028\u00042\u0006\u0010\f\u001A\u00028\u0005H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FR,\u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty2$Setter;", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;)V", "receiver1", "receiver2", "value", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "i", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Setter extends kotlin.reflect.jvm.internal.KPropertyImpl.Setter implements kotlin.reflect.KMutableProperty2.Setter {
        public final KMutableProperty2Impl i;

        public Setter(@NotNull KMutableProperty2Impl kMutableProperty2Impl0) {
            Intrinsics.checkNotNullParameter(kMutableProperty2Impl0, "property");
            super();
            this.i = kMutableProperty2Impl0;
        }

        @Override  // kotlin.reflect.KProperty$Accessor
        public KProperty getProperty() {
            return this.getProperty();
        }

        @NotNull
        public KMutableProperty2Impl getProperty() {
            return this.i;
        }

        @Override  // kotlin.reflect.jvm.internal.KPropertyImpl$Accessor
        public KPropertyImpl getProperty() {
            return this.getProperty();
        }

        @Override  // kotlin.jvm.functions.Function3
        public Object invoke(Object object0, Object object1, Object object2) {
            this.invoke(object0, object1, object2);
            return Unit.INSTANCE;
        }

        public void invoke(Object object0, Object object1, Object object2) {
            this.getProperty().set(object0, object1, object2);
        }
    }

    public final Lazy o;

    public KMutableProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        super(kDeclarationContainerImpl0, s, s1);
        c0 c00 = new c0(this);
        this.o = c.lazy(LazyThreadSafetyMode.PUBLICATION, c00);
    }

    public KMutableProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull PropertyDescriptor propertyDescriptor0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        super(kDeclarationContainerImpl0, propertyDescriptor0);
        c0 c00 = new c0(this);
        this.o = c.lazy(LazyThreadSafetyMode.PUBLICATION, c00);
    }

    @Override  // kotlin.reflect.KMutableProperty
    public kotlin.reflect.KMutableProperty.Setter getSetter() {
        return this.getSetter();
    }

    @Override  // kotlin.reflect.KMutableProperty2
    public kotlin.reflect.KMutableProperty2.Setter getSetter() {
        return this.getSetter();
    }

    @NotNull
    public Setter getSetter() {
        return (Setter)this.o.getValue();
    }

    @Override  // kotlin.reflect.KMutableProperty2
    public void set(Object object0, Object object1, Object object2) {
        this.getSetter().call(new Object[]{object0, object1, object2});
    }
}

