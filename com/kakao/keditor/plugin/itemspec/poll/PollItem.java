package com.kakao.keditor.plugin.itemspec.poll;

import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Center;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.Aligned;
import com.kakao.keditor.plugin.attrs.item.HasExtraUploadable;
import com.kakao.keditor.plugin.attrs.item.NoUpdateWhenAlignmentChanged;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@KeditorItemType(type = "poll")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J \u0010;\u001A\n <*\u0004\u0018\u00010\u00100\u00102\u0006\u0010=\u001A\u00020\u00102\u0006\u0010>\u001A\u00020\u0010H\u0002J\u0006\u0010?\u001A\u00020\u0010J\u0006\u0010@\u001A\u00020\u0010R$\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@VX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR&\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000FX\u0094\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u0017X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u001A\u0010\u001C\u001A\u00020\u0010X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001A\u0010!\u001A\u00020\u0010X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010\u001E\"\u0004\b#\u0010 R\u001A\u0010$\u001A\u00020%X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001A\u0010*\u001A\u00020\u0010X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b+\u0010\u001E\"\u0004\b,\u0010 R \u0010-\u001A\b\u0012\u0004\u0012\u00020/0.X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\u001A\u00104\u001A\u00020\u0010X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b5\u0010\u001E\"\u0004\b6\u0010 R\u001A\u00107\u001A\b\u0012\u0004\u0012\u000209088VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b:\u00101¨\u0006A"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/poll/PollItem;", "Lcom/kakao/keditor/KeditorItem;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "Ljava/io/Serializable;", "Lcom/kakao/keditor/plugin/attrs/item/HasExtraUploadable;", "Lcom/kakao/keditor/plugin/attrs/item/NoUpdateWhenAlignmentChanged;", "()V", "value", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "alignment", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "bypassStored", "", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "editable", "", "getEditable", "()Z", "setEditable", "(Z)V", "endDate", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "id", "getId", "setId", "selectCount", "", "getSelectCount", "()I", "setSelectCount", "(I)V", "startDate", "getStartDate", "setStartDate", "subItems", "", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "getSubItems", "()Ljava/util/List;", "setSubItems", "(Ljava/util/List;)V", "title", "getTitle", "setTitle", "uploadables", "", "Lcom/kakao/keditor/plugin/attrs/item/Uploadable;", "getUploadables", "toFormattedDate", "kotlin.jvm.PlatformType", "format", "dateString", "toRangeString", "toRemainCount", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PollItem extends KeditorItem implements Aligned, HasExtraUploadable, NoUpdateWhenAlignmentChanged, Serializable {
    @NotNull
    private Alignment alignment;
    @NotNull
    private Map bypassStored;
    private boolean editable;
    @NotNull
    private String endDate;
    @NotNull
    private String id;
    private int selectCount;
    @NotNull
    private String startDate;
    @NotNull
    private List subItems;
    @NotNull
    private String title;

    public PollItem() {
        this.bypassStored = new LinkedHashMap();
        this.id = "";
        this.selectCount = 1;
        this.title = "";
        this.startDate = "";
        this.endDate = "";
        this.editable = true;
        this.alignment = Center.INSTANCE;
        this.subItems = new ArrayList();
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    public Alignment getAlignment() {
        return this.alignment;
    }

    @Override  // com.kakao.keditor.KeditorItem
    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    @NotNull
    public final String getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getSelectCount() {
        return this.selectCount;
    }

    @NotNull
    public final String getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final List getSubItems() {
        return this.subItems;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.HasExtraUploadable
    @NotNull
    public List getUploadables() {
        return this.subItems;
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    public void setAlignment(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "value");
        this.removeBypass("align");
        this.alignment = alignment0;
    }

    @Override  // com.kakao.keditor.KeditorItem
    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void setEditable(boolean z) {
        this.editable = z;
    }

    public final void setEndDate(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.endDate = s;
    }

    public final void setId(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.id = s;
    }

    public final void setSelectCount(int v) {
        this.selectCount = v;
    }

    public final void setStartDate(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.startDate = s;
    }

    public final void setSubItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.subItems = list0;
    }

    public final void setTitle(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.title = s;
    }

    private final String toFormattedDate(String s, String s1) {
        try {
            return new SimpleDateFormat(s).format(new SimpleDateFormat("yyyy-MM-dd").parse(s1));
        }
        catch(ParseException unused_ex) {
            return s1;
        }
    }

    @NotNull
    public final String toRangeString() {
        String s = Keditor.INSTANCE.getContext().getString(string.ke_poll_tilde, new Object[]{this.toFormattedDate("yyyy.MM.dd", this.startDate), this.toFormattedDate("MM.dd", this.endDate)});
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }

    @NotNull
    public final String toRemainCount() {
        String s = Keditor.INSTANCE.getContext().getString(string.ke_poll_remain_count_text, new Object[]{this.selectCount});
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        return s;
    }
}

