package com.kakao.tistory.data.utils;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001A\u0004\u0018\u00010\u00022\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000B\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\n¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/data/utils/AESUtils;", "", "", "secretKey", "encryptAlgorithm", "encryptTransformation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "source", "encrypt", "(Ljava/lang/String;)Ljava/lang/String;", "decrypt", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAESUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AESUtils.kt\ncom/kakao/tistory/data/utils/AESUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class AESUtils {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public AESUtils(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "secretKey");
        Intrinsics.checkNotNullParameter(s1, "encryptAlgorithm");
        Intrinsics.checkNotNullParameter(s2, "encryptTransformation");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = 16;
        this.e = 2;
    }

    public AESUtils(String s, String s1, String s2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s1 = "AES";
        }
        if((v & 4) != 0) {
            s2 = "AES/CBC/PKCS7padding";
        }
        this(s, s1, s2);
    }

    @NotNull
    public final String decrypt(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "source");
        byte[] arr_b = Base64.decode(s, this.e);
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 0, this.d);
        Cipher cipher0 = Cipher.getInstance(this.c);
        byte[] arr_b2 = this.a.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(arr_b2, "getBytes(...)");
        cipher0.init(2, new SecretKeySpec(arr_b2, this.b), new IvParameterSpec(arr_b1));
        byte[] arr_b3 = cipher0.doFinal(Arrays.copyOfRange(arr_b, this.d, arr_b.length));
        Intrinsics.checkNotNullExpressionValue(arr_b3, "doFinal(...)");
        return new String(arr_b3, Charsets.UTF_8);
    }

    @Nullable
    public final String encrypt(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "source");
        Cipher cipher0 = Cipher.getInstance(this.c);
        byte[] arr_b = new byte[this.d];
        new SecureRandom().nextBytes(arr_b);
        byte[] arr_b1 = this.a.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "getBytes(...)");
        cipher0.init(1, new SecretKeySpec(arr_b1, this.b), new IvParameterSpec(arr_b));
        byte[] arr_b2 = s.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(arr_b2, "getBytes(...)");
        byte[] arr_b3 = cipher0.doFinal(arr_b2);
        Intrinsics.checkNotNull(arr_b3);
        byte[] arr_b4 = Base64.encode(ArraysKt___ArraysJvmKt.plus(arr_b, arr_b3), this.e);
        return arr_b4 == null ? null : new String(arr_b4, Charsets.UTF_8);
    }
}

