package com.kakao.keditor.plugin.pluginspec.imagegrid.layout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.ResourcesCompat;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.R.drawable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u001C\u0010\t\u001A\u0004\u0018\u00010\nX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u001A\u0010\u000F\u001A\u00020\u0007X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0014\u001A\u00020\u0007X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/KeditorImageGridLayout;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/layout/AutoTemplateLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "guideLineDrawable", "Landroid/graphics/drawable/Drawable;", "getGuideLineDrawable", "()Landroid/graphics/drawable/Drawable;", "setGuideLineDrawable", "(Landroid/graphics/drawable/Drawable;)V", "innerPadding", "getInnerPadding", "()I", "setInnerPadding", "(I)V", "minSingleCellWidth", "getMinSingleCellWidth", "setMinSingleCellWidth", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorImageGridLayout extends AutoTemplateLayout {
    @Nullable
    private Drawable guideLineDrawable;
    private int innerPadding;
    private int minSingleCellWidth;

    @JvmOverloads
    public KeditorImageGridLayout(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public KeditorImageGridLayout(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public KeditorImageGridLayout(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.guideLineDrawable = ResourcesCompat.getDrawable(this.getResources(), drawable.ke_imagegrid_guideline, context0.getTheme());
        this.innerPadding = this.getResources().getDimensionPixelSize(dimen.image_padding);
        this.minSingleCellWidth = this.getResources().getDimensionPixelSize(dimen.image_min_width);
    }

    public KeditorImageGridLayout(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout
    @Nullable
    public Drawable getGuideLineDrawable() {
        return this.guideLineDrawable;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout
    public int getInnerPadding() {
        return this.innerPadding;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout
    public int getMinSingleCellWidth() {
        return this.minSingleCellWidth;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout
    public void setGuideLineDrawable(@Nullable Drawable drawable0) {
        this.guideLineDrawable = drawable0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout
    public void setInnerPadding(int v) {
        this.innerPadding = v;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout
    public void setMinSingleCellWidth(int v) {
        this.minSingleCellWidth = v;
    }
}

