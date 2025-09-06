package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/domain/entity/AccountType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GENERAL", "KAKAO", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
enum AccountType {
    GENERAL("general"),
    KAKAO("kakao");

    private static final EnumEntries $ENTRIES;
    private static final AccountType[] $VALUES;
    @NotNull
    private final String value;

    private static final AccountType[] $values() [...] // Inlined contents

    static {
        AccountType.$VALUES = arr_accountType;
        Intrinsics.checkNotNullParameter(arr_accountType, "entries");
        AccountType.$ENTRIES = new a(arr_accountType);
    }

    private AccountType(String s1) {
        this.value = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return AccountType.$ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}

