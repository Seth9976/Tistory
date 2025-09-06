package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001A\u0006\u0010\u0000\u001A\u00020\u0001\u001A%\u0010\u0002\u001A\u00020\u00012\u0017\u0010\u0003\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001A,\u0010\b\u001A\u00020\u0001\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\t0\f2\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\t0\u000E\u001A#\u0010\b\u001A\u00020\u0001\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\t0\u000EH\u0086\b\u001A\'\u0010\u000F\u001A\u00020\u0006\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n*\u00020\u00052\f\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\t0\u000EH\u0086\b\u001A[\u0010\u0010\u001A\u00020\u0006\"\b\b\u0000\u0010\u0011*\u00020\n*\u00020\u00052\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u00110\f2\u0010\b\u0002\u0010\u0013\u001A\n\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u000E2\u001F\b\u0002\u0010\u0003\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"EmptySerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "SerializersModule", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "", "Lkotlin/ExtensionFunctionType;", "serializersModuleOf", "T", "", "kClass", "Lkotlin/reflect/KClass;", "serializer", "Lkotlinx/serialization/KSerializer;", "contextual", "polymorphic", "Base", "baseClass", "baseSerializer", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,270:1\n31#1,3:271\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n15#1:271,3\n*E\n"})
public final class SerializersModuleBuildersKt {
    @NotNull
    public static final SerializersModule EmptySerializersModule() {
        return SerializersModuleKt.getEmptySerializersModule();
    }

    @NotNull
    public static final SerializersModule SerializersModule(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        SerializersModuleBuilder serializersModuleBuilder0 = new SerializersModuleBuilder();
        function10.invoke(serializersModuleBuilder0);
        return serializersModuleBuilder0.build();
    }

    public static final void contextual(SerializersModuleBuilder serializersModuleBuilder0, KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(serializersModuleBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        Intrinsics.reifiedOperationMarker(4, "T");
        serializersModuleBuilder0.contextual(Reflection.getOrCreateKotlinClass(Object.class), kSerializer0);
    }

    public static final void polymorphic(@NotNull SerializersModuleBuilder serializersModuleBuilder0, @NotNull KClass kClass0, @Nullable KSerializer kSerializer0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(serializersModuleBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        PolymorphicModuleBuilder polymorphicModuleBuilder0 = new PolymorphicModuleBuilder(kClass0, kSerializer0);
        function10.invoke(polymorphicModuleBuilder0);
        polymorphicModuleBuilder0.buildTo(serializersModuleBuilder0);
    }

    public static void polymorphic$default(SerializersModuleBuilder serializersModuleBuilder0, KClass kClass0, KSerializer kSerializer0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            kSerializer0 = null;
        }
        if((v & 4) != 0) {
            function10 = kotlinx.serialization.modules.SerializersModuleBuildersKt.polymorphic.1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(serializersModuleBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        PolymorphicModuleBuilder polymorphicModuleBuilder0 = new PolymorphicModuleBuilder(kClass0, kSerializer0);
        function10.invoke(polymorphicModuleBuilder0);
        polymorphicModuleBuilder0.buildTo(serializersModuleBuilder0);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Base", "", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt$polymorphic$1\n*L\n1#1,270:1\n*E\n"})
        public final class kotlinx.serialization.modules.SerializersModuleBuildersKt.polymorphic.1 extends Lambda implements Function1 {
            public static final kotlinx.serialization.modules.SerializersModuleBuildersKt.polymorphic.1 INSTANCE;

            static {
                kotlinx.serialization.modules.SerializersModuleBuildersKt.polymorphic.1.INSTANCE = new kotlinx.serialization.modules.SerializersModuleBuildersKt.polymorphic.1();
            }

            public kotlinx.serialization.modules.SerializersModuleBuildersKt.polymorphic.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((PolymorphicModuleBuilder)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PolymorphicModuleBuilder polymorphicModuleBuilder0) {
                Intrinsics.checkNotNullParameter(polymorphicModuleBuilder0, "$this$null");
            }
        }

    }

    @NotNull
    public static final SerializersModule serializersModuleOf(@NotNull KClass kClass0, @NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        SerializersModuleBuilder serializersModuleBuilder0 = new SerializersModuleBuilder();
        serializersModuleBuilder0.contextual(kClass0, kSerializer0);
        return serializersModuleBuilder0.build();
    }

    public static final SerializersModule serializersModuleOf(KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        Intrinsics.reifiedOperationMarker(4, "T");
        return SerializersModuleBuildersKt.serializersModuleOf(Reflection.getOrCreateKotlinClass(Object.class), kSerializer0);
    }
}

