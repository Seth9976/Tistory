package com.kakao.keditor.plugin.itemspec;

import com.kakao.keditor.cdm.CDM.Item;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.f0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\b0\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/TextItemsValidator;", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "()V", "childValidators", "", "getChildValidators", "()Ljava/util/Set;", "targetTypes", "", "getTargetTypes", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TextItemsValidator implements ItemValidator {
    @NotNull
    public static final TextItemsValidator INSTANCE;
    @NotNull
    private static final Set childValidators;
    @NotNull
    private static final Set targetTypes;

    static {
        TextItemsValidator textItemsValidator0 = new TextItemsValidator();
        TextItemsValidator.INSTANCE = textItemsValidator0;
        TextItemsValidator.targetTypes = f0.setOf(new String[]{"text", "break", "image"});
        TextItemsValidator.childValidators = e0.setOf(textItemsValidator0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemValidator
    @NotNull
    public Set getChildValidators() {
        return TextItemsValidator.childValidators;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemValidator
    @NotNull
    public Map getKnownEnumValues() {
        return DefaultImpls.getKnownEnumValues(this);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemValidator
    @NotNull
    public Set getTargetTypes() {
        return TextItemsValidator.targetTypes;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemValidator
    public boolean isSupport(@NotNull Item cDM$Item0) {
        return DefaultImpls.isSupport(this, cDM$Item0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemValidator
    @NotNull
    public String popValueOrDefault(@NotNull Map map0, @NotNull String s, @NotNull String s1, boolean z) {
        return DefaultImpls.popValueOrDefault(this, map0, s, s1, z);
    }
}

