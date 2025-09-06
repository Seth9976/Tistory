package com.kakao.kphotopicker.widget;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kphotopicker/widget/SpanLookupFactory;", "", "Lcom/kakao/kphotopicker/widget/SpanLookup;", "singleSpan", "()Lcom/kakao/kphotopicker/widget/SpanLookup;", "Landroidx/recyclerview/widget/GridLayoutManager;", "layoutManager", "gridLayoutSpanLookup", "(Landroidx/recyclerview/widget/GridLayoutManager;)Lcom/kakao/kphotopicker/widget/SpanLookup;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SpanLookupFactory {
    @NotNull
    public static final SpanLookupFactory INSTANCE;

    static {
        SpanLookupFactory.INSTANCE = new SpanLookupFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final SpanLookup gridLayoutSpanLookup(@NotNull GridLayoutManager gridLayoutManager0) {
        Intrinsics.checkNotNullParameter(gridLayoutManager0, "layoutManager");
        return new SpanLookup() {
            public final GridLayoutManager a;

            {
                this.a = gridLayoutManager0;
            }

            @Override  // com.kakao.kphotopicker.widget.SpanLookup
            public int getSpanCount() {
                return this.a.getSpanCount();
            }

            @Override  // com.kakao.kphotopicker.widget.SpanLookup
            public int getSpanIndex(int v) {
                return this.a.getSpanSizeLookup().getSpanIndex(v, this.getSpanCount());
            }

            @Override  // com.kakao.kphotopicker.widget.SpanLookup
            public int getSpanSize(int v) {
                return this.a.getSpanSizeLookup().getSpanSize(v);
            }
        };
    }

    @NotNull
    public final SpanLookup singleSpan() {
        return new com.kakao.kphotopicker.widget.SpanLookupFactory.singleSpan.1();  // 初始化器: Ljava/lang/Object;-><init>()V

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0003H\u0016J\u0010\u0010\b\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0003H\u0016R\u0014\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"com/kakao/kphotopicker/widget/SpanLookupFactory$singleSpan$1", "Lcom/kakao/kphotopicker/widget/SpanLookup;", "spanCount", "", "getSpanCount", "()I", "getSpanIndex", "itemPosition", "getSpanSize", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.kphotopicker.widget.SpanLookupFactory.singleSpan.1 implements SpanLookup {
            @Override  // com.kakao.kphotopicker.widget.SpanLookup
            public int getSpanCount() {
                return 1;
            }

            @Override  // com.kakao.kphotopicker.widget.SpanLookup
            public int getSpanIndex(int v) {
                return 0;
            }

            @Override  // com.kakao.kphotopicker.widget.SpanLookup
            public int getSpanSize(int v) {
                return 1;
            }
        }

    }
}

