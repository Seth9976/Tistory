package com.kakao.keditor.request;

import androidx.room.a;
import com.kakao.keditor.KeditorItem;
import kotlin.Metadata;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR+\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\n8V@VX\u0096\u008E\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/request/RenderingRequest;", "Lcom/kakao/keditor/request/FocusedRequest;", "()V", "focusedItem", "Lcom/kakao/keditor/KeditorItem;", "getFocusedItem", "()Lcom/kakao/keditor/KeditorItem;", "setFocusedItem", "(Lcom/kakao/keditor/KeditorItem;)V", "<set-?>", "", "focusedPosition", "getFocusedPosition", "()I", "setFocusedPosition", "(I)V", "focusedPosition$delegate", "Lkotlin/properties/ReadWriteProperty;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class RenderingRequest implements FocusedRequest {
    static final KProperty[] $$delegatedProperties;
    @Nullable
    private KeditorItem focusedItem;
    @NotNull
    private final ReadWriteProperty focusedPosition$delegate;

    static {
        RenderingRequest.$$delegatedProperties = new KProperty[]{a.s(RenderingRequest.class, "focusedPosition", "getFocusedPosition()I", 0)};
    }

    public RenderingRequest() {
        this.focusedPosition$delegate = Delegates.INSTANCE.notNull();
    }

    @Override  // com.kakao.keditor.request.FocusedRequest
    @Nullable
    public KeditorItem getFocusedItem() {
        return this.focusedItem;
    }

    @Override  // com.kakao.keditor.request.FocusedRequest
    public int getFocusedPosition() {
        return ((Number)this.focusedPosition$delegate.getValue(this, RenderingRequest.$$delegatedProperties[0])).intValue();
    }

    @Override  // com.kakao.keditor.request.FocusedRequest
    public void setFocusedItem(@Nullable KeditorItem keditorItem0) {
        this.focusedItem = keditorItem0;
    }

    @Override  // com.kakao.keditor.request.FocusedRequest
    public void setFocusedPosition(int v) {
        this.focusedPosition$delegate.setValue(this, RenderingRequest.$$delegatedProperties[0], v);
    }
}

