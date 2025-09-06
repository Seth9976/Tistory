package com.kakao.sdk.common.network;

import com.kakao.sdk.common.json.IntDate;
import com.kakao.sdk.common.json.MapToQuery;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import retrofit2.Converter.Factory;
import retrofit2.Converter;
import retrofit2.Retrofit;
import ub.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J?\u0010\u0003\u001A\u000E\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001A\u0004\u0018\u00010\u00072\u0010\u0010\b\u001A\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/sdk/common/network/KakaoRetrofitConverterFactory;", "Lretrofit2/Converter$Factory;", "()V", "stringConverter", "Lretrofit2/Converter;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "common_release"}, k = 1, mv = {1, 1, 15})
public final class KakaoRetrofitConverterFactory extends Factory {
    @Override  // retrofit2.Converter$Factory
    @Nullable
    public Converter stringConverter(@Nullable Type type0, @Nullable Annotation[] arr_annotation, @Nullable Retrofit retrofit0) {
        if(Intrinsics.areEqual(type0, String.class)) {
            return null;
        }
        if(type0 instanceof Class && ((Class)type0).isEnum()) {
            return b.c;
        }
        if(Intrinsics.areEqual(type0, Date.class) && arr_annotation != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < arr_annotation.length; ++v1) {
                Annotation annotation0 = arr_annotation[v1];
                if(annotation0 instanceof IntDate) {
                    arrayList0.add(annotation0);
                }
            }
            if(((IntDate)CollectionsKt___CollectionsKt.firstOrNull(arrayList0)) != null) {
                return b.d;
            }
        }
        if(type0 instanceof ParameterizedType && Intrinsics.areEqual(((ParameterizedType)type0).getRawType(), Map.class) && arr_annotation != null) {
            ArrayList arrayList1 = new ArrayList();
            for(int v = 0; v < arr_annotation.length; ++v) {
                Annotation annotation1 = arr_annotation[v];
                if(annotation1 instanceof MapToQuery) {
                    arrayList1.add(annotation1);
                }
            }
            return ((MapToQuery)CollectionsKt___CollectionsKt.firstOrNull(arrayList1)) == null ? b.f : b.e;
        }
        return b.f;
    }
}

