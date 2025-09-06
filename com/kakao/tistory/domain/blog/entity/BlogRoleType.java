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
import kotlinx.serialization.Serializable;
import md.f;
import md.h;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000B\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013R\u0011\u0010\u0003\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0004R\u0011\u0010\b\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0004R\u0011\u0010\n\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\t\u0010\u0004R\u0011\u0010\f\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\u0004R\u0011\u0010\u000E\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\r\u0010\u0004R\u0011\u0010\u0010\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0004R\u0011\u0010\u0012\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0004j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "", "", "isMyOwnBlog", "()Z", "getHasAnyAccessAuth", "hasAnyAccessAuth", "getHasChangeBlogAuth", "hasChangeBlogAuth", "getHasEntryEditAuth", "hasEntryEditAuth", "getHasDeleteAuth", "hasDeleteAuth", "getHasVisibilityAuth", "hasVisibilityAuth", "getHasPinnedCommentAuth", "hasPinnedCommentAuth", "getHasBlogRole", "hasBlogRole", "Companion", "OWNER", "MANAGER", "EDITOR", "WRITER", "USER", "GUEST", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public enum BlogRoleType {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/BlogRoleType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer)BlogRoleType.a.getValue();
        }
    }

    OWNER,
    MANAGER,
    EDITOR,
    WRITER,
    USER,
    GUEST;

    @NotNull
    public static final Companion Companion;
    public static final Lazy a;
    public static final BlogRoleType[] b;
    public static final EnumEntries c;

    static {
        Lazy lazy0;
        BlogRoleType.b = arr_blogRoleType;
        BlogRoleType.c = new a(arr_blogRoleType);
        BlogRoleType.Companion = new Companion(null);
        Function0 function00 = e.a;
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
                lazy0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
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
        BlogRoleType.a = lazy0;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return BlogRoleType.c;
    }

    public final boolean getHasAnyAccessAuth() [...] // 潜在的解密器

    public final boolean getHasBlogRole() {
        return this.getHasAnyAccessAuth();
    }

    public final boolean getHasChangeBlogAuth() {
        return this == BlogRoleType.OWNER || this == BlogRoleType.MANAGER;
    }

    public final boolean getHasDeleteAuth() {
        return this == BlogRoleType.OWNER || this == BlogRoleType.MANAGER || this == BlogRoleType.EDITOR;
    }

    public final boolean getHasEntryEditAuth() [...] // 潜在的解密器

    public final boolean getHasPinnedCommentAuth() {
        return this == BlogRoleType.OWNER || this == BlogRoleType.MANAGER || this == BlogRoleType.EDITOR;
    }

    public final boolean getHasVisibilityAuth() {
        return this == BlogRoleType.OWNER || this == BlogRoleType.MANAGER || this == BlogRoleType.EDITOR;
    }

    public final boolean isMyOwnBlog() {
        return this == BlogRoleType.OWNER;
    }
}

