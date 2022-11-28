package com.sparta.week03.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter // 접근제어자가 private이므로 getter메소드가 필요하다.
@MappedSuperclass //Entity가 자동으로 컬럼으로 인식      ->어노테이션 3개 다 있어야함!
@EntityListeners(AuditingEntityListener.class) // 생성/변경 시간을 자동으로 업데이트 합니다.
public abstract class TimeStamped { //직접 사용하지않고 상속되어야만 사용됨->추상 클래스

    @CreatedDate //생성일자
    private LocalDateTime createdAt;

    @LastModifiedDate //마지막 수정일자
    private LocalDateTime modifiedAt;
}
