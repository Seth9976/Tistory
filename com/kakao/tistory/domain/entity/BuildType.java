package com.kakao.tistory.domain.entity;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\u0006\u0010\u000E\u001A\u00020\nJ\u0006\u0010\u000F\u001A\u00020\nJ\u0006\u0010\u0010\u001A\u00020\nJ\u0006\u0010\u0011\u001A\u00020\nJ\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/BuildType;", "", "flavor", "", "(Ljava/lang/String;)V", "getFlavor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "isCbt", "isDevelop", "isProd", "isSandbox", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BuildType {
    @NotNull
    private final String flavor;

    public BuildType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "flavor");
        super();
        this.flavor = s;
    }

    @NotNull
    public final String component1() {
        return this.flavor;
    }

    @NotNull
    public final BuildType copy(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "flavor");
        return new BuildType(s);
    }

    public static BuildType copy$default(BuildType buildType0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = buildType0.flavor;
        }
        return buildType0.copy(s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof BuildType ? Intrinsics.areEqual(this.flavor, ((BuildType)object0).flavor) : false;
    }

    @NotNull
    public final String getFlavor() {
        return this.flavor;
    }

    @Override
    public int hashCode() {
        return this.flavor.hashCode();
    }

    public final boolean isCbt() {
        String s = this.flavor.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        return StringsKt__StringsKt.contains$default(s, "cbt", false, 2, null);
    }

    // 去混淆评级： 低(20)
    public final boolean isDevelop() {
        return this.isSandbox() || this.isCbt();
    }

    public final boolean isProd() {
        String s = this.flavor.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        return StringsKt__StringsKt.contains$default(s, "prod", false, 2, null);
    }

    public final boolean isSandbox() {
        String s = this.flavor.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        return StringsKt__StringsKt.contains$default(s, "sandbox", false, 2, null);
    }

    @Override
    @NotNull
    public String toString() {
        return "BuildType(flavor=" + this.flavor + ")";
    }
}

