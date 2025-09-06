package com.kakao.android.base.utils;

import android.app.Activity;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.FragmentManager;
import i9.c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/android/base/utils/AccessibilityUtils;", "", "Landroid/app/Activity;", "activity", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "initBackStackChangedListener", "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAccessibilityUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityUtils.kt\ncom/kakao/android/base/utils/AccessibilityUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n533#2,6:33\n1855#2,2:39\n*S KotlinDebug\n*F\n+ 1 AccessibilityUtils.kt\ncom/kakao/android/base/utils/AccessibilityUtils\n*L\n21#1:33,6\n23#1:39,2\n*E\n"})
public final class AccessibilityUtils {
    @NotNull
    public static final AccessibilityUtils INSTANCE;

    static {
        AccessibilityUtils.INSTANCE = new AccessibilityUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void initBackStackChangedListener(@NotNull Activity activity0, @NotNull FragmentManager fragmentManager0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager0, "fragmentManager");
        Object object0 = activity0.getSystemService("accessibility");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        if(!((AccessibilityManager)object0).isEnabled()) {
            return;
        }
        fragmentManager0.addOnBackStackChangedListener(new c(fragmentManager0));
    }
}

