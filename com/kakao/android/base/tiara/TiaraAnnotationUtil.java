package com.kakao.android.base.tiara;

import com.kakao.tiara.data.ActionKind;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001B\u0010\u0007\u001A\u0004\u0018\u00010\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001B\u0010\b\u001A\u0004\u0018\u00010\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001B\u0010\n\u001A\u0004\u0018\u00010\t2\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/android/base/tiara/TiaraAnnotationUtil;", "", "Ljava/lang/Class;", "clazz", "", "getSection", "(Ljava/lang/Class;)Ljava/lang/String;", "getPage", "getAction", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "(Ljava/lang/Class;)Lcom/kakao/tiara/data/ActionKind;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TiaraAnnotationUtil {
    @NotNull
    public static final TiaraAnnotationUtil INSTANCE;

    static {
        TiaraAnnotationUtil.INSTANCE = new TiaraAnnotationUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Nullable
    public final String getAction(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "clazz");
        TiaraAction tiaraAction0 = (TiaraAction)class0.getAnnotation(TiaraAction.class);
        return tiaraAction0 == null ? null : tiaraAction0.action();
    }

    @Nullable
    public final ActionKind getActionKind(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "clazz");
        TiaraActionKind tiaraActionKind0 = (TiaraActionKind)class0.getAnnotation(TiaraActionKind.class);
        return tiaraActionKind0 == null ? null : tiaraActionKind0.actionKind();
    }

    @Nullable
    public final String getPage(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "clazz");
        TiaraPage tiaraPage0 = (TiaraPage)class0.getAnnotation(TiaraPage.class);
        return tiaraPage0 == null ? null : tiaraPage0.page();
    }

    @Nullable
    public final String getSection(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "clazz");
        TiaraSection tiaraSection0 = (TiaraSection)class0.getAnnotation(TiaraSection.class);
        return tiaraSection0 == null ? null : tiaraSection0.section();
    }
}

