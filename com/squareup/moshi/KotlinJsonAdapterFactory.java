package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(message = "this moved to avoid a package name conflict in the Java Platform Module System.", replaceWith = @ReplaceWith(expression = "com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u001B\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J]\u0010\u0003\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u000E\u0010\u0005\u001A\n \u0007*\u0004\u0018\u00010\u00060\u00062,\u0010\b\u001A(\u0012\u000E\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\n0\n \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n\u0018\u00010\u000B0\t2\u000E\u0010\f\u001A\n \u0007*\u0004\u0018\u00010\r0\rH\u0097\u0001¨\u0006\u000E"}, d2 = {"Lcom/squareup/moshi/KotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "p0", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "p1", "", "", "", "p2", "Lcom/squareup/moshi/Moshi;", "reflect"}, k = 1, mv = {1, 4, 2})
public final class KotlinJsonAdapterFactory implements Factory {
    public final com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory a;

    public KotlinJsonAdapterFactory() {
        this.a = new com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory();
    }

    @Override  // com.squareup.moshi.JsonAdapter$Factory
    @CheckReturnValue
    @Nullable
    @org.jetbrains.annotations.Nullable
    public JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        return this.a.create(type0, set0, moshi0);
    }
}

