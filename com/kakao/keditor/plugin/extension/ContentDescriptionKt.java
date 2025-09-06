package com.kakao.keditor.plugin.extension;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u001AY\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0010\b\u0002\u0010\u0003\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000E\u001A\f\u0010\u000F\u001A\u00020\r*\u00020\u0010H\u0000\u001A1\u0010\u0011\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0012\u001A\u00020\b2\u0016\u0010\u0013\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\u0010\u0016\u001A1\u0010\u0011\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u00062\u0016\u0010\u0013\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"applyAccessibilityInfo", "", "Landroid/view/View;", "kClazz", "Lkotlin/reflect/KClass;", "hint", "", "clickActionRes", "", "customActions", "", "Lcom/kakao/keditor/plugin/extension/CustomAction;", "talkBackIsSelected", "", "(Landroid/view/View;Lkotlin/reflect/KClass;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;)V", "isAccessibilityEnabled", "Landroid/content/Context;", "setContentDescriptionWith", "templateResId", "args", "", "", "(Landroid/view/View;I[Ljava/lang/Object;)V", "template", "(Landroid/view/View;Ljava/lang/String;[Ljava/lang/Object;)V", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ContentDescriptionKt {
    public static final void applyAccessibilityInfo(@NotNull View view0, @NotNull KClass kClass0, @Nullable String s, @Nullable Integer integer0, @Nullable List list0, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "kClazz");
        view0.setAccessibilityDelegate(new View.AccessibilityDelegate() {
            @Override  // android.view.View$AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(@NotNull View view0, @NotNull AccessibilityNodeInfo accessibilityNodeInfo0) {
                Intrinsics.checkNotNullParameter(view0, "host");
                Intrinsics.checkNotNullParameter(accessibilityNodeInfo0, "info");
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
                accessibilityNodeInfo0.setClassName(kClass0.getQualifiedName());
                if(Intrinsics.areEqual(boolean0, Boolean.FALSE)) {
                    accessibilityNodeInfo0.setSelected(false);
                }
                String s = s;
                if(s != null) {
                    accessibilityNodeInfo0.setHintText(s);
                }
                Integer integer0 = integer0;
                if(integer0 != null) {
                    try {
                        String s1 = view0.getResources().getString(((int)integer0));
                        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
                        accessibilityNodeInfo0.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, s1));
                    }
                    catch(Resources.NotFoundException resources$NotFoundException0) {
                        resources$NotFoundException0.printStackTrace();
                    }
                }
                List list0 = list0;
                if(list0 != null) {
                    View view1 = view0;
                    for(Object object0: list0) {
                        accessibilityNodeInfo0.addAction(new AccessibilityNodeInfo.AccessibilityAction(((CustomAction)object0).getActionIdRes(), view1.getContext().getString(((CustomAction)object0).getActionNameRes())));
                    }
                }
            }

            @Override  // android.view.View$AccessibilityDelegate
            public boolean performAccessibilityAction(@NotNull View view0, int v, @Nullable Bundle bundle0) {
                Intrinsics.checkNotNullParameter(view0, "host");
                List list0 = list0;
                if(list0 != null) {
                    Object object0 = null;
                    for(Object object1: list0) {
                        if(((CustomAction)object1).getActionIdRes() == v) {
                            object0 = object1;
                            break;
                        }
                    }
                    if(((CustomAction)object0) != null) {
                        ((CustomAction)object0).getAction().invoke();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view0, v, bundle0);
            }
        });
    }

    public static void applyAccessibilityInfo$default(View view0, KClass kClass0, String s, Integer integer0, List list0, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            kClass0 = Reflection.getOrCreateKotlinClass(view0.getClass());
        }
        ContentDescriptionKt.applyAccessibilityInfo(view0, kClass0, ((v & 2) == 0 ? s : null), ((v & 4) == 0 ? integer0 : null), ((v & 8) == 0 ? list0 : null), ((v & 16) == 0 ? boolean0 : null));
    }

    public static final boolean isAccessibilityEnabled(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Object object0 = context0.getSystemService("accessibility");
        AccessibilityManager accessibilityManager0 = object0 instanceof AccessibilityManager ? ((AccessibilityManager)object0) : null;
        if(accessibilityManager0 != null && accessibilityManager0.isEnabled()) {
            List list0 = accessibilityManager0.getEnabledAccessibilityServiceList(1);
            Intrinsics.checkNotNull(list0);
            return !list0.isEmpty();
        }
        return false;
    }

    public static final void setContentDescriptionWith(@NotNull View view0, int v, @NotNull Object[] arr_object) {
        String s;
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "args");
        try {
            s = "";
            s = view0.getResources().getString(v, Arrays.copyOf(arr_object, arr_object.length));
        }
        catch(Resources.NotFoundException unused_ex) {
        }
        Intrinsics.checkNotNull(s);
        view0.setContentDescription(s);
    }

    public static final void setContentDescriptionWith(@NotNull View view0, @NotNull String s, @NotNull Object[] arr_object) {
        String s1;
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(s, "template");
        Intrinsics.checkNotNullParameter(arr_object, "args");
        try {
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
            s1 = String.format(s, Arrays.copyOf(arr_object1, arr_object1.length));
            Intrinsics.checkNotNullExpressionValue(s1, "format(...)");
        }
        catch(Resources.NotFoundException unused_ex) {
            s1 = "";
        }
        view0.setContentDescription(s1);
    }
}

