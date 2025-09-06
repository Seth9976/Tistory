package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001AB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E¢\u0006\u0004\b\t\u0010\u0010J\u001F\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001B"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "T", "V", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "value", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "setter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KMutableProperty1Impl extends KProperty1Impl implements KMutableProperty1 {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001A\u00020\u000B2\u0006\u0010\t\u001A\u00028\u00022\u0006\u0010\n\u001A\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "T", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty1$Setter;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;)V", "receiver", "value", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)V", "i", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Setter extends kotlin.reflect.jvm.internal.KPropertyImpl.Setter implements kotlin.reflect.KMutableProperty1.Setter {
        public final KMutableProperty1Impl i;

        public Setter(@NotNull KMutableProperty1Impl kMutableProperty1Impl0) {
            Intrinsics.checkNotNullParameter(kMutableProperty1Impl0, "property");
            super();
            this.i = kMutableProperty1Impl0;
        }

        @Override  // kotlin.reflect.KProperty$Accessor
        public KProperty getProperty() {
            return this.getProperty();
        }

        @NotNull
        public KMutableProperty1Impl getProperty() {
            return this.i;
        }

        @Override  // kotlin.reflect.jvm.internal.KPropertyImpl$Accessor
        public KPropertyImpl getProperty() {
            return this.getProperty();
        }

        @Override  // kotlin.jvm.functions.Function2
        public Object invoke(Object object0, Object object1) {
            this.invoke(object0, object1);
            return Unit.INSTANCE;
        }

        public void invoke(Object object0, Object object1) {
            this.getProperty().set(object0, object1);
        }
    }

    public final Lazy o;

    public KMutableProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull String s, @NotNull String s1, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        super(kDeclarationContainerImpl0, s, s1, object0);
        b0 b00 = new b0(this);
        this.o = c.lazy(LazyThreadSafetyMode.PUBLICATION, b00);
    }

    public KMutableProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull PropertyDescriptor propertyDescriptor0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        super(kDeclarationContainerImpl0, propertyDescriptor0);
        b0 b00 = new b0(this);
        this.o = c.lazy(LazyThreadSafetyMode.PUBLICATION, b00);
    }

    @Override  // kotlin.reflect.KMutableProperty
    public kotlin.reflect.KMutableProperty.Setter getSetter() {
        return this.getSetter();
    }

    @Override  // kotlin.reflect.KMutableProperty1
    public kotlin.reflect.KMutableProperty1.Setter getSetter() {
        return this.getSetter();
    }

    @NotNull
    public Setter getSetter() {
        return (Setter)this.o.getValue();
    }

    @Override  // kotlin.reflect.KMutableProperty1
    public void set(Object object0, Object object1) {
        this.getSetter().call(new Object[]{object0, object1});
    }
}

