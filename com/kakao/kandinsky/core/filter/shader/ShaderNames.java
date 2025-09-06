package com.kakao.kandinsky.core.filter.shader;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u0014\u0010\u000F\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0004R\u0014\u0010\u0010\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/kakao/kandinsky/core/filter/shader/ShaderNames;", "", "", "ATTRIB_POSITION", "Ljava/lang/String;", "ATTRIB_TEXCOORD", "UNIFORM_MVP_MATRIX", "UNIFORM_TEX_MATRIX", "UNIFORM_INTENSITY", "TEXTURE_INPUT", "TEXTURE_INPUT2", "TEXTURE_INPUT3", "UNIFORM_TEXEL_WIDTH", "UNIFORM_TEXEL_HEIGHT", "UNIFORM_TEXEL_SIZE", "UNIFORM_TIME", "UNIFORM_FRAME", "VARYING_TEX_COORD", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ShaderNames {
    @NotNull
    public static final String ATTRIB_POSITION = "a_position";
    @NotNull
    public static final String ATTRIB_TEXCOORD = "a_texCoord";
    @NotNull
    public static final ShaderNames INSTANCE = null;
    @NotNull
    public static final String TEXTURE_INPUT = "texOrigin";
    @NotNull
    public static final String TEXTURE_INPUT2 = "inputTexture2";
    @NotNull
    public static final String TEXTURE_INPUT3 = "inputTexture3";
    @NotNull
    public static final String UNIFORM_FRAME = "u_frame";
    @NotNull
    public static final String UNIFORM_INTENSITY = "intensity";
    @NotNull
    public static final String UNIFORM_MVP_MATRIX = "u_mvpMatrix";
    @NotNull
    public static final String UNIFORM_TEXEL_HEIGHT = "texelHeight";
    @NotNull
    public static final String UNIFORM_TEXEL_SIZE = "u_texelSize";
    @NotNull
    public static final String UNIFORM_TEXEL_WIDTH = "texelWidth";
    @NotNull
    public static final String UNIFORM_TEX_MATRIX = "u_texMatrix";
    @NotNull
    public static final String UNIFORM_TIME = "u_time";
    @NotNull
    public static final String VARYING_TEX_COORD = "v_texCoord";

    static {
        ShaderNames.INSTANCE = new ShaderNames();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

