package com.kakao.keditor.plugin.itemspec;

import com.kakao.keditor.plugin.KeditorItemType;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A*\u0010\u0005\u001A\u0004\u0018\u00010\u0006*\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\u000B\u001A\u0012\u0010\f\u001A\u00020\b*\n\u0012\u0006\b\u0001\u0012\u00020\u000E0\r\"\u0017\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u000F"}, d2 = {"TEXT_ITEMS_VALIDATOR", "", "Lcom/kakao/keditor/plugin/itemspec/TextItemsValidator;", "getTEXT_ITEMS_VALIDATOR", "()Ljava/util/Set;", "pop", "", "", "", "key", "required", "", "type", "Ljava/lang/Class;", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ItemValidatorKt {
    @NotNull
    private static final Set TEXT_ITEMS_VALIDATOR;

    static {
        ItemValidatorKt.TEXT_ITEMS_VALIDATOR = e0.setOf(TextItemsValidator.INSTANCE);
    }

    @NotNull
    public static final Set getTEXT_ITEMS_VALIDATOR() {
        return ItemValidatorKt.TEXT_ITEMS_VALIDATOR;
    }

    @Nullable
    public static final Object pop(@NotNull Map map0, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        if(z) {
            Object object0 = map0.remove(s);
            Intrinsics.checkNotNull(object0);
            return object0;
        }
        return map0.remove(s);
    }

    public static Object pop$default(Map map0, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return ItemValidatorKt.pop(map0, s, z);
    }

    @NotNull
    public static final String type(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        KeditorItemType keditorItemType0 = (KeditorItemType)class0.getAnnotation(KeditorItemType.class);
        if(keditorItemType0 != null) {
            String s = keditorItemType0.type();
            if(s != null) {
                return s;
            }
        }
        throw new Exception("[" + class0 + "] ItemValidator must have KeditorItemType annotation!");
    }
}

