package com.kakao.kandinsky.core.filter.filter;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.kakao.kandinsky.core.filter.extension.AssetExtensionKt;
import com.kakao.kandinsky.core.filter.gl.GLBitmapTexture;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.shader.LookupShader;
import com.kakao.kandinsky.core.filter.shader.TextureShader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0014\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001A\u0010\u0010\u001A\u00020\u000B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/kandinsky/core/filter/filter/Lookup512Filter;", "Lcom/kakao/kandinsky/core/filter/filter/BaseFilter;", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "Landroid/content/res/AssetManager;", "assetManager", "", "", "param", "<init>", "(Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;Landroid/content/res/AssetManager;Ljava/util/Map;)V", "Lcom/kakao/kandinsky/core/filter/shader/LookupShader;", "c", "Lcom/kakao/kandinsky/core/filter/shader/LookupShader;", "getShader", "()Lcom/kakao/kandinsky/core/filter/shader/LookupShader;", "shader", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Lookup512Filter extends BaseFilter {
    public final LookupShader c;

    public Lookup512Filter(@NotNull GLResourcesProvider gLResourcesProvider0, @NotNull AssetManager assetManager0, @Nullable Map map0) {
        Intrinsics.checkNotNullParameter(gLResourcesProvider0, "glResourcesProvider");
        Intrinsics.checkNotNullParameter(assetManager0, "assetManager");
        super(gLResourcesProvider0);
        String s = map0 == null ? null : ((String)map0.get("lookup"));
        if(s == null) {
            throw new RuntimeException("fail load lookup bitmap path " + null);
        }
        Bitmap bitmap0 = AssetExtensionKt.loadBitmapFromAsset(assetManager0, s);
        if(bitmap0 == null) {
            throw new RuntimeException("fail load lookup bitmap " + s);
        }
        this.c = new LookupShader(gLResourcesProvider0, new GLBitmapTexture(bitmap0));
    }

    @NotNull
    public LookupShader getShader() {
        return this.c;
    }

    @Override  // com.kakao.kandinsky.core.filter.filter.BaseFilter
    public TextureShader getShader() {
        return this.getShader();
    }
}

