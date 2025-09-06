package kotlin.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000B\u0010\fJ!\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "<init>", "()V", "", "cause", "exception", "", "addSuppressed", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "", "getSuppressed", "(Ljava/lang/Throwable;)Ljava/util/List;", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/MatchGroup;", "getMatchResultNamedGroup", "(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/MatchGroup;", "Lkotlin/random/Random;", "defaultPlatformRandom", "()Lkotlin/random/Random;", "td/a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public class PlatformImplementations {
    public void addSuppressed(@NotNull Throwable throwable0, @NotNull Throwable throwable1) {
        Intrinsics.checkNotNullParameter(throwable0, "cause");
        Intrinsics.checkNotNullParameter(throwable1, "exception");
        Method method0 = a.a;
        if(method0 != null) {
            method0.invoke(throwable0, throwable1);
        }
    }

    @NotNull
    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }

    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(matchResult0, "matchResult");
        Intrinsics.checkNotNullParameter(s, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @NotNull
    public List getSuppressed(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "exception");
        Method method0 = a.b;
        if(method0 != null) {
            Object object0 = method0.invoke(throwable0, null);
            if(object0 != null) {
                List list0 = ArraysKt___ArraysJvmKt.asList(((Throwable[])object0));
                return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}

