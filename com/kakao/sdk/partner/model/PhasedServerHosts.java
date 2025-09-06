package com.kakao.sdk.partner.model;

import com.kakao.sdk.common.model.ServerHosts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\bR\u0014\u0010\u000B\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\bR\u0014\u0010\r\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\bR\u0014\u0010\u000F\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/kakao/sdk/partner/model/PhasedServerHosts;", "Lcom/kakao/sdk/common/model/ServerHosts;", "phase", "Lcom/kakao/sdk/partner/model/KakaoPhase;", "(Lcom/kakao/sdk/partner/model/KakaoPhase;)V", "account", "", "getAccount", "()Ljava/lang/String;", "channel", "getChannel", "kapi", "getKapi", "kauth", "getKauth", "legacyAccount", "getLegacyAccount", "navi", "getNavi", "getPhase", "()Lcom/kakao/sdk/partner/model/KakaoPhase;", "sharer", "getSharer", "partner-common_release"}, k = 1, mv = {1, 1, 15})
public final class PhasedServerHosts extends ServerHosts {
    @NotNull
    private final String account;
    @NotNull
    private final String channel;
    @NotNull
    private final String kapi;
    @NotNull
    private final String kauth;
    @NotNull
    private final String legacyAccount;
    @NotNull
    private final String navi;
    @NotNull
    private final KakaoPhase phase;
    @NotNull
    private final String sharer;

    public PhasedServerHosts(@NotNull KakaoPhase kakaoPhase0) {
        Intrinsics.checkParameterIsNotNull(kakaoPhase0, "phase");
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        super();
        this.phase = kakaoPhase0;
        switch(PhasedServerHosts.WhenMappings.$EnumSwitchMapping$0[kakaoPhase0.ordinal()]) {
            case 1: {
                s = "alpha-kauth.kakao.com";
                break;
            }
            case 2: {
                s = "sandbox-kauth.kakao.com";
                break;
            }
            case 3: {
                s = "beta-kauth.kakao.com";
                break;
            }
            case 4: {
                s = "kauth.kakao.com";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.kauth = s;
        switch(PhasedServerHosts.WhenMappings.$EnumSwitchMapping$1[kakaoPhase0.ordinal()]) {
            case 1: {
                s1 = "alpha-kapi.kakao.com";
                break;
            }
            case 2: {
                s1 = "sandbox-kapi.kakao.com";
                break;
            }
            case 3: {
                s1 = "beta-kapi.kakao.com";
                break;
            }
            case 4: {
                s1 = "kapi.kakao.com";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.kapi = s1;
        switch(PhasedServerHosts.WhenMappings.$EnumSwitchMapping$2[kakaoPhase0.ordinal()]) {
            case 1: {
                s2 = "alpha-accounts.kakao.com";
                break;
            }
            case 2: {
                s2 = "sandbox-accounts.kakao.com";
                break;
            }
            case 3: {
                s2 = "beta-accounts.kakao.com";
                break;
            }
            case 4: {
                s2 = "accounts.kakao.com";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.account = s2;
        switch(PhasedServerHosts.WhenMappings.$EnumSwitchMapping$3[kakaoPhase0.ordinal()]) {
            case 1: {
                s3 = "alpha-auth.kakao.com";
                break;
            }
            case 2: {
                s3 = "sandbox-auth.kakao.com";
                break;
            }
            case 3: {
                s3 = "beta-auth.kakao.com";
                break;
            }
            case 4: {
                s3 = "auth.kakao.com";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.legacyAccount = s3;
        switch(PhasedServerHosts.WhenMappings.$EnumSwitchMapping$4[kakaoPhase0.ordinal()]) {
            case 1: {
                s4 = "alpha-sharer.devel.kakao.com";
                break;
            }
            case 2: {
                s4 = "sandbox-sharer.devel.kakao.com";
                break;
            }
            case 3: {
                s4 = "beta-sharer.kakao.com";
                break;
            }
            case 4: {
                s4 = "sharer.kakao.com";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.sharer = s4;
        switch(PhasedServerHosts.WhenMappings.$EnumSwitchMapping$5[kakaoPhase0.ordinal()]) {
            case 1: 
            case 2: {
                s5 = "sandbox-kakaonavi-wguide.kakao.com";
                break;
            }
            case 3: 
            case 4: {
                s5 = "kakaonavi-wguide.kakao.com";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.navi = s5;
        switch(PhasedServerHosts.WhenMappings.$EnumSwitchMapping$6[kakaoPhase0.ordinal()]) {
            case 1: 
            case 2: {
                s6 = "sandbox-pf.kakao.com";
                break;
            }
            case 3: {
                s6 = "beta-pf.kakao.com";
                break;
            }
            case 4: {
                s6 = "pf.kakao.com";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.channel = s6;
    }

    @Override  // com.kakao.sdk.common.model.ServerHosts
    @NotNull
    public String getAccount() {
        return this.account;
    }

    @Override  // com.kakao.sdk.common.model.ServerHosts
    @NotNull
    public String getChannel() {
        return this.channel;
    }

    @Override  // com.kakao.sdk.common.model.ServerHosts
    @NotNull
    public String getKapi() {
        return this.kapi;
    }

    @Override  // com.kakao.sdk.common.model.ServerHosts
    @NotNull
    public String getKauth() {
        return this.kauth;
    }

    @Override  // com.kakao.sdk.common.model.ServerHosts
    @NotNull
    public String getLegacyAccount() {
        return this.legacyAccount;
    }

    @Override  // com.kakao.sdk.common.model.ServerHosts
    @NotNull
    public String getNavi() {
        return this.navi;
    }

    @NotNull
    public final KakaoPhase getPhase() {
        return this.phase;
    }

    @Override  // com.kakao.sdk.common.model.ServerHosts
    @NotNull
    public String getSharer() {
        return this.sharer;
    }
}

