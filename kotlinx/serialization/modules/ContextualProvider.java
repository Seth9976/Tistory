package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bJ&\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u00032\u0010\u0010\u0004\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000B"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider;", "", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Argless", "WithTypeArguments", "Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ContextualProvider {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0007\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001B\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider;", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "typeArgumentsSerializers", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lkotlinx/serialization/KSerializer;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Argless extends ContextualProvider {
        public final KSerializer a;

        public Argless(@NotNull KSerializer kSerializer0) {
            Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
            super(null);
            this.a = kSerializer0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Argless && Intrinsics.areEqual(((Argless)object0).a, this.a);
        }

        @NotNull
        public final KSerializer getSerializer() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override  // kotlinx.serialization.modules.ContextualProvider
        @NotNull
        public KSerializer invoke(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "typeArgumentsSerializers");
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B8\u0012/\u0010\b\u001A+\u0012\u001D\u0012\u001B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\u0007\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fR@\u0010\b\u001A+\u0012\u001D\u0012\u001B\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "Lkotlinx/serialization/modules/ContextualProvider;", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "a", "Lkotlin/jvm/functions/Function1;", "getProvider", "()Lkotlin/jvm/functions/Function1;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class WithTypeArguments extends ContextualProvider {
        public final Function1 a;

        public WithTypeArguments(@NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "provider");
            super(null);
            this.a = function10;
        }

        @NotNull
        public final Function1 getProvider() {
            return this.a;
        }

        @Override  // kotlinx.serialization.modules.ContextualProvider
        @NotNull
        public KSerializer invoke(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "typeArgumentsSerializers");
            return (KSerializer)this.a.invoke(list0);
        }
    }

    public ContextualProvider(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract KSerializer invoke(@NotNull List arg1);
}

