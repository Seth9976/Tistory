package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"*\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"canonicalName", "", "T", "", "Lkotlin/reflect/KClass;", "getCanonicalName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ViewModelProviders_jvmKt {
    @Nullable
    public static final String getCanonicalName(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        return kClass0.getQualifiedName();
    }
}

