package com.kakao.sdk.auth;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import sb.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BB\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/kakao/sdk/auth/TokenManagerProvider;", "", "Lcom/kakao/sdk/auth/TokenManageable;", "manager", "<init>", "(Lcom/kakao/sdk/auth/TokenManageable;)V", "a", "Lcom/kakao/sdk/auth/TokenManageable;", "getManager", "()Lcom/kakao/sdk/auth/TokenManageable;", "setManager", "Companion", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class TokenManagerProvider {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/auth/TokenManagerProvider$Companion;", "", "Lcom/kakao/sdk/auth/TokenManagerProvider;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/TokenManagerProvider;", "instance$annotations", "()V", "instance", "auth_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/TokenManagerProvider;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TokenManagerProvider getInstance() {
            Lazy lazy0 = TokenManagerProvider.b;
            KProperty kProperty0 = Companion.a[0];
            return (TokenManagerProvider)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion;
    public TokenManageable a;
    public static final Lazy b;

    static {
        TokenManagerProvider.Companion = new Companion(null);
        TokenManagerProvider.b = c.lazy(a.H);
    }

    public TokenManagerProvider() {
        this(null, 1, null);
    }

    public TokenManagerProvider(@NotNull TokenManageable tokenManageable0) {
        Intrinsics.checkParameterIsNotNull(tokenManageable0, "manager");
        super();
        this.a = tokenManageable0;
    }

    public TokenManagerProvider(TokenManageable tokenManageable0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            tokenManageable0 = TokenManager.Companion.getInstance();
        }
        this(tokenManageable0);
    }

    @NotNull
    public static final TokenManagerProvider getInstance() {
        return TokenManagerProvider.Companion.getInstance();
    }

    @NotNull
    public final TokenManageable getManager() {
        return this.a;
    }

    public final void setManager(@NotNull TokenManageable tokenManageable0) {
        Intrinsics.checkParameterIsNotNull(tokenManageable0, "<set-?>");
        this.a = tokenManageable0;
    }
}

