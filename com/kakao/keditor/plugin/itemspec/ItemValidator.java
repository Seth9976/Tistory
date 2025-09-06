package com.kakao.keditor.plugin.itemspec;

import com.kakao.keditor.cdm.CDM.Item;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0016J6\u0010\u0011\u001A\u00020\b2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00132\u0006\u0010\u0014\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\b2\b\b\u0002\u0010\u0016\u001A\u00020\u000EH\u0016R\u001A\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R&\u0010\u0006\u001A\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0018\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "", "childValidators", "", "getChildValidators", "()Ljava/util/Set;", "knownEnumValues", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "targetTypes", "getTargetTypes", "isSupport", "", "item", "Lcom/kakao/keditor/cdm/CDM$Item;", "popValueOrDefault", "attribute", "", "key", "displayDefault", "required", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ItemValidator {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nItemValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemValidator.kt\ncom/kakao/keditor/plugin/itemspec/ItemValidator$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1855#2:98\n288#2,2:99\n1856#2:101\n*S KotlinDebug\n*F\n+ 1 ItemValidator.kt\ncom/kakao/keditor/plugin/itemspec/ItemValidator$DefaultImpls\n*L\n43#1:98\n44#1:99,2\n43#1:101\n*E\n"})
    public static final class DefaultImpls {
        @NotNull
        public static Set getChildValidators(@NotNull ItemValidator itemValidator0) {
            return f0.emptySet();
        }

        @NotNull
        public static Map getKnownEnumValues(@NotNull ItemValidator itemValidator0) {
            return x.emptyMap();
        }

        public static boolean isSupport(@NotNull ItemValidator itemValidator0, @NotNull Item cDM$Item0) {
            Intrinsics.checkNotNullParameter(cDM$Item0, "item");
            Collection collection0 = cDM$Item0.getChildren();
            if(collection0 != null && !collection0.isEmpty()) {
                List list0 = cDM$Item0.getChildren();
                if(list0 != null) {
                    for(Object object0: list0) {
                        Item cDM$Item1 = (Item)object0;
                        for(Object object1: itemValidator0.getChildValidators()) {
                            if(!((ItemValidator)object1).getTargetTypes().contains(cDM$Item1.getType())) {
                                continue;
                            }
                            goto label_15;
                        }
                        object1 = null;
                    label_15:
                        if(((ItemValidator)object1) == null) {
                            return false;
                        }
                        if(!((ItemValidator)object1).isSupport(cDM$Item1)) {
                            return false;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
            return true;
        }

        @NotNull
        public static String popValueOrDefault(@NotNull ItemValidator itemValidator0, @NotNull Map map0, @NotNull String s, @NotNull String s1, boolean z) {
            String s2;
            Object object0;
            Intrinsics.checkNotNullParameter(map0, "attribute");
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "displayDefault");
            if(z) {
                object0 = map0.get(s);
                Intrinsics.checkNotNull(object0);
                s2 = object0.toString();
            }
            else {
                object0 = map0.get(s);
                s2 = object0 == null ? null : object0.toString();
            }
            if(s2 != null && itemValidator0.getKnownEnumValues().containsKey(s)) {
                Set set0 = (Set)itemValidator0.getKnownEnumValues().get(s);
                if(set0 != null && set0.contains(s2)) {
                    map0.remove(s);
                    return s2;
                }
            }
            return s1;
        }

        public static String popValueOrDefault$default(ItemValidator itemValidator0, Map map0, String s, String s1, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popValueOrDefault");
            }
            if((v & 8) != 0) {
                z = false;
            }
            return itemValidator0.popValueOrDefault(map0, s, s1, z);
        }
    }

    @NotNull
    Set getChildValidators();

    @NotNull
    Map getKnownEnumValues();

    @NotNull
    Set getTargetTypes();

    boolean isSupport(@NotNull Item arg1);

    @NotNull
    String popValueOrDefault(@NotNull Map arg1, @NotNull String arg2, @NotNull String arg3, boolean arg4);
}

