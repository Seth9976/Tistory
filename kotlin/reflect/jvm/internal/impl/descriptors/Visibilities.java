package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Visibilities {
    public static final class Inherited extends Visibility {
        @NotNull
        public static final Inherited INSTANCE;

        static {
            Inherited.INSTANCE = new Inherited("inherited", false);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }
    }

    public static final class Internal extends Visibility {
        @NotNull
        public static final Internal INSTANCE;

        static {
            Internal.INSTANCE = new Internal("internal", false);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }
    }

    public static final class InvisibleFake extends Visibility {
        @NotNull
        public static final InvisibleFake INSTANCE;

        static {
            InvisibleFake.INSTANCE = new InvisibleFake("invisible_fake", false);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }
    }

    public static final class Local extends Visibility {
        @NotNull
        public static final Local INSTANCE;

        static {
            Local.INSTANCE = new Local("local", false);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }
    }

    public static final class Private extends Visibility {
        @NotNull
        public static final Private INSTANCE;

        static {
            Private.INSTANCE = new Private("private", false);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }
    }

    public static final class PrivateToThis extends Visibility {
        @NotNull
        public static final PrivateToThis INSTANCE;

        static {
            PrivateToThis.INSTANCE = new PrivateToThis("private_to_this", false);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    public static final class Protected extends Visibility {
        @NotNull
        public static final Protected INSTANCE;

        static {
            Protected.INSTANCE = new Protected("protected", true);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }
    }

    public static final class Public extends Visibility {
        @NotNull
        public static final Public INSTANCE;

        static {
            Public.INSTANCE = new Public("public", true);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }
    }

    public static final class Unknown extends Visibility {
        @NotNull
        public static final Unknown INSTANCE;

        static {
            Unknown.INSTANCE = new Unknown("unknown", false);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;-><init>(Ljava/lang/String;Z)V
        }
    }

    @NotNull
    public static final Visibilities INSTANCE;
    public static final Map a;

    static {
        Visibilities.INSTANCE = new Visibilities();  // 初始化器: Ljava/lang/Object;-><init>()V
        Map map0 = w.createMapBuilder();
        map0.put(PrivateToThis.INSTANCE, 0);
        map0.put(Private.INSTANCE, 0);
        map0.put(Internal.INSTANCE, 1);
        map0.put(Protected.INSTANCE, 1);
        map0.put(Public.INSTANCE, 2);
        Visibilities.a = w.build(map0);
    }

    @Nullable
    public final Integer compareLocal$compiler_common(@NotNull Visibility visibility0, @NotNull Visibility visibility1) {
        Intrinsics.checkNotNullParameter(visibility0, "first");
        Intrinsics.checkNotNullParameter(visibility1, "second");
        if(visibility0 == visibility1) {
            return 0;
        }
        Integer integer0 = (Integer)Visibilities.a.get(visibility0);
        Integer integer1 = (Integer)Visibilities.a.get(visibility1);
        return integer0 == null || integer1 == null || Intrinsics.areEqual(integer0, integer1) ? null : ((int)(((int)integer0) - ((int)integer1)));
    }

    public final boolean isPrivate(@NotNull Visibility visibility0) {
        Intrinsics.checkNotNullParameter(visibility0, "visibility");
        return visibility0 == Private.INSTANCE || visibility0 == PrivateToThis.INSTANCE;
    }
}

