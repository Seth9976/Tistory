package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A*\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\n¢\u0006\u0002\u0010\u0004\u001A*\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0006\u001A*\u0010\u0007\u001A\u0002H\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\n¢\u0006\u0002\u0010\u0004\u001A*\u0010\u0007\u001A\u0002H\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0006\u001A1\u0010\b\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b\u001A1\u0010\n\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b\u001A1\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001A1\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\t\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086\b¨\u0006\f"}, d2 = {"component1", "F", "S", "Landroid/util/Pair;", "(Landroid/util/Pair;)Ljava/lang/Object;", "Landroidx/core/util/Pair;", "(Landroidx/core/util/Pair;)Ljava/lang/Object;", "component2", "toAndroidPair", "Lkotlin/Pair;", "toAndroidXPair", "toKotlinPair", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final Object component1(@NotNull Pair pair0) {
        return pair0.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final Object component1(@NotNull androidx.core.util.Pair pair0) {
        return pair0.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final Object component2(@NotNull Pair pair0) {
        return pair0.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final Object component2(@NotNull androidx.core.util.Pair pair0) {
        return pair0.second;
    }

    @NotNull
    public static final Pair toAndroidPair(@NotNull kotlin.Pair pair0) {
        return new Pair(pair0.getFirst(), pair0.getSecond());
    }

    @NotNull
    public static final androidx.core.util.Pair toAndroidXPair(@NotNull kotlin.Pair pair0) {
        return new androidx.core.util.Pair(pair0.getFirst(), pair0.getSecond());
    }

    @NotNull
    public static final kotlin.Pair toKotlinPair(@NotNull Pair pair0) {
        return new kotlin.Pair(pair0.first, pair0.second);
    }

    @NotNull
    public static final kotlin.Pair toKotlinPair(@NotNull androidx.core.util.Pair pair0) {
        return new kotlin.Pair(pair0.first, pair0.second);
    }
}

