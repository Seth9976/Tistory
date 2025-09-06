package com.kakao.tistory.domain.home.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonClassDiscriminator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
public final class HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0 implements JsonClassDiscriminator {
    public final String a;

    public HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "discriminator");
        super();
        this.a = s;
    }

    @Override
    public final Class annotationType() {
        return JsonClassDiscriminator.class;
    }

    @Override  // kotlinx.serialization.json.JsonClassDiscriminator
    public final String discriminator() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return object0 instanceof JsonClassDiscriminator ? Intrinsics.areEqual(this.discriminator(), ((JsonClassDiscriminator)object0).discriminator()) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0x2A300764;
    }

    @Override
    @NotNull
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.a + ")";
    }
}

