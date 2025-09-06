package com.kakao.kandinsky.core.kdphoto;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

public final class a extends Lambda implements Function0 {
    public static final a w;

    static {
        a.w = new a(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SealedClassSerializer("com.kakao.kandinsky.core.kdphoto.Signature", Reflection.getOrCreateKotlinClass(Signature.class), new KClass[]{Reflection.getOrCreateKotlinClass(Image.class), Reflection.getOrCreateKotlinClass(Text.class)}, new KSerializer[]{.serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer.INSTANCE}, new Annotation[0]);
    }
}

