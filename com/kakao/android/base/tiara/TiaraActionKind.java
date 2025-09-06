package com.kakao.android.base.tiara;

import com.kakao.tiara.data.ActionKind;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001A\u00020\u0003R\u000F\u0010\u0002\u001A\u00020\u0003¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/android/base/tiara/TiaraActionKind;", "", "actionKind", "Lcom/kakao/tiara/data/ActionKind;", "()Lcom/kakao/tiara/data/ActionKind;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
public @interface TiaraActionKind {
    ActionKind actionKind();
}

