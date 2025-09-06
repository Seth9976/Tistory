package com.kakao.sdk.common.util;

import android.util.Base64;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ContextInfo;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000B\u0010\t¨\u0006\f"}, d2 = {"Lcom/kakao/sdk/common/util/AESCipher;", "Lcom/kakao/sdk/common/util/Cipher;", "Lcom/kakao/sdk/common/model/ContextInfo;", "contextInfo", "<init>", "(Lcom/kakao/sdk/common/model/ContextInfo;)V", "", "value", "encrypt", "(Ljava/lang/String;)Ljava/lang/String;", "encrypted", "decrypt", "common_release"}, k = 1, mv = {1, 4, 0})
public final class AESCipher implements Cipher {
    public final String a;
    public final Charset b;
    public final javax.crypto.Cipher c;
    public final javax.crypto.Cipher d;
    public final IvParameterSpec e;

    public AESCipher() {
        this(null, 1, null);
    }

    public AESCipher(@NotNull ContextInfo contextInfo0) {
        Intrinsics.checkParameterIsNotNull(contextInfo0, "contextInfo");
        super();
        this.a = "AES";
        this.b = Charsets.UTF_8;
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(new byte[]{0x70, 78, 75, 55, -54, -30, -10, 44, 102, (byte)0x82, (byte)0x82, 92, (byte)0x8C, (byte)0xD0, (byte)0x85, -55});
        this.e = ivParameterSpec0;
        String s = contextInfo0.getSigningKeyHash();
        SecretKeyFactory secretKeyFactory0 = SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC");
        String s1 = s.substring(0, Math.min(s.length(), 16));
        Intrinsics.checkExpressionValueIsNotNull(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if(s1 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        char[] arr_c = s1.toCharArray();
        Intrinsics.checkExpressionValueIsNotNull(arr_c, "(this as java.lang.String).toCharArray()");
        SecretKey secretKey0 = secretKeyFactory0.generateSecret(new PBEKeySpec(arr_c, contextInfo0.getSalt(), 2, 0x100));
        Intrinsics.checkExpressionValueIsNotNull(secretKey0, "tmp");
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(secretKey0.getEncoded(), "AES");
        javax.crypto.Cipher cipher0 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        Intrinsics.checkExpressionValueIsNotNull(cipher0, "Cipher.getInstance(cipherAlgorithm)");
        this.c = cipher0;
        javax.crypto.Cipher cipher1 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        Intrinsics.checkExpressionValueIsNotNull(cipher1, "Cipher.getInstance(cipherAlgorithm)");
        this.d = cipher1;
        try {
            cipher0.init(1, secretKeySpec0, ivParameterSpec0);
            cipher1.init(2, secretKeySpec0, ivParameterSpec0);
        }
        catch(InvalidKeyException unused_ex) {
            SecretKeySpec secretKeySpec1 = new SecretKeySpec(Arrays.copyOfRange(secretKey0.getEncoded(), 0, secretKey0.getEncoded().length / 2), this.a);
            this.c.init(1, secretKeySpec1, this.e);
            this.d.init(2, secretKeySpec1, this.e);
        }
    }

    public AESCipher(ContextInfo contextInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            contextInfo0 = KakaoSdk.INSTANCE.getApplicationContextInfo();
        }
        this(contextInfo0);
    }

    public static String a(String s) [...] // 潜在的解密器

    @Override  // com.kakao.sdk.common.util.Cipher
    @NotNull
    public String decrypt(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "encrypted");
        byte[] arr_b = Base64.decode(s, 2);
        byte[] arr_b1 = this.d.doFinal(arr_b);
        Intrinsics.checkExpressionValueIsNotNull(arr_b1, "decryptor.doFinal(Base64…crypted, Base64.NO_WRAP))");
        return new String(arr_b1, this.b);
    }

    @Override  // com.kakao.sdk.common.util.Cipher
    @NotNull
    public String encrypt(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "value");
        byte[] arr_b = s.getBytes(this.b);
        Intrinsics.checkExpressionValueIsNotNull(arr_b, "(this as java.lang.String).getBytes(charset)");
        String s1 = Base64.encodeToString(this.c.doFinal(arr_b), 2);
        Intrinsics.checkExpressionValueIsNotNull(s1, "Base64.encodeToString(en…AR_SET)), Base64.NO_WRAP)");
        return s1;
    }
}

