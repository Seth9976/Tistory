package com.kakao.keditor.plugin.itemspec;

import com.kakao.keditor.cdm.CDM.Item;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000B\u001A\u00020\bJ\u0010\u0010\f\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\bH\u0016R\u001A\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/ItemSpec;", "T", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/itemspec/ModelConverter;", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "()V", "targetTypes", "", "", "getTargetTypes", "()Ljava/util/Set;", "type", "typeOf", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ItemSpec extends ModelConverter implements ItemValidator {
    @Override  // com.kakao.keditor.plugin.itemspec.ItemValidator
    @NotNull
    public Set getChildValidators() {
        return DefaultImpls.getChildValidators(this);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemValidator
    @NotNull
    public Map getKnownEnumValues() {
        return DefaultImpls.getKnownEnumValues(this);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemValidator
    @NotNull
    public Set getTargetTypes() {
        return e0.setOf(this.type());
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

    @NotNull
    public final String type() {
        return ItemValidatorKt.type(this.getClass());
    }

    public boolean typeOf(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "type");
        return Intrinsics.areEqual(s, ItemValidatorKt.type(this.getClass()));
    }
}

