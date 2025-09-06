package kotlin.reflect.jvm.internal;

import d0.s;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001BB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BB!\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f¢\u0006\u0004\b\n\u0010\u000FJ\u001F\u0010\u0012\u001A\u00028\u00022\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J \u0010\u0016\u001A\u00028\u00022\u0006\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0013R&\u0010\u001A\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001C"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", "V", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "receiver1", "receiver2", "get", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "invoke", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "getter", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class KProperty2Impl extends KPropertyImpl implements KProperty2 {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001A\u00028\u00052\u0006\u0010\n\u001A\u00028\u00032\u0006\u0010\u000B\u001A\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty2Impl;)V", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "i", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty2Impl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Getter extends kotlin.reflect.jvm.internal.KPropertyImpl.Getter implements kotlin.reflect.KProperty2.Getter {
        public final KProperty2Impl i;

        public Getter(@NotNull KProperty2Impl kProperty2Impl0) {
            Intrinsics.checkNotNullParameter(kProperty2Impl0, "property");
            super();
            this.i = kProperty2Impl0;
        }

        @Override  // kotlin.reflect.KProperty$Accessor
        public KProperty getProperty() {
            return this.getProperty();
        }

        @NotNull
        public KProperty2Impl getProperty() {
            return this.i;
        }

        @Override  // kotlin.reflect.jvm.internal.KPropertyImpl$Accessor
        public KPropertyImpl getProperty() {
            return this.getProperty();
        }

        @Override  // kotlin.jvm.functions.Function2
        public Object invoke(Object object0, Object object1) {
            return this.getProperty().get(object0, object1);
        }
    }

    public final Lazy m;
    public final Lazy n;

    public KProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        super(kDeclarationContainerImpl0, s, s1, CallableReference.NO_RECEIVER);
        h0 h00 = new h0(this);
        this.m = c.lazy(LazyThreadSafetyMode.PUBLICATION, h00);
        s s2 = new s(this, 9);
        this.n = c.lazy(LazyThreadSafetyMode.PUBLICATION, s2);
    }

    public KProperty2Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull PropertyDescriptor propertyDescriptor0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        super(kDeclarationContainerImpl0, propertyDescriptor0);
        h0 h00 = new h0(this);
        this.m = c.lazy(LazyThreadSafetyMode.PUBLICATION, h00);
        s s0 = new s(this, 9);
        this.n = c.lazy(LazyThreadSafetyMode.PUBLICATION, s0);
    }

    @Override  // kotlin.reflect.KProperty2
    public Object get(Object object0, Object object1) {
        return this.getGetter().call(new Object[]{object0, object1});
    }

    @Override  // kotlin.reflect.KProperty2
    @Nullable
    public Object getDelegate(Object object0, Object object1) {
        return this.getDelegateImpl(((Member)this.n.getValue()), object0, object1);
    }

    @Override  // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty.Getter getGetter() {
        return this.getGetter();
    }

    @Override  // kotlin.reflect.KProperty2
    public kotlin.reflect.KProperty2.Getter getGetter() {
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

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.get(object0, object1);
    }
}

