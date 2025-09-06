package com.kakao.tistory.presentation.view.common.bottomsheet;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/bottomsheet/AccessibilitySwipeItemType;", "", "", "a", "I", "getTitle", "()I", "title", "DELETE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AccessibilitySwipeItemType extends Enum {
    public static final enum AccessibilitySwipeItemType DELETE;
    public final int a;
    public static final AccessibilitySwipeItemType[] b;
    public static final EnumEntries c;

    static {
        AccessibilitySwipeItemType.DELETE = new AccessibilitySwipeItemType(string.label_swipe_button_delete);
        AccessibilitySwipeItemType[] arr_accessibilitySwipeItemType = {AccessibilitySwipeItemType.DELETE};
        AccessibilitySwipeItemType.b = arr_accessibilitySwipeItemType;
        Intrinsics.checkNotNullParameter(arr_accessibilitySwipeItemType, "entries");
        AccessibilitySwipeItemType.c = new a(arr_accessibilitySwipeItemType);
    }

    public AccessibilitySwipeItemType(int v) {
        super("DELETE", 0);
        this.a = v;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return AccessibilitySwipeItemType.c;
    }

    public final int getTitle() {
        return this.a;
    }

    public static AccessibilitySwipeItemType valueOf(String s) {
        return (AccessibilitySwipeItemType)Enum.valueOf(AccessibilitySwipeItemType.class, s);
    }

    public static AccessibilitySwipeItemType[] values() {
        return (AccessibilitySwipeItemType[])AccessibilitySwipeItemType.b.clone();
    }
}

