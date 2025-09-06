package com.kakao.tistory.presentation.common;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u001A\u0015\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0006\u001A\u00020\u00052\b\u0010\u0001\u001A\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0017\u0010\t\u001A\u00020\b2\b\u0010\u0001\u001A\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\n\u001A\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000F\u001A\u00020\u000E8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010\"\u0014\u0010\u0011\u001A\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001A\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"", "value", "Lcom/kakao/tistory/presentation/common/BlogStatusType;", "getBlogStatusType", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/common/BlogStatusType;", "Lcom/kakao/tistory/presentation/common/BlogRoleType;", "getBlogRoleType", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/common/BlogRoleType;", "Lcom/kakao/tistory/presentation/common/EntryType;", "getEntryType", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/common/EntryType;", "Lcom/kakao/tistory/presentation/common/RestrictType;", "getRestrictType", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/common/RestrictType;", "", "IMAGE_MAX_SIZE", "J", "TERMS_AND_CONDITIONS_URL", "Ljava/lang/String;", "QUESTION_URL", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEnumConsts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumConsts.kt\ncom/kakao/tistory/presentation/common/EnumConstsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,237:1\n8541#2,2:238\n8801#2,4:240\n*S KotlinDebug\n*F\n+ 1 EnumConsts.kt\ncom/kakao/tistory/presentation/common/EnumConstsKt\n*L\n42#1:238,2\n42#1:240,4\n*E\n"})
public final class EnumConstsKt {
    public static final long IMAGE_MAX_SIZE = 0x1400000L;
    @NotNull
    public static final String QUESTION_URL = "https://cs.kakao.com/requests?service=175&locale=ko";
    @NotNull
    public static final String TERMS_AND_CONDITIONS_URL = "https://www.kakao.com/policy/terms?type=ts&lang=ko";

    @NotNull
    public static final BlogRoleType getBlogRoleType(@Nullable String s) {
        if(s != null && s.length() != 0) {
            BlogRoleType[] arr_blogRoleType = BlogRoleType.values();
            for(int v = 0; v < arr_blogRoleType.length; ++v) {
                BlogRoleType blogRoleType0 = arr_blogRoleType[v];
                if(Intrinsics.areEqual(blogRoleType0.getValue(), s)) {
                    return blogRoleType0;
                }
            }
            return BlogRoleType.USER;
        }
        return BlogRoleType.GUEST;
    }

    @NotNull
    public static final BlogStatusType getBlogStatusType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        BlogStatusType[] arr_blogStatusType = BlogStatusType.values();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_blogStatusType.length), 16));
        for(int v = 0; v < arr_blogStatusType.length; ++v) {
            BlogStatusType blogStatusType0 = arr_blogStatusType[v];
            linkedHashMap0.put(blogStatusType0.getValue(), blogStatusType0);
        }
        BlogStatusType blogStatusType1 = (BlogStatusType)linkedHashMap0.get(s);
        return blogStatusType1 == null ? BlogStatusType.OPEN : blogStatusType1;
    }

    @NotNull
    public static final EntryType getEntryType(@Nullable String s) {
        EntryType[] arr_entryType = EntryType.values();
        for(int v = 0; v < arr_entryType.length; ++v) {
            EntryType entryType0 = arr_entryType[v];
            if(Intrinsics.areEqual(entryType0.getType(), s)) {
                return entryType0;
            }
        }
        return EntryType.POST;
    }

    @NotNull
    public static final RestrictType getRestrictType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        RestrictType[] arr_restrictType = RestrictType.values();
        for(int v = 0; v < arr_restrictType.length; ++v) {
            RestrictType restrictType0 = arr_restrictType[v];
            if(Intrinsics.areEqual(restrictType0.getValue(), s)) {
                return restrictType0;
            }
        }
        return RestrictType.TEMPORARY;
    }
}

