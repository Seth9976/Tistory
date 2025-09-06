package kotlin.reflect.jvm.internal;

import d0.s;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\n\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000FJ\u000F\u0010\u0010\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0011R\u001A\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "getter", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class KProperty0Impl extends KPropertyImpl implements KProperty0 {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty0Impl;)V", "invoke", "()Ljava/lang/Object;", "i", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty0Impl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Getter extends kotlin.reflect.jvm.internal.KPropertyImpl.Getter implements kotlin.reflect.KProperty0.Getter {
        public final KProperty0Impl i;

        public Getter(@NotNull KProperty0Impl kProperty0Impl0) {
            Intrinsics.checkNotNullParameter(kProperty0Impl0, "property");
            super();
            this.i = kProperty0Impl0;
        }

        @Override  // kotlin.reflect.KProperty$Accessor
        public KProperty getProperty() {
            return this.getProperty();
        }

        @NotNull
        public KProperty0Impl getProperty() {
            return this.i;
        }

        @Override  // kotlin.reflect.jvm.internal.KPropertyImpl$Accessor
        public KPropertyImpl getProperty() {
            return this.getProperty();
        }

        @Override  // kotlin.jvm.functions.Function0
        public Object invoke() {
            return this.getProperty().get();
        }
    }

    public final Lazy m;
    public final Lazy n;

    public KProperty0Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull String s, @NotNull String s1, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        super(kDeclarationContainerImpl0, s, s1, object0);
        f0 f00 = new f0(this);
        this.m = c.lazy(LazyThreadSafetyMode.PUBLICATION, f00);
        s s2 = new s(this, 7);
        this.n = c.lazy(LazyThreadSafetyMode.PUBLICATION, s2);
    }

    public KProperty0Impl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull PropertyDescriptor propertyDescriptor0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        super(kDeclarationContainerImpl0, propertyDescriptor0);
        f0 f00 = new f0(this);
        this.m = c.lazy(LazyThreadSafetyMode.PUBLICATION, f00);
        s s0 = new s(this, 7);
        this.n = c.lazy(LazyThreadSafetyMode.PUBLICATION, s0);
    }

    @Override  // kotlin.reflect.KProperty0
    public Object get() {
        return this.getGetter().call(new Object[0]);
    }

    @Override  // kotlin.reflect.KProperty0
    @Nullable
    public Object getDelegate() {
        return this.n.getValue();
    }

    @Override  // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty.Getter getGetter() {
        return this.getGetter();
    }

    @Override  // kotlin.reflect.KProperty0
    public kotlin.reflect.KProperty0.Getter getGetter() {
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

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.get();
    }
}

