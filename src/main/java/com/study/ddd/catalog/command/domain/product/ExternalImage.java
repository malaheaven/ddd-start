package com.study.ddd.catalog.command.domain.product;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("EI")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ExternalImage extends Image {

}
