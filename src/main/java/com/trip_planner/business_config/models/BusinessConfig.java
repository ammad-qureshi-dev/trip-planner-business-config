package com.trip_planner.business_config.models;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusinessConfig implements Serializable {

    @NonNull
    private String title;

    @NonNull
    private String description;
}
