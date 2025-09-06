package com.kakao.tistory.domain.blog.entity;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt.WhenMappings;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UNINITIALIZED_VALUE;
import kotlin.UnsafeLazyImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import md.h;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u0011\u0010\u0003\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/BlogStatusType;", "", "", "isBlogRestricted", "()Z", "Companion", "OPEN", "CLOSED", "DEL", "TMP", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public enum BlogStatusType {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/BlogStatusType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/BlogStatusType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer)BlogStatusType.a.getValue();
        }
    }

    @SerialName("open")
    OPEN,
    @SerialName("closed")
    CLOSED,
    @SerialName("del")
    DEL,
    @SerialName("tmp")
    TMP;

    @NotNull
    public static final Companion Companion;
    public static final Lazy a;
    public static final BlogStatusType[] b;
    public static final EnumEntries c;

    static {
        Lazy lazy0;
        BlogStatusType.b = arr_blogStatusType;
        BlogStatusType.c = new a(arr_blogStatusType);
        BlogStatusType.Companion = new Companion(null);
        Function0 function00 = f.a;
        if(LazyThreadSafetyMode.PUBLICATION == null) {
            NullPointerException nullPointerException0 = new NullPointerException(Intrinsics.a("mode"));
            Intrinsics.b(nullPointerException0, Intrinsics.class.getName());
            throw nullPointerException0;
        }
        if(function00 == null) {
            NullPointerException nullPointerException1 = new NullPointerException(Intrinsics.a("initializer"));
            Intrinsics.b(nullPointerException1, Intrinsics.class.getName());
            throw nullPointerException1;
        }
        switch(LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0[LazyThreadSafetyMode.PUBLICATION.ordinal()]) {
            case 1: {
                lazy0 = new h(null, function00);
                break;
            }
            case 2: {
                if(function00 == null) {
                    NullPointerException nullPointerException2 = new NullPointerException(Intrinsics.a("initializer"));
                    Intrinsics.b(nullPointerException2, Intrinsics.class.getName());
                    throw nullPointerException2;
                }
                lazy0 = new md.f();  // 初始化器: Ljava/lang/Object;-><init>()V
                lazy0.a = function00;
                lazy0.b = UNINITIALIZED_VALUE.INSTANCE;
                break;
            }
            case 3: {
                lazy0 = new UnsafeLazyImpl(function00);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        BlogStatusType.a = lazy0;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return BlogStatusType.c;
    }

    public final boolean isBlogRestricted() {
        return this != BlogStatusType.OPEN;
    }
}

