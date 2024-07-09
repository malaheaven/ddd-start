package com.study.ddd.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public class EmailSet {

    private Set<Email> emails = new HashSet<>();
}
