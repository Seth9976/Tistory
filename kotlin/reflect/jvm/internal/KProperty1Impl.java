package kotlin.reflect.jvm.internal;

import d0.s;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001AB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0012\u001A\u00028\u00012\u0006\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001A\u00028\u00012\u0006\u0010\u0011\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0013R \u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001B"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "V", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "getter", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class KProperty1Impl extends KPropertyImpl implements KProperty1 {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001B\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001A\u00028\u00032\u0006\u0010\t\u001A\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BR&\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "T", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Getter extends kotlin.reflect.jvm.internal.KPropertyImpl.Getter implements kotlin.reflect.KProperty1.Getter {
        public final KProperty1Impl i;

        public Getter(@NotNull KProperty1Impl kProperty1Impl0) {
            Intrinsics.checkNotNullParameter(kProperty1Impl0, "property");
            super();
            this.i = kProperty1Impl0;
        }

        @Override  // kotlin.reflect.KProperty$Accessor
        public KProperty getProperty() {
            return this.getProperty();
        }

        @NotNull
        public KProperty1Impl getProperty() {
            return this.i;
        }

        @Override  // kotlin.reflect.jvm.internal.KPropertyImpl$Accessor
        public KPropertyImpl getProperty() {
            return this.getProperty();
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            return this.getProperty().get(object0);
        }
    }

    public final Lazy m;
    public final Lazy n;

    public KProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull String s, @NotNull String s1, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        super(kDeclarationContainerImpl0, s, s1, object0);
        g0 g00 = new g0(this);
        this.m = c.lazy(LazyThreadSafetyMode.PUBLICATION, g00);
        s s2 = new s(this, 8);
        this.n = c.lazy(LazyThreadSafetyMode.PUBLICATION, s2);
    }

    public KProperty1Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull PropertyDescriptor propertyDescriptor0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        super(kDeclarationContainerImpl0, propertyDescriptor0);
        g0 g00 = new g0(this);
        this.m = c.lazy(LazyThreadSafetyMode.PUBLICATION, g00);
        s s0 = new s(this, 8);
        this.n = c.lazy(LazyThreadSafetyMode.PUBLICATION, s0);
    }

    @Override  // kotlin.reflect.KProperty1
    public Object get(Object object0) {
        return this.getGetter().call(new Object[]{object0});
    }

    @Override  // kotlin.reflect.KProperty1
    @Nullable
    public Object getDelegate(Object object0) {
        return this.getDelegateImpl(((Member)this.n.getValue()), object0, null);
    }

    @Override  // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty.Getter getGetter() {
        return this.getGetter();
    }

    @Override  // kotlin.reflect.KProperty1
    public kotlin.reflect.KProperty1.Getter getGetter() {
        return this.getGetter();
    }

    @NotNull
    public Getter getGetter() {
        return (Getter)this.m.getValue();
    }

    @Override  // kotlin.reflect.jvm.internal.KPropertyImpl
    public kotlin.reflect.jvm.internal.KPropertyImpl.Getter getGetter() {
        return this.getGetter();
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.get(object0);
    }
}

