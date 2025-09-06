package kotlinx.serialization.internal;

import a5.b;
import androidx.room.a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001E\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0005H\u0001\u001A \u0010\u0000\u001A\u00020\u00012\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0005H\u0001¨\u0006\u0007"}, d2 = {"throwSubtypeNotRegistered", "", "subClassName", "", "baseClass", "Lkotlin/reflect/KClass;", "subClass", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class AbstractPolymorphicSerializerKt {
    @JvmName(name = "throwSubtypeNotRegistered")
    @NotNull
    public static final Void throwSubtypeNotRegistered(@Nullable String s, @NotNull KClass kClass0) {
        String s2;
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        String s1 = "in the polymorphic scope of \'" + kClass0.getSimpleName() + '\'';
        if(s == null) {
            s2 = "Class discriminator was missing and no default serializers were registered " + s1 + '.';
        }
        else {
            StringBuilder stringBuilder0 = b.w("Serializer for subclass \'", s, "\' is not found ", s1, ".\nCheck if class with serial name \'");
            a.w(stringBuilder0, s, "\' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class \'", s, "\' has to be \'@Serializable\', and the base class \'");
            stringBuilder0.append(kClass0.getSimpleName());
            stringBuilder0.append("\' has to be sealed and \'@Serializable\'.");
            s2 = stringBuilder0.toString();
        }
        throw new SerializationException(s2);
    }

    @JvmName(name = "throwSubtypeNotRegistered")
    @NotNull
    public static final Void throwSubtypeNotRegistered(@NotNull KClass kClass0, @NotNull KClass kClass1) {
        Intrinsics.checkNotNullParameter(kClass0, "subClass");
        Intrinsics.checkNotNullParameter(kClass1, "baseClass");
        String s = kClass0.getSimpleName();
        if(s == null) {
            s = String.valueOf(kClass0);
        }
        AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(s, kClass1);
        throw new KotlinNothingValueException();
    }
}

