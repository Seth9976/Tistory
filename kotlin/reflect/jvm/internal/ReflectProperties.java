package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ReflectProperties {
    public static class LazySoftVal extends Val implements Function0 {
        public final Function0 b;
        public volatile SoftReference c;

        public LazySoftVal(@Nullable Object object0, @NotNull Function0 function00) {
            if(function00 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter \'initializer\' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            }
            super();
            this.c = null;
            this.b = function00;
            if(object0 != null) {
                this.c = new SoftReference(this.escape(object0));
            }
        }

        @Override  // kotlin.reflect.jvm.internal.ReflectProperties$Val, kotlin.jvm.functions.Function0
        public Object invoke() {
            SoftReference softReference0 = this.c;
            if(softReference0 != null) {
                Object object0 = softReference0.get();
                if(object0 != null) {
                    return this.unescape(object0);
                }
            }
            Object object1 = this.b.invoke();
            this.c = new SoftReference(this.escape(object1));
            return object1;
        }
    }

    public static class LazyVal extends Val {
        public final Function0 b;
        public volatile Object c;

        public LazyVal(@NotNull Function0 function00) {
            if(function00 == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter \'initializer\' of kotlin/reflect/jvm/internal/ReflectProperties$LazyVal.<init> must not be null");
            }
            super();
            this.c = null;
            this.b = function00;
        }

        @Override  // kotlin.reflect.jvm.internal.ReflectProperties$Val
        public Object invoke() {
            Object object0 = this.c;
            if(object0 != null) {
                return this.unescape(object0);
            }
            Object object1 = this.b.invoke();
            this.c = this.escape(object1);
            return object1;
        }
    }

    public static abstract class Val {
        public static final n0 a;

        static {
            Val.a = new n0();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public Object escape(Object object0) {
            return object0 == null ? Val.a : object0;
        }

        public final Object getValue(Object object0, Object object1) {
            return this.invoke();
        }

        public abstract Object invoke();

        public Object unescape(Object object0) {
            return object0 == Val.a ? null : object0;
        }
    }

    public static void a(int v) {
        Object[] arr_object = {"initializer", "kotlin/reflect/jvm/internal/ReflectProperties", null};
        arr_object[2] = v == 1 || v == 2 ? "lazySoft" : "lazy";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @NotNull
    public static LazyVal lazy(@NotNull Function0 function00) {
        if(function00 != null) {
            return new LazyVal(function00);
        }
        ReflectProperties.a(0);
        throw null;
    }

    @NotNull
    public static LazySoftVal lazySoft(@Nullable Object object0, @NotNull Function0 function00) {
        if(function00 != null) {
            return new LazySoftVal(object0, function00);
        }
        ReflectProperties.a(1);
        throw null;
    }

    @NotNull
    public static LazySoftVal lazySoft(@NotNull Function0 function00) {
        if(function00 != null) {
            return ReflectProperties.lazySoft(null, function00);
        }
        ReflectProperties.a(2);
        throw null;
    }
}

